package z3sol

import scala.collection.mutable._
import com.microsoft.z3._

object z3sol {
    
    val ctx: Context = new Context(new java.util.HashMap[String, String])  
    val solver: com.microsoft.z3.Solver = ctx.mkSolver()   

    def Z3AddConstraints (id : String, value : Int, cond : String) {
        
        val _id :  IntExpr  = ctx.mkIntConst(id)
        val _expr : Expr = ctx.mkNumeral(value, ctx.mkIntSort())
        var _formula : BoolExpr = ctx.mkEq(_id, _expr)

        cond match {
            case "assign" => {
                _formula = ctx.mkEq(_id, _expr)
                println("AssignRuleAdded")
            }
            
            case "==" => {
                _formula = ctx.mkEq(_id, _expr)
                println("EqualRuleAdded")
            }

            case ">" => {
                _formula = ctx.mkGt(_id, _expr.asInstanceOf[ArithExpr])
                println("GreaterThanRuleAdded")
            }

            case "<" => {
                _formula = ctx.mkLt(_id, _expr.asInstanceOf[ArithExpr])
                println("LessThanRuleAdded")
            }

            case ">=" => {
                _formula = ctx.mkGe(_id, _expr.asInstanceOf[ArithExpr])
                println("GreaterThanEqualRuleAdded")
            }

            case "<=" => {
                _formula = ctx.mkLe(_id, _expr.asInstanceOf[ArithExpr])
                println("LessThanEqualRuleAdded")
            }
        }

        solver.add(_formula)
    }

    def Z3Solver () {
        if(solver.check == Status.SATISFIABLE) {
            println("sat")
        } else  {
            println("unsat")
        }
    }

    def Examplez3Solving () {
       
        val x : IntExpr = ctx.mkIntConst("x")
        val y : IntExpr = ctx.mkIntConst("y")
        val num : Expr =  ctx.mkNumeral(50, ctx.mkIntSort())
        val res : Expr =  ctx.mkNumeral(100, ctx.mkIntSort())

        val z : ArithExpr = ctx.mkAdd(x, y)
        val formula2 : BoolExpr = ctx.mkEq(x, num)
        val formula3 : BoolExpr = ctx.mkEq(y, num)
        val formula1 : BoolExpr = ctx.mkEq(z, res)

        val solver: com.microsoft.z3.Solver = ctx.mkSolver()   
        solver.add(formula2)   
        solver.add(formula1)
        solver.add(formula3)

        if(solver.check == Status.SATISFIABLE) {
            println("sat")
        } else  {
            println("unsat")
        }
    }
}