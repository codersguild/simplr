package z3sol

import com.microsoft.z3._
import scala.collection.mutable._

object z3sol {
    
    val ctx: Context = new Context(new java.util.HashMap[String, String])  
    val solver: com.microsoft.z3.Solver = ctx.mkSolver()   
    var z3Constraints = Set[String]() 

    def Z3AddConstraints (lhs : String, rhs : Int, condition : String) {
        
        val lhsExpr :  IntExpr  = ctx.mkIntConst(lhs)
        val rhsExpr : Expr = ctx.mkNumeral(rhs, ctx.mkIntSort())
        var formula : BoolExpr = ctx.mkEq(lhsExpr, rhsExpr)
        
        condition match {
            case "assign" => {
                formula = ctx.mkEq(lhsExpr, rhsExpr)
                z3Constraints += s"$lhsExpr = $rhsExpr"
                println("AssignRuleAdded")
            }
            
            case "==" => {
                formula = ctx.mkEq(lhsExpr, rhsExpr)
                z3Constraints += s"$lhsExpr == $rhsExpr"
                println("EqualRuleAdded")
            }

            case ">" => {
                formula = ctx.mkGt(lhsExpr, rhsExpr.asInstanceOf[ArithExpr])
                z3Constraints += s"$lhsExpr > $rhsExpr"
                println("GreaterThanRuleAdded")
            }

            case "<" => {
                formula = ctx.mkLt(lhsExpr, rhsExpr.asInstanceOf[ArithExpr])
                z3Constraints += s"$lhsExpr < $rhsExpr"
                println("LessThanRuleAdded")
            }

            case ">=" => {
                formula = ctx.mkGe(lhsExpr, rhsExpr.asInstanceOf[ArithExpr])
                z3Constraints += s"$lhsExpr >= $rhsExpr"
                println("GreaterThanEqualRuleAdded")
            }

            case "<=" => {
                formula = ctx.mkLe(lhsExpr, rhsExpr.asInstanceOf[ArithExpr])
                z3Constraints += s"$lhsExpr <= $rhsExpr"
                println("LessThanEqualRuleAdded")
            }

            case "!=" => {
                formula = ctx.mkNot( ctx.mkEq(lhsExpr, rhsExpr.asInstanceOf[ArithExpr]) )
                z3Constraints += s"$lhsExpr != $rhsExpr"
                println("NotEqualRuleAdded")
            }
        }
        solver.add(formula)
    }
    
    def Z3AddSymbolicConstraints (lhs : String, rhs : String, relOp : String) {
        
    }

    def Z3Solver () {
        println("\nNo of Z3 Assertions : " + solver.getNumAssertions())
        z3Constraints.foreach(println)
        if(solver.check == Status.SATISFIABLE) {
            println("\nSatisfiable !\n")
        } else  {
            println("\nNot Satisfiable\n")
        }
    }

    // def Examplez3Solving () {
       
    //     val x : IntExpr = ctx.mkIntConst("x")
    //     val y : IntExpr = ctx.mkIntConst("y")
    //     val num : Expr =  ctx.mkNumeral(50, ctx.mkIntSort())
    //     val res : Expr =  ctx.mkNumeral(100, ctx.mkIntSort())

    //     val z : ArithExpr = ctx.mkAdd(x, y)
    //     val formula2 : BoolExpr = ctx.mkEq(x, num)
    //     val formula3 : BoolExpr = ctx.mkEq(y, num)
    //     val formula1 : BoolExpr = ctx.mkEq(z, res)

    //     val solver: com.microsoft.z3.Solver = ctx.mkSolver()   
    //     solver.add(formula2)   
    //     solver.add(formula1)
    //     solver.add(formula3)

    //     if(solver.check == Status.SATISFIABLE) {
    //         println("sat")
    //     } else  {
    //         println("unsat")
    //     }
    // }
}