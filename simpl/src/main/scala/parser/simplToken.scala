package tokens

import scala.util.parsing._

sealed trait simplTokens

case class INTTYPE() extends simplTokens
case class BOOLTYPE() extends simplTokens
case class IDENTIFIER() extends simplTokens
case class IF() extends simplTokens
case class ELSE() extends simplTokens

case class EQUAL() extends simplTokens
case class LPAREN() extends simplTokens
case class RPAREN() extends simplTokens
case class LCURLY() extends simplTokens
case class RCURLY() extends simplTokens
case class ENDCOLON() extends simplTokens

case class FUNCTIONCALL() extends simplTokens
case class RETURNCALL() extends simplTokens
case class ASSERT() extends simplTokens
case class PRINT() extends simplTokens
case class COMMA() extends simplTokens