// Generated from C:\Users\vinic\Videos\Captures\CompiladorAntlr-main\Compiladores\grammar\teste\parser\Trabalho.g4 by ANTLR 4.6
 
package teste.parser;
import java.util.*;
import compiladores.Simbolo;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrabalhoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EOL=6, PE=7, PD=8, ADIC=9, RESTO=10, 
		MENOS=11, MULT=12, DIV=13, IGUAL=14, PALA=15, VAR=16, NUM=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_input = 2, RULE_output = 3, RULE_expr0 = 4, 
		RULE_expr1 = 5, RULE_expr2 = 6;
	public static final String[] ruleNames = {
		"prog", "stmt", "input", "output", "expr0", "expr1", "expr2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'double'", "'string'", "'\"'", "'print'", "';'", "'('", 
		"')'", "'+'", "'%'", "'-'", "'*'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "EOL", "PE", "PD", "ADIC", "RESTO", 
		"MENOS", "MULT", "DIV", "IGUAL", "PALA", "VAR", "NUM", "WS"
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
	public String getGrammarFileName() { return "Trabalho.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private HashMap<String,Simbolo> memory = new HashMap<String,Simbolo>();


	public TrabalhoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Integer val;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				stmt();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << PE) | (1L << VAR) | (1L << NUM))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public Integer val;
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TrabalhoParser.EOL, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case PE:
			case VAR:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				input();
				setState(20);
				match(EOL);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				output();
				setState(23);
				match(EOL);
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

	public static class InputContext extends ParserRuleContext {
		public Integer val;
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
			this.val = ctx.val;
		}
	}
	public static class InputdoublevarContext extends InputContext {
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public InputdoublevarContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterInputdoublevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitInputdoublevar(this);
		}
	}
	public static class InputdoublevarexprContext extends InputContext {
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public InputdoublevarexprContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterInputdoublevarexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitInputdoublevarexpr(this);
		}
	}
	public static class InputstringvarecprContext extends InputContext {
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public TerminalNode PALA() { return getToken(TrabalhoParser.PALA, 0); }
		public InputstringvarecprContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterInputstringvarecpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitInputstringvarecpr(this);
		}
	}
	public static class InputintvarContext extends InputContext {
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public InputintvarContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterInputintvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitInputintvar(this);
		}
	}
	public static class InputexprContext extends InputContext {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public InputexprContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterInputexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitInputexpr(this);
		}
	}
	public static class InputintvarexprContext extends InputContext {
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public InputintvarexprContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterInputintvarexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitInputintvarexpr(this);
		}
	}
	public static class InputstringvarContext extends InputContext {
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public InputstringvarContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterInputstringvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitInputstringvar(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InputintvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__0);
				setState(28);
				match(VAR);
				}
				break;
			case 2:
				_localctx = new InputintvarexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(VAR);
				setState(31);
				match(IGUAL);
				setState(32);
				expr0();
				}
				break;
			case 3:
				_localctx = new InputdoublevarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__1);
				setState(34);
				match(VAR);
				}
				break;
			case 4:
				_localctx = new InputdoublevarexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(T__1);
				setState(36);
				match(VAR);
				setState(37);
				match(IGUAL);
				setState(38);
				expr0();
				}
				break;
			case 5:
				_localctx = new InputstringvarecprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(T__2);
				setState(40);
				match(VAR);
				setState(41);
				match(IGUAL);
				setState(42);
				match(T__3);
				setState(43);
				match(PALA);
				setState(44);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new InputstringvarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(T__2);
				setState(46);
				match(VAR);
				}
				break;
			case 7:
				_localctx = new InputexprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				expr0();
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

	public static class OutputContext extends ParserRuleContext {
		public String val;
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			match(VAR);
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

	public static class Expr0Context extends ParserRuleContext {
		public Integer val;
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
			this.val = ctx.val;
		}
	}
	public static class EprxmenosContext extends Expr0Context {
		public Expr0Context h2;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public EprxmenosContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterEprxmenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitEprxmenos(this);
		}
	}
	public static class EprxsomaContext extends Expr0Context {
		public Expr0Context h1;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public EprxsomaContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterEprxsoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitEprxsoma(this);
		}
	}
	public static class EprxContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public EprxContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterEprx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitEprx(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr0);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EprxsomaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				expr1();
				setState(54);
				match(ADIC);
				setState(55);
				((EprxsomaContext)_localctx).h1 = expr0();
				}
				break;
			case 2:
				_localctx = new EprxmenosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				expr1();
				setState(58);
				match(MENOS);
				setState(59);
				((EprxmenosContext)_localctx).h2 = expr0();
				}
				break;
			case 3:
				_localctx = new EprxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public Integer val;
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
			this.val = ctx.val;
		}
	}
	public static class EprxdmultiContext extends Expr1Context {
		public Expr1Context t1;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public EprxdmultiContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterEprxdmulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitEprxdmulti(this);
		}
	}
	public static class EprxdividirContext extends Expr1Context {
		public Expr1Context t2;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public EprxdividirContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterEprxdividir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitEprxdividir(this);
		}
	}
	public static class Expr1expr2Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1expr2Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterExpr1expr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitExpr1expr2(this);
		}
	}
	public static class EprxrestoContext extends Expr1Context {
		public Expr1Context t3;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public EprxrestoContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterEprxresto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitEprxresto(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new EprxdmultiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				expr2();
				setState(65);
				match(MULT);
				setState(66);
				((EprxdmultiContext)_localctx).t1 = expr1();
				}
				break;
			case 2:
				_localctx = new EprxdividirContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				expr2();
				setState(69);
				match(DIV);
				setState(70);
				((EprxdividirContext)_localctx).t2 = expr1();
				}
				break;
			case 3:
				_localctx = new EprxrestoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				expr2();
				setState(73);
				match(RESTO);
				setState(74);
				((EprxrestoContext)_localctx).t3 = expr1();
				}
				break;
			case 4:
				_localctx = new Expr1expr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
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
		public Integer val;
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
			this.val = ctx.val;
		}
	}
	public static class ExprvarContext extends Expr2Context {
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public ExprvarContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterExprvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitExprvar(this);
		}
	}
	public static class ExprnumContext extends Expr2Context {
		public TerminalNode NUM() { return getToken(TrabalhoParser.NUM, 0); }
		public ExprnumContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterExprnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitExprnum(this);
		}
	}
	public static class ExprparentesContext extends Expr2Context {
		public TerminalNode PE() { return getToken(TrabalhoParser.PE, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode PD() { return getToken(TrabalhoParser.PD, 0); }
		public ExprparentesContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).enterExprparentes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoListener ) ((TrabalhoListener)listener).exitExprparentes(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr2);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PE:
				_localctx = new ExprparentesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(PE);
				setState(80);
				expr0();
				setState(81);
				match(PD);
				}
				break;
			case NUM:
				_localctx = new ExprnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(NUM);
				}
				break;
			case VAR:
				_localctx = new ExprvarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(VAR);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"X\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2a\2\21\3\2\2\2\4\33\3\2\2\2\6\62\3\2"+
		"\2\2\b\64\3\2\2\2\n@\3\2\2\2\fO\3\2\2\2\16W\3\2\2\2\20\22\5\4\3\2\21\20"+
		"\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26"+
		"\5\6\4\2\26\27\7\b\2\2\27\34\3\2\2\2\30\31\5\b\5\2\31\32\7\b\2\2\32\34"+
		"\3\2\2\2\33\25\3\2\2\2\33\30\3\2\2\2\34\5\3\2\2\2\35\36\7\3\2\2\36\63"+
		"\7\22\2\2\37 \7\3\2\2 !\7\22\2\2!\"\7\20\2\2\"\63\5\n\6\2#$\7\4\2\2$\63"+
		"\7\22\2\2%&\7\4\2\2&\'\7\22\2\2\'(\7\20\2\2(\63\5\n\6\2)*\7\5\2\2*+\7"+
		"\22\2\2+,\7\20\2\2,-\7\6\2\2-.\7\21\2\2.\63\7\6\2\2/\60\7\5\2\2\60\63"+
		"\7\22\2\2\61\63\5\n\6\2\62\35\3\2\2\2\62\37\3\2\2\2\62#\3\2\2\2\62%\3"+
		"\2\2\2\62)\3\2\2\2\62/\3\2\2\2\62\61\3\2\2\2\63\7\3\2\2\2\64\65\7\7\2"+
		"\2\65\66\7\22\2\2\66\t\3\2\2\2\678\5\f\7\289\7\13\2\29:\5\n\6\2:A\3\2"+
		"\2\2;<\5\f\7\2<=\7\r\2\2=>\5\n\6\2>A\3\2\2\2?A\5\f\7\2@\67\3\2\2\2@;\3"+
		"\2\2\2@?\3\2\2\2A\13\3\2\2\2BC\5\16\b\2CD\7\16\2\2DE\5\f\7\2EP\3\2\2\2"+
		"FG\5\16\b\2GH\7\17\2\2HI\5\f\7\2IP\3\2\2\2JK\5\16\b\2KL\7\f\2\2LM\5\f"+
		"\7\2MP\3\2\2\2NP\5\16\b\2OB\3\2\2\2OF\3\2\2\2OJ\3\2\2\2ON\3\2\2\2P\r\3"+
		"\2\2\2QR\7\t\2\2RS\5\n\6\2ST\7\n\2\2TX\3\2\2\2UX\7\23\2\2VX\7\22\2\2W"+
		"Q\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\17\3\2\2\2\b\23\33\62@OW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}