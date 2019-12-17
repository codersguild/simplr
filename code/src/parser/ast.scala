import scala.reflect.runtime.universe._

trait expr[exp] {
    def hasValidLhs: Boolean
    def hasOperands: Boolean
    def lhs: BigInt
    def rhs: expr
    def literal: expr
    def constant : const
}

object Ast extends App {
    sealed trait expr
}
