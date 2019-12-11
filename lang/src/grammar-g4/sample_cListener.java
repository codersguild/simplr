// Generated from sample_c.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sample_cParser}.
 */
public interface sample_cListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sample_cParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(sample_cParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(sample_cParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(sample_cParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(sample_cParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(sample_cParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(sample_cParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(sample_cParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(sample_cParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(sample_cParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(sample_cParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(sample_cParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(sample_cParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(sample_cParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(sample_cParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(sample_cParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(sample_cParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(sample_cParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(sample_cParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(sample_cParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(sample_cParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(sample_cParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(sample_cParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(sample_cParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(sample_cParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(sample_cParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(sample_cParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(sample_cParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(sample_cParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(sample_cParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(sample_cParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(sample_cParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(sample_cParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(sample_cParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(sample_cParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(sample_cParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(sample_cParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(sample_cParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(sample_cParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(sample_cParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(sample_cParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(sample_cParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(sample_cParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(sample_cParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(sample_cParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(sample_cParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(sample_cParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(sample_cParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(sample_cParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(sample_cParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(sample_cParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(sample_cParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(sample_cParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(sample_cParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(sample_cParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(sample_cParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(sample_cParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(sample_cParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(sample_cParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(sample_cParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(sample_cParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(sample_cParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(sample_cParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(sample_cParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(sample_cParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(sample_cParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(sample_cParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(sample_cParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(sample_cParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(sample_cParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(sample_cParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(sample_cParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(sample_cParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(sample_cParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(sample_cParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(sample_cParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(sample_cParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(sample_cParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(sample_cParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(sample_cParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(sample_cParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(sample_cParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(sample_cParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(sample_cParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(sample_cParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(sample_cParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(sample_cParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(sample_cParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(sample_cParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(sample_cParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(sample_cParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(sample_cParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(sample_cParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(sample_cParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(sample_cParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(sample_cParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(sample_cParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(sample_cParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(sample_cParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(sample_cParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(sample_cParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(sample_cParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(sample_cParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(sample_cParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(sample_cParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(sample_cParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(sample_cParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(sample_cParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(sample_cParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(sample_cParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(sample_cParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(sample_cParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(sample_cParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(sample_cParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(sample_cParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(sample_cParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(sample_cParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(sample_cParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(sample_cParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(sample_cParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(sample_cParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(sample_cParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(sample_cParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(sample_cParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(sample_cParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(sample_cParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(sample_cParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(sample_cParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(sample_cParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(sample_cParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(sample_cParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(sample_cParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(sample_cParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(sample_cParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(sample_cParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(sample_cParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(sample_cParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(sample_cParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(sample_cParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(sample_cParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(sample_cParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(sample_cParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(sample_cParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(sample_cParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(sample_cParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(sample_cParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(sample_cParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(sample_cParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(sample_cParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(sample_cParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(sample_cParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(sample_cParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(sample_cParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(sample_cParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(sample_cParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(sample_cParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(sample_cParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(sample_cParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(sample_cParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(sample_cParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(sample_cParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(sample_cParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(sample_cParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(sample_cParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(sample_cParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(sample_cParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(sample_cParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(sample_cParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(sample_cParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(sample_cParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(sample_cParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(sample_cParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(sample_cParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sample_cParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(sample_cParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sample_cParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(sample_cParser.DeclarationListContext ctx);
}