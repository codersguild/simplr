import reader._
import parser._
import z3sol._

object Main extends App {
    
    val sample_code = reader.read(args(0))
    sample_code.foreach (parser.parserEngine)
    
    println("Domain : " + parser.domain)
    println("Delta : " + parser.deltaValues)

    z3sol.Z3Solver ()

}

