import ast._
import reader._
import parser._
import z3sol._
import simpllexer._
import simplparser._

object Main extends App {
    
    val sample_code = reader.read(args(0))
    
    // sample_code.foreach (parser.parserEngine)
    // println("Domain : " + parser.domain)
    // println("Delta : " + parser.deltaValues)
    // z3sol.Z3Solver ()

    val simplparserEngine = new ParserRules
    val envState = new ProgramState
    val ast = new AbstactSyntaxTreeVisitor

    for(lines <- sample_code) {
        val parseResult = simplparserEngine.parseAll(simplparserEngine.statement, lines)
        parseResult match {
            case parseResult: simplparserEngine.Failure => println (s"Parsing Error Occured")
            case _ => {
                val astResult = ast.visitorEval(parseResult.get, envState)
                // println(parseResult.get)
            }
        }
    }

    z3sol.Z3Solver ()
}

