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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BACK=8, DISTANCE=9, 
		FORWARD=10, HEADING=11, HOME=12, LEFT=13, POS=14, RIGHT=15, SETHEADING=16, 
		SETPOS=17, SETX=18, SETY=19, TOWARDS=20, XCOR=21, YCOR=22, BG=23, CG=24, 
		CLEAN=25, COLOR=26, COLORUNDER=27, FILL=28, FREEZEBG=29, NAMEFROMCOLOUR=30, 
		PD=31, PE=32, PENSIZE=33, PU=34, SETBG=35, SETCOLOR=36, SETPENSIZE=37, 
		STAMP=38, UNFREEZEBG=39, HT=40, INBACK=41, INFRONT=42, OPACITY=43, SETOPACITY=44, 
		SETSHAPE=45, SETSIZE=46, SHAPE=47, SIZE=48, ST=49, CLICKOFF=50, CLICKON=51, 
		CLONE=52, TELL=53, TOUCHINGX=54, WHO=55, ANNOUNCE=56, ASCII=57, BOTTOM=58, 
		CB=59, CC=60, CD=61, CF=62, CHAR=63, CLEARTEXT=64, CU=65, DELETE=66, EOL=67, 
		EOT=68, HIDETEXT=69, INSERT=70, PRINT=71, SELECT=72, SELECTED=73, SHOW=74, 
		SHOWTEXT=75, SOL=76, TEXTCOUNT=77, TEXTITEM=78, TEXTPICK=79, TEXTWHO=80, 
		TOP=81, TRANSPARENT=82, UNSELECT=83, BUTFIRST=84, BUTLAST=85, COUNT=86, 
		EMPTY=87, EQUALX=88, FIRST=89, FPUT=90, IDENTICALX=91, ITEM=92, LAST=93, 
		LIST=94, LISTX=95, LPUT=96, MEMBERX=97, NUMBER=98, PARSE=99, PICK=100, 
		SENTENCE=101, WORD=102, WORDX=103, ABS=104, ARCTAN=105, COS=106, DIFFERENCE=107, 
		EXP=108, INT=109, LN=110, LOG=111, MINUS=112, PI=113, POWER=114, PRODUCT=115, 
		QUOTIENT=116, RANDOM=117, REMAINDER=118, ROUND=119, SIN=120, SQRT=121, 
		SUM=122, TAN=123, COMPARISON=124, ASK=125, FREEZE=126, GET=127, NEWPAGE=128, 
		NEWSLIDER=129, NEWTEXT=130, NEWTURTLE=131, REMOVE=132, RENAME=133, SET=134, 
		TALKTO=135, UNFREEZE=136, RESETT=137, TIMER=138, CLEARNAME=139, CLEARNAMES=140, 
		LET=141, MAKE=142, NAMEX=143, NAMES=144, THING=145, GETPAGE=146, NAMEPAGE=147, 
		NEXTPAGE=148, PAGELIST=149, PREVPAGE=150, PROJECTSIZE=151, AND=152, IF=153, 
		IFELSE=154, NOT=155, OR=156, ANSWER=157, KEYX=158, MOUSEPOS=159, PEEKCHAR=160, 
		QUESTION=161, READCHAR=162, SAY=163, SAYAS=164, SKIPCHAR=165, VOICES=166, 
		BROADCAST=167, CANCEL=168, CAREFULLY=169, DOLIST=170, DOTIMES=171, ERRORMESSAGE=172, 
		EVERYONE=173, FOREVER=174, LAUNCH=175, OUTPUT=176, REPEAT=177, RUN=178, 
		STOP=179, STOPALL=180, STOPME=181, WAIT=182, PROCEDURE=183, CALL=184, 
		DIVISION=185, NATURALNUMBER=186, FLOATNUMBER=187, BOOLEAN=188, OTHERWORD=189, 
		WHITESPACE=190, NEWLINE=191;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_cmd = 2, RULE_mathStatement = 3, 
		RULE_mathSentence = 4, RULE_mathValue = 5, RULE_singleArgMathOperator = 6, 
		RULE_doubleArgMathOperator = 7, RULE_stringArg = 8, RULE_variableName = 9, 
		RULE_variableValue = 10, RULE_procedure = 11, RULE_procedureCall = 12, 
		RULE_repeat = 13, RULE_back = 14, RULE_forward = 15, RULE_left = 16, RULE_right = 17, 
		RULE_setheading = 18, RULE_setx = 19, RULE_sety = 20, RULE_namefromcolor = 21, 
		RULE_setcolor = 22, RULE_setpensize = 23, RULE_setbg = 24, RULE_setpos = 25, 
		RULE_distance = 26, RULE_towards = 27, RULE_clearname = 28, RULE_namex = 29, 
		RULE_thing = 30, RULE_ifc = 31, RULE_ifelse = 32, RULE_heading = 33, RULE_home = 34, 
		RULE_pos = 35, RULE_xcor = 36, RULE_ycor = 37, RULE_clearnames = 38, RULE_names = 39, 
		RULE_bg = 40, RULE_cg = 41, RULE_clean = 42, RULE_color = 43, RULE_colorrunder = 44, 
		RULE_fill = 45, RULE_freezebg = 46, RULE_pd = 47, RULE_pe = 48, RULE_pensize = 49, 
		RULE_pu = 50, RULE_stamp = 51, RULE_unfreezebg = 52, RULE_let = 53, RULE_make = 54, 
		RULE_spaceArg = 55, RULE_newLineArg = 56, RULE_brakeArg = 57, RULE_naturalNumberArg = 58, 
		RULE_list = 59, RULE_endFileArg = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "cmd", "mathStatement", "mathSentence", "mathValue", 
			"singleArgMathOperator", "doubleArgMathOperator", "stringArg", "variableName", 
			"variableValue", "procedure", "procedureCall", "repeat", "back", "forward", 
			"left", "right", "setheading", "setx", "sety", "namefromcolor", "setcolor", 
			"setpensize", "setbg", "setpos", "distance", "towards", "clearname", 
			"namex", "thing", "ifc", "ifelse", "heading", "home", "pos", "xcor", 
			"ycor", "clearnames", "names", "bg", "cg", "clean", "color", "colorrunder", 
			"fill", "freezebg", "pd", "pe", "pensize", "pu", "stamp", "unfreezebg", 
			"let", "make", "spaceArg", "newLineArg", "brakeArg", "naturalNumberArg", 
			"list", "endFileArg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "']'", "','", "'''", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'!='", null, null, null, null, "'-'", null, null, "'*'", null, null, 
			null, null, null, null, "'+'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "BACK", "DISTANCE", "FORWARD", 
			"HEADING", "HOME", "LEFT", "POS", "RIGHT", "SETHEADING", "SETPOS", "SETX", 
			"SETY", "TOWARDS", "XCOR", "YCOR", "BG", "CG", "CLEAN", "COLOR", "COLORUNDER", 
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
			"ABS", "ARCTAN", "COS", "DIFFERENCE", "EXP", "INT", "LN", "LOG", "MINUS", 
			"PI", "POWER", "PRODUCT", "QUOTIENT", "RANDOM", "REMAINDER", "ROUND", 
			"SIN", "SQRT", "SUM", "TAN", "COMPARISON", "ASK", "FREEZE", "GET", "NEWPAGE", 
			"NEWSLIDER", "NEWTEXT", "NEWTURTLE", "REMOVE", "RENAME", "SET", "TALKTO", 
			"UNFREEZE", "RESETT", "TIMER", "CLEARNAME", "CLEARNAMES", "LET", "MAKE", 
			"NAMEX", "NAMES", "THING", "GETPAGE", "NAMEPAGE", "NEXTPAGE", "PAGELIST", 
			"PREVPAGE", "PROJECTSIZE", "AND", "IF", "IFELSE", "NOT", "OR", "ANSWER", 
			"KEYX", "MOUSEPOS", "PEEKCHAR", "QUESTION", "READCHAR", "SAY", "SAYAS", 
			"SKIPCHAR", "VOICES", "BROADCAST", "CANCEL", "CAREFULLY", "DOLIST", "DOTIMES", 
			"ERRORMESSAGE", "EVERYONE", "FOREVER", "LAUNCH", "OUTPUT", "REPEAT", 
			"RUN", "STOP", "STOPALL", "STOPME", "WAIT", "PROCEDURE", "CALL", "DIVISION", 
			"NATURALNUMBER", "FLOATNUMBER", "BOOLEAN", "OTHERWORD", "WHITESPACE", 
			"NEWLINE"
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
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				line();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << DISTANCE) | (1L << FORWARD) | (1L << HEADING) | (1L << HOME) | (1L << LEFT) | (1L << POS) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETPOS) | (1L << SETX) | (1L << SETY) | (1L << TOWARDS) | (1L << XCOR) | (1L << YCOR) | (1L << BG) | (1L << CG) | (1L << CLEAN) | (1L << COLOR) | (1L << COLORUNDER) | (1L << FILL) | (1L << FREEZEBG) | (1L << NAMEFROMCOLOUR) | (1L << PD) | (1L << PE) | (1L << PENSIZE) | (1L << PU) | (1L << SETBG) | (1L << SETCOLOR) | (1L << SETPENSIZE) | (1L << STAMP) | (1L << UNFREEZEBG))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (CLEARNAME - 139)) | (1L << (CLEARNAMES - 139)) | (1L << (LET - 139)) | (1L << (MAKE - 139)) | (1L << (NAMEX - 139)) | (1L << (NAMES - 139)) | (1L << (THING - 139)) | (1L << (IF - 139)) | (1L << (IFELSE - 139)) | (1L << (REPEAT - 139)) | (1L << (PROCEDURE - 139)) | (1L << (CALL - 139)) | (1L << (WHITESPACE - 139)) | (1L << (NEWLINE - 139)))) != 0) );
			setState(127);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(129);
				brakeArg();
				}
				break;
			}
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(132);
						spaceArg();
						}
					}

					setState(135);
					cmd();
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(136);
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
				setState(141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(143);
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
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
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
		public ClearnameContext clearname() {
			return getRuleContext(ClearnameContext.class,0);
		}
		public NamexContext namex() {
			return getRuleContext(NamexContext.class,0);
		}
		public ThingContext thing() {
			return getRuleContext(ThingContext.class,0);
		}
		public ClearnamesContext clearnames() {
			return getRuleContext(ClearnamesContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public MakeContext make() {
			return getRuleContext(MakeContext.class,0);
		}
		public IfcContext ifc() {
			return getRuleContext(IfcContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public BgContext bg() {
			return getRuleContext(BgContext.class,0);
		}
		public CgContext cg() {
			return getRuleContext(CgContext.class,0);
		}
		public CleanContext clean() {
			return getRuleContext(CleanContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ColorrunderContext colorrunder() {
			return getRuleContext(ColorrunderContext.class,0);
		}
		public FillContext fill() {
			return getRuleContext(FillContext.class,0);
		}
		public FreezebgContext freezebg() {
			return getRuleContext(FreezebgContext.class,0);
		}
		public NamefromcolorContext namefromcolor() {
			return getRuleContext(NamefromcolorContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public PeContext pe() {
			return getRuleContext(PeContext.class,0);
		}
		public PensizeContext pensize() {
			return getRuleContext(PensizeContext.class,0);
		}
		public PuContext pu() {
			return getRuleContext(PuContext.class,0);
		}
		public SetbgContext setbg() {
			return getRuleContext(SetbgContext.class,0);
		}
		public SetcolorContext setcolor() {
			return getRuleContext(SetcolorContext.class,0);
		}
		public SetpensizeContext setpensize() {
			return getRuleContext(SetpensizeContext.class,0);
		}
		public StampContext stamp() {
			return getRuleContext(StampContext.class,0);
		}
		public UnfreezebgContext unfreezebg() {
			return getRuleContext(UnfreezebgContext.class,0);
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				repeat();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				procedure();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				procedureCall();
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				back();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				right();
				}
				break;
			case SETHEADING:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				setheading();
				}
				break;
			case SETX:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				setx();
				}
				break;
			case SETY:
				enterOuterAlt(_localctx, 10);
				{
				setState(155);
				sety();
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 11);
				{
				setState(156);
				setpos();
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 12);
				{
				setState(157);
				distance();
				}
				break;
			case TOWARDS:
				enterOuterAlt(_localctx, 13);
				{
				setState(158);
				towards();
				}
				break;
			case HEADING:
				enterOuterAlt(_localctx, 14);
				{
				setState(159);
				heading();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 15);
				{
				setState(160);
				home();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 16);
				{
				setState(161);
				pos();
				}
				break;
			case XCOR:
				enterOuterAlt(_localctx, 17);
				{
				setState(162);
				xcor();
				}
				break;
			case YCOR:
				enterOuterAlt(_localctx, 18);
				{
				setState(163);
				ycor();
				}
				break;
			case CLEARNAME:
				enterOuterAlt(_localctx, 19);
				{
				setState(164);
				clearname();
				}
				break;
			case NAMEX:
				enterOuterAlt(_localctx, 20);
				{
				setState(165);
				namex();
				}
				break;
			case THING:
				enterOuterAlt(_localctx, 21);
				{
				setState(166);
				thing();
				}
				break;
			case CLEARNAMES:
				enterOuterAlt(_localctx, 22);
				{
				setState(167);
				clearnames();
				}
				break;
			case NAMES:
				enterOuterAlt(_localctx, 23);
				{
				setState(168);
				names();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 24);
				{
				setState(169);
				let();
				}
				break;
			case MAKE:
				enterOuterAlt(_localctx, 25);
				{
				setState(170);
				make();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 26);
				{
				setState(171);
				ifc();
				}
				break;
			case IFELSE:
				enterOuterAlt(_localctx, 27);
				{
				setState(172);
				ifelse();
				}
				break;
			case BG:
				enterOuterAlt(_localctx, 28);
				{
				setState(173);
				bg();
				}
				break;
			case CG:
				enterOuterAlt(_localctx, 29);
				{
				setState(174);
				cg();
				}
				break;
			case CLEAN:
				enterOuterAlt(_localctx, 30);
				{
				setState(175);
				clean();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(176);
				color();
				}
				break;
			case COLORUNDER:
				enterOuterAlt(_localctx, 32);
				{
				setState(177);
				colorrunder();
				}
				break;
			case FILL:
				enterOuterAlt(_localctx, 33);
				{
				setState(178);
				fill();
				}
				break;
			case FREEZEBG:
				enterOuterAlt(_localctx, 34);
				{
				setState(179);
				freezebg();
				}
				break;
			case NAMEFROMCOLOUR:
				enterOuterAlt(_localctx, 35);
				{
				setState(180);
				namefromcolor();
				}
				break;
			case PD:
				enterOuterAlt(_localctx, 36);
				{
				setState(181);
				pd();
				}
				break;
			case PE:
				enterOuterAlt(_localctx, 37);
				{
				setState(182);
				pe();
				}
				break;
			case PENSIZE:
				enterOuterAlt(_localctx, 38);
				{
				setState(183);
				pensize();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 39);
				{
				setState(184);
				pu();
				}
				break;
			case SETBG:
				enterOuterAlt(_localctx, 40);
				{
				setState(185);
				setbg();
				}
				break;
			case SETCOLOR:
				enterOuterAlt(_localctx, 41);
				{
				setState(186);
				setcolor();
				}
				break;
			case SETPENSIZE:
				enterOuterAlt(_localctx, 42);
				{
				setState(187);
				setpensize();
				}
				break;
			case STAMP:
				enterOuterAlt(_localctx, 43);
				{
				setState(188);
				stamp();
				}
				break;
			case UNFREEZEBG:
				enterOuterAlt(_localctx, 44);
				{
				setState(189);
				unfreezebg();
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

	public static class MathStatementContext extends ParserRuleContext {
		public MathSentenceContext mathSentence() {
			return getRuleContext(MathSentenceContext.class,0);
		}
		public MathStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMathStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMathStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMathStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathStatementContext mathStatement() throws RecognitionException {
		MathStatementContext _localctx = new MathStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mathStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			mathSentence(0);
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

	public static class MathSentenceContext extends ParserRuleContext {
		public List<MathSentenceContext> mathSentence() {
			return getRuleContexts(MathSentenceContext.class);
		}
		public MathSentenceContext mathSentence(int i) {
			return getRuleContext(MathSentenceContext.class,i);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public SingleArgMathOperatorContext singleArgMathOperator() {
			return getRuleContext(SingleArgMathOperatorContext.class,0);
		}
		public MathValueContext mathValue() {
			return getRuleContext(MathValueContext.class,0);
		}
		public DoubleArgMathOperatorContext doubleArgMathOperator() {
			return getRuleContext(DoubleArgMathOperatorContext.class,0);
		}
		public MathSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMathSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMathSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMathSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathSentenceContext mathSentence() throws RecognitionException {
		return mathSentence(0);
	}

	private MathSentenceContext mathSentence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathSentenceContext _localctx = new MathSentenceContext(_ctx, _parentState);
		MathSentenceContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_mathSentence, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				{
				setState(195);
				match(T__0);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(196);
					brakeArg();
					}
				}

				setState(199);
				mathSentence(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(200);
					brakeArg();
					}
				}

				setState(203);
				match(T__1);
				}
				}
				break;
			case ABS:
			case ARCTAN:
			case COS:
			case INT:
			case LN:
			case MINUS:
			case RANDOM:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case NOT:
				{
				setState(205);
				singleArgMathOperator();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(206);
					brakeArg();
					}
				}

				setState(209);
				mathSentence(2);
				}
				break;
			case T__2:
			case NATURALNUMBER:
			case FLOATNUMBER:
			case BOOLEAN:
				{
				setState(211);
				mathValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathSentenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mathSentence);
					setState(214);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(215);
						brakeArg();
						}
					}

					setState(218);
					doubleArgMathOperator();
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(219);
						brakeArg();
						}
					}

					setState(222);
					mathSentence(4);
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MathValueContext extends ParserRuleContext {
		public TerminalNode FLOATNUMBER() { return getToken(LynxParser.FLOATNUMBER, 0); }
		public TerminalNode NATURALNUMBER() { return getToken(LynxParser.NATURALNUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(LynxParser.BOOLEAN, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMathValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMathValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMathValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathValueContext mathValue() throws RecognitionException {
		MathValueContext _localctx = new MathValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mathValue);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(FLOATNUMBER);
				}
				break;
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(NATURALNUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(BOOLEAN);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				variableName();
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

	public static class SingleArgMathOperatorContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(LynxParser.ABS, 0); }
		public TerminalNode ARCTAN() { return getToken(LynxParser.ARCTAN, 0); }
		public TerminalNode COS() { return getToken(LynxParser.COS, 0); }
		public TerminalNode INT() { return getToken(LynxParser.INT, 0); }
		public TerminalNode LN() { return getToken(LynxParser.LN, 0); }
		public TerminalNode MINUS() { return getToken(LynxParser.MINUS, 0); }
		public TerminalNode RANDOM() { return getToken(LynxParser.RANDOM, 0); }
		public TerminalNode ROUND() { return getToken(LynxParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(LynxParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(LynxParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(LynxParser.TAN, 0); }
		public TerminalNode NOT() { return getToken(LynxParser.NOT, 0); }
		public SingleArgMathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleArgMathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSingleArgMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSingleArgMathOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSingleArgMathOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleArgMathOperatorContext singleArgMathOperator() throws RecognitionException {
		SingleArgMathOperatorContext _localctx = new SingleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleArgMathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (ABS - 104)) | (1L << (ARCTAN - 104)) | (1L << (COS - 104)) | (1L << (INT - 104)) | (1L << (LN - 104)) | (1L << (MINUS - 104)) | (1L << (RANDOM - 104)) | (1L << (ROUND - 104)) | (1L << (SIN - 104)) | (1L << (SQRT - 104)) | (1L << (TAN - 104)) | (1L << (NOT - 104)))) != 0)) ) {
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

	public static class DoubleArgMathOperatorContext extends ParserRuleContext {
		public TerminalNode DIFFERENCE() { return getToken(LynxParser.DIFFERENCE, 0); }
		public TerminalNode POWER() { return getToken(LynxParser.POWER, 0); }
		public TerminalNode QUOTIENT() { return getToken(LynxParser.QUOTIENT, 0); }
		public TerminalNode REMAINDER() { return getToken(LynxParser.REMAINDER, 0); }
		public TerminalNode SUM() { return getToken(LynxParser.SUM, 0); }
		public TerminalNode MINUS() { return getToken(LynxParser.MINUS, 0); }
		public TerminalNode PRODUCT() { return getToken(LynxParser.PRODUCT, 0); }
		public TerminalNode DIVISION() { return getToken(LynxParser.DIVISION, 0); }
		public TerminalNode COMPARISON() { return getToken(LynxParser.COMPARISON, 0); }
		public TerminalNode EXP() { return getToken(LynxParser.EXP, 0); }
		public TerminalNode LOG() { return getToken(LynxParser.LOG, 0); }
		public TerminalNode OR() { return getToken(LynxParser.OR, 0); }
		public TerminalNode AND() { return getToken(LynxParser.AND, 0); }
		public DoubleArgMathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleArgMathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDoubleArgMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDoubleArgMathOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDoubleArgMathOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleArgMathOperatorContext doubleArgMathOperator() throws RecognitionException {
		DoubleArgMathOperatorContext _localctx = new DoubleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doubleArgMathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (DIFFERENCE - 107)) | (1L << (EXP - 107)) | (1L << (LOG - 107)) | (1L << (MINUS - 107)) | (1L << (POWER - 107)) | (1L << (PRODUCT - 107)) | (1L << (QUOTIENT - 107)) | (1L << (REMAINDER - 107)) | (1L << (SUM - 107)) | (1L << (COMPARISON - 107)) | (1L << (AND - 107)) | (1L << (OR - 107)))) != 0) || _la==DIVISION) ) {
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
		enterRule(_localctx, 16, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode OTHERWORD() { return getToken(LynxParser.OTHERWORD, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__2);
			setState(242);
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

	public static class VariableValueContext extends ParserRuleContext {
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableValue);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case ABS:
			case ARCTAN:
			case COS:
			case INT:
			case LN:
			case MINUS:
			case RANDOM:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case NOT:
			case NATURALNUMBER:
			case FLOATNUMBER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				mathStatement();
				}
				break;
			case OTHERWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				stringArg();
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(LynxParser.PROCEDURE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(PROCEDURE);
			setState(249);
			brakeArg();
			setState(250);
			stringArg();
			setState(251);
			brakeArg();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(252);
				variableName();
				setState(253);
				brakeArg();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(T__3);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(261);
				brakeArg();
				}
				break;
			}
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(264);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(269);
				brakeArg();
				}
			}

			setState(272);
			match(T__4);
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

	public static class ProcedureCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(LynxParser.CALL, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public List<VariableValueContext> variableValue() {
			return getRuleContexts(VariableValueContext.class);
		}
		public VariableValueContext variableValue(int i) {
			return getRuleContext(VariableValueContext.class,i);
		}
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedureCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(CALL);
			setState(275);
			brakeArg();
			setState(276);
			stringArg();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					brakeArg();
					setState(278);
					variableValue();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(285);
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
		enterRule(_localctx, 26, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(REPEAT);
			setState(289);
			brakeArg();
			setState(290);
			naturalNumberArg();
			setState(291);
			brakeArg();
			setState(292);
			match(T__3);
			setState(293);
			line();
			setState(294);
			match(T__4);
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 28, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(BACK);
			setState(297);
			brakeArg();
			setState(298);
			mathStatement();
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 30, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(FORWARD);
			setState(301);
			brakeArg();
			setState(302);
			mathStatement();
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 32, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(LEFT);
			setState(305);
			brakeArg();
			setState(306);
			mathStatement();
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 34, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(RIGHT);
			setState(309);
			brakeArg();
			setState(310);
			mathStatement();
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 36, RULE_setheading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(SETHEADING);
			setState(313);
			brakeArg();
			setState(314);
			mathStatement();
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 38, RULE_setx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(SETX);
			setState(317);
			brakeArg();
			setState(318);
			mathStatement();
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 40, RULE_sety);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(SETY);
			setState(321);
			brakeArg();
			setState(322);
			mathStatement();
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

	public static class NamefromcolorContext extends ParserRuleContext {
		public TerminalNode NAMEFROMCOLOUR() { return getToken(LynxParser.NAMEFROMCOLOUR, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public NamefromcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namefromcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNamefromcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNamefromcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNamefromcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamefromcolorContext namefromcolor() throws RecognitionException {
		NamefromcolorContext _localctx = new NamefromcolorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_namefromcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(NAMEFROMCOLOUR);
			setState(325);
			brakeArg();
			setState(326);
			mathStatement();
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

	public static class SetcolorContext extends ParserRuleContext {
		public TerminalNode SETCOLOR() { return getToken(LynxParser.SETCOLOR, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetcolorContext setcolor() throws RecognitionException {
		SetcolorContext _localctx = new SetcolorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_setcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(SETCOLOR);
			setState(329);
			brakeArg();
			setState(330);
			mathStatement();
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

	public static class SetpensizeContext extends ParserRuleContext {
		public TerminalNode SETPENSIZE() { return getToken(LynxParser.SETPENSIZE, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetpensizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setpensize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetpensize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetpensize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetpensize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetpensizeContext setpensize() throws RecognitionException {
		SetpensizeContext _localctx = new SetpensizeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setpensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(SETPENSIZE);
			setState(333);
			brakeArg();
			setState(334);
			mathStatement();
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

	public static class SetbgContext extends ParserRuleContext {
		public TerminalNode SETBG() { return getToken(LynxParser.SETBG, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public SetbgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setbg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSetbg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSetbg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSetbg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetbgContext setbg() throws RecognitionException {
		SetbgContext _localctx = new SetbgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setbg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(SETBG);
			setState(337);
			brakeArg();
			setState(338);
			mathStatement();
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
		public List<MathStatementContext> mathStatement() {
			return getRuleContexts(MathStatementContext.class);
		}
		public MathStatementContext mathStatement(int i) {
			return getRuleContext(MathStatementContext.class,i);
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
		enterRule(_localctx, 50, RULE_setpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(SETPOS);
			setState(341);
			brakeArg();
			setState(342);
			match(T__3);
			setState(343);
			brakeArg();
			setState(344);
			mathStatement();
			setState(345);
			brakeArg();
			setState(346);
			match(T__5);
			setState(347);
			brakeArg();
			setState(348);
			mathStatement();
			setState(349);
			brakeArg();
			setState(350);
			match(T__4);
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
		enterRule(_localctx, 52, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(DISTANCE);
			setState(353);
			brakeArg();
			setState(354);
			match(T__6);
			setState(355);
			stringArg();
			setState(356);
			match(T__6);
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
		enterRule(_localctx, 54, RULE_towards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(TOWARDS);
			setState(359);
			brakeArg();
			setState(360);
			match(T__6);
			setState(361);
			stringArg();
			setState(362);
			match(T__6);
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

	public static class ClearnameContext extends ParserRuleContext {
		public TerminalNode CLEARNAME() { return getToken(LynxParser.CLEARNAME, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public ClearnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterClearname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitClearname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitClearname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearnameContext clearname() throws RecognitionException {
		ClearnameContext _localctx = new ClearnameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_clearname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(CLEARNAME);
			setState(365);
			brakeArg();
			setState(366);
			match(T__6);
			setState(367);
			stringArg();
			setState(368);
			match(T__6);
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

	public static class NamexContext extends ParserRuleContext {
		public TerminalNode NAMEX() { return getToken(LynxParser.NAMEX, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public NamexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNamex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNamex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNamex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamexContext namex() throws RecognitionException {
		NamexContext _localctx = new NamexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(NAMEX);
			setState(371);
			brakeArg();
			setState(372);
			match(T__6);
			setState(373);
			stringArg();
			setState(374);
			match(T__6);
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

	public static class ThingContext extends ParserRuleContext {
		public TerminalNode THING() { return getToken(LynxParser.THING, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public ThingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitThing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThingContext thing() throws RecognitionException {
		ThingContext _localctx = new ThingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_thing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(THING);
			setState(377);
			brakeArg();
			setState(378);
			match(T__6);
			setState(379);
			stringArg();
			setState(380);
			match(T__6);
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

	public static class IfcContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LynxParser.IF, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public IfcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterIfc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitIfc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitIfc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcContext ifc() throws RecognitionException {
		IfcContext _localctx = new IfcContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IF);
			setState(383);
			brakeArg();
			setState(384);
			mathStatement();
			setState(385);
			brakeArg();
			setState(386);
			match(T__3);
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(387);
				brakeArg();
				}
				break;
			}
			setState(390);
			line();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(391);
				brakeArg();
				}
			}

			setState(394);
			match(T__4);
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

	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IFELSE() { return getToken(LynxParser.IFELSE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(IFELSE);
			setState(397);
			brakeArg();
			setState(398);
			mathStatement();
			setState(399);
			brakeArg();
			setState(400);
			match(T__3);
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(401);
				brakeArg();
				}
				break;
			}
			setState(404);
			line();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(405);
				brakeArg();
				}
			}

			setState(408);
			match(T__4);
			setState(409);
			brakeArg();
			setState(410);
			match(T__3);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(411);
				brakeArg();
				}
				break;
			}
			setState(414);
			line();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(415);
				brakeArg();
				}
			}

			setState(418);
			match(T__4);
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
		enterRule(_localctx, 66, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		enterRule(_localctx, 68, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 70, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 72, RULE_xcor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		enterRule(_localctx, 74, RULE_ycor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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

	public static class ClearnamesContext extends ParserRuleContext {
		public TerminalNode CLEARNAMES() { return getToken(LynxParser.CLEARNAMES, 0); }
		public ClearnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterClearnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitClearnames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitClearnames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearnamesContext clearnames() throws RecognitionException {
		ClearnamesContext _localctx = new ClearnamesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_clearnames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(CLEARNAMES);
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

	public static class NamesContext extends ParserRuleContext {
		public TerminalNode NAMES() { return getToken(LynxParser.NAMES, 0); }
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(NAMES);
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

	public static class BgContext extends ParserRuleContext {
		public TerminalNode BG() { return getToken(LynxParser.BG, 0); }
		public BgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BgContext bg() throws RecognitionException {
		BgContext _localctx = new BgContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(BG);
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

	public static class CgContext extends ParserRuleContext {
		public TerminalNode CG() { return getToken(LynxParser.CG, 0); }
		public CgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterCg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitCg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitCg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CgContext cg() throws RecognitionException {
		CgContext _localctx = new CgContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(CG);
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

	public static class CleanContext extends ParserRuleContext {
		public TerminalNode CLEAN() { return getToken(LynxParser.CLEAN, 0); }
		public CleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterClean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitClean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitClean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CleanContext clean() throws RecognitionException {
		CleanContext _localctx = new CleanContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_clean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(CLEAN);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(LynxParser.COLOR, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(COLOR);
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

	public static class ColorrunderContext extends ParserRuleContext {
		public TerminalNode COLORUNDER() { return getToken(LynxParser.COLORUNDER, 0); }
		public ColorrunderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorrunder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterColorrunder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitColorrunder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitColorrunder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorrunderContext colorrunder() throws RecognitionException {
		ColorrunderContext _localctx = new ColorrunderContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_colorrunder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(COLORUNDER);
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

	public static class FillContext extends ParserRuleContext {
		public TerminalNode FILL() { return getToken(LynxParser.FILL, 0); }
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterFill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitFill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(FILL);
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

	public static class FreezebgContext extends ParserRuleContext {
		public TerminalNode FREEZEBG() { return getToken(LynxParser.FREEZEBG, 0); }
		public FreezebgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freezebg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterFreezebg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitFreezebg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitFreezebg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreezebgContext freezebg() throws RecognitionException {
		FreezebgContext _localctx = new FreezebgContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_freezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(FREEZEBG);
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

	public static class PdContext extends ParserRuleContext {
		public TerminalNode PD() { return getToken(LynxParser.PD, 0); }
		public PdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdContext pd() throws RecognitionException {
		PdContext _localctx = new PdContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(PD);
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

	public static class PeContext extends ParserRuleContext {
		public TerminalNode PE() { return getToken(LynxParser.PE, 0); }
		public PeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeContext pe() throws RecognitionException {
		PeContext _localctx = new PeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(PE);
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

	public static class PensizeContext extends ParserRuleContext {
		public TerminalNode PENSIZE() { return getToken(LynxParser.PENSIZE, 0); }
		public PensizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pensize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPensize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPensize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPensize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PensizeContext pensize() throws RecognitionException {
		PensizeContext _localctx = new PensizeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(PENSIZE);
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

	public static class PuContext extends ParserRuleContext {
		public TerminalNode PU() { return getToken(LynxParser.PU, 0); }
		public PuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuContext pu() throws RecognitionException {
		PuContext _localctx = new PuContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(PU);
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

	public static class StampContext extends ParserRuleContext {
		public TerminalNode STAMP() { return getToken(LynxParser.STAMP, 0); }
		public StampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterStamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitStamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitStamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StampContext stamp() throws RecognitionException {
		StampContext _localctx = new StampContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_stamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(STAMP);
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

	public static class UnfreezebgContext extends ParserRuleContext {
		public TerminalNode UNFREEZEBG() { return getToken(LynxParser.UNFREEZEBG, 0); }
		public UnfreezebgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unfreezebg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterUnfreezebg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitUnfreezebg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitUnfreezebg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnfreezebgContext unfreezebg() throws RecognitionException {
		UnfreezebgContext _localctx = new UnfreezebgContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unfreezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(UNFREEZEBG);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(LynxParser.LET, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(LET);
			setState(461);
			brakeArg();
			setState(462);
			variableName();
			setState(463);
			brakeArg();
			setState(464);
			variableValue();
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(465);
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

	public static class MakeContext extends ParserRuleContext {
		public TerminalNode MAKE() { return getToken(LynxParser.MAKE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public TerminalNode WORD() { return getToken(LynxParser.WORD, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_make; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeContext make() throws RecognitionException {
		MakeContext _localctx = new MakeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_make);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(MAKE);
			setState(469);
			brakeArg();
			setState(470);
			match(T__6);
			setState(471);
			stringArg();
			setState(472);
			match(T__6);
			setState(473);
			brakeArg();
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(474);
				match(WORD);
				}
				break;
			case T__3:
				{
				setState(475);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 110, RULE_spaceArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(478);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(481); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 112, RULE_newLineArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(483);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(486); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 114, RULE_brakeArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(490);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(488);
						spaceArg();
						}
						break;
					case NEWLINE:
						{
						setState(489);
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
				setState(492); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
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
		enterRule(_localctx, 116, RULE_naturalNumberArg);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(NATURALNUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				variableName();
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

	public static class ListContext extends ParserRuleContext {
		public List<MathStatementContext> mathStatement() {
			return getRuleContexts(MathStatementContext.class);
		}
		public MathStatementContext mathStatement(int i) {
			return getRuleContext(MathStatementContext.class,i);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__3);
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(499);
						brakeArg();
						}
					}

					setState(502);
					mathStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(507);
				brakeArg();
				}
			}

			setState(510);
			match(T__4);
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
		enterRule(_localctx, 120, RULE_endFileArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return mathSentence_sempred((MathSentenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathSentence_sempred(MathSentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c1\u0205\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\6\2~\n\2\r\2\16\2\177\3\2\3\2\3\3\5\3\u0085\n\3\3\3\5\3\u0088"+
		"\n\3\3\3\3\3\5\3\u008c\n\3\6\3\u008e\n\3\r\3\16\3\u008f\3\3\5\3\u0093"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c1\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\5\6\u00c8\n\6\3\6\3\6\5\6\u00cc\n\6\3\6\3\6\3\6\3\6\5\6\u00d2\n\6"+
		"\3\6\3\6\3\6\5\6\u00d7\n\6\3\6\3\6\5\6\u00db\n\6\3\6\3\6\5\6\u00df\n\6"+
		"\3\6\3\6\7\6\u00e3\n\6\f\6\16\6\u00e6\13\6\3\7\3\7\3\7\3\7\5\7\u00ec\n"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u00f9\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u0102\n\r\f\r\16\r\u0105\13\r\3\r\3\r\5\r\u0109"+
		"\n\r\3\r\6\r\u010c\n\r\r\r\16\r\u010d\3\r\5\r\u0111\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u011b\n\16\f\16\16\16\u011e\13\16\3\16\5"+
		"\16\u0121\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\5!\u0187\n!\3!\3!\5!\u018b\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0195"+
		"\n\"\3\"\3\"\5\"\u0199\n\"\3\"\3\"\3\"\3\"\5\"\u019f\n\"\3\"\3\"\5\"\u01a3"+
		"\n\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01d5\n\67"+
		"\38\38\38\38\38\38\38\38\58\u01df\n8\39\69\u01e2\n9\r9\169\u01e3\3:\6"+
		":\u01e7\n:\r:\16:\u01e8\3;\3;\6;\u01ed\n;\r;\16;\u01ee\3<\3<\5<\u01f3"+
		"\n<\3=\3=\5=\u01f7\n=\3=\6=\u01fa\n=\r=\16=\u01fb\3=\5=\u01ff\n=\3=\3"+
		"=\3>\3>\3>\2\3\n?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\4\t\2jloprrwwy{}}\u009d\u009d"+
		"\13\2mnqrtvxx||~~\u009a\u009a\u009e\u009e\u00bb\u00bb\2\u021a\2}\3\2\2"+
		"\2\4\u0084\3\2\2\2\6\u00c0\3\2\2\2\b\u00c2\3\2\2\2\n\u00d6\3\2\2\2\f\u00eb"+
		"\3\2\2\2\16\u00ed\3\2\2\2\20\u00ef\3\2\2\2\22\u00f1\3\2\2\2\24\u00f3\3"+
		"\2\2\2\26\u00f8\3\2\2\2\30\u00fa\3\2\2\2\32\u0114\3\2\2\2\34\u0122\3\2"+
		"\2\2\36\u012a\3\2\2\2 \u012e\3\2\2\2\"\u0132\3\2\2\2$\u0136\3\2\2\2&\u013a"+
		"\3\2\2\2(\u013e\3\2\2\2*\u0142\3\2\2\2,\u0146\3\2\2\2.\u014a\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u0152\3\2\2\2\64\u0156\3\2\2\2\66\u0162\3\2\2\28\u0168"+
		"\3\2\2\2:\u016e\3\2\2\2<\u0174\3\2\2\2>\u017a\3\2\2\2@\u0180\3\2\2\2B"+
		"\u018e\3\2\2\2D\u01a6\3\2\2\2F\u01a8\3\2\2\2H\u01aa\3\2\2\2J\u01ac\3\2"+
		"\2\2L\u01ae\3\2\2\2N\u01b0\3\2\2\2P\u01b2\3\2\2\2R\u01b4\3\2\2\2T\u01b6"+
		"\3\2\2\2V\u01b8\3\2\2\2X\u01ba\3\2\2\2Z\u01bc\3\2\2\2\\\u01be\3\2\2\2"+
		"^\u01c0\3\2\2\2`\u01c2\3\2\2\2b\u01c4\3\2\2\2d\u01c6\3\2\2\2f\u01c8\3"+
		"\2\2\2h\u01ca\3\2\2\2j\u01cc\3\2\2\2l\u01ce\3\2\2\2n\u01d6\3\2\2\2p\u01e1"+
		"\3\2\2\2r\u01e6\3\2\2\2t\u01ec\3\2\2\2v\u01f2\3\2\2\2x\u01f4\3\2\2\2z"+
		"\u0202\3\2\2\2|~\5\4\3\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5z>\2\u0082\3\3\2\2\2\u0083\u0085"+
		"\5t;\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008d\3\2\2\2\u0086"+
		"\u0088\5p9\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2"+
		"\2\u0089\u008b\5\6\4\2\u008a\u008c\5p9\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5t"+
		";\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\5\3\2\2\2\u0094\u00c1"+
		"\5\34\17\2\u0095\u00c1\5\30\r\2\u0096\u00c1\5\32\16\2\u0097\u00c1\5 \21"+
		"\2\u0098\u00c1\5\36\20\2\u0099\u00c1\5\"\22\2\u009a\u00c1\5$\23\2\u009b"+
		"\u00c1\5&\24\2\u009c\u00c1\5(\25\2\u009d\u00c1\5*\26\2\u009e\u00c1\5\64"+
		"\33\2\u009f\u00c1\5\66\34\2\u00a0\u00c1\58\35\2\u00a1\u00c1\5D#\2\u00a2"+
		"\u00c1\5F$\2\u00a3\u00c1\5H%\2\u00a4\u00c1\5J&\2\u00a5\u00c1\5L\'\2\u00a6"+
		"\u00c1\5:\36\2\u00a7\u00c1\5<\37\2\u00a8\u00c1\5> \2\u00a9\u00c1\5N(\2"+
		"\u00aa\u00c1\5P)\2\u00ab\u00c1\5l\67\2\u00ac\u00c1\5n8\2\u00ad\u00c1\5"+
		"@!\2\u00ae\u00c1\5B\"\2\u00af\u00c1\5R*\2\u00b0\u00c1\5T+\2\u00b1\u00c1"+
		"\5V,\2\u00b2\u00c1\5X-\2\u00b3\u00c1\5Z.\2\u00b4\u00c1\5\\/\2\u00b5\u00c1"+
		"\5^\60\2\u00b6\u00c1\5,\27\2\u00b7\u00c1\5`\61\2\u00b8\u00c1\5b\62\2\u00b9"+
		"\u00c1\5d\63\2\u00ba\u00c1\5f\64\2\u00bb\u00c1\5\62\32\2\u00bc\u00c1\5"+
		".\30\2\u00bd\u00c1\5\60\31\2\u00be\u00c1\5h\65\2\u00bf\u00c1\5j\66\2\u00c0"+
		"\u0094\3\2\2\2\u00c0\u0095\3\2\2\2\u00c0\u0096\3\2\2\2\u00c0\u0097\3\2"+
		"\2\2\u00c0\u0098\3\2\2\2\u00c0\u0099\3\2\2\2\u00c0\u009a\3\2\2\2\u00c0"+
		"\u009b\3\2\2\2\u00c0\u009c\3\2\2\2\u00c0\u009d\3\2\2\2\u00c0\u009e\3\2"+
		"\2\2\u00c0\u009f\3\2\2\2\u00c0\u00a0\3\2\2\2\u00c0\u00a1\3\2\2\2\u00c0"+
		"\u00a2\3\2\2\2\u00c0\u00a3\3\2\2\2\u00c0\u00a4\3\2\2\2\u00c0\u00a5\3\2"+
		"\2\2\u00c0\u00a6\3\2\2\2\u00c0\u00a7\3\2\2\2\u00c0\u00a8\3\2\2\2\u00c0"+
		"\u00a9\3\2\2\2\u00c0\u00aa\3\2\2\2\u00c0\u00ab\3\2\2\2\u00c0\u00ac\3\2"+
		"\2\2\u00c0\u00ad\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0"+
		"\u00b0\3\2\2\2\u00c0\u00b1\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0\u00b3\3\2"+
		"\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b5\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0"+
		"\u00b7\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00ba\3\2"+
		"\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\7\3\2\2\2\u00c2\u00c3\5\n\6\2"+
		"\u00c3\t\3\2\2\2\u00c4\u00c5\b\6\1\2\u00c5\u00c7\7\3\2\2\u00c6\u00c8\5"+
		"t;\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\5\n\6\2\u00ca\u00cc\5t;\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\4\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d1"+
		"\5\16\b\2\u00d0\u00d2\5t;\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\5\n\6\4\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5\f"+
		"\7\2\u00d6\u00c4\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00e4\3\2\2\2\u00d8\u00da\f\5\2\2\u00d9\u00db\5t;\2\u00da\u00d9\3\2\2"+
		"\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\5\20\t\2\u00dd"+
		"\u00df\5t;\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2"+
		"\2\u00e0\u00e1\5\n\6\6\u00e1\u00e3\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\13\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ec\7\u00bd\2\2\u00e8\u00ec\7\u00bc\2\2\u00e9\u00ec"+
		"\7\u00be\2\2\u00ea\u00ec\5\24\13\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\r\3\2\2\2\u00ed\u00ee"+
		"\t\2\2\2\u00ee\17\3\2\2\2\u00ef\u00f0\t\3\2\2\u00f0\21\3\2\2\2\u00f1\u00f2"+
		"\7\u00bf\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\7\5\2\2\u00f4\u00f5\7\u00bf"+
		"\2\2\u00f5\25\3\2\2\2\u00f6\u00f9\5\b\5\2\u00f7\u00f9\5\22\n\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00fb\7\u00b9\2\2"+
		"\u00fb\u00fc\5t;\2\u00fc\u00fd\5\22\n\2\u00fd\u0103\5t;\2\u00fe\u00ff"+
		"\5\24\13\2\u00ff\u0100\5t;\2\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0108\7\6\2\2\u0107\u0109\5t;\2\u0108\u0107"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u010c\5\4\3\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0110\3\2\2\2\u010f\u0111\5t;\2\u0110\u010f\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\7\2\2\u0113\31\3\2\2\2\u0114"+
		"\u0115\7\u00ba\2\2\u0115\u0116\5t;\2\u0116\u011c\5\22\n\2\u0117\u0118"+
		"\5t;\2\u0118\u0119\5\26\f\2\u0119\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0121\5t;\2\u0120\u011f\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\33\3\2\2\2\u0122\u0123\7\u00b3\2\2\u0123\u0124\5t;\2\u0124"+
		"\u0125\5v<\2\u0125\u0126\5t;\2\u0126\u0127\7\6\2\2\u0127\u0128\5\4\3\2"+
		"\u0128\u0129\7\7\2\2\u0129\35\3\2\2\2\u012a\u012b\7\n\2\2\u012b\u012c"+
		"\5t;\2\u012c\u012d\5\b\5\2\u012d\37\3\2\2\2\u012e\u012f\7\f\2\2\u012f"+
		"\u0130\5t;\2\u0130\u0131\5\b\5\2\u0131!\3\2\2\2\u0132\u0133\7\17\2\2\u0133"+
		"\u0134\5t;\2\u0134\u0135\5\b\5\2\u0135#\3\2\2\2\u0136\u0137\7\21\2\2\u0137"+
		"\u0138\5t;\2\u0138\u0139\5\b\5\2\u0139%\3\2\2\2\u013a\u013b\7\22\2\2\u013b"+
		"\u013c\5t;\2\u013c\u013d\5\b\5\2\u013d\'\3\2\2\2\u013e\u013f\7\24\2\2"+
		"\u013f\u0140\5t;\2\u0140\u0141\5\b\5\2\u0141)\3\2\2\2\u0142\u0143\7\25"+
		"\2\2\u0143\u0144\5t;\2\u0144\u0145\5\b\5\2\u0145+\3\2\2\2\u0146\u0147"+
		"\7 \2\2\u0147\u0148\5t;\2\u0148\u0149\5\b\5\2\u0149-\3\2\2\2\u014a\u014b"+
		"\7&\2\2\u014b\u014c\5t;\2\u014c\u014d\5\b\5\2\u014d/\3\2\2\2\u014e\u014f"+
		"\7\'\2\2\u014f\u0150\5t;\2\u0150\u0151\5\b\5\2\u0151\61\3\2\2\2\u0152"+
		"\u0153\7%\2\2\u0153\u0154\5t;\2\u0154\u0155\5\b\5\2\u0155\63\3\2\2\2\u0156"+
		"\u0157\7\23\2\2\u0157\u0158\5t;\2\u0158\u0159\7\6\2\2\u0159\u015a\5t;"+
		"\2\u015a\u015b\5\b\5\2\u015b\u015c\5t;\2\u015c\u015d\7\b\2\2\u015d\u015e"+
		"\5t;\2\u015e\u015f\5\b\5\2\u015f\u0160\5t;\2\u0160\u0161\7\7\2\2\u0161"+
		"\65\3\2\2\2\u0162\u0163\7\13\2\2\u0163\u0164\5t;\2\u0164\u0165\7\t\2\2"+
		"\u0165\u0166\5\22\n\2\u0166\u0167\7\t\2\2\u0167\67\3\2\2\2\u0168\u0169"+
		"\7\26\2\2\u0169\u016a\5t;\2\u016a\u016b\7\t\2\2\u016b\u016c\5\22\n\2\u016c"+
		"\u016d\7\t\2\2\u016d9\3\2\2\2\u016e\u016f\7\u008d\2\2\u016f\u0170\5t;"+
		"\2\u0170\u0171\7\t\2\2\u0171\u0172\5\22\n\2\u0172\u0173\7\t\2\2\u0173"+
		";\3\2\2\2\u0174\u0175\7\u0091\2\2\u0175\u0176\5t;\2\u0176\u0177\7\t\2"+
		"\2\u0177\u0178\5\22\n\2\u0178\u0179\7\t\2\2\u0179=\3\2\2\2\u017a\u017b"+
		"\7\u0093\2\2\u017b\u017c\5t;\2\u017c\u017d\7\t\2\2\u017d\u017e\5\22\n"+
		"\2\u017e\u017f\7\t\2\2\u017f?\3\2\2\2\u0180\u0181\7\u009b\2\2\u0181\u0182"+
		"\5t;\2\u0182\u0183\5\b\5\2\u0183\u0184\5t;\2\u0184\u0186\7\6\2\2\u0185"+
		"\u0187\5t;\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2"+
		"\2\u0188\u018a\5\4\3\2\u0189\u018b\5t;\2\u018a\u0189\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\7\2\2\u018dA\3\2\2\2\u018e"+
		"\u018f\7\u009c\2\2\u018f\u0190\5t;\2\u0190\u0191\5\b\5\2\u0191\u0192\5"+
		"t;\2\u0192\u0194\7\6\2\2\u0193\u0195\5t;\2\u0194\u0193\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\5\4\3\2\u0197\u0199\5t;\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\7"+
		"\2\2\u019b\u019c\5t;\2\u019c\u019e\7\6\2\2\u019d\u019f\5t;\2\u019e\u019d"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\5\4\3\2\u01a1"+
		"\u01a3\5t;\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2"+
		"\2\u01a4\u01a5\7\7\2\2\u01a5C\3\2\2\2\u01a6\u01a7\7\r\2\2\u01a7E\3\2\2"+
		"\2\u01a8\u01a9\7\16\2\2\u01a9G\3\2\2\2\u01aa\u01ab\7\20\2\2\u01abI\3\2"+
		"\2\2\u01ac\u01ad\7\27\2\2\u01adK\3\2\2\2\u01ae\u01af\7\30\2\2\u01afM\3"+
		"\2\2\2\u01b0\u01b1\7\u008e\2\2\u01b1O\3\2\2\2\u01b2\u01b3\7\u0092\2\2"+
		"\u01b3Q\3\2\2\2\u01b4\u01b5\7\31\2\2\u01b5S\3\2\2\2\u01b6\u01b7\7\32\2"+
		"\2\u01b7U\3\2\2\2\u01b8\u01b9\7\33\2\2\u01b9W\3\2\2\2\u01ba\u01bb\7\34"+
		"\2\2\u01bbY\3\2\2\2\u01bc\u01bd\7\35\2\2\u01bd[\3\2\2\2\u01be\u01bf\7"+
		"\36\2\2\u01bf]\3\2\2\2\u01c0\u01c1\7\37\2\2\u01c1_\3\2\2\2\u01c2\u01c3"+
		"\7!\2\2\u01c3a\3\2\2\2\u01c4\u01c5\7\"\2\2\u01c5c\3\2\2\2\u01c6\u01c7"+
		"\7#\2\2\u01c7e\3\2\2\2\u01c8\u01c9\7$\2\2\u01c9g\3\2\2\2\u01ca\u01cb\7"+
		"(\2\2\u01cbi\3\2\2\2\u01cc\u01cd\7)\2\2\u01cdk\3\2\2\2\u01ce\u01cf\7\u008f"+
		"\2\2\u01cf\u01d0\5t;\2\u01d0\u01d1\5\24\13\2\u01d1\u01d2\5t;\2\u01d2\u01d4"+
		"\5\26\f\2\u01d3\u01d5\5t;\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"m\3\2\2\2\u01d6\u01d7\7\u0090\2\2\u01d7\u01d8\5t;\2\u01d8\u01d9\7\t\2"+
		"\2\u01d9\u01da\5\22\n\2\u01da\u01db\7\t\2\2\u01db\u01de\5t;\2\u01dc\u01df"+
		"\7h\2\2\u01dd\u01df\5x=\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"o\3\2\2\2\u01e0\u01e2\7\u00c0\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4q\3\2\2\2\u01e5\u01e7"+
		"\7\u00c1\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2"+
		"\2\u01e8\u01e9\3\2\2\2\u01e9s\3\2\2\2\u01ea\u01ed\5p9\2\u01eb\u01ed\5"+
		"r:\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efu\3\2\2\2\u01f0\u01f3\7\u00bc"+
		"\2\2\u01f1\u01f3\5\24\13\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"w\3\2\2\2\u01f4\u01f9\7\6\2\2\u01f5\u01f7\5t;\2\u01f6\u01f5\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\5\b\5\2\u01f9\u01f6\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fe\3\2\2\2\u01fd\u01ff\5t;\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2"+
		"\2\u01ff\u0200\3\2\2\2\u0200\u0201\7\7\2\2\u0201y\3\2\2\2\u0202\u0203"+
		"\7\2\2\3\u0203{\3\2\2\2(\177\u0084\u0087\u008b\u008f\u0092\u00c0\u00c7"+
		"\u00cb\u00d1\u00d6\u00da\u00de\u00e4\u00eb\u00f8\u0103\u0108\u010d\u0110"+
		"\u011c\u0120\u0186\u018a\u0194\u0198\u019e\u01a2\u01d4\u01de\u01e3\u01e8"+
		"\u01ec\u01ee\u01f2\u01f6\u01fb\u01fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}