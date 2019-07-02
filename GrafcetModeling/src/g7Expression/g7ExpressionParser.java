// Generated from g7Expression.g4 by ANTLR 4.7.1

package g7Expression;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class g7ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AND=5, OR=6, EQUAL=7, DIFF=8, LE=9, GE=10, 
		LT=11, GT=12, MULT=13, DIV=14, ADD=15, SUB=16, NOT=17, RE=18, FE=19, BoolValue=20, 
		U=21, Number=22, Id=23, WS=24;
	public static final int
		RULE_myG7Expr = 0, RULE_g7Expr = 1, RULE_timeLogicG7Expr = 2, RULE_atomic = 3;
	public static final String[] ruleNames = {
		"myG7Expr", "g7Expr", "timeLogicG7Expr", "atomic"
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

	@Override
	public String getGrammarFileName() { return "g7Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public g7ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MyG7ExprContext extends ParserRuleContext {
		public G7ExprContext g7Expr() {
			return getRuleContext(G7ExprContext.class,0);
		}
		public MyG7ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myG7Expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterMyG7Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitMyG7Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitMyG7Expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyG7ExprContext myG7Expr() throws RecognitionException {
		MyG7ExprContext _localctx = new MyG7ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myG7Expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			g7Expr(0);
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

	public static class G7ExprContext extends ParserRuleContext {
		public G7ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g7Expr; }
	 
		public G7ExprContext() { }
		public void copyFrom(G7ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualDiff_G7ExprContext extends G7ExprContext {
		public G7ExprContext left;
		public Token op;
		public G7ExprContext right;
		public List<G7ExprContext> g7Expr() {
			return getRuleContexts(G7ExprContext.class);
		}
		public G7ExprContext g7Expr(int i) {
			return getRuleContext(G7ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(g7ExpressionParser.EQUAL, 0); }
		public TerminalNode DIFF() { return getToken(g7ExpressionParser.DIFF, 0); }
		public EqualDiff_G7ExprContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterEqualDiff_G7Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitEqualDiff_G7Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitEqualDiff_G7Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryAtomContext extends G7ExprContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public PrimaryAtomContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterPrimaryAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitPrimaryAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitPrimaryAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryParenthesisContext extends G7ExprContext {
		public G7ExprContext g7Expr() {
			return getRuleContext(G7ExprContext.class,0);
		}
		public PrimaryParenthesisContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterPrimaryParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitPrimaryParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitPrimaryParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixMinusContext extends G7ExprContext {
		public Token op;
		public G7ExprContext g7Expr() {
			return getRuleContext(G7ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(g7ExpressionParser.SUB, 0); }
		public InfixMinusContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterInfixMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitInfixMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitInfixMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryTimingContext extends G7ExprContext {
		public TimeLogicG7ExprContext timeLogicG7Expr() {
			return getRuleContext(TimeLogicG7ExprContext.class,0);
		}
		public PrimaryTimingContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterPrimaryTiming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitPrimaryTiming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitPrimaryTiming(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDiv_G7ExprContext extends G7ExprContext {
		public G7ExprContext left;
		public Token op;
		public G7ExprContext right;
		public List<G7ExprContext> g7Expr() {
			return getRuleContexts(G7ExprContext.class);
		}
		public G7ExprContext g7Expr(int i) {
			return getRuleContext(G7ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(g7ExpressionParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(g7ExpressionParser.DIV, 0); }
		public MulDiv_G7ExprContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterMulDiv_G7Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitMulDiv_G7Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitMulDiv_G7Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LEcmp_G7ExprContext extends G7ExprContext {
		public G7ExprContext left;
		public Token op;
		public G7ExprContext right;
		public List<G7ExprContext> g7Expr() {
			return getRuleContexts(G7ExprContext.class);
		}
		public G7ExprContext g7Expr(int i) {
			return getRuleContext(G7ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(g7ExpressionParser.LE, 0); }
		public TerminalNode GE() { return getToken(g7ExpressionParser.GE, 0); }
		public TerminalNode LT() { return getToken(g7ExpressionParser.LT, 0); }
		public TerminalNode GT() { return getToken(g7ExpressionParser.GT, 0); }
		public LEcmp_G7ExprContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterLEcmp_G7Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitLEcmp_G7Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitLEcmp_G7Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryLogicOpContext extends G7ExprContext {
		public Token op;
		public G7ExprContext g7Expr() {
			return getRuleContext(G7ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(g7ExpressionParser.NOT, 0); }
		public TerminalNode RE() { return getToken(g7ExpressionParser.RE, 0); }
		public TerminalNode FE() { return getToken(g7ExpressionParser.FE, 0); }
		public UnaryLogicOpContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterUnaryLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitUnaryLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitUnaryLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSub_G7ExprContext extends G7ExprContext {
		public G7ExprContext left;
		public Token op;
		public G7ExprContext right;
		public List<G7ExprContext> g7Expr() {
			return getRuleContexts(G7ExprContext.class);
		}
		public G7ExprContext g7Expr(int i) {
			return getRuleContext(G7ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(g7ExpressionParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(g7ExpressionParser.SUB, 0); }
		public AddSub_G7ExprContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterAddSub_G7Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitAddSub_G7Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitAddSub_G7Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOr_G7ExprContext extends G7ExprContext {
		public G7ExprContext left;
		public Token op;
		public G7ExprContext right;
		public List<G7ExprContext> g7Expr() {
			return getRuleContexts(G7ExprContext.class);
		}
		public G7ExprContext g7Expr(int i) {
			return getRuleContext(G7ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(g7ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(g7ExpressionParser.OR, 0); }
		public AndOr_G7ExprContext(G7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterAndOr_G7Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitAndOr_G7Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitAndOr_G7Expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final G7ExprContext g7Expr() throws RecognitionException {
		return g7Expr(0);
	}

	private G7ExprContext g7Expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		G7ExprContext _localctx = new G7ExprContext(_ctx, _parentState);
		G7ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_g7Expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case RE:
			case FE:
				{
				_localctx = new UnaryLogicOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(11);
				((UnaryLogicOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << RE) | (1L << FE))) != 0)) ) {
					((UnaryLogicOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(12);
				g7Expr(10);
				}
				break;
			case SUB:
				{
				_localctx = new InfixMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				((InfixMinusContext)_localctx).op = match(SUB);
				setState(14);
				g7Expr(6);
				}
				break;
			case BoolValue:
			case Number:
			case Id:
				{
				_localctx = new PrimaryAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				atomic();
				}
				break;
			case T__2:
				{
				_localctx = new PrimaryTimingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				timeLogicG7Expr();
				}
				break;
			case T__0:
				{
				_localctx = new PrimaryParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(T__0);
				setState(18);
				g7Expr(0);
				setState(19);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new LEcmp_G7ExprContext(new G7ExprContext(_parentctx, _parentState));
						((LEcmp_G7ExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_g7Expr);
						setState(23);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(24);
						((LEcmp_G7ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GE) | (1L << LT) | (1L << GT))) != 0)) ) {
							((LEcmp_G7ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(25);
						((LEcmp_G7ExprContext)_localctx).right = g7Expr(10);
						}
						break;
					case 2:
						{
						_localctx = new EqualDiff_G7ExprContext(new G7ExprContext(_parentctx, _parentState));
						((EqualDiff_G7ExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_g7Expr);
						setState(26);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(27);
						((EqualDiff_G7ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==DIFF) ) {
							((EqualDiff_G7ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(28);
						((EqualDiff_G7ExprContext)_localctx).right = g7Expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AndOr_G7ExprContext(new G7ExprContext(_parentctx, _parentState));
						((AndOr_G7ExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_g7Expr);
						setState(29);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(30);
						((AndOr_G7ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOr_G7ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						((AndOr_G7ExprContext)_localctx).right = g7Expr(8);
						}
						break;
					case 4:
						{
						_localctx = new MulDiv_G7ExprContext(new G7ExprContext(_parentctx, _parentState));
						((MulDiv_G7ExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_g7Expr);
						setState(32);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(33);
						((MulDiv_G7ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDiv_G7ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(34);
						((MulDiv_G7ExprContext)_localctx).right = g7Expr(6);
						}
						break;
					case 5:
						{
						_localctx = new AddSub_G7ExprContext(new G7ExprContext(_parentctx, _parentState));
						((AddSub_G7ExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_g7Expr);
						setState(35);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(36);
						((AddSub_G7ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSub_G7ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(37);
						((AddSub_G7ExprContext)_localctx).right = g7Expr(5);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TimeLogicG7ExprContext extends ParserRuleContext {
		public TimeLogicG7ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeLogicG7Expr; }
	 
		public TimeLogicG7ExprContext() { }
		public void copyFrom(TimeLogicG7ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeLogicDelayed1Context extends TimeLogicG7ExprContext {
		public Token nb;
		public Token unit;
		public G7ExprContext g7Expr() {
			return getRuleContext(G7ExprContext.class,0);
		}
		public TerminalNode Number() { return getToken(g7ExpressionParser.Number, 0); }
		public TerminalNode U() { return getToken(g7ExpressionParser.U, 0); }
		public TimeLogicDelayed1Context(TimeLogicG7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterTimeLogicDelayed1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitTimeLogicDelayed1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitTimeLogicDelayed1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeLogicDelayed2Context extends TimeLogicG7ExprContext {
		public Token nb1;
		public Token unit1;
		public Token nb2;
		public Token unit2;
		public G7ExprContext g7Expr() {
			return getRuleContext(G7ExprContext.class,0);
		}
		public List<TerminalNode> Number() { return getTokens(g7ExpressionParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(g7ExpressionParser.Number, i);
		}
		public List<TerminalNode> U() { return getTokens(g7ExpressionParser.U); }
		public TerminalNode U(int i) {
			return getToken(g7ExpressionParser.U, i);
		}
		public TimeLogicDelayed2Context(TimeLogicG7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterTimeLogicDelayed2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitTimeLogicDelayed2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitTimeLogicDelayed2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeLogicG7ExprLimitedContext extends TimeLogicG7ExprContext {
		public Token op;
		public Token nb;
		public Token unit;
		public G7ExprContext g7Expr() {
			return getRuleContext(G7ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(g7ExpressionParser.NOT, 0); }
		public TerminalNode Number() { return getToken(g7ExpressionParser.Number, 0); }
		public TerminalNode U() { return getToken(g7ExpressionParser.U, 0); }
		public TimeLogicG7ExprLimitedContext(TimeLogicG7ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterTimeLogicG7ExprLimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitTimeLogicG7ExprLimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitTimeLogicG7ExprLimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeLogicG7ExprContext timeLogicG7Expr() throws RecognitionException {
		TimeLogicG7ExprContext _localctx = new TimeLogicG7ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_timeLogicG7Expr);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new TimeLogicDelayed2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__2);
				setState(44);
				((TimeLogicDelayed2Context)_localctx).nb1 = match(Number);
				setState(45);
				((TimeLogicDelayed2Context)_localctx).unit1 = match(U);
				setState(46);
				match(DIV);
				setState(47);
				g7Expr(0);
				setState(48);
				match(DIV);
				setState(49);
				((TimeLogicDelayed2Context)_localctx).nb2 = match(Number);
				setState(50);
				((TimeLogicDelayed2Context)_localctx).unit2 = match(U);
				setState(51);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new TimeLogicDelayed1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__2);
				setState(54);
				((TimeLogicDelayed1Context)_localctx).nb = match(Number);
				setState(55);
				((TimeLogicDelayed1Context)_localctx).unit = match(U);
				setState(56);
				match(DIV);
				setState(57);
				g7Expr(0);
				setState(58);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new TimeLogicG7ExprLimitedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__2);
				setState(61);
				((TimeLogicG7ExprLimitedContext)_localctx).op = match(NOT);
				setState(62);
				((TimeLogicG7ExprLimitedContext)_localctx).nb = match(Number);
				setState(63);
				((TimeLogicG7ExprLimitedContext)_localctx).unit = match(U);
				setState(64);
				match(DIV);
				setState(65);
				g7Expr(0);
				setState(66);
				match(T__3);
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

	public static class AtomicContext extends ParserRuleContext {
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	 
		public AtomicContext() { }
		public void copyFrom(AtomicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomBoolContext extends AtomicContext {
		public TerminalNode BoolValue() { return getToken(g7ExpressionParser.BoolValue, 0); }
		public AtomBoolContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterAtomBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitAtomBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitAtomBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomNumberContext extends AtomicContext {
		public TerminalNode Number() { return getToken(g7ExpressionParser.Number, 0); }
		public AtomNumberContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitAtomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomIdContext extends AtomicContext {
		public TerminalNode Id() { return getToken(g7ExpressionParser.Id, 0); }
		public AtomIdContext(AtomicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).enterAtomId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof g7ExpressionListener ) ((g7ExpressionListener)listener).exitAtomId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof g7ExpressionVisitor ) return ((g7ExpressionVisitor<? extends T>)visitor).visitAtomId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atomic);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(Number);
				}
				break;
			case Id:
				_localctx = new AtomIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(Id);
				}
				break;
			case BoolValue:
				_localctx = new AtomBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(BoolValue);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return g7Expr_sempred((G7ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean g7Expr_sempred(G7ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4G\n\4\3\5"+
		"\3\5\3\5\5\5L\n\5\3\5\2\3\4\6\2\4\6\b\2\b\3\2\23\25\3\2\13\16\3\2\t\n"+
		"\3\2\7\b\3\2\17\20\3\2\21\22\2V\2\n\3\2\2\2\4\27\3\2\2\2\6F\3\2\2\2\b"+
		"K\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\b\3\1\2\r\16\t\2\2\2\16\30\5\4"+
		"\3\f\17\20\7\22\2\2\20\30\5\4\3\b\21\30\5\b\5\2\22\30\5\6\4\2\23\24\7"+
		"\3\2\2\24\25\5\4\3\2\25\26\7\4\2\2\26\30\3\2\2\2\27\f\3\2\2\2\27\17\3"+
		"\2\2\2\27\21\3\2\2\2\27\22\3\2\2\2\27\23\3\2\2\2\30*\3\2\2\2\31\32\f\13"+
		"\2\2\32\33\t\3\2\2\33)\5\4\3\f\34\35\f\n\2\2\35\36\t\4\2\2\36)\5\4\3\13"+
		"\37 \f\t\2\2 !\t\5\2\2!)\5\4\3\n\"#\f\7\2\2#$\t\6\2\2$)\5\4\3\b%&\f\6"+
		"\2\2&\'\t\7\2\2\')\5\4\3\7(\31\3\2\2\2(\34\3\2\2\2(\37\3\2\2\2(\"\3\2"+
		"\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2-.\7"+
		"\5\2\2./\7\30\2\2/\60\7\27\2\2\60\61\7\20\2\2\61\62\5\4\3\2\62\63\7\20"+
		"\2\2\63\64\7\30\2\2\64\65\7\27\2\2\65\66\7\6\2\2\66G\3\2\2\2\678\7\5\2"+
		"\289\7\30\2\29:\7\27\2\2:;\7\20\2\2;<\5\4\3\2<=\7\6\2\2=G\3\2\2\2>?\7"+
		"\5\2\2?@\7\23\2\2@A\7\30\2\2AB\7\27\2\2BC\7\20\2\2CD\5\4\3\2DE\7\6\2\2"+
		"EG\3\2\2\2F-\3\2\2\2F\67\3\2\2\2F>\3\2\2\2G\7\3\2\2\2HL\7\30\2\2IL\7\31"+
		"\2\2JL\7\26\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2\7\27(*FK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}