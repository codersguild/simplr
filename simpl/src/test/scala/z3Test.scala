import z3sol._
import simplparser._
import org.scalatest._
import scala.collection.mutable._

class z3CaseTests extends FlatSpec {

	"z3 Solver on no constraints" should "Produce SAT Result" in {
        val assertResult = z3sol.Z3Solver()
        assert(assertResult == "SAT")
    } 

    "print(x);" should "Produce Correct Print AST" in {
        val simplparserEngine = new ParserRules
        val parseResult = simplparserEngine.parseAll(simplparserEngine.statement, "print(x);")
        assert(parseResult.get.toString == "PrintStatement(simplVariable(x))")
    }

    "assert(x > y + 90);" should "Produce Correct Assert AST" in {
        val simplparserEngine = new ParserRules
        val parseResult = simplparserEngine.parseAll(simplparserEngine.statement, "assert(x > y + 90);")
        assert(parseResult.get.toString == "AssertStatement(RelOpExpression(simplVariable(x),>,"
                                            +"ArithExpression(simplVariable(y),+,"
                                            +"NumericExpression(90))))")
    }

    "int x = 56;" should "Produce Correct Assign AST" in {
        val simplparserEngine = new ParserRules
        val parseResult = simplparserEngine.parseAll(simplparserEngine.statement, "int x = 56;")
        assert(parseResult.get.toString == "AssignmentStatement(simplVariable(x),NumericExpression(56))")
    }

}


