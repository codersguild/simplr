// Generated from simpl.g4 by ANTLR 4.7.1
package simpl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplParser}.
 */
public interface simplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simplParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(simplParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(simplParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simplParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simplParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(simplParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(simplParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(simplParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(simplParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(simplParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(simplParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(simplParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(simplParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(simplParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(simplParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(simplParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(simplParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#relopExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelopExpression(simplParser.RelopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#relopExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelopExpression(simplParser.RelopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simplParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simplParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(simplParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(simplParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(simplParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(simplParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#pure_number}.
	 * @param ctx the parse tree
	 */
	void enterPure_number(simplParser.Pure_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#pure_number}.
	 * @param ctx the parse tree
	 */
	void exitPure_number(simplParser.Pure_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simplParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simplParser.VariableContext ctx);
}