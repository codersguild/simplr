package parser

import scala.collection.mutable._
import org.antlr.v4.runtime._
import z3sol._
import simpl._

object parser {
    
    val domain = Map[String, String]()
    val deltaValues = Map[String, Int]()

    def evalfunction (x : Int, y : Int, op : String) : Int = op match {
        case "+" => return x + y
        case "-" => return x - y
        case "*" => return x * y
        case "/" => return x / y
        case "^" => return x ^ y
    }

    def parserEngine (expr : String) = {

        var parseStream = new ANTLRInputStream (expr)
        var lexer = new simplLexer (parseStream)
        var tokens = new CommonTokenStream (lexer)
        var parse = new simplParser (tokens)

        val SimplVisitorApp = new SimplExprVisitorParsing()
        val assign_result = SimplVisitorApp.visit(parse.statement())

        // println("Domain : " + parser.domain)
        // println("Delta : " + parser.deltaValues)
    }

    sealed trait expression
    case class operation (operator : String) extends expression
    case class evalresult (result : Option[Int]) extends expression
    
    abstract class ResultType
    case object NoResult extends ResultType
    case class IntResult(v : Int) extends ResultType
    case class BoolResult(v : Boolean) extends ResultType

    class SimplExprVisitorParsing extends simplBaseVisitor[Option[(ResultType, String)]] {
        type R = (ResultType, String)

        override def visitStatement (ctx : simplParser.StatementContext) : Option[R] = {
            if (ctx.decl != null) return visitDeclarationStatement(ctx.decl)
            if (ctx.asgn != null) return visitAssignmentStatement(ctx.asgn)
            if (ctx.cond != null) return visitConditionStatement(ctx.cond)
            if (ctx.asrt != null) return visitAssertStatement(ctx.asrt)
            if (ctx.prnt != null) return visitPrintStatement(ctx.prnt)
            return None
        }

        override def visitAssertStatement (ctx : simplParser.AssertStatementContext) : Option[R] = {
            var ident = ctx.relexp.id.getText
            var rule = ctx.relexp.rel.getText
            var condl = ctx.relexp.exp.getText
            var res = visitExpression(ctx.relexp.exp)
            z3sol.Z3AddConstraints(ident, res.get._1.asInstanceOf[IntResult].v, rule)
            println(s"AssertRule : (id: $ident) (relop: $rule) (condexpr: $condl) (result : $res)")
            return None
        }

        override def visitPrintStatement (ctx : simplParser.PrintStatementContext) : Option[R] = {
            var printexpr = ctx.printexp.getText
            var result = visitExpression(ctx.printexp).get._1.asInstanceOf[IntResult].toString
            println(s"Print : (evalprintrec: $printexpr) : $result")
            return Some((NoResult, result))
        }

        override def visitConditionStatement (ctx : simplParser.ConditionStatementContext) : Option[R] = {
            var ident = ctx.relexp.id.getText
            var rule = ctx.relexp.rel.getText
            var condl = ctx.relexp.exp.getText
            var truebranch = ctx.truestat.getText 
            var falsebranch =  ctx.falsestat.getText
            z3sol.Z3AddConstraints(ident, res.get._1.asInstanceOf[IntResult].v, rule) // Check condition result. 
            println(s"Conditional : (fullcondlexpr : $ident $rule $condl) ? (true) {$truebranch} : (false) ($falsebranch)") 
            // TODO
            return None
        }

        override def visitDeclarationStatement (ctx : simplParser.DeclarationStatementContext) : Option[R] = {
            val ident = ctx.id.getText.toString
            domain(ident) = ctx.typ.getText.toString
            deltaValues(ident) = 0; // zero-initalized by default 
            z3sol.Z3AddConstraints(ident, 0, "assign")
            return None
        }

        override def visitAssignmentStatement (ctx : simplParser.AssignmentStatementContext) : Option[R] = {
            var expr = visitExpression(ctx.right)
            var ident = visitIdentifier(ctx.left)
            domain(ctx.left.getText.toString) = ctx.typ.getText.toString
            deltaValues(ctx.left.getText.toString) = expr.get._1.asInstanceOf[IntResult].v
            z3sol.Z3AddConstraints(ctx.left.getText.toString, expr.get._1.asInstanceOf[IntResult].v, "assign")
            return None
        }

        override def visitIdentifier (ctx : simplParser.IdentifierContext) : Option[R] = {
            val ident = ctx.getText.toString
            deltaValues(ident) = 0 // zero-initalized by default 
            return None
        }

        override def visitExpression (ctx : simplParser.ExpressionContext) : Option[R] = {
            
            var left : Option[R] = None
            var right : Option[R] = None
            var operator = ""

            if (ctx.left != null && ctx.right != null) {
                operator = ctx.op.getText
                left = visitExpression(ctx.left)
                right = visitExpression(ctx.right)
                return Some((IntResult(evalfunction(left.get._1.asInstanceOf[IntResult].v, 
                                                    right.get._1.asInstanceOf[IntResult].v, operator)), ""));
            }

            if(ctx.left != null)  
               return visitExpression(ctx.left)
            if(ctx.right != null)
               return visitExpression(ctx.right)
            
            if (ctx.left == null && ctx.right == null) {
                if(ctx.main_expr != null)
                    return visitExpression(ctx.main_expr)
                else {
                    if (ctx.num != null)
                        return Some((IntResult(ctx.num.getText.toInt),""))
                    if (ctx.varl != null)
                        return Some((IntResult(deltaValues(ctx.varl.getText)),""))
                }
            }
            return None
        }

    }
}