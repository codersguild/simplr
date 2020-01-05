package errors

trait Errors

case class ErrorLocation (lineNumber : Int, columnNumber : Int) extends Errors {
    override def toString = s"at line $lineNumber, col $columnNumber"
}

case class SyntaxError(errorlocation : ErrorLocation, errorMsg : String) extends Errors

