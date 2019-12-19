package parser

import scala.collection.mutable._
import scala.collection.immutable._
import org.antlr.v4.runtime._
import scala.io._
import simpl._
 
object parser {
    
    def parse (expr : String) = {

        var parseStream = new ANTLRInputStream (expr);
        var lexer = new simplLexer (parseStream);
        var tokens = new CommonTokenStream (lexer);
        var parseEngine = new simplParser (tokens); 
    
    }

    class SimplExprParsing extends simplBaseListener {

    }
}
