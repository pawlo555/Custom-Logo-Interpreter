// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/grammar\Lynx.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LynxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NEGATINATURALNUMBER=4, NATURALNUMBER=5, FLOATNUMBER=6, 
		FLOATNUMBER2=7, NOT=8, AND=9, OR=10, BACK=11, DISTANCE=12, FORWARD=13, 
		GLIDE=14, HEADING=15, HOME=16, LEFT=17, POS=18, RIGHT=19, SETHEADING=20, 
		SETPOS=21, SETX=22, SETY=23, TOWARDS=24, XCOR=25, YCOR=26, REPEAT=27, 
		IF=28, WORD=29, WHITESPACE=30, NEWLINE=31, IFSTATMENT=32;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_numberCommand = 2, RULE_bracketCommand = 3, 
		RULE_wordCommand = 4, RULE_numberNumberCommand = 5, RULE_justCommand = 6, 
		RULE_repeat = 7, RULE_insideLoop = 8, RULE_multipleInside = 9, RULE_oneInside = 10, 
		RULE_totalnumber = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "numberCommand", "bracketCommand", "wordCommand", 
			"numberNumberCommand", "justCommand", "repeat", "insideLoop", "multipleInside", 
			"oneInside", "totalnumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NEGATINATURALNUMBER", "NATURALNUMBER", "FLOATNUMBER", 
			"FLOATNUMBER2", "NOT", "AND", "OR", "BACK", "DISTANCE", "FORWARD", "GLIDE", 
			"HEADING", "HOME", "LEFT", "POS", "RIGHT", "SETHEADING", "SETPOS", "SETX", 
			"SETY", "TOWARDS", "XCOR", "YCOR", "REPEAT", "IF", "WORD", "WHITESPACE", 
			"NEWLINE", "IFSTATMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Lynx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LynxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LynxParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				command();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << DISTANCE) | (1L << FORWARD) | (1L << GLIDE) | (1L << HEADING) | (1L << HOME) | (1L << LEFT) | (1L << POS) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETPOS) | (1L << SETX) | (1L << SETY) | (1L << TOWARDS) | (1L << XCOR) | (1L << YCOR) | (1L << REPEAT) | (1L << NEWLINE))) != 0) );
			setState(29);
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

	public static class CommandContext extends ParserRuleContext {
		public NumberCommandContext numberCommand() {
			return getRuleContext(NumberCommandContext.class,0);
		}
		public BracketCommandContext bracketCommand() {
			return getRuleContext(BracketCommandContext.class,0);
		}
		public WordCommandContext wordCommand() {
			return getRuleContext(WordCommandContext.class,0);
		}
		public NumberNumberCommandContext numberNumberCommand() {
			return getRuleContext(NumberNumberCommandContext.class,0);
		}
		public JustCommandContext justCommand() {
			return getRuleContext(JustCommandContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LynxParser.NEWLINE, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK:
			case FORWARD:
			case LEFT:
			case RIGHT:
			case SETHEADING:
			case SETX:
			case SETY:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				numberCommand();
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				bracketCommand();
				}
				break;
			case DISTANCE:
			case TOWARDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				wordCommand();
				}
				break;
			case GLIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				numberNumberCommand();
				}
				break;
			case HEADING:
			case HOME:
			case POS:
			case XCOR:
			case YCOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				justCommand();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				repeat();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				match(NEWLINE);
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

	public static class NumberCommandContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LynxParser.WHITESPACE, 0); }
		public TotalnumberContext totalnumber() {
			return getRuleContext(TotalnumberContext.class,0);
		}
		public TerminalNode BACK() { return getToken(LynxParser.BACK, 0); }
		public TerminalNode FORWARD() { return getToken(LynxParser.FORWARD, 0); }
		public TerminalNode LEFT() { return getToken(LynxParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(LynxParser.RIGHT, 0); }
		public TerminalNode SETHEADING() { return getToken(LynxParser.SETHEADING, 0); }
		public TerminalNode SETX() { return getToken(LynxParser.SETX, 0); }
		public TerminalNode SETY() { return getToken(LynxParser.SETY, 0); }
		public NumberCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNumberCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNumberCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNumberCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberCommandContext numberCommand() throws RecognitionException {
		NumberCommandContext _localctx = new NumberCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numberCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << FORWARD) | (1L << LEFT) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETX) | (1L << SETY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			match(WHITESPACE);
			setState(42);
			totalnumber();
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

	public static class BracketCommandContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LynxParser.WHITESPACE, 0); }
		public List<TotalnumberContext> totalnumber() {
			return getRuleContexts(TotalnumberContext.class);
		}
		public TotalnumberContext totalnumber(int i) {
			return getRuleContext(TotalnumberContext.class,i);
		}
		public TerminalNode SETPOS() { return getToken(LynxParser.SETPOS, 0); }
		public BracketCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBracketCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBracketCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBracketCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketCommandContext bracketCommand() throws RecognitionException {
		BracketCommandContext _localctx = new BracketCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bracketCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(SETPOS);
			}
			setState(45);
			match(WHITESPACE);
			setState(46);
			match(T__0);
			setState(47);
			totalnumber();
			setState(48);
			match(T__1);
			setState(49);
			totalnumber();
			setState(50);
			match(T__2);
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

	public static class WordCommandContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LynxParser.WHITESPACE, 0); }
		public TerminalNode WORD() { return getToken(LynxParser.WORD, 0); }
		public TerminalNode DISTANCE() { return getToken(LynxParser.DISTANCE, 0); }
		public TerminalNode TOWARDS() { return getToken(LynxParser.TOWARDS, 0); }
		public WordCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterWordCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitWordCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitWordCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordCommandContext wordCommand() throws RecognitionException {
		WordCommandContext _localctx = new WordCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wordCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==DISTANCE || _la==TOWARDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			match(WHITESPACE);
			setState(54);
			match(WORD);
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

	public static class NumberNumberCommandContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(LynxParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LynxParser.WHITESPACE, i);
		}
		public List<TotalnumberContext> totalnumber() {
			return getRuleContexts(TotalnumberContext.class);
		}
		public TotalnumberContext totalnumber(int i) {
			return getRuleContext(TotalnumberContext.class,i);
		}
		public TerminalNode GLIDE() { return getToken(LynxParser.GLIDE, 0); }
		public NumberNumberCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberNumberCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNumberNumberCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNumberNumberCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNumberNumberCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberNumberCommandContext numberNumberCommand() throws RecognitionException {
		NumberNumberCommandContext _localctx = new NumberNumberCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numberNumberCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			match(GLIDE);
			}
			setState(57);
			match(WHITESPACE);
			setState(58);
			totalnumber();
			setState(59);
			match(WHITESPACE);
			setState(60);
			totalnumber();
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

	public static class JustCommandContext extends ParserRuleContext {
		public TerminalNode HEADING() { return getToken(LynxParser.HEADING, 0); }
		public TerminalNode HOME() { return getToken(LynxParser.HOME, 0); }
		public TerminalNode POS() { return getToken(LynxParser.POS, 0); }
		public TerminalNode XCOR() { return getToken(LynxParser.XCOR, 0); }
		public TerminalNode YCOR() { return getToken(LynxParser.YCOR, 0); }
		public JustCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterJustCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitJustCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitJustCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustCommandContext justCommand() throws RecognitionException {
		JustCommandContext _localctx = new JustCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_justCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEADING) | (1L << HOME) | (1L << POS) | (1L << XCOR) | (1L << YCOR))) != 0)) ) {
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(LynxParser.REPEAT, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(LynxParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LynxParser.WHITESPACE, i);
		}
		public TerminalNode NATURALNUMBER() { return getToken(LynxParser.NATURALNUMBER, 0); }
		public InsideLoopContext insideLoop() {
			return getRuleContext(InsideLoopContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(REPEAT);
			setState(65);
			match(WHITESPACE);
			setState(66);
			match(NATURALNUMBER);
			setState(67);
			match(WHITESPACE);
			setState(68);
			insideLoop();
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

	public static class InsideLoopContext extends ParserRuleContext {
		public MultipleInsideContext multipleInside() {
			return getRuleContext(MultipleInsideContext.class,0);
		}
		public OneInsideContext oneInside() {
			return getRuleContext(OneInsideContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LynxParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LynxParser.WHITESPACE, i);
		}
		public InsideLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterInsideLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitInsideLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitInsideLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideLoopContext insideLoop() throws RecognitionException {
		InsideLoopContext _localctx = new InsideLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insideLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__0);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(71);
				match(WHITESPACE);
				}
			}

			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(74);
				multipleInside();
				}
				break;
			case 2:
				{
				setState(75);
				oneInside();
				}
				break;
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(78);
				match(WHITESPACE);
				}
			}

			setState(81);
			match(T__2);
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

	public static class MultipleInsideContext extends ParserRuleContext {
		public OneInsideContext oneInside() {
			return getRuleContext(OneInsideContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LynxParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LynxParser.WHITESPACE, i);
		}
		public MultipleInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMultipleInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMultipleInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMultipleInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleInsideContext multipleInside() throws RecognitionException {
		MultipleInsideContext _localctx = new MultipleInsideContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multipleInside);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(86); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(83);
						command();
						setState(84);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(88); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(90);
				oneInside();
				}
				break;
			case 2:
				{
				setState(92);
				oneInside();
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

	public static class OneInsideContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public OneInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterOneInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitOneInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitOneInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneInsideContext oneInside() throws RecognitionException {
		OneInsideContext _localctx = new OneInsideContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oneInside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			command();
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

	public static class TotalnumberContext extends ParserRuleContext {
		public TerminalNode NATURALNUMBER() { return getToken(LynxParser.NATURALNUMBER, 0); }
		public TerminalNode NEGATINATURALNUMBER() { return getToken(LynxParser.NEGATINATURALNUMBER, 0); }
		public TotalnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterTotalnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitTotalnumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitTotalnumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalnumberContext totalnumber() throws RecognitionException {
		TotalnumberContext _localctx = new TotalnumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_totalnumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==NEGATINATURALNUMBER || _la==NATURALNUMBER) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\5\nK\n\n\3\n\3\n\5\nO\n\n\3\n\5\nR\n\n\3\n\3\n\3\13\3\13\3\13\6"+
		"\13Y\n\13\r\13\16\13Z\3\13\3\13\3\13\5\13`\n\13\3\f\3\f\3\r\3\r\3\r\2"+
		"\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\7\2\r\r\17\17\23\23\25\26\30\31"+
		"\4\2\16\16\32\32\5\2\21\22\24\24\33\34\3\2\6\7\2e\2\33\3\2\2\2\4(\3\2"+
		"\2\2\6*\3\2\2\2\b.\3\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16@\3\2\2\2\20B\3\2"+
		"\2\2\22H\3\2\2\2\24_\3\2\2\2\26a\3\2\2\2\30c\3\2\2\2\32\34\5\4\3\2\33"+
		"\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37"+
		" \7\2\2\3 \3\3\2\2\2!)\5\6\4\2\")\5\b\5\2#)\5\n\6\2$)\5\f\7\2%)\5\16\b"+
		"\2&)\5\20\t\2\')\7!\2\2(!\3\2\2\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2\2(%\3\2"+
		"\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\t\2\2\2+,\7 \2\2,-\5\30\r\2-\7"+
		"\3\2\2\2./\7\27\2\2/\60\7 \2\2\60\61\7\3\2\2\61\62\5\30\r\2\62\63\7\4"+
		"\2\2\63\64\5\30\r\2\64\65\7\5\2\2\65\t\3\2\2\2\66\67\t\3\2\2\678\7 \2"+
		"\289\7\37\2\29\13\3\2\2\2:;\7\20\2\2;<\7 \2\2<=\5\30\r\2=>\7 \2\2>?\5"+
		"\30\r\2?\r\3\2\2\2@A\t\4\2\2A\17\3\2\2\2BC\7\35\2\2CD\7 \2\2DE\7\7\2\2"+
		"EF\7 \2\2FG\5\22\n\2G\21\3\2\2\2HJ\7\3\2\2IK\7 \2\2JI\3\2\2\2JK\3\2\2"+
		"\2KN\3\2\2\2LO\5\24\13\2MO\5\26\f\2NL\3\2\2\2NM\3\2\2\2OQ\3\2\2\2PR\7"+
		" \2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\5\2\2T\23\3\2\2\2UV\5\4\3\2VW"+
		"\7 \2\2WY\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\"+
		"]\5\26\f\2]`\3\2\2\2^`\5\26\f\2_X\3\2\2\2_^\3\2\2\2`\25\3\2\2\2ab\5\4"+
		"\3\2b\27\3\2\2\2cd\t\5\2\2d\31\3\2\2\2\t\35(JNQZ_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}