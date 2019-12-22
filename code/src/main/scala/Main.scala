import reader._
import parser._

object Main extends App {
    
    val sample_code = reader.read(args(0))
    sample_code.foreach (parser.parserEngine)
    
    println("Domain : " + parser.domain)
    println("Delta : " + parser.deltaValues)

    parser.Examplez3Solving ()

}

