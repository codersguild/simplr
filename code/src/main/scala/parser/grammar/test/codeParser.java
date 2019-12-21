// Generated from code.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class codeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGNMENT=1, TYPE=2, NUMBER=3, NEWLINE=4, IF=5, ELSE=6, LPAREN=7, PRINT=8, 
		RPAREN=9, ASSERT=10, PLUS=11, MINUS=12, MULT=13, DIV=14, GT=15, LT=16, 
		EQ=17, GTEQ=18, LTEQ=19, POW=20, WS=21, END_STATEMENT=22, VALID_ID_START=23, 
		VALID_ID_CHAR=24;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declarationStatement = 2, RULE_assertStatement = 3, 
		RULE_printStatement = 4, RULE_conditionStatement = 5, RULE_assignmentStatement = 6, 
		RULE_identifier = 7, RULE_relopExpression = 8, RULE_expression = 9, RULE_type = 10, 
		RULE_relop = 11, RULE_pure_number = 12, RULE_variable = 13;
	public static final String[] ruleNames = {
		"program", "statement", "declarationStatement", "assertStatement", "printStatement", 
		"conditionStatement", "assignmentStatement", "identifier", "relopExpression", 
		"expression", "type", "relop", "pure_number", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, null, null, "'if'", "'else'", "'('", "'print'", "')'", 
		"'assert'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'>='", 
		"'<='", "'^'", null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ASSIGNMENT", "TYPE", "NUMBER", "NEWLINE", "IF", "ELSE", "LPAREN", 
		"PRINT", "RPAREN", "ASSERT", "PLUS", "MINUS", "MULT", "DIV", "GT", "LT", 
		"EQ", "GTEQ", "LTEQ", "POW", "WS", "END_STATEMENT", "VALID_ID_START", 
		"VALID_ID_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "code.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public codeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(codeParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << NEWLINE) | (1L << IF) | (1L << PRINT) | (1L << ASSERT) | (1L << VALID_ID_START))) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext asgn;
		public DeclarationStatementContext decl;
		public ConditionStatementContext cond;
		public AssertStatementContext asrt;
		public PrintStatementContext prnt;
		public TerminalNode END_STATEMENT() { return getToken(codeParser.END_STATEMENT, 0); }
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(codeParser.NEWLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((StatementContext)_localctx).asgn = assignmentStatement();
				setState(37);
				match(END_STATEMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((StatementContext)_localctx).decl = declarationStatement();
				setState(40);
				match(END_STATEMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				((StatementContext)_localctx).cond = conditionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				((StatementContext)_localctx).asrt = assertStatement();
				setState(44);
				match(END_STATEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				((StatementContext)_localctx).prnt = printStatement();
				setState(47);
				match(END_STATEMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public TypeContext typ;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((DeclarationStatementContext)_localctx).typ = type();
			setState(53);
			((DeclarationStatementContext)_localctx).id = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public Token stattype;
		public RelopExpressionContext relexp;
		public TerminalNode LPAREN() { return getToken(codeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(codeParser.RPAREN, 0); }
		public TerminalNode ASSERT() { return getToken(codeParser.ASSERT, 0); }
		public RelopExpressionContext relopExpression() {
			return getRuleContext(RelopExpressionContext.class,0);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((AssertStatementContext)_localctx).stattype = match(ASSERT);
			setState(56);
			match(LPAREN);
			setState(57);
			((AssertStatementContext)_localctx).relexp = relopExpression();
			setState(58);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public Token stattype;
		public ExpressionContext printexp;
		public TerminalNode LPAREN() { return getToken(codeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(codeParser.RPAREN, 0); }
		public TerminalNode PRINT() { return getToken(codeParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((PrintStatementContext)_localctx).stattype = match(PRINT);
			setState(61);
			match(LPAREN);
			setState(62);
			((PrintStatementContext)_localctx).printexp = expression(0);
			setState(63);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionStatementContext extends ParserRuleContext {
		public Token stattype;
		public RelopExpressionContext relexp;
		public StatementContext truestat;
		public StatementContext falsestat;
		public TerminalNode LPAREN() { return getToken(codeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(codeParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(codeParser.IF, 0); }
		public RelopExpressionContext relopExpression() {
			return getRuleContext(RelopExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(codeParser.ELSE, 0); }
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitConditionStatement(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((ConditionStatementContext)_localctx).stattype = match(IF);
			setState(66);
			match(LPAREN);
			setState(67);
			((ConditionStatementContext)_localctx).relexp = relopExpression();
			setState(68);
			match(RPAREN);
			setState(69);
			((ConditionStatementContext)_localctx).truestat = statement();
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(70);
				match(ELSE);
				setState(71);
				((ConditionStatementContext)_localctx).falsestat = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TypeContext typ;
		public IdentifierContext left;
		public Token assign;
		public ExpressionContext right;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(codeParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentStatement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((AssignmentStatementContext)_localctx).typ = type();
				setState(75);
				((AssignmentStatementContext)_localctx).left = identifier();
				setState(76);
				((AssignmentStatementContext)_localctx).assign = match(ASSIGNMENT);
				setState(77);
				((AssignmentStatementContext)_localctx).right = expression(0);
				}
				break;
			case VALID_ID_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((AssignmentStatementContext)_localctx).left = identifier();
				setState(80);
				((AssignmentStatementContext)_localctx).assign = match(ASSIGNMENT);
				setState(81);
				((AssignmentStatementContext)_localctx).right = expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopExpressionContext extends ParserRuleContext {
		public IdentifierContext id;
		public RelopContext rel;
		public ExpressionContext exp;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RelopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterRelopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitRelopExpression(this);
		}
	}

	public final RelopExpressionContext relopExpression() throws RecognitionException {
		RelopExpressionContext _localctx = new RelopExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((RelopExpressionContext)_localctx).id = identifier();
			setState(88);
			((RelopExpressionContext)_localctx).rel = relop();
			setState(89);
			((RelopExpressionContext)_localctx).exp = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public Pure_numberContext num;
		public VariableContext varl;
		public ExpressionContext main_expr;
		public Token op;
		public ExpressionContext right;
		public Pure_numberContext pure_number() {
			return getRuleContext(Pure_numberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(codeParser.MINUS, 0); }
		public TerminalNode LPAREN() { return getToken(codeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(codeParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(codeParser.POW, 0); }
		public TerminalNode MULT() { return getToken(codeParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(codeParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(codeParser.PLUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(92);
				((ExpressionContext)_localctx).num = pure_number();
				}
				break;
			case VALID_ID_START:
				{
				setState(93);
				((ExpressionContext)_localctx).varl = variable();
				}
				break;
			case MINUS:
				{
				setState(94);
				match(MINUS);
				setState(95);
				((ExpressionContext)_localctx).varl = variable();
				}
				break;
			case LPAREN:
				{
				setState(96);
				match(LPAREN);
				setState(97);
				((ExpressionContext)_localctx).main_expr = expression(0);
				setState(98);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						((ExpressionContext)_localctx).op = match(POW);
						setState(104);
						((ExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(106);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						((ExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(109);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						((ExpressionContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(codeParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(codeParser.EQ, 0); }
		public TerminalNode GT() { return getToken(codeParser.GT, 0); }
		public TerminalNode LT() { return getToken(codeParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pure_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(codeParser.NUMBER, 0); }
		public Pure_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pure_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterPure_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitPure_number(this);
		}
	}

	public final Pure_numberContext pure_number() throws RecognitionException {
		Pure_numberContext _localctx = new Pure_numberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pure_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VALID_ID_START() { return getToken(codeParser.VALID_ID_START, 0); }
		public List<TerminalNode> VALID_ID_CHAR() { return getTokens(codeParser.VALID_ID_CHAR); }
		public TerminalNode VALID_ID_CHAR(int i) {
			return getToken(codeParser.VALID_ID_CHAR, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof codeListener ) ((codeListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(VALID_ID_START);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(VALID_ID_CHAR);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\65"+
		"\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bV\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13g\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13r\n\13\f\13"+
		"\16\13u\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17\177\n\17\f\17\16"+
		"\17\u0082\13\17\3\17\2\3\24\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5"+
		"\3\2\17\20\3\2\r\16\3\2\21\23\2\u0084\2!\3\2\2\2\4\64\3\2\2\2\6\66\3\2"+
		"\2\2\b9\3\2\2\2\n>\3\2\2\2\fC\3\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22Y\3\2"+
		"\2\2\24f\3\2\2\2\26v\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34|\3\2\2\2\36 \5"+
		"\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2"+
		"\2\2$%\7\2\2\3%\3\3\2\2\2&\'\5\16\b\2\'(\7\30\2\2(\65\3\2\2\2)*\5\6\4"+
		"\2*+\7\30\2\2+\65\3\2\2\2,\65\5\f\7\2-.\5\b\5\2./\7\30\2\2/\65\3\2\2\2"+
		"\60\61\5\n\6\2\61\62\7\30\2\2\62\65\3\2\2\2\63\65\7\6\2\2\64&\3\2\2\2"+
		"\64)\3\2\2\2\64,\3\2\2\2\64-\3\2\2\2\64\60\3\2\2\2\64\63\3\2\2\2\65\5"+
		"\3\2\2\2\66\67\5\26\f\2\678\5\20\t\28\7\3\2\2\29:\7\f\2\2:;\7\t\2\2;<"+
		"\5\22\n\2<=\7\13\2\2=\t\3\2\2\2>?\7\n\2\2?@\7\t\2\2@A\5\24\13\2AB\7\13"+
		"\2\2B\13\3\2\2\2CD\7\7\2\2DE\7\t\2\2EF\5\22\n\2FG\7\13\2\2GJ\5\4\3\2H"+
		"I\7\b\2\2IK\5\4\3\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LM\5\26\f\2MN\5\20\t"+
		"\2NO\7\3\2\2OP\5\24\13\2PV\3\2\2\2QR\5\20\t\2RS\7\3\2\2ST\5\24\13\2TV"+
		"\3\2\2\2UL\3\2\2\2UQ\3\2\2\2V\17\3\2\2\2WX\5\34\17\2X\21\3\2\2\2YZ\5\20"+
		"\t\2Z[\5\30\r\2[\\\5\24\13\2\\\23\3\2\2\2]^\b\13\1\2^g\5\32\16\2_g\5\34"+
		"\17\2`a\7\16\2\2ag\5\34\17\2bc\7\t\2\2cd\5\24\13\2de\7\13\2\2eg\3\2\2"+
		"\2f]\3\2\2\2f_\3\2\2\2f`\3\2\2\2fb\3\2\2\2gs\3\2\2\2hi\f\t\2\2ij\7\26"+
		"\2\2jr\5\24\13\nkl\f\b\2\2lm\t\2\2\2mr\5\24\13\tno\f\7\2\2op\t\3\2\2p"+
		"r\5\24\13\bqh\3\2\2\2qk\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2t\25\3\2\2\2us\3\2\2\2vw\7\4\2\2w\27\3\2\2\2xy\t\4\2\2y\31\3\2\2\2z"+
		"{\7\5\2\2{\33\3\2\2\2|\u0080\7\31\2\2}\177\7\32\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\35\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\n!\64JUfqs\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}