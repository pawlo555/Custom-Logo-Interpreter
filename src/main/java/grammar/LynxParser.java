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
		T__0=1, T__1=2, T__2=3, BACK=4, DISTANCE=5, FORWARD=6, GLIDE=7, HEADING=8, 
		HOME=9, LEFT=10, POS=11, RIGHT=12, SETHEADING=13, SETPOS=14, SETX=15, 
		SETY=16, TOWARDS=17, XCOR=18, YCOR=19, BG=20, CG=21, CLEAN=22, COLOR=23, 
		COLORUNDER=24, FILL=25, FREEZEBG=26, NAMEFROMCOLOUR=27, PD=28, PE=29, 
		PENSIZE=30, PU=31, SETBG=32, SETCOLOR=33, SETPENSIZE=34, STAMP=35, UNFREEZEBG=36, 
		HT=37, INBACK=38, INFRONT=39, OPACITY=40, SETOPACITY=41, SETSHAPE=42, 
		SETSIZE=43, SHAPE=44, SIZE=45, ST=46, CLICKOFF=47, CLICKON=48, CLONE=49, 
		TELL=50, TOUCHINGX=51, WHO=52, ANNOUNCE=53, ASCII=54, BOTTOM=55, CB=56, 
		CC=57, CD=58, CF=59, CHAR=60, CLEARTEXT=61, CU=62, DELETE=63, EOL=64, 
		EOT=65, HIDETEXT=66, INSERT=67, PRINT=68, SELECT=69, SELECTED=70, SHOW=71, 
		SHOWTEXT=72, SOL=73, TEXTCOUNT=74, TEXTITEM=75, TEXTPICK=76, TEXTWHO=77, 
		TOP=78, TRANSPARENT=79, UNSELECT=80, BUTFIRST=81, BUTLAST=82, COUNT=83, 
		EMPTY=84, EQUALX=85, FIRST=86, FPUT=87, IDENTICALX=88, ITEM=89, LAST=90, 
		LIST=91, LISTX=92, LPUT=93, MEMBERX=94, NUMBER=95, PARSE=96, PICK=97, 
		SENTENCE=98, WORD=99, WORDX=100, ABS=101, ARCTAN=102, COS=103, DIFFERENCE=104, 
		EXP=105, GREATERX=106, INT=107, LESSX=108, LN=109, LOG=110, MINUS=111, 
		PI=112, POWER=113, PRODUCT=114, QUOTIENT=115, RANDOM=116, REMAINDER=117, 
		ROUND=118, SIN=119, SQRT=120, SUM=121, TAN=122, ASK=123, FREEZE=124, GET=125, 
		NEWPAGE=126, NEWSLIDER=127, NEWTEXT=128, NEWTURTLE=129, REMOVE=130, RENAME=131, 
		SET=132, TALKTO=133, UNFREEZE=134, RESETT=135, TIMER=136, CLEARNAME=137, 
		CLEARNAMES=138, LET=139, MAKE=140, NAMEX=141, NAMES=142, THING=143, GETPAGE=144, 
		NAMEPAGE=145, NEXTPAGE=146, PAGELIST=147, PREVPAGE=148, PROJECTSIZE=149, 
		AND=150, IF=151, IFELSE=152, NOT=153, OR=154, ANSWER=155, KEYX=156, MOUSEPOS=157, 
		PEEKCHAR=158, QUESTION=159, READCHAR=160, SAY=161, SAYAS=162, SKIPCHAR=163, 
		VOICES=164, BROADCAST=165, CANCEL=166, CAREFULLY=167, DOLIST=168, DOTIMES=169, 
		ERRORMESSAGE=170, EVERYONE=171, FOREVER=172, LAUNCH=173, OUTPUT=174, REPEAT=175, 
		RUN=176, STOP=177, STOPALL=178, STOPME=179, WAIT=180, NATURALNUMBER=181, 
		NEGATINATURALNUMBER=182, FLOATNUMBER=183, OTHERWORD=184, WHITESPACE=185, 
		NEWLINE=186;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_cmd = 2, RULE_repeat = 3, RULE_back = 4, 
		RULE_forward = 5, RULE_left = 6, RULE_right = 7, RULE_setheading = 8, 
		RULE_setx = 9, RULE_sety = 10, RULE_setpos = 11, RULE_distance = 12, RULE_towards = 13, 
		RULE_gilde = 14, RULE_heading = 15, RULE_home = 16, RULE_pos = 17, RULE_xcor = 18, 
		RULE_ycor = 19, RULE_spaceArg = 20, RULE_newLineArg = 21, RULE_brakeArg = 22, 
		RULE_naturalNumberArg = 23, RULE_totalnumberArg = 24, RULE_stringArg = 25, 
		RULE_endFileArg = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "cmd", "repeat", "back", "forward", "left", "right", 
			"setheading", "setx", "sety", "setpos", "distance", "towards", "gilde", 
			"heading", "home", "pos", "xcor", "ycor", "spaceArg", "newLineArg", "brakeArg", 
			"naturalNumberArg", "totalnumberArg", "stringArg", "endFileArg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BACK", "DISTANCE", "FORWARD", "GLIDE", "HEADING", 
			"HOME", "LEFT", "POS", "RIGHT", "SETHEADING", "SETPOS", "SETX", "SETY", 
			"TOWARDS", "XCOR", "YCOR", "BG", "CG", "CLEAN", "COLOR", "COLORUNDER", 
			"FILL", "FREEZEBG", "NAMEFROMCOLOUR", "PD", "PE", "PENSIZE", "PU", "SETBG", 
			"SETCOLOR", "SETPENSIZE", "STAMP", "UNFREEZEBG", "HT", "INBACK", "INFRONT", 
			"OPACITY", "SETOPACITY", "SETSHAPE", "SETSIZE", "SHAPE", "SIZE", "ST", 
			"CLICKOFF", "CLICKON", "CLONE", "TELL", "TOUCHINGX", "WHO", "ANNOUNCE", 
			"ASCII", "BOTTOM", "CB", "CC", "CD", "CF", "CHAR", "CLEARTEXT", "CU", 
			"DELETE", "EOL", "EOT", "HIDETEXT", "INSERT", "PRINT", "SELECT", "SELECTED", 
			"SHOW", "SHOWTEXT", "SOL", "TEXTCOUNT", "TEXTITEM", "TEXTPICK", "TEXTWHO", 
			"TOP", "TRANSPARENT", "UNSELECT", "BUTFIRST", "BUTLAST", "COUNT", "EMPTY", 
			"EQUALX", "FIRST", "FPUT", "IDENTICALX", "ITEM", "LAST", "LIST", "LISTX", 
			"LPUT", "MEMBERX", "NUMBER", "PARSE", "PICK", "SENTENCE", "WORD", "WORDX", 
			"ABS", "ARCTAN", "COS", "DIFFERENCE", "EXP", "GREATERX", "INT", "LESSX", 
			"LN", "LOG", "MINUS", "PI", "POWER", "PRODUCT", "QUOTIENT", "RANDOM", 
			"REMAINDER", "ROUND", "SIN", "SQRT", "SUM", "TAN", "ASK", "FREEZE", "GET", 
			"NEWPAGE", "NEWSLIDER", "NEWTEXT", "NEWTURTLE", "REMOVE", "RENAME", "SET", 
			"TALKTO", "UNFREEZE", "RESETT", "TIMER", "CLEARNAME", "CLEARNAMES", "LET", 
			"MAKE", "NAMEX", "NAMES", "THING", "GETPAGE", "NAMEPAGE", "NEXTPAGE", 
			"PAGELIST", "PREVPAGE", "PROJECTSIZE", "AND", "IF", "IFELSE", "NOT", 
			"OR", "ANSWER", "KEYX", "MOUSEPOS", "PEEKCHAR", "QUESTION", "READCHAR", 
			"SAY", "SAYAS", "SKIPCHAR", "VOICES", "BROADCAST", "CANCEL", "CAREFULLY", 
			"DOLIST", "DOTIMES", "ERRORMESSAGE", "EVERYONE", "FOREVER", "LAUNCH", 
			"OUTPUT", "REPEAT", "RUN", "STOP", "STOPALL", "STOPME", "WAIT", "NATURALNUMBER", 
			"NEGATINATURALNUMBER", "FLOATNUMBER", "OTHERWORD", "WHITESPACE", "NEWLINE"
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
		public EndFileArgContext endFileArg() {
			return getRuleContext(EndFileArgContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				line();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << DISTANCE) | (1L << FORWARD) | (1L << GLIDE) | (1L << HEADING) | (1L << HOME) | (1L << LEFT) | (1L << POS) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETPOS) | (1L << SETX) | (1L << SETY) | (1L << TOWARDS) | (1L << XCOR) | (1L << YCOR))) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (REPEAT - 175)) | (1L << (WHITESPACE - 175)) | (1L << (NEWLINE - 175)))) != 0) );
			setState(59);
			endFileArg();
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

	public static class LineContext extends ParserRuleContext {
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<SpaceArgContext> spaceArg() {
			return getRuleContexts(SpaceArgContext.class);
		}
		public SpaceArgContext spaceArg(int i) {
			return getRuleContext(SpaceArgContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(61);
				brakeArg();
				}
				break;
			}
			setState(71); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(64);
						spaceArg();
						}
					}

					setState(67);
					cmd();
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(68);
						spaceArg();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75);
				brakeArg();
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

	public static class CmdContext extends ParserRuleContext {
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public ForwardContext forward() {
			return getRuleContext(ForwardContext.class,0);
		}
		public BackContext back() {
			return getRuleContext(BackContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public SetheadingContext setheading() {
			return getRuleContext(SetheadingContext.class,0);
		}
		public SetxContext setx() {
			return getRuleContext(SetxContext.class,0);
		}
		public SetyContext sety() {
			return getRuleContext(SetyContext.class,0);
		}
		public SetposContext setpos() {
			return getRuleContext(SetposContext.class,0);
		}
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public TowardsContext towards() {
			return getRuleContext(TowardsContext.class,0);
		}
		public GildeContext gilde() {
			return getRuleContext(GildeContext.class,0);
		}
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public HomeContext home() {
			return getRuleContext(HomeContext.class,0);
		}
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public XcorContext xcor() {
			return getRuleContext(XcorContext.class,0);
		}
		public YcorContext ycor() {
			return getRuleContext(YcorContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				repeat();
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				back();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				right();
				}
				break;
			case SETHEADING:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				setheading();
				}
				break;
			case SETX:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				setx();
				}
				break;
			case SETY:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				sety();
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				setpos();
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				distance();
				}
				break;
			case TOWARDS:
				enterOuterAlt(_localctx, 11);
				{
				setState(88);
				towards();
				}
				break;
			case GLIDE:
				enterOuterAlt(_localctx, 12);
				{
				setState(89);
				gilde();
				}
				break;
			case HEADING:
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				heading();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 14);
				{
				setState(91);
				home();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 15);
				{
				setState(92);
				pos();
				}
				break;
			case XCOR:
				enterOuterAlt(_localctx, 16);
				{
				setState(93);
				xcor();
				}
				break;
			case YCOR:
				enterOuterAlt(_localctx, 17);
				{
				setState(94);
				ycor();
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(LynxParser.REPEAT, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public NaturalNumberArgContext naturalNumberArg() {
			return getRuleContext(NaturalNumberArgContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
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
		enterRule(_localctx, 6, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(REPEAT);
			setState(98);
			brakeArg();
			setState(99);
			naturalNumberArg();
			setState(100);
			brakeArg();
			setState(101);
			match(T__0);
			setState(102);
			line();
			setState(103);
			match(T__1);
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

	public static class BackContext extends ParserRuleContext {
		public TerminalNode BACK() { return getToken(LynxParser.BACK, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public BackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(BACK);
			setState(106);
			brakeArg();
			setState(107);
			totalnumberArg();
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

	public static class ForwardContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(LynxParser.FORWARD, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public ForwardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardContext forward() throws RecognitionException {
		ForwardContext _localctx = new ForwardContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FORWARD);
			setState(110);
			brakeArg();
			setState(111);
			totalnumberArg();
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

	public static class LeftContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(LynxParser.LEFT, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LEFT);
			setState(114);
			brakeArg();
			setState(115);
			totalnumberArg();
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

	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(LynxParser.RIGHT, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(RIGHT);
			setState(118);
			brakeArg();
			setState(119);
			totalnumberArg();
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

	public static class SetheadingContext extends ParserRuleContext {
		public TerminalNode SETHEADING() { return getToken(LynxParser.SETHEADING, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public SetheadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setheading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetheading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetheading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetheading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetheadingContext setheading() throws RecognitionException {
		SetheadingContext _localctx = new SetheadingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setheading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(SETHEADING);
			setState(122);
			brakeArg();
			setState(123);
			totalnumberArg();
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

	public static class SetxContext extends ParserRuleContext {
		public TerminalNode SETX() { return getToken(LynxParser.SETX, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public SetxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetxContext setx() throws RecognitionException {
		SetxContext _localctx = new SetxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(SETX);
			setState(126);
			brakeArg();
			setState(127);
			totalnumberArg();
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

	public static class SetyContext extends ParserRuleContext {
		public TerminalNode SETY() { return getToken(LynxParser.SETY, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public SetyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sety; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSety(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSety(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetyContext sety() throws RecognitionException {
		SetyContext _localctx = new SetyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sety);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SETY);
			setState(130);
			brakeArg();
			setState(131);
			totalnumberArg();
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

	public static class SetposContext extends ParserRuleContext {
		public TerminalNode SETPOS() { return getToken(LynxParser.SETPOS, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<TotalnumberArgContext> totalnumberArg() {
			return getRuleContexts(TotalnumberArgContext.class);
		}
		public TotalnumberArgContext totalnumberArg(int i) {
			return getRuleContext(TotalnumberArgContext.class,i);
		}
		public SetposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetposContext setpos() throws RecognitionException {
		SetposContext _localctx = new SetposContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SETPOS);
			setState(134);
			brakeArg();
			setState(135);
			match(T__0);
			setState(136);
			brakeArg();
			setState(137);
			totalnumberArg();
			setState(138);
			brakeArg();
			setState(139);
			match(T__2);
			setState(140);
			brakeArg();
			setState(141);
			totalnumberArg();
			setState(142);
			brakeArg();
			setState(143);
			match(T__1);
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

	public static class DistanceContext extends ParserRuleContext {
		public TerminalNode DISTANCE() { return getToken(LynxParser.DISTANCE, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDistance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDistance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DISTANCE);
			setState(146);
			brakeArg();
			setState(147);
			stringArg();
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

	public static class TowardsContext extends ParserRuleContext {
		public TerminalNode TOWARDS() { return getToken(LynxParser.TOWARDS, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public TowardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_towards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterTowards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitTowards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitTowards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TowardsContext towards() throws RecognitionException {
		TowardsContext _localctx = new TowardsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_towards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TOWARDS);
			setState(150);
			brakeArg();
			setState(151);
			stringArg();
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

	public static class GildeContext extends ParserRuleContext {
		public TerminalNode GLIDE() { return getToken(LynxParser.GLIDE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<TotalnumberArgContext> totalnumberArg() {
			return getRuleContexts(TotalnumberArgContext.class);
		}
		public TotalnumberArgContext totalnumberArg(int i) {
			return getRuleContext(TotalnumberArgContext.class,i);
		}
		public GildeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gilde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterGilde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitGilde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitGilde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GildeContext gilde() throws RecognitionException {
		GildeContext _localctx = new GildeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_gilde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(GLIDE);
			setState(154);
			brakeArg();
			setState(155);
			totalnumberArg();
			setState(156);
			brakeArg();
			setState(157);
			totalnumberArg();
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

	public static class HeadingContext extends ParserRuleContext {
		public TerminalNode HEADING() { return getToken(LynxParser.HEADING, 0); }
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(HEADING);
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

	public static class HomeContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(LynxParser.HOME, 0); }
		public HomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterHome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitHome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitHome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeContext home() throws RecognitionException {
		HomeContext _localctx = new HomeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(HOME);
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

	public static class PosContext extends ParserRuleContext {
		public TerminalNode POS() { return getToken(LynxParser.POS, 0); }
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(POS);
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

	public static class XcorContext extends ParserRuleContext {
		public TerminalNode XCOR() { return getToken(LynxParser.XCOR, 0); }
		public XcorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xcor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterXcor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitXcor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitXcor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XcorContext xcor() throws RecognitionException {
		XcorContext _localctx = new XcorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_xcor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(XCOR);
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

	public static class YcorContext extends ParserRuleContext {
		public TerminalNode YCOR() { return getToken(LynxParser.YCOR, 0); }
		public YcorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ycor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterYcor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitYcor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitYcor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YcorContext ycor() throws RecognitionException {
		YcorContext _localctx = new YcorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ycor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(YCOR);
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

	public static class SpaceArgContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(LynxParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LynxParser.WHITESPACE, i);
		}
		public SpaceArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSpaceArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSpaceArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSpaceArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceArgContext spaceArg() throws RecognitionException {
		SpaceArgContext _localctx = new SpaceArgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_spaceArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(169);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NewLineArgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(LynxParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LynxParser.NEWLINE, i);
		}
		public NewLineArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLineArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNewLineArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNewLineArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNewLineArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineArgContext newLineArg() throws RecognitionException {
		NewLineArgContext _localctx = new NewLineArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newLineArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(174);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BrakeArgContext extends ParserRuleContext {
		public List<SpaceArgContext> spaceArg() {
			return getRuleContexts(SpaceArgContext.class);
		}
		public SpaceArgContext spaceArg(int i) {
			return getRuleContext(SpaceArgContext.class,i);
		}
		public List<NewLineArgContext> newLineArg() {
			return getRuleContexts(NewLineArgContext.class);
		}
		public NewLineArgContext newLineArg(int i) {
			return getRuleContext(NewLineArgContext.class,i);
		}
		public BrakeArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brakeArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBrakeArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBrakeArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBrakeArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrakeArgContext brakeArg() throws RecognitionException {
		BrakeArgContext _localctx = new BrakeArgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_brakeArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(181);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(179);
						spaceArg();
						}
						break;
					case NEWLINE:
						{
						setState(180);
						newLineArg();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NaturalNumberArgContext extends ParserRuleContext {
		public TerminalNode NATURALNUMBER() { return getToken(LynxParser.NATURALNUMBER, 0); }
		public NaturalNumberArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalNumberArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNaturalNumberArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNaturalNumberArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNaturalNumberArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalNumberArgContext naturalNumberArg() throws RecognitionException {
		NaturalNumberArgContext _localctx = new NaturalNumberArgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_naturalNumberArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(NATURALNUMBER);
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

	public static class TotalnumberArgContext extends ParserRuleContext {
		public TerminalNode NATURALNUMBER() { return getToken(LynxParser.NATURALNUMBER, 0); }
		public TerminalNode NEGATINATURALNUMBER() { return getToken(LynxParser.NEGATINATURALNUMBER, 0); }
		public TotalnumberArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalnumberArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterTotalnumberArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitTotalnumberArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitTotalnumberArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalnumberArgContext totalnumberArg() throws RecognitionException {
		TotalnumberArgContext _localctx = new TotalnumberArgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_totalnumberArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==NATURALNUMBER || _la==NEGATINATURALNUMBER) ) {
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

	public static class StringArgContext extends ParserRuleContext {
		public TerminalNode OTHERWORD() { return getToken(LynxParser.OTHERWORD, 0); }
		public StringArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterStringArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitStringArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitStringArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArgContext stringArg() throws RecognitionException {
		StringArgContext _localctx = new StringArgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(OTHERWORD);
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

	public static class EndFileArgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LynxParser.EOF, 0); }
		public EndFileArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endFileArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterEndFileArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitEndFileArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitEndFileArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndFileArgContext endFileArg() throws RecognitionException {
		EndFileArgContext _localctx = new EndFileArgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_endFileArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bc\u00c4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\2\3\2\3\3\5\3"+
		"A\n\3\3\3\5\3D\n\3\3\3\3\3\5\3H\n\3\6\3J\n\3\r\3\16\3K\3\3\5\3O\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u00ad\n\26\r\26"+
		"\16\26\u00ae\3\27\6\27\u00b2\n\27\r\27\16\27\u00b3\3\30\3\30\6\30\u00b8"+
		"\n\30\r\30\16\30\u00b9\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2"+
		"\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3"+
		"\3\2\u00b7\u00b8\2\u00c2\29\3\2\2\2\4@\3\2\2\2\6a\3\2\2\2\bc\3\2\2\2\n"+
		"k\3\2\2\2\fo\3\2\2\2\16s\3\2\2\2\20w\3\2\2\2\22{\3\2\2\2\24\177\3\2\2"+
		"\2\26\u0083\3\2\2\2\30\u0087\3\2\2\2\32\u0093\3\2\2\2\34\u0097\3\2\2\2"+
		"\36\u009b\3\2\2\2 \u00a1\3\2\2\2\"\u00a3\3\2\2\2$\u00a5\3\2\2\2&\u00a7"+
		"\3\2\2\2(\u00a9\3\2\2\2*\u00ac\3\2\2\2,\u00b1\3\2\2\2.\u00b7\3\2\2\2\60"+
		"\u00bb\3\2\2\2\62\u00bd\3\2\2\2\64\u00bf\3\2\2\2\66\u00c1\3\2\2\28:\5"+
		"\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\66\34\2>"+
		"\3\3\2\2\2?A\5.\30\2@?\3\2\2\2@A\3\2\2\2AI\3\2\2\2BD\5*\26\2CB\3\2\2\2"+
		"CD\3\2\2\2DE\3\2\2\2EG\5\6\4\2FH\5*\26\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2"+
		"IC\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\5.\30\2NM\3\2\2\2"+
		"NO\3\2\2\2O\5\3\2\2\2Pb\5\b\5\2Qb\5\f\7\2Rb\5\n\6\2Sb\5\16\b\2Tb\5\20"+
		"\t\2Ub\5\22\n\2Vb\5\24\13\2Wb\5\26\f\2Xb\5\30\r\2Yb\5\32\16\2Zb\5\34\17"+
		"\2[b\5\36\20\2\\b\5 \21\2]b\5\"\22\2^b\5$\23\2_b\5&\24\2`b\5(\25\2aP\3"+
		"\2\2\2aQ\3\2\2\2aR\3\2\2\2aS\3\2\2\2aT\3\2\2\2aU\3\2\2\2aV\3\2\2\2aW\3"+
		"\2\2\2aX\3\2\2\2aY\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^"+
		"\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\7\3\2\2\2cd\7\u00b1\2\2de\5.\30\2ef\5\60"+
		"\31\2fg\5.\30\2gh\7\3\2\2hi\5\4\3\2ij\7\4\2\2j\t\3\2\2\2kl\7\6\2\2lm\5"+
		".\30\2mn\5\62\32\2n\13\3\2\2\2op\7\b\2\2pq\5.\30\2qr\5\62\32\2r\r\3\2"+
		"\2\2st\7\f\2\2tu\5.\30\2uv\5\62\32\2v\17\3\2\2\2wx\7\16\2\2xy\5.\30\2"+
		"yz\5\62\32\2z\21\3\2\2\2{|\7\17\2\2|}\5.\30\2}~\5\62\32\2~\23\3\2\2\2"+
		"\177\u0080\7\21\2\2\u0080\u0081\5.\30\2\u0081\u0082\5\62\32\2\u0082\25"+
		"\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0085\5.\30\2\u0085\u0086\5\62\32"+
		"\2\u0086\27\3\2\2\2\u0087\u0088\7\20\2\2\u0088\u0089\5.\30\2\u0089\u008a"+
		"\7\3\2\2\u008a\u008b\5.\30\2\u008b\u008c\5\62\32\2\u008c\u008d\5.\30\2"+
		"\u008d\u008e\7\5\2\2\u008e\u008f\5.\30\2\u008f\u0090\5\62\32\2\u0090\u0091"+
		"\5.\30\2\u0091\u0092\7\4\2\2\u0092\31\3\2\2\2\u0093\u0094\7\7\2\2\u0094"+
		"\u0095\5.\30\2\u0095\u0096\5\64\33\2\u0096\33\3\2\2\2\u0097\u0098\7\23"+
		"\2\2\u0098\u0099\5.\30\2\u0099\u009a\5\64\33\2\u009a\35\3\2\2\2\u009b"+
		"\u009c\7\t\2\2\u009c\u009d\5.\30\2\u009d\u009e\5\62\32\2\u009e\u009f\5"+
		".\30\2\u009f\u00a0\5\62\32\2\u00a0\37\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2"+
		"!\3\2\2\2\u00a3\u00a4\7\13\2\2\u00a4#\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6"+
		"%\3\2\2\2\u00a7\u00a8\7\24\2\2\u00a8\'\3\2\2\2\u00a9\u00aa\7\25\2\2\u00aa"+
		")\3\2\2\2\u00ab\u00ad\7\u00bb\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af+\3\2\2\2\u00b0\u00b2"+
		"\7\u00bc\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4-\3\2\2\2\u00b5\u00b8\5*\26\2\u00b6\u00b8"+
		"\5,\27\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba/\3\2\2\2\u00bb\u00bc\7\u00b7"+
		"\2\2\u00bc\61\3\2\2\2\u00bd\u00be\t\2\2\2\u00be\63\3\2\2\2\u00bf\u00c0"+
		"\7\u00ba\2\2\u00c0\65\3\2\2\2\u00c1\u00c2\7\2\2\3\u00c2\67\3\2\2\2\r;"+
		"@CGKNa\u00ae\u00b3\u00b7\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}