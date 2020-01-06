package simplparser

import ast._
import tokens._
import errors._
import simpllexer._
import scala.util.parsing.combinator._  

class ParserRules extends LexerRules with PackratParsers {

    lazy val argDeclaration : PackratParser[simplDeclaration] = {
        (inttype | booltype) ~ variable ^^ {
            case str ~ name => simplDeclaration(str.toString, name.toString)
        }
    }

    lazy val relExpression : PackratParser[simplExpression] = {
        variable ~ (">" | "<" | "<=" | ">=" | "==" | "!=") ~ expr ^^ {
            case exp1 ~ relop ~ exp2 => RelOpExpression(exp1, relop.toString, exp2)
        }
    }

    lazy val arithExpression : PackratParser[simplExpression] = expr

    lazy val expr : PackratParser[simplExpression] = {
        term ~ rep("+" ~ term | "-" ~ term) ^^ {
            case exp ~ Nil => exp 
            case number ~ listOfTerms => (number /: listOfTerms) {
                case (exp, "+" ~ terms) => ArithExpression(exp, "+", terms)
                case (exp, "-" ~ terms) => ArithExpression(exp, "-", terms)
            }
        }
    }

    lazy val term : PackratParser[simplExpression] = {
        pterm ~ rep("*" ~ pterm | "/" ~ pterm) ^^ {
            case exp ~ Nil => exp 
            case number ~ listOfTerms => (number /: listOfTerms) {
                case (exp, "*" ~ terms) => ArithExpression(exp, "*", terms)
                case (exp, "/" ~ terms) => ArithExpression(exp, "/", terms)
            }
        } 
    }
    
    lazy val pterm : PackratParser[simplExpression] = {
        factor ~ rep("^" ~ factor) ^^ {
            case exp ~ Nil => exp 
            case number ~ listOfTerms => (number /: listOfTerms) {
                case (exp, "^" ~ terms) => ArithExpression(exp, "^", terms)
            }
        }
    }

    lazy val factor : PackratParser[simplExpression] = constant | variable | lparen ~> expr <~ rparen 
    
    lazy val constant : PackratParser[simplExpression] = number | bool  

    lazy val number : PackratParser[NumericExpression] = {
        """(0|[1-9]\d*)""".r ^^ {
            case numeric => NumericExpression(numeric.toInt)
        }
    }

    lazy val bool : PackratParser[BoolExpression] = {
         (truelit | falselit) ^^ {
            case boolValue => BoolExpression(boolValue.toString)
        }
    }

    lazy val statement : PackratParser[Statement] = {
        assignmentStatement | declarationStatement | printStatement | assertStatement | condlStatement // functionStatement | returnStatement 
    }

    lazy val assignmentStatement : PackratParser[Statement] = {
        (inttype | booltype) ~ variable ~ equal ~ arithExpression ~ endcolon ^^ {
            case _ ~ id ~ _ ~ exp ~ _ => AssignmentStatement(id, exp)
        }
    }

    lazy val declarationStatement : PackratParser[Statement] = {
        (inttype | booltype) ~ variable ~ endcolon ^^ {
            case str ~ id ~ _ => DeclarationStatement(str.toString, id)
        }
    }

    lazy val printStatement : PackratParser[Statement] = {
        printstmt ~ lparen ~ arithExpression ~ rparen ~ endcolon ^^ {
            case _ ~ _ ~ exp ~ _ ~ _ => PrintStatement(exp)
        }
    }

    lazy val assertStatement : PackratParser[Statement] = {
        assertstmt ~ lparen ~ relExpression ~ rparen ~ endcolon ^^ {
            case _ ~ _ ~ exp ~ _ ~ _ => AssertStatement(exp)
        }
    }

    lazy val condlStatement : PackratParser[Statement] = {
        ifstmt ~ lparen ~ relExpression ~ rparen ~ blockStmts ~ elsestmt ~ blockStmts ^^ {
            case _ ~ _ ~ relexp ~ _ ~ truestmts ~ _ ~ falsestmts => ConditionalStatement(relexp, truestmts, falsestmts)   
        }
    }

    lazy val blockStmts : PackratParser[List[Statement]] = {
        lcurly ~ rep(statement) ~ rcurly ^^ {
            case _ ~ liststmts ~ _ => liststmts
        }
    }

    lazy val variable : PackratParser[simplVariable] = {
        """[a-zA-Z_][a-zA-Z0-9_]*""".r ^^ {
            case variable => simplVariable (variable.toString)
        }
    }
} 