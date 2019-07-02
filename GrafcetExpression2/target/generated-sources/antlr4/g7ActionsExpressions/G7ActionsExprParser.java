// Generated from G7ActionsExpr.g4 by ANTLR 4.7.1

package g7ActionsExpressions;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class G7ActionsExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAT=1, ASG=2, IF=3, ID=4, WS=5, Expr=6;
	public static final int
		RULE_actExpr = 0, RULE_expr2 = 1;
	public static final String[] ruleNames = {
		"actExpr", "expr2"
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

	@Override
	public String getGrammarFileName() { return "G7ActionsExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public G7ActionsExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ActExprContext extends ParserRuleContext {
		public ActExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actExpr; }
	 
		public ActExprContext() { }
		public void copyFrom(ActExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfExprContext extends ActExprContext {
		public TerminalNode ID() { return getToken(G7ActionsExprParser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(G7ActionsExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(G7ActionsExprParser.WS, i);
		}
		public TerminalNode IF() { return getToken(G7ActionsExprParser.IF, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public IfExprContext(ActExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G7ActionsExprVisitor ) return ((G7ActionsExprVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ActExprContext {
		public TerminalNode ID() { return getToken(G7ActionsExprParser.ID, 0); }
		public IdExprContext(ActExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G7ActionsExprVisitor ) return ((G7ActionsExprVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExprContext extends ActExprContext {
		public TerminalNode SAT() { return getToken(G7ActionsExprParser.SAT, 0); }
		public TerminalNode ID() { return getToken(G7ActionsExprParser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(G7ActionsExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(G7ActionsExprParser.WS, i);
		}
		public TerminalNode ASG() { return getToken(G7ActionsExprParser.ASG, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public AssignmentExprContext(ActExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G7ActionsExprVisitor ) return ((G7ActionsExprVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActExprContext actExpr() throws RecognitionException {
		ActExprContext _localctx = new ActExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_actExpr);
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AssignmentExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				match(SAT);
				setState(6);
				match(ID);
				setState(7);
				match(WS);
				setState(8);
				match(ASG);
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(9);
					match(WS);
					}
					}
					setState(12); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(14);
				expr2();
				}
				break;
			case 3:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(ID);
				setState(16);
				match(WS);
				setState(17);
				match(IF);
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(18);
					match(WS);
					}
					}
					setState(21); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(23);
				expr2();
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

	public static class Expr2Context extends ParserRuleContext {
		public TerminalNode Expr() { return getToken(G7ActionsExprParser.Expr, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G7ActionsExprListener ) ((G7ActionsExprListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G7ActionsExprVisitor ) return ((G7ActionsExprVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(Expr);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\37\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\6\2\r\n\2\r\2\16\2\16\3\2\3\2\3\2\3\2\3\2"+
		"\6\2\26\n\2\r\2\16\2\27\3\2\5\2\33\n\2\3\3\3\3\3\3\2\2\4\2\4\2\2\2 \2"+
		"\32\3\2\2\2\4\34\3\2\2\2\6\33\7\6\2\2\7\b\7\3\2\2\b\t\7\6\2\2\t\n\7\7"+
		"\2\2\n\f\7\4\2\2\13\r\7\7\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16"+
		"\17\3\2\2\2\17\20\3\2\2\2\20\33\5\4\3\2\21\22\7\6\2\2\22\23\7\7\2\2\23"+
		"\25\7\5\2\2\24\26\7\7\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\31\3\2\2\2\31\33\5\4\3\2\32\6\3\2\2\2\32\7\3\2\2\2\32\21"+
		"\3\2\2\2\33\3\3\2\2\2\34\35\7\b\2\2\35\5\3\2\2\2\5\16\27\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}