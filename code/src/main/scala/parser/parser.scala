package parser

import scala.collection.mutable._
import scala.collection.immutable._
import org.antlr.v4.runtime._
import scala.io._
import simpl._
 
object parser {
    
    def parserEngine (expr : String) = {

        var parseStream = new ANTLRInputStream (expr);
        var lexer = new simplLexer (parseStream);
        var tokens = new CommonTokenStream (lexer);
        var parseApp = new simplParser (tokens); 
        val simplParsingApp = new SimplParsing ();

        parseApp.assignmentStatement.enterRule(simplParsingApp);
    
    }

    class SimplParsing extends simplBaseListener {
        
        override def enterAssignmentStatement (ctx : simplParser.AssignmentStatementContext) : Unit = { 
            
            val identifier = ctx.identifier().getText
            val expr = ctx.expression().getText
            val assignmentOp = ctx.ASSIGNMENT().getText
            println (s"$identifier $assignmentOp $expr")

        }
    };

    sealed trait expression
    case class operation (operator : String) extends expression
    case class evalresult (result : Option[Int]) extends expression

    class SimplExprVisitorParsing extends simplBaseVisitor[Unit] {

        override def visitAssignmentStatement (ctx : simplParser.AssignmentStatementContext) : Unit = {
            
        }

    }

}
