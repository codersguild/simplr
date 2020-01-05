// Generated from code.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link codeParser}.
 */
public interface codeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link codeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(codeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(codeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(codeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(codeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(codeParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(codeParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(codeParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(codeParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(codeParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(codeParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(codeParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(codeParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(codeParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(codeParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(codeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(codeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#relopExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelopExpression(codeParser.RelopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#relopExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelopExpression(codeParser.RelopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(codeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(codeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(codeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(codeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(codeParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(codeParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#pure_number}.
	 * @param ctx the parse tree
	 */
	void enterPure_number(codeParser.Pure_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#pure_number}.
	 * @param ctx the parse tree
	 */
	void exitPure_number(codeParser.Pure_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(codeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(codeParser.VariableContext ctx);
}