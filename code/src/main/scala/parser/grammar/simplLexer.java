// Generated from simpl.g4 by ANTLR 4.7.1
package simpl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGNMENT=1, TYPE=2, NUMBER=3, NEWLINE=4, IF=5, ELSE=6, LPAREN=7, PRINT=8, 
		RPAREN=9, ASSERT=10, PLUS=11, MINUS=12, MULT=13, DIV=14, GT=15, LT=16, 
		EQ=17, GTEQ=18, LTEQ=19, POW=20, WS=21, END_STATEMENT=22, VALID_ID_START=23, 
		VALID_ID_CHAR=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ASSIGNMENT", "TYPE", "NUMBER", "NEWLINE", "IF", "ELSE", "LPAREN", "PRINT", 
		"RPAREN", "ASSERT", "PLUS", "MINUS", "MULT", "DIV", "GT", "LT", "EQ", 
		"GTEQ", "LTEQ", "POW", "WS", "END_STATEMENT", "VALID_ID_START", "VALID_ID_CHAR"
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


	public simplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3\4"+
		"\6\4D\n\4\r\4\16\4E\3\5\5\5I\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\6\26~\n\26\r\26"+
		"\16\26\177\3\26\3\26\3\27\3\27\3\30\5\30\u0087\n\30\3\31\3\31\5\31\u008b"+
		"\n\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\4\5\2\13"+
		"\f\17\17\"\"\5\2C\\aac|\2\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5@\3\2\2\2"+
		"\7C\3\2\2\2\tH\3\2\2\2\13L\3\2\2\2\rO\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2"+
		"\23\\\3\2\2\2\25^\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35k\3\2"+
		"\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%t\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+}"+
		"\3\2\2\2-\u0083\3\2\2\2/\u0086\3\2\2\2\61\u008a\3\2\2\2\63\64\7?\2\2\64"+
		"\4\3\2\2\2\65\66\7k\2\2\66\67\7p\2\2\67A\7v\2\289\7e\2\29:\7j\2\2:;\7"+
		"c\2\2;A\7t\2\2<=\7d\2\2=>\7q\2\2>?\7q\2\2?A\7n\2\2@\65\3\2\2\2@8\3\2\2"+
		"\2@<\3\2\2\2A\6\3\2\2\2BD\4\62;\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\b\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\f\2\2K\n"+
		"\3\2\2\2LM\7k\2\2MN\7h\2\2N\f\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g"+
		"\2\2S\16\3\2\2\2TU\7*\2\2U\20\3\2\2\2VW\7r\2\2WX\7t\2\2XY\7k\2\2YZ\7p"+
		"\2\2Z[\7v\2\2[\22\3\2\2\2\\]\7+\2\2]\24\3\2\2\2^_\7c\2\2_`\7u\2\2`a\7"+
		"u\2\2ab\7g\2\2bc\7t\2\2cd\7v\2\2d\26\3\2\2\2ef\7-\2\2f\30\3\2\2\2gh\7"+
		"/\2\2h\32\3\2\2\2ij\7,\2\2j\34\3\2\2\2kl\7\61\2\2l\36\3\2\2\2mn\7@\2\2"+
		"n \3\2\2\2op\7>\2\2p\"\3\2\2\2qr\7?\2\2rs\7?\2\2s$\3\2\2\2tu\7@\2\2uv"+
		"\7?\2\2v&\3\2\2\2wx\7>\2\2xy\7?\2\2y(\3\2\2\2z{\7`\2\2{*\3\2\2\2|~\t\2"+
		"\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\b\26\2\2\u0082,\3\2\2\2\u0083\u0084\7=\2\2\u0084"+
		".\3\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087\60\3\2\2\2\u0088"+
		"\u008b\5/\30\2\u0089\u008b\4\62;\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\62\3\2\2\2\t\2@EH\177\u0086\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}