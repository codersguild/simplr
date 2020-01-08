import ast._
import reader._
import z3sol._
import simplparser._

object Main extends App {
    
    val sample_code = reader.read(args(0))
    val simplparserEngine = new ParserRules
    val envState = new ProgramState
    val ast = new AbstactSyntaxTreeEval

    for(lines <- sample_code) {
        val parseResult = simplparserEngine.parseAll(simplparserEngine.statement, lines)
        parseResult match {
            case parseResult: simplparserEngine.Failure => println ("Parsing Error Occured")
            case _ => {
                val astResult = ast.Evalfunction(parseResult.get, envState)
                // println(parseResult.get) // To get AST. 
            }
        }
    }

    var equNum = z3sol.Z3GetAssertionSize()
    var assertions = z3sol.Z3GetModelEquations()

    println("\nNo of Z3 Assertions : %d\n".format(equNum))
    assertions.foreach(println)
    println("\nModel Assertion Result : %s\n".format(z3sol.Z3Solver()))
}

