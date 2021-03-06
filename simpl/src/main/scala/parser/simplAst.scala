package ast
import z3sol._
import scala.util.parsing._
import scala.collection.mutable._

sealed trait ResultType
case object NoResult extends ResultType
case class IntResult(v : Int) extends ResultType
case class BoolResult(v : Boolean) extends ResultType
case class StringResult(v : String) extends ResultType

sealed trait AbstactSyntaxTree 

trait simplExpression extends AbstactSyntaxTree {
    def value : ResultType
}

case class simplVariable (variable : String) extends simplExpression {
    def variableName = variable
    def symbol = s"__$variable"
    def value = IntResult(0)
}

// TODO extends AbstractSyntaxTree
case class simplDeclaration (ardgdecltype : String, argdeclname : String) extends simplExpression {
    def value = StringResult(argdeclname)
}

// TODO Symbolic z3 Expressions mkAdd, mkSub.
// TODO ArithExpression may throw error in case of StringResult.
case class ArithExpression(expr1 : simplExpression, arithOp : String, expr2 : simplExpression ) extends simplExpression {
    def value = arithOp match {
        case "+" => IntResult( expr1.value.asInstanceOf[IntResult].v + 
                                    expr2.value.asInstanceOf[IntResult].v)
        case "*" => IntResult( expr1.value.asInstanceOf[IntResult].v * 
                                    expr2.value.asInstanceOf[IntResult].v)
        case "/" => IntResult( expr1.value.asInstanceOf[IntResult].v / 
                                    expr2.value.asInstanceOf[IntResult].v)
        case "-" => IntResult( expr1.value.asInstanceOf[IntResult].v - 
                                    expr2.value.asInstanceOf[IntResult].v)
    }
}

case class NumericExpression(numericValue : Int) extends simplExpression {
    def value = IntResult(numericValue)
}

case class BoolExpression(boolValue : String) extends simplExpression {
    def value = BoolResult(boolValue.toBoolean)
}

case class RelOpExpression(expr1: simplVariable, relOp : String, expr2: simplExpression) extends simplExpression {
    def value = relOp match {
        case ">" => BoolResult( expr1.value.asInstanceOf[IntResult].v > 
                                    expr2.value.asInstanceOf[IntResult].v)
        case "<" => BoolResult( expr1.value.asInstanceOf[IntResult].v < 
                                    expr2.value.asInstanceOf[IntResult].v)
        case "<=" => BoolResult( expr1.value.asInstanceOf[IntResult].v <= 
                                    expr2.value.asInstanceOf[IntResult].v)
        case ">=" => BoolResult( expr1.value.asInstanceOf[IntResult].v >= 
                                    expr2.value.asInstanceOf[IntResult].v)
        case "==" => BoolResult( expr1.value.asInstanceOf[IntResult].v == 
                                    expr2.value.asInstanceOf[IntResult].v)
        case "!=" => BoolResult( expr1.value.asInstanceOf[IntResult].v != 
                                    expr2.value.asInstanceOf[IntResult].v)
    }
}

trait Statement extends AbstactSyntaxTree 
case class DeclarationStatement(decltype : String, declname : simplVariable) extends Statement
case class AssignmentStatement(lhs : simplVariable, rhs : simplExpression) extends Statement
case class PrintStatement(printexpr : simplExpression) extends Statement
case class AssertStatement(assertrule : simplExpression) extends Statement
case class ConditionalStatement(    condl : simplExpression, 
                                    truebranch : List[Statement], 
                                    falsebranch : List[Statement]) extends Statement
case class FunctionStatement(   function : String, 
                                params : List[simplDeclaration], 
                                functionBlock : List[Statement]) extends Statement
case class ReturnStatement(returnval : simplExpression) extends Statement

// TODO Notion of a Program state which stores execution stack as well.

/* For storing program environment and evaluation results for program states */
class ProgramState {
    val domain = Map[String, String]()                                                            
    val deltaValues = Map[String, Int]()
    val callStackStrings = List[String]()
    val symbols = Set[String]()
}

// TODO Make variable eval seperate. Statements have state transition. 
// TODO ExprToZ3expr() function. Stores to a map and program state.

/* AST Evaluator */
class AbstactSyntaxTreeEval  {
    def Evalfunction(abstractSynataxTree : AbstactSyntaxTree, programState : ProgramState) : Option[(ResultType)] = {
        abstractSynataxTree match  {
            
            case DeclarationStatement(decltype, declname) => {
                programState.domain(declname.variableName) = decltype
                programState.symbols += declname.symbol
                return None
            }
            
            case AssignmentStatement(lhs, rhs) => {
                val assignedValue = Evalfunction(rhs, programState).get.asInstanceOf[IntResult].v
                val name = lhs.variableName
                programState.deltaValues(name) = assignedValue
                println(s"Assign : $name = $assignedValue")

                // TODO Handle reassignments to same var, z3 gives UNSAT result.
                z3sol.Z3AddConstraints(lhs.symbol, assignedValue, "assign")
                return None
            }
            
            case PrintStatement(printexpr) => {
                val printresult = Evalfunction(printexpr, programState).get.asInstanceOf[IntResult].v
                println(s"Print : $printresult")
                return None
            }
            
            case AssertStatement(assertrule) => {
                val assertEvalValue = Evalfunction(assertrule, programState).get.asInstanceOf[BoolResult].v
                return None
            }

            case ConditionalStatement(condl, truebranch, falsebranch) => {
                var condition = Evalfunction(condl, programState).get.asInstanceOf[BoolResult].v
                condition match {
                    case true => {
                        for(stmts <- truebranch) {
                            Evalfunction(stmts, programState)
                        }
                    }
                    case false => {
                        for(stmts <- falsebranch) {
                            Evalfunction(stmts, programState)
                        }
                    }
                }
                return None
            }

            case FunctionStatement(function, params, functionBlock) => {
                // TODO Implement FunctionStatement()
                return None
            }

            case ReturnStatement(returnval) => {
                // TODO Implement ReturnStatement()
                return None
            }

            case ArithExpression(expr1, op, expr2) => {
                op match  {
                    case "+" => return Some(IntResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v + 
                                                        Evalfunction(expr2, programState).get.asInstanceOf[IntResult].v))) 
                    case "-" => return Some(IntResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v - 
                                                        Evalfunction(expr2, programState).get.asInstanceOf[IntResult].v))) 
                    case "*" => return Some(IntResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v * 
                                                        Evalfunction(expr2, programState).get.asInstanceOf[IntResult].v))) 
                    case "/" => return Some(IntResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v / 
                                                        Evalfunction(expr2, programState).get.asInstanceOf[IntResult].v))) 
                }
            }

            case RelOpExpression(expr1, op, expr2) => {
                var expr_2 = Evalfunction(expr2, programState).get.asInstanceOf[IntResult].v
                z3sol.Z3AddConstraints( expr1.symbol, expr_2, op)
                op match  {
                    case "<" => return Some(BoolResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v < expr_2))) 
                    case ">" => return Some(BoolResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v > expr_2))) 
                    case "<=" => return Some(BoolResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v <= expr_2))) 
                    case ">=" => return Some(BoolResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v >= expr_2)))
                    case "==" => return Some(BoolResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v == expr_2))) 
                    case "!=" => return Some(BoolResult(( Evalfunction(expr1, programState).get.asInstanceOf[IntResult].v != expr_2))) 
                }
            }

            case NumericExpression(v) => {
                return Some(IntResult(v.toInt))
            }

            case BoolExpression(v) => {
                v match {
                    case "true" => Some(IntResult(1))
                    case "false" => Some(IntResult(0))
                }
            }

            case simplVariable(v) => {
                if(programState.deltaValues.contains(v))
                    return Some(IntResult(programState.deltaValues(v)))
                else 
                    return Some(IntResult(0))
            }
        }
    }
}