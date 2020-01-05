// Generated from simpl.g4 by ANTLR 4.7.1
package simpl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simplParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simplVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simplParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(simplParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simplParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(simplParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(simplParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(simplParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(simplParser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(simplParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(simplParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#relopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopExpression(simplParser.RelopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(simplParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(simplParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(simplParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#pure_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPure_number(simplParser.Pure_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simplParser.VariableContext ctx);
}