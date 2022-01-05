// Generated from C:/LynxTrnaslator-main2/LynxTranslator-main/src/main/java/grammar\Lynx.g4 by ANTLR 4.9.2
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
		SUM=122, TAN=123, COMPARISONEQUALS=124, COMPARISONBIGGER=125, COMPARISONSMALLER=126, 
		COMPARISONSMALLEREQUALS=127, COMPARISONBIGGEREQUALS=128, ASK=129, FREEZE=130, 
		GET=131, NEWPAGE=132, NEWSLIDER=133, NEWTEXT=134, NEWTURTLE=135, REMOVE=136, 
		RENAME=137, SET=138, TALKTO=139, UNFREEZE=140, RESETT=141, TIMER=142, 
		CLEARNAME=143, CLEARNAMES=144, LET=145, ASSIGN=146, MAKE=147, NAMEX=148, 
		NAMES=149, THING=150, GETPAGE=151, NAMEPAGE=152, NEXTPAGE=153, PAGELIST=154, 
		PREVPAGE=155, PROJECTSIZE=156, AND=157, IF=158, IFELSE=159, NOT=160, OR=161, 
		ANSWER=162, KEYX=163, MOUSEPOS=164, PEEKCHAR=165, QUESTION=166, READCHAR=167, 
		SAY=168, SAYAS=169, SKIPCHAR=170, VOICES=171, BROADCAST=172, CANCEL=173, 
		CAREFULLY=174, DOLIST=175, DOTIMES=176, ERRORMESSAGE=177, EVERYONE=178, 
		FOREVER=179, LAUNCH=180, OUTPUT=181, REPEAT=182, WHILE=183, RUN=184, STOP=185, 
		STOPALL=186, STOPME=187, WAIT=188, PROCEDURE=189, CALL=190, DIVISION=191, 
		NATURALNUMBER=192, FLOATNUMBER=193, BOOLEAN=194, OTHERWORD=195, WHITESPACE=196, 
		NEWLINE=197;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_cmd = 2, RULE_mathStatement = 3, 
		RULE_mathSentence = 4, RULE_mathValue = 5, RULE_singleArgMathOperator = 6, 
		RULE_doubleArgMathOperator = 7, RULE_stringArg = 8, RULE_variableName = 9, 
		RULE_procedure = 10, RULE_procedureCall = 11, RULE_repeat = 12, RULE_while1 = 13, 
		RULE_back = 14, RULE_forward = 15, RULE_left = 16, RULE_right = 17, RULE_setheading = 18, 
		RULE_setx = 19, RULE_sety = 20, RULE_namefromcolor = 21, RULE_setcolor = 22, 
		RULE_setpensize = 23, RULE_setbg = 24, RULE_setpos = 25, RULE_distance = 26, 
		RULE_towards = 27, RULE_clearname = 28, RULE_namex = 29, RULE_thing = 30, 
		RULE_ifc = 31, RULE_ifelse = 32, RULE_heading = 33, RULE_home = 34, RULE_pos = 35, 
		RULE_xcor = 36, RULE_ycor = 37, RULE_clearnames = 38, RULE_names = 39, 
		RULE_bg = 40, RULE_cg = 41, RULE_clean = 42, RULE_color = 43, RULE_colorrunder = 44, 
		RULE_fill = 45, RULE_freezebg = 46, RULE_pd = 47, RULE_pe = 48, RULE_pensize = 49, 
		RULE_pu = 50, RULE_stamp = 51, RULE_unfreezebg = 52, RULE_let = 53, RULE_assign = 54, 
		RULE_make = 55, RULE_spaceArg = 56, RULE_newLineArg = 57, RULE_brakeArg = 58, 
		RULE_naturalNumberArg = 59, RULE_list = 60, RULE_endFileArg = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "cmd", "mathStatement", "mathSentence", "mathValue", 
			"singleArgMathOperator", "doubleArgMathOperator", "stringArg", "variableName", 
			"procedure", "procedureCall", "repeat", "while1", "back", "forward", 
			"left", "right", "setheading", "setx", "sety", "namefromcolor", "setcolor", 
			"setpensize", "setbg", "setpos", "distance", "towards", "clearname", 
			"namex", "thing", "ifc", "ifelse", "heading", "home", "pos", "xcor", 
			"ycor", "clearnames", "names", "bg", "cg", "clean", "color", "colorrunder", 
			"fill", "freezebg", "pd", "pe", "pensize", "pu", "stamp", "unfreezebg", 
			"let", "assign", "make", "spaceArg", "newLineArg", "brakeArg", "naturalNumberArg", 
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
			null, null, null, null, "'+'", null, null, "'>'", "'<'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'/'"
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
			"SIN", "SQRT", "SUM", "TAN", "COMPARISONEQUALS", "COMPARISONBIGGER", 
			"COMPARISONSMALLER", "COMPARISONSMALLEREQUALS", "COMPARISONBIGGEREQUALS", 
			"ASK", "FREEZE", "GET", "NEWPAGE", "NEWSLIDER", "NEWTEXT", "NEWTURTLE", 
			"REMOVE", "RENAME", "SET", "TALKTO", "UNFREEZE", "RESETT", "TIMER", "CLEARNAME", 
			"CLEARNAMES", "LET", "ASSIGN", "MAKE", "NAMEX", "NAMES", "THING", "GETPAGE", 
			"NAMEPAGE", "NEXTPAGE", "PAGELIST", "PREVPAGE", "PROJECTSIZE", "AND", 
			"IF", "IFELSE", "NOT", "OR", "ANSWER", "KEYX", "MOUSEPOS", "PEEKCHAR", 
			"QUESTION", "READCHAR", "SAY", "SAYAS", "SKIPCHAR", "VOICES", "BROADCAST", 
			"CANCEL", "CAREFULLY", "DOLIST", "DOTIMES", "ERRORMESSAGE", "EVERYONE", 
			"FOREVER", "LAUNCH", "OUTPUT", "REPEAT", "WHILE", "RUN", "STOP", "STOPALL", 
			"STOPME", "WAIT", "PROCEDURE", "CALL", "DIVISION", "NATURALNUMBER", "FLOATNUMBER", 
			"BOOLEAN", "OTHERWORD", "WHITESPACE", "NEWLINE"
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
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				line();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << DISTANCE) | (1L << FORWARD) | (1L << HEADING) | (1L << HOME) | (1L << LEFT) | (1L << POS) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETPOS) | (1L << SETX) | (1L << SETY) | (1L << TOWARDS) | (1L << XCOR) | (1L << YCOR) | (1L << BG) | (1L << CG) | (1L << CLEAN) | (1L << COLOR) | (1L << COLORUNDER) | (1L << FILL) | (1L << FREEZEBG) | (1L << NAMEFROMCOLOUR) | (1L << PD) | (1L << PE) | (1L << PENSIZE) | (1L << PU) | (1L << SETBG) | (1L << SETCOLOR) | (1L << SETPENSIZE) | (1L << STAMP) | (1L << UNFREEZEBG))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CLEARNAME - 143)) | (1L << (CLEARNAMES - 143)) | (1L << (LET - 143)) | (1L << (ASSIGN - 143)) | (1L << (MAKE - 143)) | (1L << (NAMEX - 143)) | (1L << (NAMES - 143)) | (1L << (THING - 143)) | (1L << (IF - 143)) | (1L << (IFELSE - 143)) | (1L << (REPEAT - 143)) | (1L << (WHILE - 143)) | (1L << (PROCEDURE - 143)) | (1L << (CALL - 143)) | (1L << (WHITESPACE - 143)) | (1L << (NEWLINE - 143)))) != 0) );
			setState(129);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(131);
				brakeArg();
				}
				break;
			}
			setState(141); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(134);
						spaceArg();
						}
					}

					setState(137);
					cmd();
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(138);
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
				setState(143); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(145);
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
		public While1Context while1() {
			return getRuleContext(While1Context.class,0);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				repeat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				while1();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				procedure();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				procedureCall();
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				back();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				right();
				}
				break;
			case SETHEADING:
				enterOuterAlt(_localctx, 9);
				{
				setState(156);
				setheading();
				}
				break;
			case SETX:
				enterOuterAlt(_localctx, 10);
				{
				setState(157);
				setx();
				}
				break;
			case SETY:
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				sety();
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 12);
				{
				setState(159);
				setpos();
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 13);
				{
				setState(160);
				distance();
				}
				break;
			case TOWARDS:
				enterOuterAlt(_localctx, 14);
				{
				setState(161);
				towards();
				}
				break;
			case HEADING:
				enterOuterAlt(_localctx, 15);
				{
				setState(162);
				heading();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 16);
				{
				setState(163);
				home();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 17);
				{
				setState(164);
				pos();
				}
				break;
			case XCOR:
				enterOuterAlt(_localctx, 18);
				{
				setState(165);
				xcor();
				}
				break;
			case YCOR:
				enterOuterAlt(_localctx, 19);
				{
				setState(166);
				ycor();
				}
				break;
			case CLEARNAME:
				enterOuterAlt(_localctx, 20);
				{
				setState(167);
				clearname();
				}
				break;
			case NAMEX:
				enterOuterAlt(_localctx, 21);
				{
				setState(168);
				namex();
				}
				break;
			case THING:
				enterOuterAlt(_localctx, 22);
				{
				setState(169);
				thing();
				}
				break;
			case CLEARNAMES:
				enterOuterAlt(_localctx, 23);
				{
				setState(170);
				clearnames();
				}
				break;
			case NAMES:
				enterOuterAlt(_localctx, 24);
				{
				setState(171);
				names();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 25);
				{
				setState(172);
				let();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 26);
				{
				setState(173);
				assign();
				}
				break;
			case MAKE:
				enterOuterAlt(_localctx, 27);
				{
				setState(174);
				make();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 28);
				{
				setState(175);
				ifc();
				}
				break;
			case IFELSE:
				enterOuterAlt(_localctx, 29);
				{
				setState(176);
				ifelse();
				}
				break;
			case BG:
				enterOuterAlt(_localctx, 30);
				{
				setState(177);
				bg();
				}
				break;
			case CG:
				enterOuterAlt(_localctx, 31);
				{
				setState(178);
				cg();
				}
				break;
			case CLEAN:
				enterOuterAlt(_localctx, 32);
				{
				setState(179);
				clean();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 33);
				{
				setState(180);
				color();
				}
				break;
			case COLORUNDER:
				enterOuterAlt(_localctx, 34);
				{
				setState(181);
				colorrunder();
				}
				break;
			case FILL:
				enterOuterAlt(_localctx, 35);
				{
				setState(182);
				fill();
				}
				break;
			case FREEZEBG:
				enterOuterAlt(_localctx, 36);
				{
				setState(183);
				freezebg();
				}
				break;
			case NAMEFROMCOLOUR:
				enterOuterAlt(_localctx, 37);
				{
				setState(184);
				namefromcolor();
				}
				break;
			case PD:
				enterOuterAlt(_localctx, 38);
				{
				setState(185);
				pd();
				}
				break;
			case PE:
				enterOuterAlt(_localctx, 39);
				{
				setState(186);
				pe();
				}
				break;
			case PENSIZE:
				enterOuterAlt(_localctx, 40);
				{
				setState(187);
				pensize();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 41);
				{
				setState(188);
				pu();
				}
				break;
			case SETBG:
				enterOuterAlt(_localctx, 42);
				{
				setState(189);
				setbg();
				}
				break;
			case SETCOLOR:
				enterOuterAlt(_localctx, 43);
				{
				setState(190);
				setcolor();
				}
				break;
			case SETPENSIZE:
				enterOuterAlt(_localctx, 44);
				{
				setState(191);
				setpensize();
				}
				break;
			case STAMP:
				enterOuterAlt(_localctx, 45);
				{
				setState(192);
				stamp();
				}
				break;
			case UNFREEZEBG:
				enterOuterAlt(_localctx, 46);
				{
				setState(193);
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
			setState(196);
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
		public MathSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathSentence; }
	 
		public MathSentenceContext() { }
		public void copyFrom(MathSentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleArgsContext extends MathSentenceContext {
		public SingleArgMathOperatorContext singleArgMathOperator() {
			return getRuleContext(SingleArgMathOperatorContext.class,0);
		}
		public MathSentenceContext mathSentence() {
			return getRuleContext(MathSentenceContext.class,0);
		}
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public SingleArgsContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSingleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSingleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSingleArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleArgsContext extends MathSentenceContext {
		public List<MathSentenceContext> mathSentence() {
			return getRuleContexts(MathSentenceContext.class);
		}
		public MathSentenceContext mathSentence(int i) {
			return getRuleContext(MathSentenceContext.class,i);
		}
		public DoubleArgMathOperatorContext doubleArgMathOperator() {
			return getRuleContext(DoubleArgMathOperatorContext.class,0);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public DoubleArgsContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDoubleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDoubleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDoubleArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueContext extends MathSentenceContext {
		public MathValueContext mathValue() {
			return getRuleContext(MathValueContext.class,0);
		}
		public ValueContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraketsContext extends MathSentenceContext {
		public MathSentenceContext mathSentence() {
			return getRuleContext(MathSentenceContext.class,0);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public BraketsContext(MathSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBrakets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBrakets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBrakets(this);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new BraketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(199);
				match(T__0);
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
				mathSentence(0);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(204);
					brakeArg();
					}
				}

				setState(207);
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
				_localctx = new SingleArgsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				singleArgMathOperator();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(210);
					brakeArg();
					}
				}

				setState(213);
				mathSentence(2);
				}
				break;
			case T__2:
			case NATURALNUMBER:
			case FLOATNUMBER:
			case BOOLEAN:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				mathValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DoubleArgsContext(new MathSentenceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mathSentence);
					setState(218);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
					doubleArgMathOperator();
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(223);
						brakeArg();
						}
					}

					setState(226);
					mathSentence(4);
					}
					} 
				}
				setState(232);
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
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(FLOATNUMBER);
				}
				break;
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(NATURALNUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(BOOLEAN);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
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
		public SingleArgMathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleArgMathOperator; }
	 
		public SingleArgMathOperatorContext() { }
		public void copyFrom(SingleArgMathOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TanContext extends SingleArgMathOperatorContext {
		public TerminalNode TAN() { return getToken(LynxParser.TAN, 0); }
		public TanContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomContext extends SingleArgMathOperatorContext {
		public TerminalNode RANDOM() { return getToken(LynxParser.RANDOM, 0); }
		public RandomContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRandom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRandom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnContext extends SingleArgMathOperatorContext {
		public TerminalNode LN() { return getToken(LynxParser.LN, 0); }
		public LnContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusSingleContext extends SingleArgMathOperatorContext {
		public TerminalNode MINUS() { return getToken(LynxParser.MINUS, 0); }
		public MinusSingleContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMinusSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMinusSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMinusSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends SingleArgMathOperatorContext {
		public TerminalNode NOT() { return getToken(LynxParser.NOT, 0); }
		public NotContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsContext extends SingleArgMathOperatorContext {
		public TerminalNode ABS() { return getToken(LynxParser.ABS, 0); }
		public AbsContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitAbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitAbs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int1Context extends SingleArgMathOperatorContext {
		public TerminalNode INT() { return getToken(LynxParser.INT, 0); }
		public Int1Context(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterInt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitInt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitInt1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArctanContext extends SingleArgMathOperatorContext {
		public TerminalNode ARCTAN() { return getToken(LynxParser.ARCTAN, 0); }
		public ArctanContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterArctan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitArctan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitArctan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoundContext extends SingleArgMathOperatorContext {
		public TerminalNode ROUND() { return getToken(LynxParser.ROUND, 0); }
		public RoundContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRound(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtContext extends SingleArgMathOperatorContext {
		public TerminalNode SQRT() { return getToken(LynxParser.SQRT, 0); }
		public SqrtContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends SingleArgMathOperatorContext {
		public TerminalNode COS() { return getToken(LynxParser.COS, 0); }
		public CosContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends SingleArgMathOperatorContext {
		public TerminalNode SIN() { return getToken(LynxParser.SIN, 0); }
		public SinContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleArgMathOperatorContext singleArgMathOperator() throws RecognitionException {
		SingleArgMathOperatorContext _localctx = new SingleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleArgMathOperator);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				_localctx = new AbsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(ABS);
				}
				break;
			case ARCTAN:
				_localctx = new ArctanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(ARCTAN);
				}
				break;
			case COS:
				_localctx = new CosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(COS);
				}
				break;
			case INT:
				_localctx = new Int1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(INT);
				}
				break;
			case LN:
				_localctx = new LnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(LN);
				}
				break;
			case MINUS:
				_localctx = new MinusSingleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(MINUS);
				}
				break;
			case RANDOM:
				_localctx = new RandomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(RANDOM);
				}
				break;
			case ROUND:
				_localctx = new RoundContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				match(ROUND);
				}
				break;
			case SIN:
				_localctx = new SinContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(247);
				match(SIN);
				}
				break;
			case SQRT:
				_localctx = new SqrtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(248);
				match(SQRT);
				}
				break;
			case TAN:
				_localctx = new TanContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(249);
				match(TAN);
				}
				break;
			case NOT:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(250);
				match(NOT);
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

	public static class DoubleArgMathOperatorContext extends ParserRuleContext {
		public DoubleArgMathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleArgMathOperator; }
	 
		public DoubleArgMathOperatorContext() { }
		public void copyFrom(DoubleArgMathOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusContext extends DoubleArgMathOperatorContext {
		public TerminalNode MINUS() { return getToken(LynxParser.MINUS, 0); }
		public MinusContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonBiggerEqualsContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONBIGGEREQUALS() { return getToken(LynxParser.COMPARISONBIGGEREQUALS, 0); }
		public ComparisonBiggerEqualsContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterComparisonBiggerEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitComparisonBiggerEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitComparisonBiggerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonSmallerEqualsContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONSMALLEREQUALS() { return getToken(LynxParser.COMPARISONSMALLEREQUALS, 0); }
		public ComparisonSmallerEqualsContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterComparisonSmallerEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitComparisonSmallerEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitComparisonSmallerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductContext extends DoubleArgMathOperatorContext {
		public TerminalNode PRODUCT() { return getToken(LynxParser.PRODUCT, 0); }
		public ProductContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends DoubleArgMathOperatorContext {
		public TerminalNode OR() { return getToken(LynxParser.OR, 0); }
		public OrContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonBiggerContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONBIGGER() { return getToken(LynxParser.COMPARISONBIGGER, 0); }
		public ComparisonBiggerContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterComparisonBigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitComparisonBigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitComparisonBigger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogContext extends DoubleArgMathOperatorContext {
		public TerminalNode LOG() { return getToken(LynxParser.LOG, 0); }
		public LogContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonSmallerContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONSMALLER() { return getToken(LynxParser.COMPARISONSMALLER, 0); }
		public ComparisonSmallerContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterComparisonSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitComparisonSmaller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitComparisonSmaller(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonEqualsContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONEQUALS() { return getToken(LynxParser.COMPARISONEQUALS, 0); }
		public ComparisonEqualsContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterComparisonEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitComparisonEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitComparisonEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends DoubleArgMathOperatorContext {
		public TerminalNode SUM() { return getToken(LynxParser.SUM, 0); }
		public SumContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotientContext extends DoubleArgMathOperatorContext {
		public TerminalNode QUOTIENT() { return getToken(LynxParser.QUOTIENT, 0); }
		public QuotientContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterQuotient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitQuotient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitQuotient(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends DoubleArgMathOperatorContext {
		public TerminalNode DIVISION() { return getToken(LynxParser.DIVISION, 0); }
		public DivisionContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends DoubleArgMathOperatorContext {
		public TerminalNode AND() { return getToken(LynxParser.AND, 0); }
		public AndContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceContext extends DoubleArgMathOperatorContext {
		public TerminalNode DIFFERENCE() { return getToken(LynxParser.DIFFERENCE, 0); }
		public DifferenceContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitDifference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends DoubleArgMathOperatorContext {
		public TerminalNode POWER() { return getToken(LynxParser.POWER, 0); }
		public PowerContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends DoubleArgMathOperatorContext {
		public TerminalNode EXP() { return getToken(LynxParser.EXP, 0); }
		public ExpContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemainderContext extends DoubleArgMathOperatorContext {
		public TerminalNode REMAINDER() { return getToken(LynxParser.REMAINDER, 0); }
		public RemainderContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterRemainder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitRemainder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitRemainder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleArgMathOperatorContext doubleArgMathOperator() throws RecognitionException {
		DoubleArgMathOperatorContext _localctx = new DoubleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doubleArgMathOperator);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFFERENCE:
				_localctx = new DifferenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(DIFFERENCE);
				}
				break;
			case POWER:
				_localctx = new PowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(POWER);
				}
				break;
			case QUOTIENT:
				_localctx = new QuotientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(QUOTIENT);
				}
				break;
			case REMAINDER:
				_localctx = new RemainderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(REMAINDER);
				}
				break;
			case SUM:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(SUM);
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				match(MINUS);
				}
				break;
			case PRODUCT:
				_localctx = new ProductContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				match(PRODUCT);
				}
				break;
			case DIVISION:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
				match(DIVISION);
				}
				break;
			case COMPARISONEQUALS:
				_localctx = new ComparisonEqualsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(261);
				match(COMPARISONEQUALS);
				}
				break;
			case COMPARISONBIGGER:
				_localctx = new ComparisonBiggerContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				match(COMPARISONBIGGER);
				}
				break;
			case COMPARISONSMALLER:
				_localctx = new ComparisonSmallerContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(263);
				match(COMPARISONSMALLER);
				}
				break;
			case COMPARISONBIGGEREQUALS:
				_localctx = new ComparisonBiggerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(264);
				match(COMPARISONBIGGEREQUALS);
				}
				break;
			case COMPARISONSMALLEREQUALS:
				_localctx = new ComparisonSmallerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(265);
				match(COMPARISONSMALLEREQUALS);
				}
				break;
			case EXP:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(266);
				match(EXP);
				}
				break;
			case LOG:
				_localctx = new LogContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(267);
				match(LOG);
				}
				break;
			case OR:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(268);
				match(OR);
				}
				break;
			case AND:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(269);
				match(AND);
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
			setState(272);
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
			setState(274);
			match(T__2);
			setState(275);
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
		enterRule(_localctx, 20, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(PROCEDURE);
			setState(278);
			brakeArg();
			setState(279);
			stringArg();
			setState(280);
			brakeArg();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(281);
				variableName();
				setState(282);
				brakeArg();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(T__3);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(290);
				brakeArg();
				}
				break;
			}
			setState(294); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(293);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(296); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(298);
				brakeArg();
				}
			}

			setState(301);
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
		public List<MathStatementContext> mathStatement() {
			return getRuleContexts(MathStatementContext.class);
		}
		public MathStatementContext mathStatement(int i) {
			return getRuleContext(MathStatementContext.class,i);
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
		enterRule(_localctx, 22, RULE_procedureCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(CALL);
			setState(304);
			brakeArg();
			setState(305);
			stringArg();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					brakeArg();
					setState(307);
					mathStatement();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(314);
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
		enterRule(_localctx, 24, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(REPEAT);
			setState(318);
			brakeArg();
			setState(319);
			mathStatement();
			setState(320);
			brakeArg();
			setState(321);
			match(T__3);
			setState(322);
			line();
			setState(323);
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

	public static class While1Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LynxParser.WHILE, 0); }
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
		public While1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterWhile1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitWhile1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitWhile1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While1Context while1() throws RecognitionException {
		While1Context _localctx = new While1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_while1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(WHILE);
			setState(326);
			brakeArg();
			setState(327);
			mathStatement();
			setState(328);
			brakeArg();
			setState(329);
			match(T__3);
			setState(330);
			line();
			setState(331);
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
			setState(333);
			match(BACK);
			setState(334);
			brakeArg();
			setState(335);
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
			setState(337);
			match(FORWARD);
			setState(338);
			brakeArg();
			setState(339);
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
			setState(341);
			match(LEFT);
			setState(342);
			brakeArg();
			setState(343);
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
			setState(345);
			match(RIGHT);
			setState(346);
			brakeArg();
			setState(347);
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
			setState(349);
			match(SETHEADING);
			setState(350);
			brakeArg();
			setState(351);
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
			setState(353);
			match(SETX);
			setState(354);
			brakeArg();
			setState(355);
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
			setState(357);
			match(SETY);
			setState(358);
			brakeArg();
			setState(359);
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
			setState(361);
			match(NAMEFROMCOLOUR);
			setState(362);
			brakeArg();
			setState(363);
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
			setState(365);
			match(SETCOLOR);
			setState(366);
			brakeArg();
			setState(367);
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
			setState(369);
			match(SETPENSIZE);
			setState(370);
			brakeArg();
			setState(371);
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
			setState(373);
			match(SETBG);
			setState(374);
			brakeArg();
			setState(375);
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
			setState(377);
			match(SETPOS);
			setState(378);
			brakeArg();
			setState(379);
			match(T__3);
			setState(380);
			brakeArg();
			setState(381);
			mathStatement();
			setState(382);
			brakeArg();
			setState(383);
			match(T__5);
			setState(384);
			brakeArg();
			setState(385);
			mathStatement();
			setState(386);
			brakeArg();
			setState(387);
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
			setState(389);
			match(DISTANCE);
			setState(390);
			brakeArg();
			setState(391);
			match(T__6);
			setState(392);
			stringArg();
			setState(393);
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
			setState(395);
			match(TOWARDS);
			setState(396);
			brakeArg();
			setState(397);
			match(T__6);
			setState(398);
			stringArg();
			setState(399);
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
			setState(401);
			match(CLEARNAME);
			setState(402);
			brakeArg();
			setState(403);
			match(T__6);
			setState(404);
			stringArg();
			setState(405);
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
			setState(407);
			match(NAMEX);
			setState(408);
			brakeArg();
			setState(409);
			match(T__6);
			setState(410);
			stringArg();
			setState(411);
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
			setState(413);
			match(THING);
			setState(414);
			brakeArg();
			setState(415);
			match(T__6);
			setState(416);
			stringArg();
			setState(417);
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
			setState(419);
			match(IF);
			setState(420);
			brakeArg();
			setState(421);
			mathStatement();
			setState(422);
			brakeArg();
			setState(423);
			match(T__3);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(424);
				brakeArg();
				}
				break;
			}
			setState(427);
			line();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(428);
				brakeArg();
				}
			}

			setState(431);
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
			setState(433);
			match(IFELSE);
			setState(434);
			brakeArg();
			setState(435);
			mathStatement();
			setState(436);
			brakeArg();
			setState(437);
			match(T__3);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(438);
				brakeArg();
				}
				break;
			}
			setState(441);
			line();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(442);
				brakeArg();
				}
			}

			setState(445);
			match(T__4);
			setState(446);
			brakeArg();
			setState(447);
			match(T__3);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(448);
				brakeArg();
				}
				break;
			}
			setState(451);
			line();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(452);
				brakeArg();
				}
			}

			setState(455);
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
			setState(457);
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
			setState(459);
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
			setState(461);
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
			setState(463);
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
			setState(465);
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
			setState(467);
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
			setState(469);
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
			setState(471);
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
			setState(473);
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
			setState(475);
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
			setState(477);
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
			setState(479);
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
			setState(481);
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
			setState(483);
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
			setState(485);
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
			setState(487);
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
			setState(489);
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
			setState(491);
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
			setState(493);
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
			setState(495);
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
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
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
			setState(497);
			match(LET);
			setState(498);
			brakeArg();
			setState(499);
			variableName();
			setState(500);
			brakeArg();
			setState(501);
			mathStatement();
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(502);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(LynxParser.ASSIGN, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(ASSIGN);
			setState(506);
			brakeArg();
			setState(507);
			variableName();
			setState(508);
			brakeArg();
			setState(509);
			mathStatement();
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(510);
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
		enterRule(_localctx, 110, RULE_make);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(MAKE);
			setState(514);
			brakeArg();
			setState(515);
			match(T__6);
			setState(516);
			stringArg();
			setState(517);
			match(T__6);
			setState(518);
			brakeArg();
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(519);
				match(WORD);
				}
				break;
			case T__3:
				{
				setState(520);
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
		enterRule(_localctx, 112, RULE_spaceArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(523);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(526); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 114, RULE_newLineArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(528);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(531); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 116, RULE_brakeArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(535);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(533);
						spaceArg();
						}
						break;
					case NEWLINE:
						{
						setState(534);
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
				setState(537); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 118, RULE_naturalNumberArg);
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(NATURALNUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
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
		enterRule(_localctx, 120, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(T__3);
			setState(548); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(544);
						brakeArg();
						}
					}

					setState(547);
					mathStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(550); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(552);
				brakeArg();
				}
			}

			setState(555);
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
		enterRule(_localctx, 122, RULE_endFileArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c7\u0232\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\6\2\u0080\n\2\r\2\16\2\u0081\3\2\3\2\3\3\5\3\u0087\n"+
		"\3\3\3\5\3\u008a\n\3\3\3\3\3\5\3\u008e\n\3\6\3\u0090\n\3\r\3\16\3\u0091"+
		"\3\3\5\3\u0095\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c5"+
		"\n\4\3\5\3\5\3\6\3\6\3\6\5\6\u00cc\n\6\3\6\3\6\5\6\u00d0\n\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00d6\n\6\3\6\3\6\3\6\5\6\u00db\n\6\3\6\3\6\5\6\u00df\n\6\3"+
		"\6\3\6\5\6\u00e3\n\6\3\6\3\6\7\6\u00e7\n\6\f\6\16\6\u00ea\13\6\3\7\3\7"+
		"\3\7\3\7\5\7\u00f0\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00fe\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0111\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u011f\n\f\f\f\16\f\u0122\13\f\3\f\3\f\5\f\u0126\n\f\3\f\6"+
		"\f\u0129\n\f\r\f\16\f\u012a\3\f\5\f\u012e\n\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0138\n\r\f\r\16\r\u013b\13\r\3\r\5\r\u013e\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\5!\u01ac\n!\3!\3!\5!\u01b0\n!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u01ba\n\"\3\"\3\"\5\"\u01be\n\"\3\"\3\"\3\"\3\"\5\"\u01c4\n"+
		"\"\3\"\3\"\5\"\u01c8\n\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\5\67\u01fa\n\67\38\38\38\38\38\38\58\u0202\n8\39\39\39\39\39\39\3"+
		"9\39\59\u020c\n9\3:\6:\u020f\n:\r:\16:\u0210\3;\6;\u0214\n;\r;\16;\u0215"+
		"\3<\3<\6<\u021a\n<\r<\16<\u021b\3=\3=\5=\u0220\n=\3>\3>\5>\u0224\n>\3"+
		">\6>\u0227\n>\r>\16>\u0228\3>\5>\u022c\n>\3>\3>\3?\3?\3?\2\3\n@\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|\2\2\2\u0263\2\177\3\2\2\2\4\u0086\3\2\2\2\6\u00c4"+
		"\3\2\2\2\b\u00c6\3\2\2\2\n\u00da\3\2\2\2\f\u00ef\3\2\2\2\16\u00fd\3\2"+
		"\2\2\20\u0110\3\2\2\2\22\u0112\3\2\2\2\24\u0114\3\2\2\2\26\u0117\3\2\2"+
		"\2\30\u0131\3\2\2\2\32\u013f\3\2\2\2\34\u0147\3\2\2\2\36\u014f\3\2\2\2"+
		" \u0153\3\2\2\2\"\u0157\3\2\2\2$\u015b\3\2\2\2&\u015f\3\2\2\2(\u0163\3"+
		"\2\2\2*\u0167\3\2\2\2,\u016b\3\2\2\2.\u016f\3\2\2\2\60\u0173\3\2\2\2\62"+
		"\u0177\3\2\2\2\64\u017b\3\2\2\2\66\u0187\3\2\2\28\u018d\3\2\2\2:\u0193"+
		"\3\2\2\2<\u0199\3\2\2\2>\u019f\3\2\2\2@\u01a5\3\2\2\2B\u01b3\3\2\2\2D"+
		"\u01cb\3\2\2\2F\u01cd\3\2\2\2H\u01cf\3\2\2\2J\u01d1\3\2\2\2L\u01d3\3\2"+
		"\2\2N\u01d5\3\2\2\2P\u01d7\3\2\2\2R\u01d9\3\2\2\2T\u01db\3\2\2\2V\u01dd"+
		"\3\2\2\2X\u01df\3\2\2\2Z\u01e1\3\2\2\2\\\u01e3\3\2\2\2^\u01e5\3\2\2\2"+
		"`\u01e7\3\2\2\2b\u01e9\3\2\2\2d\u01eb\3\2\2\2f\u01ed\3\2\2\2h\u01ef\3"+
		"\2\2\2j\u01f1\3\2\2\2l\u01f3\3\2\2\2n\u01fb\3\2\2\2p\u0203\3\2\2\2r\u020e"+
		"\3\2\2\2t\u0213\3\2\2\2v\u0219\3\2\2\2x\u021f\3\2\2\2z\u0221\3\2\2\2|"+
		"\u022f\3\2\2\2~\u0080\5\4\3\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5|?\2\u0084"+
		"\3\3\2\2\2\u0085\u0087\5v<\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u008f\3\2\2\2\u0088\u008a\5r:\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008d\5\6\4\2\u008c\u008e\5r:\2\u008d\u008c"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0095\5v<\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\5"+
		"\3\2\2\2\u0096\u00c5\5\32\16\2\u0097\u00c5\5\34\17\2\u0098\u00c5\5\26"+
		"\f\2\u0099\u00c5\5\30\r\2\u009a\u00c5\5 \21\2\u009b\u00c5\5\36\20\2\u009c"+
		"\u00c5\5\"\22\2\u009d\u00c5\5$\23\2\u009e\u00c5\5&\24\2\u009f\u00c5\5"+
		"(\25\2\u00a0\u00c5\5*\26\2\u00a1\u00c5\5\64\33\2\u00a2\u00c5\5\66\34\2"+
		"\u00a3\u00c5\58\35\2\u00a4\u00c5\5D#\2\u00a5\u00c5\5F$\2\u00a6\u00c5\5"+
		"H%\2\u00a7\u00c5\5J&\2\u00a8\u00c5\5L\'\2\u00a9\u00c5\5:\36\2\u00aa\u00c5"+
		"\5<\37\2\u00ab\u00c5\5> \2\u00ac\u00c5\5N(\2\u00ad\u00c5\5P)\2\u00ae\u00c5"+
		"\5l\67\2\u00af\u00c5\5n8\2\u00b0\u00c5\5p9\2\u00b1\u00c5\5@!\2\u00b2\u00c5"+
		"\5B\"\2\u00b3\u00c5\5R*\2\u00b4\u00c5\5T+\2\u00b5\u00c5\5V,\2\u00b6\u00c5"+
		"\5X-\2\u00b7\u00c5\5Z.\2\u00b8\u00c5\5\\/\2\u00b9\u00c5\5^\60\2\u00ba"+
		"\u00c5\5,\27\2\u00bb\u00c5\5`\61\2\u00bc\u00c5\5b\62\2\u00bd\u00c5\5d"+
		"\63\2\u00be\u00c5\5f\64\2\u00bf\u00c5\5\62\32\2\u00c0\u00c5\5.\30\2\u00c1"+
		"\u00c5\5\60\31\2\u00c2\u00c5\5h\65\2\u00c3\u00c5\5j\66\2\u00c4\u0096\3"+
		"\2\2\2\u00c4\u0097\3\2\2\2\u00c4\u0098\3\2\2\2\u00c4\u0099\3\2\2\2\u00c4"+
		"\u009a\3\2\2\2\u00c4\u009b\3\2\2\2\u00c4\u009c\3\2\2\2\u00c4\u009d\3\2"+
		"\2\2\u00c4\u009e\3\2\2\2\u00c4\u009f\3\2\2\2\u00c4\u00a0\3\2\2\2\u00c4"+
		"\u00a1\3\2\2\2\u00c4\u00a2\3\2\2\2\u00c4\u00a3\3\2\2\2\u00c4\u00a4\3\2"+
		"\2\2\u00c4\u00a5\3\2\2\2\u00c4\u00a6\3\2\2\2\u00c4\u00a7\3\2\2\2\u00c4"+
		"\u00a8\3\2\2\2\u00c4\u00a9\3\2\2\2\u00c4\u00aa\3\2\2\2\u00c4\u00ab\3\2"+
		"\2\2\u00c4\u00ac\3\2\2\2\u00c4\u00ad\3\2\2\2\u00c4\u00ae\3\2\2\2\u00c4"+
		"\u00af\3\2\2\2\u00c4\u00b0\3\2\2\2\u00c4\u00b1\3\2\2\2\u00c4\u00b2\3\2"+
		"\2\2\u00c4\u00b3\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4"+
		"\u00b6\3\2\2\2\u00c4\u00b7\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00b9\3\2"+
		"\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\7\3\2\2\2\u00c6\u00c7\5\n\6\2\u00c7\t\3\2\2\2\u00c8\u00c9\b\6\1\2\u00c9"+
		"\u00cb\7\3\2\2\u00ca\u00cc\5v<\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5\n\6\2\u00ce\u00d0\5v<\2\u00cf\u00ce"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\4\2\2\u00d2"+
		"\u00db\3\2\2\2\u00d3\u00d5\5\16\b\2\u00d4\u00d6\5v<\2\u00d5\u00d4\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5\n\6\4\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00db\5\f\7\2\u00da\u00c8\3\2\2\2\u00da\u00d3\3\2"+
		"\2\2\u00da\u00d9\3\2\2\2\u00db\u00e8\3\2\2\2\u00dc\u00de\f\5\2\2\u00dd"+
		"\u00df\5v<\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2"+
		"\2\u00e0\u00e2\5\20\t\2\u00e1\u00e3\5v<\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\n\6\6\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00dc\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\13\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f0\7\u00c3\2\2\u00ec"+
		"\u00f0\7\u00c2\2\2\u00ed\u00f0\7\u00c4\2\2\u00ee\u00f0\5\24\13\2\u00ef"+
		"\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\r\3\2\2\2\u00f1\u00fe\7j\2\2\u00f2\u00fe\7k\2\2\u00f3\u00fe"+
		"\7l\2\2\u00f4\u00fe\7o\2\2\u00f5\u00fe\7p\2\2\u00f6\u00fe\7r\2\2\u00f7"+
		"\u00fe\7w\2\2\u00f8\u00fe\7y\2\2\u00f9\u00fe\7z\2\2\u00fa\u00fe\7{\2\2"+
		"\u00fb\u00fe\7}\2\2\u00fc\u00fe\7\u00a2\2\2\u00fd\u00f1\3\2\2\2\u00fd"+
		"\u00f2\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f5\3\2"+
		"\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd"+
		"\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe\17\3\2\2\2\u00ff\u0111\7m\2\2\u0100\u0111\7t\2\2\u0101\u0111"+
		"\7v\2\2\u0102\u0111\7x\2\2\u0103\u0111\7|\2\2\u0104\u0111\7r\2\2\u0105"+
		"\u0111\7u\2\2\u0106\u0111\7\u00c1\2\2\u0107\u0111\7~\2\2\u0108\u0111\7"+
		"\177\2\2\u0109\u0111\7\u0080\2\2\u010a\u0111\7\u0082\2\2\u010b\u0111\7"+
		"\u0081\2\2\u010c\u0111\7n\2\2\u010d\u0111\7q\2\2\u010e\u0111\7\u00a3\2"+
		"\2\u010f\u0111\7\u009f\2\2\u0110\u00ff\3\2\2\2\u0110\u0100\3\2\2\2\u0110"+
		"\u0101\3\2\2\2\u0110\u0102\3\2\2\2\u0110\u0103\3\2\2\2\u0110\u0104\3\2"+
		"\2\2\u0110\u0105\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u0107\3\2\2\2\u0110"+
		"\u0108\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010b\3\2"+
		"\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\21\3\2\2\2\u0112\u0113\7\u00c5\2\2\u0113\23\3\2\2"+
		"\2\u0114\u0115\7\5\2\2\u0115\u0116\7\u00c5\2\2\u0116\25\3\2\2\2\u0117"+
		"\u0118\7\u00bf\2\2\u0118\u0119\5v<\2\u0119\u011a\5\22\n\2\u011a\u0120"+
		"\5v<\2\u011b\u011c\5\24\13\2\u011c\u011d\5v<\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\7\6\2\2\u0124"+
		"\u0126\5v<\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2"+
		"\2\u0127\u0129\5\4\3\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\5v<\2\u012d"+
		"\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\7"+
		"\2\2\u0130\27\3\2\2\2\u0131\u0132\7\u00c0\2\2\u0132\u0133\5v<\2\u0133"+
		"\u0139\5\22\n\2\u0134\u0135\5v<\2\u0135\u0136\5\b\5\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\5v"+
		"<\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\31\3\2\2\2\u013f\u0140"+
		"\7\u00b8\2\2\u0140\u0141\5v<\2\u0141\u0142\5\b\5\2\u0142\u0143\5v<\2\u0143"+
		"\u0144\7\6\2\2\u0144\u0145\5\4\3\2\u0145\u0146\7\7\2\2\u0146\33\3\2\2"+
		"\2\u0147\u0148\7\u00b9\2\2\u0148\u0149\5v<\2\u0149\u014a\5\b\5\2\u014a"+
		"\u014b\5v<\2\u014b\u014c\7\6\2\2\u014c\u014d\5\4\3\2\u014d\u014e\7\7\2"+
		"\2\u014e\35\3\2\2\2\u014f\u0150\7\n\2\2\u0150\u0151\5v<\2\u0151\u0152"+
		"\5\b\5\2\u0152\37\3\2\2\2\u0153\u0154\7\f\2\2\u0154\u0155\5v<\2\u0155"+
		"\u0156\5\b\5\2\u0156!\3\2\2\2\u0157\u0158\7\17\2\2\u0158\u0159\5v<\2\u0159"+
		"\u015a\5\b\5\2\u015a#\3\2\2\2\u015b\u015c\7\21\2\2\u015c\u015d\5v<\2\u015d"+
		"\u015e\5\b\5\2\u015e%\3\2\2\2\u015f\u0160\7\22\2\2\u0160\u0161\5v<\2\u0161"+
		"\u0162\5\b\5\2\u0162\'\3\2\2\2\u0163\u0164\7\24\2\2\u0164\u0165\5v<\2"+
		"\u0165\u0166\5\b\5\2\u0166)\3\2\2\2\u0167\u0168\7\25\2\2\u0168\u0169\5"+
		"v<\2\u0169\u016a\5\b\5\2\u016a+\3\2\2\2\u016b\u016c\7 \2\2\u016c\u016d"+
		"\5v<\2\u016d\u016e\5\b\5\2\u016e-\3\2\2\2\u016f\u0170\7&\2\2\u0170\u0171"+
		"\5v<\2\u0171\u0172\5\b\5\2\u0172/\3\2\2\2\u0173\u0174\7\'\2\2\u0174\u0175"+
		"\5v<\2\u0175\u0176\5\b\5\2\u0176\61\3\2\2\2\u0177\u0178\7%\2\2\u0178\u0179"+
		"\5v<\2\u0179\u017a\5\b\5\2\u017a\63\3\2\2\2\u017b\u017c\7\23\2\2\u017c"+
		"\u017d\5v<\2\u017d\u017e\7\6\2\2\u017e\u017f\5v<\2\u017f\u0180\5\b\5\2"+
		"\u0180\u0181\5v<\2\u0181\u0182\7\b\2\2\u0182\u0183\5v<\2\u0183\u0184\5"+
		"\b\5\2\u0184\u0185\5v<\2\u0185\u0186\7\7\2\2\u0186\65\3\2\2\2\u0187\u0188"+
		"\7\13\2\2\u0188\u0189\5v<\2\u0189\u018a\7\t\2\2\u018a\u018b\5\22\n\2\u018b"+
		"\u018c\7\t\2\2\u018c\67\3\2\2\2\u018d\u018e\7\26\2\2\u018e\u018f\5v<\2"+
		"\u018f\u0190\7\t\2\2\u0190\u0191\5\22\n\2\u0191\u0192\7\t\2\2\u01929\3"+
		"\2\2\2\u0193\u0194\7\u0091\2\2\u0194\u0195\5v<\2\u0195\u0196\7\t\2\2\u0196"+
		"\u0197\5\22\n\2\u0197\u0198\7\t\2\2\u0198;\3\2\2\2\u0199\u019a\7\u0096"+
		"\2\2\u019a\u019b\5v<\2\u019b\u019c\7\t\2\2\u019c\u019d\5\22\n\2\u019d"+
		"\u019e\7\t\2\2\u019e=\3\2\2\2\u019f\u01a0\7\u0098\2\2\u01a0\u01a1\5v<"+
		"\2\u01a1\u01a2\7\t\2\2\u01a2\u01a3\5\22\n\2\u01a3\u01a4\7\t\2\2\u01a4"+
		"?\3\2\2\2\u01a5\u01a6\7\u00a0\2\2\u01a6\u01a7\5v<\2\u01a7\u01a8\5\b\5"+
		"\2\u01a8\u01a9\5v<\2\u01a9\u01ab\7\6\2\2\u01aa\u01ac\5v<\2\u01ab\u01aa"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\5\4\3\2\u01ae"+
		"\u01b0\5v<\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2"+
		"\2\u01b1\u01b2\7\7\2\2\u01b2A\3\2\2\2\u01b3\u01b4\7\u00a1\2\2\u01b4\u01b5"+
		"\5v<\2\u01b5\u01b6\5\b\5\2\u01b6\u01b7\5v<\2\u01b7\u01b9\7\6\2\2\u01b8"+
		"\u01ba\5v<\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2"+
		"\2\u01bb\u01bd\5\4\3\2\u01bc\u01be\5v<\2\u01bd\u01bc\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\5v<\2\u01c1"+
		"\u01c3\7\6\2\2\u01c2\u01c4\5v<\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\5\4\3\2\u01c6\u01c8\5v<\2\u01c7\u01c6"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\7\2\2\u01ca"+
		"C\3\2\2\2\u01cb\u01cc\7\r\2\2\u01ccE\3\2\2\2\u01cd\u01ce\7\16\2\2\u01ce"+
		"G\3\2\2\2\u01cf\u01d0\7\20\2\2\u01d0I\3\2\2\2\u01d1\u01d2\7\27\2\2\u01d2"+
		"K\3\2\2\2\u01d3\u01d4\7\30\2\2\u01d4M\3\2\2\2\u01d5\u01d6\7\u0092\2\2"+
		"\u01d6O\3\2\2\2\u01d7\u01d8\7\u0097\2\2\u01d8Q\3\2\2\2\u01d9\u01da\7\31"+
		"\2\2\u01daS\3\2\2\2\u01db\u01dc\7\32\2\2\u01dcU\3\2\2\2\u01dd\u01de\7"+
		"\33\2\2\u01deW\3\2\2\2\u01df\u01e0\7\34\2\2\u01e0Y\3\2\2\2\u01e1\u01e2"+
		"\7\35\2\2\u01e2[\3\2\2\2\u01e3\u01e4\7\36\2\2\u01e4]\3\2\2\2\u01e5\u01e6"+
		"\7\37\2\2\u01e6_\3\2\2\2\u01e7\u01e8\7!\2\2\u01e8a\3\2\2\2\u01e9\u01ea"+
		"\7\"\2\2\u01eac\3\2\2\2\u01eb\u01ec\7#\2\2\u01ece\3\2\2\2\u01ed\u01ee"+
		"\7$\2\2\u01eeg\3\2\2\2\u01ef\u01f0\7(\2\2\u01f0i\3\2\2\2\u01f1\u01f2\7"+
		")\2\2\u01f2k\3\2\2\2\u01f3\u01f4\7\u0093\2\2\u01f4\u01f5\5v<\2\u01f5\u01f6"+
		"\5\24\13\2\u01f6\u01f7\5v<\2\u01f7\u01f9\5\b\5\2\u01f8\u01fa\5v<\2\u01f9"+
		"\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fam\3\2\2\2\u01fb\u01fc\7\u0094"+
		"\2\2\u01fc\u01fd\5v<\2\u01fd\u01fe\5\24\13\2\u01fe\u01ff\5v<\2\u01ff\u0201"+
		"\5\b\5\2\u0200\u0202\5v<\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"o\3\2\2\2\u0203\u0204\7\u0095\2\2\u0204\u0205\5v<\2\u0205\u0206\7\t\2"+
		"\2\u0206\u0207\5\22\n\2\u0207\u0208\7\t\2\2\u0208\u020b\5v<\2\u0209\u020c"+
		"\7h\2\2\u020a\u020c\5z>\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c"+
		"q\3\2\2\2\u020d\u020f\7\u00c6\2\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211s\3\2\2\2\u0212\u0214"+
		"\7\u00c7\2\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2"+
		"\2\u0215\u0216\3\2\2\2\u0216u\3\2\2\2\u0217\u021a\5r:\2\u0218\u021a\5"+
		"t;\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021cw\3\2\2\2\u021d\u0220\7\u00c2"+
		"\2\2\u021e\u0220\5\24\13\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220"+
		"y\3\2\2\2\u0221\u0226\7\6\2\2\u0222\u0224\5v<\2\u0223\u0222\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\5\b\5\2\u0226\u0223\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u022c\5v<\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2"+
		"\2\u022c\u022d\3\2\2\2\u022d\u022e\7\7\2\2\u022e{\3\2\2\2\u022f\u0230"+
		"\7\2\2\3\u0230}\3\2\2\2*\u0081\u0086\u0089\u008d\u0091\u0094\u00c4\u00cb"+
		"\u00cf\u00d5\u00da\u00de\u00e2\u00e8\u00ef\u00fd\u0110\u0120\u0125\u012a"+
		"\u012d\u0139\u013d\u01ab\u01af\u01b9\u01bd\u01c3\u01c7\u01f9\u0201\u020b"+
		"\u0210\u0215\u0219\u021b\u021f\u0223\u0228\u022b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}