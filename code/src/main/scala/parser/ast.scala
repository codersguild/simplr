package ast
import scala.collection.mutable._

object ast {

    var delta_values = Map("_init" -> 0)

    abstract class operators
    
    class arth_binary_op (op : String, x : Int, y : Int) extends operators {
        
        def evalfunction (x : Int, y : Int) = op match {
            case "+" => x + y
            case "-" => x - y
            case "*" => x * y
            case "/" => x / y
            case "&" => x & y
            case "|" => x | y
            case "^" => x ^ y
            case ">>" => x >> y
            case "<<" => x << y
        }
        
        def updatevalues (delta : Map[String, Int], symb : String, vals : Int) {
            delta(symb) = vals
        }
    } 

}