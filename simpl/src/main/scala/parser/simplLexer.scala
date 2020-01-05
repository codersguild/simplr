package simpllexer

import ast._
import tokens._
import errors._
import scala.util.parsing.combinator._

class LexerRules extends RegexParsers {

    override def skipWhitespace = true
    override val whiteSpace = "[ \t\r\f\n]+".r

    def inttype:      Parser[INTTYPE] =  { "int" ^^ {_ => INTTYPE() } }
    def booltype:     Parser[BOOLTYPE] = { "bool" ^^ {_ => BOOLTYPE() } }
    def ifstmt:       Parser[IF] = { "if" ^^ {_ => IF() } }
    def elsestmt:     Parser[ELSE] = { "else" ^^ {_ => ELSE() } }
    def functioncall: Parser[FUNCTIONCALL] = { "func" ^^ {_=> FUNCTIONCALL() } }
    def returncall:   Parser[RETURNCALL] = { "ret" ^^ {_ => RETURNCALL() } }
    def equal:        Parser[EQUAL] = { "=" ^^ {_ => EQUAL() } }
    def endcolon:     Parser[ENDCOLON] = { ";" ^^ {_ => ENDCOLON() } }
    def comma:        Parser[COMMA] = { "," ^^ {_ => COMMA() } }
    def assertstmt:   Parser[ASSERT] = { "assert" ^^ {_ => ASSERT() } }
    def printstmt:    Parser[PRINT] = { "print" ^^ {_ => PRINT() } }    

    def lcurly:       Parser[LCURLY] =  { "{" ^^ {_ => LCURLY() } }
    def rcurly:       Parser[RCURLY] =  { "}" ^^ {_ => RCURLY() } }
    def lparen:       Parser[LPAREN] =  { "(" ^^ {_ => LPAREN() } }
    def rparen:       Parser[RPAREN] =  { ")" ^^ {_ => RPAREN() } }
    def truelit:      Parser[Any] = "true"
    def falselit:     Parser[Any] = "false"
    def identifier :  Parser[IDENTIFIER] = { "[a-zA-Z_][a-zA-Z0-9_]*".r ^^ {_ => IDENTIFIER() } } 

}