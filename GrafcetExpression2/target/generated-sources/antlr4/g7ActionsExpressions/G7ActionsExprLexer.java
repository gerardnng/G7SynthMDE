// Generated from G7ActionsExpr.g4 by ANTLR 4.7.1

package g7ActionsExpressions;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class G7ActionsExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAT=1, ASG=2, IF=3, ID=4, WS=5, Expr=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SAT", "Digit", "Letter", "ASG", "IF", "ID", "WS", "Expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "':='", null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SAT", "ASG", "IF", "ID", "WS", "Expr"
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


	public G7ActionsExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "G7ActionsExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b;\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\4\5\4#\n\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\7\7\60\n\7\f\7\16\7\63\13\7\3\b\3\b\3"+
		"\t\6\t8\n\t\r\t\16\t9\2\2\n\3\3\5\2\7\2\t\4\13\5\r\6\17\7\21\b\3\2\6\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\13\2\"\"*-//\61;>@C]__aac|\2<\2\3\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3"+
		"\35\3\2\2\2\5\37\3\2\2\2\7\"\3\2\2\2\t$\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2"+
		"\17\64\3\2\2\2\21\67\3\2\2\2\23\24\7*\2\2\24\25\7C\2\2\25\26\7E\2\2\26"+
		"\27\7V\2\2\27\36\7+\2\2\30\31\7*\2\2\31\32\7F\2\2\32\33\7G\2\2\33\34\7"+
		"E\2\2\34\36\7+\2\2\35\23\3\2\2\2\35\30\3\2\2\2\36\4\3\2\2\2\37 \t\2\2"+
		"\2 \6\3\2\2\2!#\t\3\2\2\"!\3\2\2\2#\b\3\2\2\2$%\7<\2\2%&\7?\2\2&\n\3\2"+
		"\2\2\'(\7k\2\2(,\7h\2\2)*\7K\2\2*,\7H\2\2+\'\3\2\2\2+)\3\2\2\2,\f\3\2"+
		"\2\2-\61\t\3\2\2.\60\t\4\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\16\3\2\2\2\63\61\3\2\2\2\64\65\7\"\2\2\65\20\3\2\2\2\668\t"+
		"\5\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\22\3\2\2\2\t\2\35"+
		"\"+\61\679\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}