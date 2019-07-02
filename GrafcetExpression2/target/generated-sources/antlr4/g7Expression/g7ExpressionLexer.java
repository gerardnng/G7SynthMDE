// Generated from g7Expression.g4 by ANTLR 4.7.1

package g7Expression;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class g7ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AND=5, OR=6, EQUAL=7, DIFF=8, LE=9, GE=10, 
		LT=11, GT=12, MULT=13, DIV=14, ADD=15, SUB=16, NOT=17, RE=18, FE=19, BoolValue=20, 
		U=21, Number=22, Id=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "AND", "OR", "EQUAL", "DIFF", "LE", "GE", 
		"LT", "GT", "MULT", "DIV", "ADD", "SUB", "NOT", "RE", "FE", "BoolValue", 
		"U", "Digit", "Letter", "IntPlus", "Number", "Id", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", null, null, null, null, "'<='", "'>='", 
		"'<'", "'>'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "AND", "OR", "EQUAL", "DIFF", "LE", "GE", 
		"LT", "GT", "MULT", "DIV", "ADD", "SUB", "NOT", "RE", "FE", "BoolValue", 
		"U", "Number", "Id", "WS"
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


	public g7ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g7Expression.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n"+
		"\7\3\b\3\b\3\b\5\bW\n\b\3\t\3\t\3\t\3\t\5\t]\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22x\n\22\3\23\3\23\3\23\3\23\5\23~\n\23\3"+
		"\24\3\24\3\24\3\24\5\24\u0084\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u008f\n\25\3\26\3\26\3\26\5\26\u0094\n\26\3\27\3\27\3"+
		"\30\5\30\u0099\n\30\3\31\6\31\u009c\n\31\r\31\16\31\u009d\3\32\6\32\u00a1"+
		"\n\32\r\32\16\32\u00a2\3\32\3\32\6\32\u00a7\n\32\r\32\16\32\u00a8\5\32"+
		"\u00ab\n\32\3\33\3\33\3\33\7\33\u00b0\n\33\f\33\16\33\u00b3\13\33\3\34"+
		"\6\34\u00b6\n\34\r\34\16\34\u00b7\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\2/\2\61\2\63\30\65\31\67\32\3\2\6\5\2jjoouu\3\2\62;\5\2C"+
		"\\aac|\5\2\13\13\17\17\"\"\2\u00ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2"+
		"\2\2\7=\3\2\2\2\t?\3\2\2\2\13I\3\2\2\2\rQ\3\2\2\2\17V\3\2\2\2\21\\\3\2"+
		"\2\2\23^\3\2\2\2\25a\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3"+
		"\2\2\2\37l\3\2\2\2!n\3\2\2\2#w\3\2\2\2%}\3\2\2\2\'\u0083\3\2\2\2)\u008e"+
		"\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0098\3\2\2\2\61\u009b\3\2\2\2"+
		"\63\u00a0\3\2\2\2\65\u00ac\3\2\2\2\67\u00b5\3\2\2\29:\7*\2\2:\4\3\2\2"+
		"\2;<\7+\2\2<\6\3\2\2\2=>\7]\2\2>\b\3\2\2\2?@\7_\2\2@\n\3\2\2\2AB\7c\2"+
		"\2BC\7p\2\2CJ\7f\2\2DE\7C\2\2EF\7P\2\2FJ\7F\2\2GH\7(\2\2HJ\7(\2\2IA\3"+
		"\2\2\2ID\3\2\2\2IG\3\2\2\2J\f\3\2\2\2KL\7q\2\2LR\7t\2\2MN\7Q\2\2NR\7T"+
		"\2\2OP\7~\2\2PR\7~\2\2QK\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\16\3\2\2\2ST\7?"+
		"\2\2TW\7?\2\2UW\7?\2\2VS\3\2\2\2VU\3\2\2\2W\20\3\2\2\2XY\7#\2\2Y]\7?\2"+
		"\2Z[\7>\2\2[]\7@\2\2\\X\3\2\2\2\\Z\3\2\2\2]\22\3\2\2\2^_\7>\2\2_`\7?\2"+
		"\2`\24\3\2\2\2ab\7@\2\2bc\7?\2\2c\26\3\2\2\2de\7>\2\2e\30\3\2\2\2fg\7"+
		"@\2\2g\32\3\2\2\2hi\7,\2\2i\34\3\2\2\2jk\7\61\2\2k\36\3\2\2\2lm\7-\2\2"+
		"m \3\2\2\2no\7/\2\2o\"\3\2\2\2pq\7p\2\2qr\7q\2\2rx\7v\2\2st\7P\2\2tu\7"+
		"Q\2\2ux\7V\2\2vx\7#\2\2wp\3\2\2\2ws\3\2\2\2wv\3\2\2\2x$\3\2\2\2yz\7T\2"+
		"\2z~\7G\2\2{|\7t\2\2|~\7g\2\2}y\3\2\2\2}{\3\2\2\2~&\3\2\2\2\177\u0080"+
		"\7H\2\2\u0080\u0084\7G\2\2\u0081\u0082\7h\2\2\u0082\u0084\7g\2\2\u0083"+
		"\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084(\3\2\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u008f\7g\2\2\u0089\u008a\7h\2\2"+
		"\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008f"+
		"\7g\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008f*\3\2\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0094\7u\2\2\u0092\u0094\t\2\2\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094,\3\2\2\2\u0095\u0096\t\3\2\2\u0096.\3\2\2\2\u0097"+
		"\u0099\t\4\2\2\u0098\u0097\3\2\2\2\u0099\60\3\2\2\2\u009a\u009c\5-\27"+
		"\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\62\3\2\2\2\u009f\u00a1\5-\27\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00aa\3\2"+
		"\2\2\u00a4\u00a6\7\60\2\2\u00a5\u00a7\5-\27\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\64\3\2\2\2\u00ac\u00b1"+
		"\5/\30\2\u00ad\u00b0\5/\30\2\u00ae\u00b0\5-\27\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\66\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\b\34\2\2\u00ba8\3\2\2\2\24\2IQV\\w}\u0083\u008e"+
		"\u0093\u0098\u009d\u00a2\u00a8\u00aa\u00af\u00b1\u00b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}