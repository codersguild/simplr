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
    
    class SimplExprVisitorParsing extends simplBaseVisitor[String] {

        override def visitStatement (ctx : simplParser.StatementContext) : String = {
            if (ctx.decl != null) return visitDeclarationStatement(ctx.decl)
            if (ctx.asgn != null) return visitAssignmentStatement(ctx.asgn)
            if (ctx.cond != null) return visitConditionStatement(ctx.cond)
            if (ctx.asrt != null) return visitAssertStatement(ctx.asrt)
            if (ctx.prnt != null) return visitPrintStatement(ctx.prnt)
            return ctx.getText.toString
        }

        override def visitAssertStatement (ctx : simplParser.AssertStatementContext) : String = {
            var ident = ctx.relexp.id.getText
            var rule = ctx.relexp.rel.getText
            var condl = ctx.relexp.exp.getText
            var res = visitExpression(ctx.relexp.exp)
            z3sol.Z3AddConstraints(ident, res.toInt, rule)
            println(s"AssertRule : (id: $ident) (relop: $rule) (condexpr: $condl) (result : $res)")
            return ctx.getText.toString
        }

        override def visitPrintStatement (ctx : simplParser.PrintStatementContext) : String = {
            var printexpr = ctx.printexp.getText
            var result = visitExpression(ctx.printexp)
            println(s"Print : (evalprintrec: $printexpr) : $result")
            return ctx.getText.toString
        }

        override def visitConditionStatement (ctx : simplParser.ConditionStatementContext) : String = {
            var ident = ctx.relexp.id.getText
            var rule = ctx.relexp.rel.getText
            var condl = ctx.relexp.exp.getText
            var truebranch = ctx.truestat.getText // What to visit false or true. 
            var falsebranch =  ctx.falsestat.getText
            // z3sol.Z3AddConstraints(ident, deltaValues(condl.toString), rule)
            println(s"Conditional : (fullcondlexpr : $ident $rule $condl) ? (true) {$truebranch} : (false) ($falsebranch)") 
            return ctx.getText.toString
        }

        override def visitDeclarationStatement (ctx : simplParser.DeclarationStatementContext) : String = {
            val ident = ctx.id.getText.toString
            domain(ident) = ctx.typ.getText.toString
            deltaValues(ident) = 0; // zero-initalized by default 
            z3sol.Z3AddConstraints(ident, 0, "assign")
            return ident;
        }

        override def visitAssignmentStatement (ctx : simplParser.AssignmentStatementContext) : String = {
            var expr = visitExpression(ctx.right)
            var ident = visitIdentifier(ctx.left)
            domain(ident) = ctx.typ.getText.toString
            deltaValues(ident) = expr.toInt
            z3sol.Z3AddConstraints(ident, expr.toInt, "assign")
            return s"$ident = $expr"
        }

        override def visitIdentifier (ctx : simplParser.IdentifierContext) : String = {
            val ident = ctx.getText.toString
            deltaValues(ident) = 0 // zero-initalized by default 
            return ident
        }

        override def visitExpression (ctx : simplParser.ExpressionContext) : String = {
            
            var left = ""
            var right = "" 
            var operator = ""
            var expr = ""

            if (ctx.left != null && ctx.right != null) {
                operator = ctx.op.getText
                left = visitExpression(ctx.left)
                right = visitExpression(ctx.right)
                var tempexpr = evalfunction(left.toInt, right.toInt, operator);
                return tempexpr.toString
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
                        return ctx.num.getText
                    if (ctx.varl != null)
                        return deltaValues(ctx.varl.getText).toString
                }
            }
            return expr
        }

    }
}