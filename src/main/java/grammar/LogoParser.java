// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/grammar\Logo.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SPECIAL_WORD=10, BACK=11, DISTANCE=12, FORWARD=13, HEADING=14, HOME=15, 
		LEFT=16, POS=17, RIGHT=18, SETHEADING=19, SETPOS=20, SETX=21, SETY=22, 
		TOWARDS=23, BG=24, CG=25, CLEAN=26, COLOR=27, COLORUNDER=28, FILL=29, 
		FREEZEBG=30, NAMEFROMCOLOUR=31, PD=32, PE=33, PENSIZE=34, PU=35, SETBG=36, 
		SETCOLOR=37, SETPENSIZE=38, STAMP=39, UNFREEZEBG=40, HT=41, INBACK=42, 
		INFRONT=43, OPACITY=44, SETOPACITY=45, SETSHAPE=46, SETSIZE=47, SHAPE=48, 
		SIZE=49, ST=50, CLICKOFF=51, CLICKON=52, CLONE=53, TELL=54, TOUCHINGX=55, 
		WHO=56, ANNOUNCE=57, ASCII=58, BOTTOM=59, CB=60, CC=61, CD=62, CF=63, 
		CHAR=64, CLEARTEXT=65, CU=66, DELETE=67, EOL=68, EOT=69, HIDETEXT=70, 
		INSERT=71, PRINT=72, SELECT=73, SELECTED=74, SHOW=75, SHOWTEXT=76, SOL=77, 
		TEXTCOUNT=78, TEXTITEM=79, TEXTPICK=80, TEXTWHO=81, TOP=82, TRANSPARENT=83, 
		UNSELECT=84, BUTFIRST=85, BUTLAST=86, COUNT=87, EMPTY=88, EQUALX=89, FIRST=90, 
		FPUT=91, IDENTICALX=92, ITEM=93, LAST=94, LIST=95, LISTX=96, LPUT=97, 
		MEMBERX=98, NUMBER=99, PARSE=100, PICK=101, SENTENCE=102, WORD=103, WORDX=104, 
		ABS=105, ARCTAN=106, COS=107, DIFFERENCE=108, EXP=109, INT=110, LN=111, 
		LOG=112, MINUS=113, PI=114, POWER=115, PRODUCT=116, QUOTIENT=117, RANDOM=118, 
		REMAINDER=119, ROUND=120, SIN=121, SQRT=122, SUM=123, TAN=124, COMPARISONEQUALS=125, 
		COMPARISONBIGGER=126, COMPARISONSMALLER=127, COMPARISONSMALLEREQUALS=128, 
		COMPARISONBIGGEREQUALS=129, ASK=130, FREEZE=131, GET=132, NEWPAGE=133, 
		NEWSLIDER=134, NEWTEXT=135, NEWTURTLE=136, REMOVE=137, RENAME=138, SET=139, 
		TALKTO=140, UNFREEZE=141, RESETT=142, TIMER=143, CLEARNAME=144, CLEARNAMES=145, 
		LET=146, ASSIGN=147, MAKE=148, NAMEX=149, NAMES=150, THING=151, GETPAGE=152, 
		NAMEPAGE=153, NEXTPAGE=154, PAGELIST=155, PREVPAGE=156, PROJECTSIZE=157, 
		AND=158, IF=159, IFELSE=160, NOT=161, OR=162, ANSWER=163, KEYX=164, MOUSEPOS=165, 
		PEEKCHAR=166, QUESTION=167, READCHAR=168, SAY=169, SAYAS=170, SKIPCHAR=171, 
		VOICES=172, BROADCAST=173, CANCEL=174, CAREFULLY=175, DOLIST=176, DOTIMES=177, 
		ERRORMESSAGE=178, EVERYONE=179, FOREVER=180, LAUNCH=181, OUTPUT=182, REPEAT=183, 
		WHILE=184, RUN=185, STOP=186, STOPALL=187, STOPME=188, WAIT=189, PROCEDURE=190, 
		CALL=191, DIVISION=192, NATURALNUMBER=193, FLOATNUMBER=194, BOOLEAN=195, 
		OTHERWORD=196, WHITESPACE=197, NEWLINE=198;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_cmd = 2, RULE_mathStatement = 3, 
		RULE_mathSentence = 4, RULE_mathValue = 5, RULE_singleArgMathOperator = 6, 
		RULE_doubleArgMathOperator = 7, RULE_stringArg = 8, RULE_variableName = 9, 
		RULE_procedure = 10, RULE_procedureCall = 11, RULE_repeat = 12, RULE_while1 = 13, 
		RULE_back = 14, RULE_forward = 15, RULE_left = 16, RULE_right = 17, RULE_setheading = 18, 
		RULE_setx = 19, RULE_sety = 20, RULE_namefromcolor = 21, RULE_setcolor = 22, 
		RULE_setpensize = 23, RULE_setbg = 24, RULE_setpos = 25, RULE_distance = 26, 
		RULE_towards = 27, RULE_clearname = 28, RULE_namex = 29, RULE_thing = 30, 
		RULE_ifc = 31, RULE_ifElse = 32, RULE_heading = 33, RULE_home = 34, RULE_pos = 35, 
		RULE_clearnames = 36, RULE_names = 37, RULE_bg = 38, RULE_cg = 39, RULE_clean = 40, 
		RULE_color = 41, RULE_colorrunder = 42, RULE_fill = 43, RULE_freezebg = 44, 
		RULE_pd = 45, RULE_pe = 46, RULE_pensize = 47, RULE_pu = 48, RULE_stamp = 49, 
		RULE_unfreezebg = 50, RULE_let = 51, RULE_assign = 52, RULE_spaceArg = 53, 
		RULE_newLineArg = 54, RULE_brakeArg = 55, RULE_endFileArg = 56, RULE_commandsList = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "cmd", "mathStatement", "mathSentence", "mathValue", 
			"singleArgMathOperator", "doubleArgMathOperator", "stringArg", "variableName", 
			"procedure", "procedureCall", "repeat", "while1", "back", "forward", 
			"left", "right", "setheading", "setx", "sety", "namefromcolor", "setcolor", 
			"setpensize", "setbg", "setpos", "distance", "towards", "clearname", 
			"namex", "thing", "ifc", "ifElse", "heading", "home", "pos", "clearnames", 
			"names", "bg", "cg", "clean", "color", "colorrunder", "fill", "freezebg", 
			"pd", "pe", "pensize", "pu", "stamp", "unfreezebg", "let", "assign", 
			"spaceArg", "newLineArg", "brakeArg", "endFileArg", "commandsList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "','", "']'", "'''", "'{'", "'}'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'!='", null, null, null, null, "'-'", null, null, "'*'", 
			null, null, null, null, null, null, "'+'", null, "'=='", "'>'", "'<'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SPECIAL_WORD", 
			"BACK", "DISTANCE", "FORWARD", "HEADING", "HOME", "LEFT", "POS", "RIGHT", 
			"SETHEADING", "SETPOS", "SETX", "SETY", "TOWARDS", "BG", "CG", "CLEAN", 
			"COLOR", "COLORUNDER", "FILL", "FREEZEBG", "NAMEFROMCOLOUR", "PD", "PE", 
			"PENSIZE", "PU", "SETBG", "SETCOLOR", "SETPENSIZE", "STAMP", "UNFREEZEBG", 
			"HT", "INBACK", "INFRONT", "OPACITY", "SETOPACITY", "SETSHAPE", "SETSIZE", 
			"SHAPE", "SIZE", "ST", "CLICKOFF", "CLICKON", "CLONE", "TELL", "TOUCHINGX", 
			"WHO", "ANNOUNCE", "ASCII", "BOTTOM", "CB", "CC", "CD", "CF", "CHAR", 
			"CLEARTEXT", "CU", "DELETE", "EOL", "EOT", "HIDETEXT", "INSERT", "PRINT", 
			"SELECT", "SELECTED", "SHOW", "SHOWTEXT", "SOL", "TEXTCOUNT", "TEXTITEM", 
			"TEXTPICK", "TEXTWHO", "TOP", "TRANSPARENT", "UNSELECT", "BUTFIRST", 
			"BUTLAST", "COUNT", "EMPTY", "EQUALX", "FIRST", "FPUT", "IDENTICALX", 
			"ITEM", "LAST", "LIST", "LISTX", "LPUT", "MEMBERX", "NUMBER", "PARSE", 
			"PICK", "SENTENCE", "WORD", "WORDX", "ABS", "ARCTAN", "COS", "DIFFERENCE", 
			"EXP", "INT", "LN", "LOG", "MINUS", "PI", "POWER", "PRODUCT", "QUOTIENT", 
			"RANDOM", "REMAINDER", "ROUND", "SIN", "SQRT", "SUM", "TAN", "COMPARISONEQUALS", 
			"COMPARISONBIGGER", "COMPARISONSMALLER", "COMPARISONSMALLEREQUALS", "COMPARISONBIGGEREQUALS", 
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
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				line();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << DISTANCE) | (1L << FORWARD) | (1L << HEADING) | (1L << HOME) | (1L << LEFT) | (1L << POS) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETPOS) | (1L << SETX) | (1L << SETY) | (1L << TOWARDS) | (1L << BG) | (1L << CG) | (1L << CLEAN) | (1L << COLOR) | (1L << COLORUNDER) | (1L << FILL) | (1L << FREEZEBG) | (1L << NAMEFROMCOLOUR) | (1L << PD) | (1L << PE) | (1L << PENSIZE) | (1L << PU) | (1L << SETBG) | (1L << SETCOLOR) | (1L << SETPENSIZE) | (1L << STAMP) | (1L << UNFREEZEBG))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (CLEARNAME - 144)) | (1L << (CLEARNAMES - 144)) | (1L << (LET - 144)) | (1L << (ASSIGN - 144)) | (1L << (NAMEX - 144)) | (1L << (NAMES - 144)) | (1L << (THING - 144)) | (1L << (IF - 144)) | (1L << (IFELSE - 144)) | (1L << (REPEAT - 144)) | (1L << (WHILE - 144)) | (1L << (PROCEDURE - 144)) | (1L << (CALL - 144)) | (1L << (WHITESPACE - 144)) | (1L << (NEWLINE - 144)))) != 0) );
			setState(121);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLine(this);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(123);
				brakeArg();
				}
				break;
			}
			setState(133); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(126);
						spaceArg();
						}
					}

					setState(129);
					cmd();
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(130);
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
				setState(135); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(137);
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
		public IfcContext ifc() {
			return getRuleContext(IfcContext.class,0);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				repeat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				while1();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				procedure();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				procedureCall();
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				back();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				right();
				}
				break;
			case SETHEADING:
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				setheading();
				}
				break;
			case SETX:
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				setx();
				}
				break;
			case SETY:
				enterOuterAlt(_localctx, 11);
				{
				setState(150);
				sety();
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 12);
				{
				setState(151);
				setpos();
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 13);
				{
				setState(152);
				distance();
				}
				break;
			case TOWARDS:
				enterOuterAlt(_localctx, 14);
				{
				setState(153);
				towards();
				}
				break;
			case HEADING:
				enterOuterAlt(_localctx, 15);
				{
				setState(154);
				heading();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 16);
				{
				setState(155);
				home();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 17);
				{
				setState(156);
				pos();
				}
				break;
			case CLEARNAME:
				enterOuterAlt(_localctx, 18);
				{
				setState(157);
				clearname();
				}
				break;
			case NAMEX:
				enterOuterAlt(_localctx, 19);
				{
				setState(158);
				namex();
				}
				break;
			case THING:
				enterOuterAlt(_localctx, 20);
				{
				setState(159);
				thing();
				}
				break;
			case CLEARNAMES:
				enterOuterAlt(_localctx, 21);
				{
				setState(160);
				clearnames();
				}
				break;
			case NAMES:
				enterOuterAlt(_localctx, 22);
				{
				setState(161);
				names();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 23);
				{
				setState(162);
				let();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 24);
				{
				setState(163);
				assign();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 25);
				{
				setState(164);
				ifc();
				}
				break;
			case IFELSE:
				enterOuterAlt(_localctx, 26);
				{
				setState(165);
				ifElse();
				}
				break;
			case BG:
				enterOuterAlt(_localctx, 27);
				{
				setState(166);
				bg();
				}
				break;
			case CG:
				enterOuterAlt(_localctx, 28);
				{
				setState(167);
				cg();
				}
				break;
			case CLEAN:
				enterOuterAlt(_localctx, 29);
				{
				setState(168);
				clean();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 30);
				{
				setState(169);
				color();
				}
				break;
			case COLORUNDER:
				enterOuterAlt(_localctx, 31);
				{
				setState(170);
				colorrunder();
				}
				break;
			case FILL:
				enterOuterAlt(_localctx, 32);
				{
				setState(171);
				fill();
				}
				break;
			case FREEZEBG:
				enterOuterAlt(_localctx, 33);
				{
				setState(172);
				freezebg();
				}
				break;
			case NAMEFROMCOLOUR:
				enterOuterAlt(_localctx, 34);
				{
				setState(173);
				namefromcolor();
				}
				break;
			case PD:
				enterOuterAlt(_localctx, 35);
				{
				setState(174);
				pd();
				}
				break;
			case PE:
				enterOuterAlt(_localctx, 36);
				{
				setState(175);
				pe();
				}
				break;
			case PENSIZE:
				enterOuterAlt(_localctx, 37);
				{
				setState(176);
				pensize();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 38);
				{
				setState(177);
				pu();
				}
				break;
			case SETBG:
				enterOuterAlt(_localctx, 39);
				{
				setState(178);
				setbg();
				}
				break;
			case SETCOLOR:
				enterOuterAlt(_localctx, 40);
				{
				setState(179);
				setcolor();
				}
				break;
			case SETPENSIZE:
				enterOuterAlt(_localctx, 41);
				{
				setState(180);
				setpensize();
				}
				break;
			case STAMP:
				enterOuterAlt(_localctx, 42);
				{
				setState(181);
				stamp();
				}
				break;
			case UNFREEZEBG:
				enterOuterAlt(_localctx, 43);
				{
				setState(182);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMathStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMathStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMathStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathStatementContext mathStatement() throws RecognitionException {
		MathStatementContext _localctx = new MathStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mathStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSingleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSingleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSingleArgs(this);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDoubleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDoubleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDoubleArgs(this);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitValue(this);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBrakets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBrakets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBrakets(this);
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
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new BraketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(188);
				match(T__0);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(189);
					brakeArg();
					}
				}

				setState(192);
				mathSentence(0);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(193);
					brakeArg();
					}
				}

				setState(196);
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
				setState(198);
				singleArgMathOperator();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(199);
					brakeArg();
					}
				}

				setState(202);
				mathSentence(2);
				}
				break;
			case T__2:
			case SPECIAL_WORD:
			case NATURALNUMBER:
			case FLOATNUMBER:
			case BOOLEAN:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				mathValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DoubleArgsContext(new MathSentenceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mathSentence);
					setState(207);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(208);
						brakeArg();
						}
					}

					setState(211);
					doubleArgMathOperator();
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(212);
						brakeArg();
						}
					}

					setState(215);
					mathSentence(4);
					}
					} 
				}
				setState(221);
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
		public TerminalNode FLOATNUMBER() { return getToken(LogoParser.FLOATNUMBER, 0); }
		public TerminalNode NATURALNUMBER() { return getToken(LogoParser.NATURALNUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogoParser.BOOLEAN, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMathValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMathValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMathValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathValueContext mathValue() throws RecognitionException {
		MathValueContext _localctx = new MathValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mathValue);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(FLOATNUMBER);
				}
				break;
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(NATURALNUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(BOOLEAN);
				}
				break;
			case T__2:
			case SPECIAL_WORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
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
		public TerminalNode TAN() { return getToken(LogoParser.TAN, 0); }
		public TanContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomContext extends SingleArgMathOperatorContext {
		public TerminalNode RANDOM() { return getToken(LogoParser.RANDOM, 0); }
		public RandomContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRandom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRandom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnContext extends SingleArgMathOperatorContext {
		public TerminalNode LN() { return getToken(LogoParser.LN, 0); }
		public LnContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusSingleContext extends SingleArgMathOperatorContext {
		public TerminalNode MINUS() { return getToken(LogoParser.MINUS, 0); }
		public MinusSingleContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMinusSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMinusSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMinusSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends SingleArgMathOperatorContext {
		public TerminalNode NOT() { return getToken(LogoParser.NOT, 0); }
		public NotContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsContext extends SingleArgMathOperatorContext {
		public TerminalNode ABS() { return getToken(LogoParser.ABS, 0); }
		public AbsContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAbs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int1Context extends SingleArgMathOperatorContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public Int1Context(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInt1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArctanContext extends SingleArgMathOperatorContext {
		public TerminalNode ARCTAN() { return getToken(LogoParser.ARCTAN, 0); }
		public ArctanContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterArctan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitArctan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitArctan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoundContext extends SingleArgMathOperatorContext {
		public TerminalNode ROUND() { return getToken(LogoParser.ROUND, 0); }
		public RoundContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRound(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtContext extends SingleArgMathOperatorContext {
		public TerminalNode SQRT() { return getToken(LogoParser.SQRT, 0); }
		public SqrtContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends SingleArgMathOperatorContext {
		public TerminalNode COS() { return getToken(LogoParser.COS, 0); }
		public CosContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends SingleArgMathOperatorContext {
		public TerminalNode SIN() { return getToken(LogoParser.SIN, 0); }
		public SinContext(SingleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleArgMathOperatorContext singleArgMathOperator() throws RecognitionException {
		SingleArgMathOperatorContext _localctx = new SingleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleArgMathOperator);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				_localctx = new AbsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(ABS);
				}
				break;
			case ARCTAN:
				_localctx = new ArctanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(ARCTAN);
				}
				break;
			case COS:
				_localctx = new CosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(COS);
				}
				break;
			case INT:
				_localctx = new Int1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(INT);
				}
				break;
			case LN:
				_localctx = new LnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(LN);
				}
				break;
			case MINUS:
				_localctx = new MinusSingleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(MINUS);
				}
				break;
			case RANDOM:
				_localctx = new RandomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				match(RANDOM);
				}
				break;
			case ROUND:
				_localctx = new RoundContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				match(ROUND);
				}
				break;
			case SIN:
				_localctx = new SinContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				match(SIN);
				}
				break;
			case SQRT:
				_localctx = new SqrtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(237);
				match(SQRT);
				}
				break;
			case TAN:
				_localctx = new TanContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(238);
				match(TAN);
				}
				break;
			case NOT:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(239);
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
		public TerminalNode MINUS() { return getToken(LogoParser.MINUS, 0); }
		public MinusContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonBiggerEqualsContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONBIGGEREQUALS() { return getToken(LogoParser.COMPARISONBIGGEREQUALS, 0); }
		public ComparisonBiggerEqualsContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterComparisonBiggerEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitComparisonBiggerEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitComparisonBiggerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonSmallerEqualsContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONSMALLEREQUALS() { return getToken(LogoParser.COMPARISONSMALLEREQUALS, 0); }
		public ComparisonSmallerEqualsContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterComparisonSmallerEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitComparisonSmallerEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitComparisonSmallerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductContext extends DoubleArgMathOperatorContext {
		public TerminalNode PRODUCT() { return getToken(LogoParser.PRODUCT, 0); }
		public ProductContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends DoubleArgMathOperatorContext {
		public TerminalNode OR() { return getToken(LogoParser.OR, 0); }
		public OrContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonBiggerContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONBIGGER() { return getToken(LogoParser.COMPARISONBIGGER, 0); }
		public ComparisonBiggerContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterComparisonBigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitComparisonBigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitComparisonBigger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogContext extends DoubleArgMathOperatorContext {
		public TerminalNode LOG() { return getToken(LogoParser.LOG, 0); }
		public LogContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonSmallerContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONSMALLER() { return getToken(LogoParser.COMPARISONSMALLER, 0); }
		public ComparisonSmallerContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterComparisonSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitComparisonSmaller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitComparisonSmaller(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonEqualsContext extends DoubleArgMathOperatorContext {
		public TerminalNode COMPARISONEQUALS() { return getToken(LogoParser.COMPARISONEQUALS, 0); }
		public ComparisonEqualsContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterComparisonEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitComparisonEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitComparisonEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends DoubleArgMathOperatorContext {
		public TerminalNode SUM() { return getToken(LogoParser.SUM, 0); }
		public SumContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotientContext extends DoubleArgMathOperatorContext {
		public TerminalNode QUOTIENT() { return getToken(LogoParser.QUOTIENT, 0); }
		public QuotientContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterQuotient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitQuotient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitQuotient(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends DoubleArgMathOperatorContext {
		public TerminalNode DIVISION() { return getToken(LogoParser.DIVISION, 0); }
		public DivisionContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends DoubleArgMathOperatorContext {
		public TerminalNode AND() { return getToken(LogoParser.AND, 0); }
		public AndContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceContext extends DoubleArgMathOperatorContext {
		public TerminalNode DIFFERENCE() { return getToken(LogoParser.DIFFERENCE, 0); }
		public DifferenceContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDifference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends DoubleArgMathOperatorContext {
		public TerminalNode POWER() { return getToken(LogoParser.POWER, 0); }
		public PowerContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends DoubleArgMathOperatorContext {
		public TerminalNode EXP() { return getToken(LogoParser.EXP, 0); }
		public ExpContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemainderContext extends DoubleArgMathOperatorContext {
		public TerminalNode REMAINDER() { return getToken(LogoParser.REMAINDER, 0); }
		public RemainderContext(DoubleArgMathOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRemainder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRemainder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRemainder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleArgMathOperatorContext doubleArgMathOperator() throws RecognitionException {
		DoubleArgMathOperatorContext _localctx = new DoubleArgMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_doubleArgMathOperator);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFFERENCE:
				_localctx = new DifferenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(DIFFERENCE);
				}
				break;
			case POWER:
				_localctx = new PowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(POWER);
				}
				break;
			case QUOTIENT:
				_localctx = new QuotientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(QUOTIENT);
				}
				break;
			case REMAINDER:
				_localctx = new RemainderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(REMAINDER);
				}
				break;
			case SUM:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(SUM);
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				match(MINUS);
				}
				break;
			case PRODUCT:
				_localctx = new ProductContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				match(PRODUCT);
				}
				break;
			case DIVISION:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				match(DIVISION);
				}
				break;
			case COMPARISONEQUALS:
				_localctx = new ComparisonEqualsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				match(COMPARISONEQUALS);
				}
				break;
			case COMPARISONBIGGER:
				_localctx = new ComparisonBiggerContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				match(COMPARISONBIGGER);
				}
				break;
			case COMPARISONSMALLER:
				_localctx = new ComparisonSmallerContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(252);
				match(COMPARISONSMALLER);
				}
				break;
			case COMPARISONBIGGEREQUALS:
				_localctx = new ComparisonBiggerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(253);
				match(COMPARISONBIGGEREQUALS);
				}
				break;
			case COMPARISONSMALLEREQUALS:
				_localctx = new ComparisonSmallerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(254);
				match(COMPARISONSMALLEREQUALS);
				}
				break;
			case EXP:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(255);
				match(EXP);
				}
				break;
			case LOG:
				_localctx = new LogContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(256);
				match(LOG);
				}
				break;
			case OR:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(257);
				match(OR);
				}
				break;
			case AND:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(258);
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
		public TerminalNode OTHERWORD() { return getToken(LogoParser.OTHERWORD, 0); }
		public StringArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterStringArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitStringArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitStringArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArgContext stringArg() throws RecognitionException {
		StringArgContext _localctx = new StringArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		public TerminalNode OTHERWORD() { return getToken(LogoParser.OTHERWORD, 0); }
		public TerminalNode SPECIAL_WORD() { return getToken(LogoParser.SPECIAL_WORD, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableName);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(T__2);
				setState(264);
				match(OTHERWORD);
				}
				break;
			case SPECIAL_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(SPECIAL_WORD);
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
		public TerminalNode PROCEDURE() { return getToken(LogoParser.PROCEDURE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public CommandsListContext commandsList() {
			return getRuleContext(CommandsListContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(PROCEDURE);
			setState(269);
			brakeArg();
			setState(270);
			stringArg();
			setState(271);
			brakeArg();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==SPECIAL_WORD) {
				{
				{
				setState(272);
				variableName();
				setState(273);
				brakeArg();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			commandsList();
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
		public TerminalNode CALL() { return getToken(LogoParser.CALL, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProcedureCall(this);
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
			setState(282);
			match(CALL);
			setState(283);
			brakeArg();
			setState(284);
			stringArg();
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					brakeArg();
					setState(286);
					mathStatement();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(293);
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
		public TerminalNode REPEAT() { return getToken(LogoParser.REPEAT, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public CommandsListContext commandsList() {
			return getRuleContext(CommandsListContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(REPEAT);
			setState(297);
			brakeArg();
			setState(298);
			mathStatement();
			setState(299);
			brakeArg();
			setState(300);
			commandsList();
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
		public TerminalNode WHILE() { return getToken(LogoParser.WHILE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public CommandsListContext commandsList() {
			return getRuleContext(CommandsListContext.class,0);
		}
		public While1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterWhile1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitWhile1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitWhile1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While1Context while1() throws RecognitionException {
		While1Context _localctx = new While1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_while1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(WHILE);
			setState(303);
			brakeArg();
			setState(304);
			mathStatement();
			setState(305);
			brakeArg();
			setState(306);
			commandsList();
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
		public TerminalNode BACK() { return getToken(LogoParser.BACK, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(BACK);
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

	public static class ForwardContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(LogoParser.FORWARD, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardContext forward() throws RecognitionException {
		ForwardContext _localctx = new ForwardContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(FORWARD);
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

	public static class LeftContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(LogoParser.LEFT, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(LEFT);
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

	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(LogoParser.RIGHT, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(RIGHT);
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

	public static class SetheadingContext extends ParserRuleContext {
		public TerminalNode SETHEADING() { return getToken(LogoParser.SETHEADING, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSetheading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSetheading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSetheading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetheadingContext setheading() throws RecognitionException {
		SetheadingContext _localctx = new SetheadingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setheading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(SETHEADING);
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

	public static class SetxContext extends ParserRuleContext {
		public TerminalNode SETX() { return getToken(LogoParser.SETX, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSetx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSetx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSetx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetxContext setx() throws RecognitionException {
		SetxContext _localctx = new SetxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(SETX);
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

	public static class SetyContext extends ParserRuleContext {
		public TerminalNode SETY() { return getToken(LogoParser.SETY, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSety(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSety(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetyContext sety() throws RecognitionException {
		SetyContext _localctx = new SetyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sety);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(SETY);
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

	public static class NamefromcolorContext extends ParserRuleContext {
		public TerminalNode NAMEFROMCOLOUR() { return getToken(LogoParser.NAMEFROMCOLOUR, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNamefromcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNamefromcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNamefromcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamefromcolorContext namefromcolor() throws RecognitionException {
		NamefromcolorContext _localctx = new NamefromcolorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_namefromcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(NAMEFROMCOLOUR);
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

	public static class SetcolorContext extends ParserRuleContext {
		public TerminalNode SETCOLOR() { return getToken(LogoParser.SETCOLOR, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSetcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSetcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSetcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetcolorContext setcolor() throws RecognitionException {
		SetcolorContext _localctx = new SetcolorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_setcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(SETCOLOR);
			setState(341);
			brakeArg();
			setState(342);
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
		public TerminalNode SETPENSIZE() { return getToken(LogoParser.SETPENSIZE, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSetpensize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSetpensize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSetpensize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetpensizeContext setpensize() throws RecognitionException {
		SetpensizeContext _localctx = new SetpensizeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setpensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(SETPENSIZE);
			setState(345);
			brakeArg();
			setState(346);
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
		public TerminalNode SETBG() { return getToken(LogoParser.SETBG, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSetbg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSetbg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSetbg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetbgContext setbg() throws RecognitionException {
		SetbgContext _localctx = new SetbgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setbg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(SETBG);
			setState(349);
			brakeArg();
			setState(350);
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
		public TerminalNode SETPOS() { return getToken(LogoParser.SETPOS, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSetpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSetpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSetpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetposContext setpos() throws RecognitionException {
		SetposContext _localctx = new SetposContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_setpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(SETPOS);
			setState(353);
			brakeArg();
			setState(354);
			match(T__3);
			setState(355);
			brakeArg();
			setState(356);
			mathStatement();
			setState(357);
			brakeArg();
			setState(358);
			match(T__4);
			setState(359);
			brakeArg();
			setState(360);
			mathStatement();
			setState(361);
			brakeArg();
			setState(362);
			match(T__5);
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
		public TerminalNode DISTANCE() { return getToken(LogoParser.DISTANCE, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDistance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDistance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(DISTANCE);
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

	public static class TowardsContext extends ParserRuleContext {
		public TerminalNode TOWARDS() { return getToken(LogoParser.TOWARDS, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTowards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTowards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTowards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TowardsContext towards() throws RecognitionException {
		TowardsContext _localctx = new TowardsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_towards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(TOWARDS);
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

	public static class ClearnameContext extends ParserRuleContext {
		public TerminalNode CLEARNAME() { return getToken(LogoParser.CLEARNAME, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterClearname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitClearname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitClearname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearnameContext clearname() throws RecognitionException {
		ClearnameContext _localctx = new ClearnameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_clearname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(CLEARNAME);
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

	public static class NamexContext extends ParserRuleContext {
		public TerminalNode NAMEX() { return getToken(LogoParser.NAMEX, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNamex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNamex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNamex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamexContext namex() throws RecognitionException {
		NamexContext _localctx = new NamexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(NAMEX);
			setState(383);
			brakeArg();
			setState(384);
			match(T__6);
			setState(385);
			stringArg();
			setState(386);
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
		public TerminalNode THING() { return getToken(LogoParser.THING, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitThing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitThing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThingContext thing() throws RecognitionException {
		ThingContext _localctx = new ThingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_thing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(THING);
			setState(389);
			brakeArg();
			setState(390);
			match(T__6);
			setState(391);
			stringArg();
			setState(392);
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
		public TerminalNode IF() { return getToken(LogoParser.IF, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public CommandsListContext commandsList() {
			return getRuleContext(CommandsListContext.class,0);
		}
		public IfcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterIfc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitIfc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitIfc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcContext ifc() throws RecognitionException {
		IfcContext _localctx = new IfcContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(IF);
			setState(395);
			brakeArg();
			setState(396);
			mathStatement();
			setState(397);
			brakeArg();
			setState(398);
			commandsList();
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

	public static class IfElseContext extends ParserRuleContext {
		public TerminalNode IFELSE() { return getToken(LogoParser.IFELSE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public List<CommandsListContext> commandsList() {
			return getRuleContexts(CommandsListContext.class);
		}
		public CommandsListContext commandsList(int i) {
			return getRuleContext(CommandsListContext.class,i);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(IFELSE);
			setState(401);
			brakeArg();
			setState(402);
			mathStatement();
			setState(403);
			brakeArg();
			setState(404);
			commandsList();
			setState(405);
			brakeArg();
			setState(406);
			commandsList();
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
		public TerminalNode HEADING() { return getToken(LogoParser.HEADING, 0); }
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		public TerminalNode HOME() { return getToken(LogoParser.HOME, 0); }
		public HomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterHome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitHome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitHome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeContext home() throws RecognitionException {
		HomeContext _localctx = new HomeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		public TerminalNode POS() { return getToken(LogoParser.POS, 0); }
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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

	public static class ClearnamesContext extends ParserRuleContext {
		public TerminalNode CLEARNAMES() { return getToken(LogoParser.CLEARNAMES, 0); }
		public ClearnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterClearnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitClearnames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitClearnames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearnamesContext clearnames() throws RecognitionException {
		ClearnamesContext _localctx = new ClearnamesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_clearnames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		public TerminalNode NAMES() { return getToken(LogoParser.NAMES, 0); }
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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
		public TerminalNode BG() { return getToken(LogoParser.BG, 0); }
		public BgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BgContext bg() throws RecognitionException {
		BgContext _localctx = new BgContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
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
		public TerminalNode CG() { return getToken(LogoParser.CG, 0); }
		public CgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CgContext cg() throws RecognitionException {
		CgContext _localctx = new CgContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		public TerminalNode CLEAN() { return getToken(LogoParser.CLEAN, 0); }
		public CleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterClean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitClean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitClean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CleanContext clean() throws RecognitionException {
		CleanContext _localctx = new CleanContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_clean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		public TerminalNode COLOR() { return getToken(LogoParser.COLOR, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		public TerminalNode COLORUNDER() { return getToken(LogoParser.COLORUNDER, 0); }
		public ColorrunderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorrunder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterColorrunder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitColorrunder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitColorrunder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorrunderContext colorrunder() throws RecognitionException {
		ColorrunderContext _localctx = new ColorrunderContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_colorrunder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		public TerminalNode FILL() { return getToken(LogoParser.FILL, 0); }
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		public TerminalNode FREEZEBG() { return getToken(LogoParser.FREEZEBG, 0); }
		public FreezebgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freezebg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFreezebg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFreezebg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFreezebg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreezebgContext freezebg() throws RecognitionException {
		FreezebgContext _localctx = new FreezebgContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_freezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
		public TerminalNode PD() { return getToken(LogoParser.PD, 0); }
		public PdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdContext pd() throws RecognitionException {
		PdContext _localctx = new PdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		public TerminalNode PE() { return getToken(LogoParser.PE, 0); }
		public PeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeContext pe() throws RecognitionException {
		PeContext _localctx = new PeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		public TerminalNode PENSIZE() { return getToken(LogoParser.PENSIZE, 0); }
		public PensizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pensize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPensize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPensize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPensize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PensizeContext pensize() throws RecognitionException {
		PensizeContext _localctx = new PensizeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		public TerminalNode PU() { return getToken(LogoParser.PU, 0); }
		public PuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuContext pu() throws RecognitionException {
		PuContext _localctx = new PuContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
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
		public TerminalNode STAMP() { return getToken(LogoParser.STAMP, 0); }
		public StampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterStamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitStamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitStamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StampContext stamp() throws RecognitionException {
		StampContext _localctx = new StampContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
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
		public TerminalNode UNFREEZEBG() { return getToken(LogoParser.UNFREEZEBG, 0); }
		public UnfreezebgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unfreezebg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterUnfreezebg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitUnfreezebg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitUnfreezebg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnfreezebgContext unfreezebg() throws RecognitionException {
		UnfreezebgContext _localctx = new UnfreezebgContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unfreezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		public TerminalNode LET() { return getToken(LogoParser.LET, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(LET);
			setState(445);
			brakeArg();
			setState(446);
			variableName();
			setState(447);
			brakeArg();
			setState(448);
			mathStatement();
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(449);
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
		public TerminalNode ASSIGN() { return getToken(LogoParser.ASSIGN, 0); }
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(ASSIGN);
			setState(453);
			brakeArg();
			setState(454);
			variableName();
			setState(455);
			brakeArg();
			setState(456);
			mathStatement();
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(457);
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

	public static class SpaceArgContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(LogoParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LogoParser.WHITESPACE, i);
		}
		public SpaceArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSpaceArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSpaceArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSpaceArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceArgContext spaceArg() throws RecognitionException {
		SpaceArgContext _localctx = new SpaceArgContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_spaceArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(460);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(463); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(LogoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LogoParser.NEWLINE, i);
		}
		public NewLineArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLineArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNewLineArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNewLineArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNewLineArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineArgContext newLineArg() throws RecognitionException {
		NewLineArgContext _localctx = new NewLineArgContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_newLineArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(465);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(468); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBrakeArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBrakeArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBrakeArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrakeArgContext brakeArg() throws RecognitionException {
		BrakeArgContext _localctx = new BrakeArgContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_brakeArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(472);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(470);
						spaceArg();
						}
						break;
					case NEWLINE:
						{
						setState(471);
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
				setState(474); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class EndFileArgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogoParser.EOF, 0); }
		public EndFileArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endFileArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterEndFileArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitEndFileArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitEndFileArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndFileArgContext endFileArg() throws RecognitionException {
		EndFileArgContext _localctx = new EndFileArgContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_endFileArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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

	public static class CommandsListContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CommandsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCommandsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCommandsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCommandsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsListContext commandsList() throws RecognitionException {
		CommandsListContext _localctx = new CommandsListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_commandsList);
		int _la;
		try {
			int _alt;
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK:
			case DISTANCE:
			case FORWARD:
			case HEADING:
			case HOME:
			case LEFT:
			case POS:
			case RIGHT:
			case SETHEADING:
			case SETPOS:
			case SETX:
			case SETY:
			case TOWARDS:
			case BG:
			case CG:
			case CLEAN:
			case COLOR:
			case COLORUNDER:
			case FILL:
			case FREEZEBG:
			case NAMEFROMCOLOUR:
			case PD:
			case PE:
			case PENSIZE:
			case PU:
			case SETBG:
			case SETCOLOR:
			case SETPENSIZE:
			case STAMP:
			case UNFREEZEBG:
			case CLEARNAME:
			case CLEARNAMES:
			case LET:
			case ASSIGN:
			case NAMEX:
			case NAMES:
			case THING:
			case IF:
			case IFELSE:
			case REPEAT:
			case WHILE:
			case PROCEDURE:
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				cmd();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(T__3);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(480);
					brakeArg();
					}
					break;
				}
				setState(484); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(483);
						line();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(486); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(488);
					brakeArg();
					}
				}

				setState(491);
				match(T__5);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(T__7);
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(494);
					brakeArg();
					}
					break;
				}
				setState(498); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(497);
						line();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(500); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(502);
					brakeArg();
					}
				}

				setState(505);
				match(T__8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c8\u0200\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\6\2x\n\2"+
		"\r\2\16\2y\3\2\3\2\3\3\5\3\177\n\3\3\3\5\3\u0082\n\3\3\3\3\3\5\3\u0086"+
		"\n\3\6\3\u0088\n\3\r\3\16\3\u0089\3\3\5\3\u008d\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00ba\n\4\3\5\3\5\3\6\3\6\3\6\5\6\u00c1\n\6\3\6\3\6"+
		"\5\6\u00c5\n\6\3\6\3\6\3\6\3\6\5\6\u00cb\n\6\3\6\3\6\3\6\5\6\u00d0\n\6"+
		"\3\6\3\6\5\6\u00d4\n\6\3\6\3\6\5\6\u00d8\n\6\3\6\3\6\7\6\u00dc\n\6\f\6"+
		"\16\6\u00df\13\6\3\7\3\7\3\7\3\7\5\7\u00e5\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0106\n\t\3\n\3\n\3\13\3\13\3"+
		"\13\5\13\u010d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0116\n\f\f\f\16\f"+
		"\u0119\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0123\n\r\f\r\16\r\u0126"+
		"\13\r\3\r\5\r\u0129\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u01c5\n\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01cd"+
		"\n\66\3\67\6\67\u01d0\n\67\r\67\16\67\u01d1\38\68\u01d5\n8\r8\168\u01d6"+
		"\39\39\69\u01db\n9\r9\169\u01dc\3:\3:\3;\3;\3;\5;\u01e4\n;\3;\6;\u01e7"+
		"\n;\r;\16;\u01e8\3;\5;\u01ec\n;\3;\3;\3;\3;\5;\u01f2\n;\3;\6;\u01f5\n"+
		";\r;\16;\u01f6\3;\5;\u01fa\n;\3;\3;\5;\u01fe\n;\3;\2\3\n<\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprt\2\2\2\u022d\2w\3\2\2\2\4~\3\2\2\2\6\u00b9\3\2\2\2\b\u00bb"+
		"\3\2\2\2\n\u00cf\3\2\2\2\f\u00e4\3\2\2\2\16\u00f2\3\2\2\2\20\u0105\3\2"+
		"\2\2\22\u0107\3\2\2\2\24\u010c\3\2\2\2\26\u010e\3\2\2\2\30\u011c\3\2\2"+
		"\2\32\u012a\3\2\2\2\34\u0130\3\2\2\2\36\u0136\3\2\2\2 \u013a\3\2\2\2\""+
		"\u013e\3\2\2\2$\u0142\3\2\2\2&\u0146\3\2\2\2(\u014a\3\2\2\2*\u014e\3\2"+
		"\2\2,\u0152\3\2\2\2.\u0156\3\2\2\2\60\u015a\3\2\2\2\62\u015e\3\2\2\2\64"+
		"\u0162\3\2\2\2\66\u016e\3\2\2\28\u0174\3\2\2\2:\u017a\3\2\2\2<\u0180\3"+
		"\2\2\2>\u0186\3\2\2\2@\u018c\3\2\2\2B\u0192\3\2\2\2D\u019a\3\2\2\2F\u019c"+
		"\3\2\2\2H\u019e\3\2\2\2J\u01a0\3\2\2\2L\u01a2\3\2\2\2N\u01a4\3\2\2\2P"+
		"\u01a6\3\2\2\2R\u01a8\3\2\2\2T\u01aa\3\2\2\2V\u01ac\3\2\2\2X\u01ae\3\2"+
		"\2\2Z\u01b0\3\2\2\2\\\u01b2\3\2\2\2^\u01b4\3\2\2\2`\u01b6\3\2\2\2b\u01b8"+
		"\3\2\2\2d\u01ba\3\2\2\2f\u01bc\3\2\2\2h\u01be\3\2\2\2j\u01c6\3\2\2\2l"+
		"\u01cf\3\2\2\2n\u01d4\3\2\2\2p\u01da\3\2\2\2r\u01de\3\2\2\2t\u01fd\3\2"+
		"\2\2vx\5\4\3\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5r"+
		":\2|\3\3\2\2\2}\177\5p9\2~}\3\2\2\2~\177\3\2\2\2\177\u0087\3\2\2\2\u0080"+
		"\u0082\5l\67\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0085\5\6\4\2\u0084\u0086\5l\67\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u008d\5p9\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\5\3\2\2\2\u008e"+
		"\u00ba\5\32\16\2\u008f\u00ba\5\34\17\2\u0090\u00ba\5\26\f\2\u0091\u00ba"+
		"\5\30\r\2\u0092\u00ba\5 \21\2\u0093\u00ba\5\36\20\2\u0094\u00ba\5\"\22"+
		"\2\u0095\u00ba\5$\23\2\u0096\u00ba\5&\24\2\u0097\u00ba\5(\25\2\u0098\u00ba"+
		"\5*\26\2\u0099\u00ba\5\64\33\2\u009a\u00ba\5\66\34\2\u009b\u00ba\58\35"+
		"\2\u009c\u00ba\5D#\2\u009d\u00ba\5F$\2\u009e\u00ba\5H%\2\u009f\u00ba\5"+
		":\36\2\u00a0\u00ba\5<\37\2\u00a1\u00ba\5> \2\u00a2\u00ba\5J&\2\u00a3\u00ba"+
		"\5L\'\2\u00a4\u00ba\5h\65\2\u00a5\u00ba\5j\66\2\u00a6\u00ba\5@!\2\u00a7"+
		"\u00ba\5B\"\2\u00a8\u00ba\5N(\2\u00a9\u00ba\5P)\2\u00aa\u00ba\5R*\2\u00ab"+
		"\u00ba\5T+\2\u00ac\u00ba\5V,\2\u00ad\u00ba\5X-\2\u00ae\u00ba\5Z.\2\u00af"+
		"\u00ba\5,\27\2\u00b0\u00ba\5\\/\2\u00b1\u00ba\5^\60\2\u00b2\u00ba\5`\61"+
		"\2\u00b3\u00ba\5b\62\2\u00b4\u00ba\5\62\32\2\u00b5\u00ba\5.\30\2\u00b6"+
		"\u00ba\5\60\31\2\u00b7\u00ba\5d\63\2\u00b8\u00ba\5f\64\2\u00b9\u008e\3"+
		"\2\2\2\u00b9\u008f\3\2\2\2\u00b9\u0090\3\2\2\2\u00b9\u0091\3\2\2\2\u00b9"+
		"\u0092\3\2\2\2\u00b9\u0093\3\2\2\2\u00b9\u0094\3\2\2\2\u00b9\u0095\3\2"+
		"\2\2\u00b9\u0096\3\2\2\2\u00b9\u0097\3\2\2\2\u00b9\u0098\3\2\2\2\u00b9"+
		"\u0099\3\2\2\2\u00b9\u009a\3\2\2\2\u00b9\u009b\3\2\2\2\u00b9\u009c\3\2"+
		"\2\2\u00b9\u009d\3\2\2\2\u00b9\u009e\3\2\2\2\u00b9\u009f\3\2\2\2\u00b9"+
		"\u00a0\3\2\2\2\u00b9\u00a1\3\2\2\2\u00b9\u00a2\3\2\2\2\u00b9\u00a3\3\2"+
		"\2\2\u00b9\u00a4\3\2\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00a6\3\2\2\2\u00b9"+
		"\u00a7\3\2\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00aa\3\2"+
		"\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9"+
		"\u00ae\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2"+
		"\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9"+
		"\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\7\3\2\2\2\u00bb\u00bc\5\n\6\2\u00bc\t\3\2\2\2\u00bd\u00be\b"+
		"\6\1\2\u00be\u00c0\7\3\2\2\u00bf\u00c1\5p9\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5\n\6\2\u00c3\u00c5\5p"+
		"9\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\7\4\2\2\u00c7\u00d0\3\2\2\2\u00c8\u00ca\5\16\b\2\u00c9\u00cb\5"+
		"p9\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\5\n\6\4\u00cd\u00d0\3\2\2\2\u00ce\u00d0\5\f\7\2\u00cf\u00bd\3\2"+
		"\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00dd\3\2\2\2\u00d1"+
		"\u00d3\f\5\2\2\u00d2\u00d4\5p9\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\5\20\t\2\u00d6\u00d8\5p9\2\u00d7\u00d6"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\5\n\6\6\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d1\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\13\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e5"+
		"\7\u00c4\2\2\u00e1\u00e5\7\u00c3\2\2\u00e2\u00e5\7\u00c5\2\2\u00e3\u00e5"+
		"\5\24\13\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\r\3\2\2\2\u00e6\u00f3\7k\2\2\u00e7\u00f3\7"+
		"l\2\2\u00e8\u00f3\7m\2\2\u00e9\u00f3\7p\2\2\u00ea\u00f3\7q\2\2\u00eb\u00f3"+
		"\7s\2\2\u00ec\u00f3\7x\2\2\u00ed\u00f3\7z\2\2\u00ee\u00f3\7{\2\2\u00ef"+
		"\u00f3\7|\2\2\u00f0\u00f3\7~\2\2\u00f1\u00f3\7\u00a3\2\2\u00f2\u00e6\3"+
		"\2\2\2\u00f2\u00e7\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2\u00e9\3\2\2\2\u00f2"+
		"\u00ea\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ed\3\2"+
		"\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\17\3\2\2\2\u00f4\u0106\7n\2\2\u00f5\u0106\7u\2\2"+
		"\u00f6\u0106\7w\2\2\u00f7\u0106\7y\2\2\u00f8\u0106\7}\2\2\u00f9\u0106"+
		"\7s\2\2\u00fa\u0106\7v\2\2\u00fb\u0106\7\u00c2\2\2\u00fc\u0106\7\177\2"+
		"\2\u00fd\u0106\7\u0080\2\2\u00fe\u0106\7\u0081\2\2\u00ff\u0106\7\u0083"+
		"\2\2\u0100\u0106\7\u0082\2\2\u0101\u0106\7o\2\2\u0102\u0106\7r\2\2\u0103"+
		"\u0106\7\u00a4\2\2\u0104\u0106\7\u00a0\2\2\u0105\u00f4\3\2\2\2\u0105\u00f5"+
		"\3\2\2\2\u0105\u00f6\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00f8\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0105\u00fa\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2"+
		"\2\2\u0105\u00fd\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105"+
		"\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106\21\3\2\2\2\u0107\u0108\7\u00c6\2\2\u0108"+
		"\23\3\2\2\2\u0109\u010a\7\5\2\2\u010a\u010d\7\u00c6\2\2\u010b\u010d\7"+
		"\f\2\2\u010c\u0109\3\2\2\2\u010c\u010b\3\2\2\2\u010d\25\3\2\2\2\u010e"+
		"\u010f\7\u00c0\2\2\u010f\u0110\5p9\2\u0110\u0111\5\22\n\2\u0111\u0117"+
		"\5p9\2\u0112\u0113\5\24\13\2\u0113\u0114\5p9\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\5t;\2\u011b\27"+
		"\3\2\2\2\u011c\u011d\7\u00c1\2\2\u011d\u011e\5p9\2\u011e\u0124\5\22\n"+
		"\2\u011f\u0120\5p9\2\u0120\u0121\5\b\5\2\u0121\u0123\3\2\2\2\u0122\u011f"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\5p9\2\u0128\u0127\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\31\3\2\2\2\u012a\u012b\7\u00b9\2\2\u012b"+
		"\u012c\5p9\2\u012c\u012d\5\b\5\2\u012d\u012e\5p9\2\u012e\u012f\5t;\2\u012f"+
		"\33\3\2\2\2\u0130\u0131\7\u00ba\2\2\u0131\u0132\5p9\2\u0132\u0133\5\b"+
		"\5\2\u0133\u0134\5p9\2\u0134\u0135\5t;\2\u0135\35\3\2\2\2\u0136\u0137"+
		"\7\r\2\2\u0137\u0138\5p9\2\u0138\u0139\5\b\5\2\u0139\37\3\2\2\2\u013a"+
		"\u013b\7\17\2\2\u013b\u013c\5p9\2\u013c\u013d\5\b\5\2\u013d!\3\2\2\2\u013e"+
		"\u013f\7\22\2\2\u013f\u0140\5p9\2\u0140\u0141\5\b\5\2\u0141#\3\2\2\2\u0142"+
		"\u0143\7\24\2\2\u0143\u0144\5p9\2\u0144\u0145\5\b\5\2\u0145%\3\2\2\2\u0146"+
		"\u0147\7\25\2\2\u0147\u0148\5p9\2\u0148\u0149\5\b\5\2\u0149\'\3\2\2\2"+
		"\u014a\u014b\7\27\2\2\u014b\u014c\5p9\2\u014c\u014d\5\b\5\2\u014d)\3\2"+
		"\2\2\u014e\u014f\7\30\2\2\u014f\u0150\5p9\2\u0150\u0151\5\b\5\2\u0151"+
		"+\3\2\2\2\u0152\u0153\7!\2\2\u0153\u0154\5p9\2\u0154\u0155\5\b\5\2\u0155"+
		"-\3\2\2\2\u0156\u0157\7\'\2\2\u0157\u0158\5p9\2\u0158\u0159\5\b\5\2\u0159"+
		"/\3\2\2\2\u015a\u015b\7(\2\2\u015b\u015c\5p9\2\u015c\u015d\5\b\5\2\u015d"+
		"\61\3\2\2\2\u015e\u015f\7&\2\2\u015f\u0160\5p9\2\u0160\u0161\5\b\5\2\u0161"+
		"\63\3\2\2\2\u0162\u0163\7\26\2\2\u0163\u0164\5p9\2\u0164\u0165\7\6\2\2"+
		"\u0165\u0166\5p9\2\u0166\u0167\5\b\5\2\u0167\u0168\5p9\2\u0168\u0169\7"+
		"\7\2\2\u0169\u016a\5p9\2\u016a\u016b\5\b\5\2\u016b\u016c\5p9\2\u016c\u016d"+
		"\7\b\2\2\u016d\65\3\2\2\2\u016e\u016f\7\16\2\2\u016f\u0170\5p9\2\u0170"+
		"\u0171\7\t\2\2\u0171\u0172\5\22\n\2\u0172\u0173\7\t\2\2\u0173\67\3\2\2"+
		"\2\u0174\u0175\7\31\2\2\u0175\u0176\5p9\2\u0176\u0177\7\t\2\2\u0177\u0178"+
		"\5\22\n\2\u0178\u0179\7\t\2\2\u01799\3\2\2\2\u017a\u017b\7\u0092\2\2\u017b"+
		"\u017c\5p9\2\u017c\u017d\7\t\2\2\u017d\u017e\5\22\n\2\u017e\u017f\7\t"+
		"\2\2\u017f;\3\2\2\2\u0180\u0181\7\u0097\2\2\u0181\u0182\5p9\2\u0182\u0183"+
		"\7\t\2\2\u0183\u0184\5\22\n\2\u0184\u0185\7\t\2\2\u0185=\3\2\2\2\u0186"+
		"\u0187\7\u0099\2\2\u0187\u0188\5p9\2\u0188\u0189\7\t\2\2\u0189\u018a\5"+
		"\22\n\2\u018a\u018b\7\t\2\2\u018b?\3\2\2\2\u018c\u018d\7\u00a1\2\2\u018d"+
		"\u018e\5p9\2\u018e\u018f\5\b\5\2\u018f\u0190\5p9\2\u0190\u0191\5t;\2\u0191"+
		"A\3\2\2\2\u0192\u0193\7\u00a2\2\2\u0193\u0194\5p9\2\u0194\u0195\5\b\5"+
		"\2\u0195\u0196\5p9\2\u0196\u0197\5t;\2\u0197\u0198\5p9\2\u0198\u0199\5"+
		"t;\2\u0199C\3\2\2\2\u019a\u019b\7\20\2\2\u019bE\3\2\2\2\u019c\u019d\7"+
		"\21\2\2\u019dG\3\2\2\2\u019e\u019f\7\23\2\2\u019fI\3\2\2\2\u01a0\u01a1"+
		"\7\u0093\2\2\u01a1K\3\2\2\2\u01a2\u01a3\7\u0098\2\2\u01a3M\3\2\2\2\u01a4"+
		"\u01a5\7\32\2\2\u01a5O\3\2\2\2\u01a6\u01a7\7\33\2\2\u01a7Q\3\2\2\2\u01a8"+
		"\u01a9\7\34\2\2\u01a9S\3\2\2\2\u01aa\u01ab\7\35\2\2\u01abU\3\2\2\2\u01ac"+
		"\u01ad\7\36\2\2\u01adW\3\2\2\2\u01ae\u01af\7\37\2\2\u01afY\3\2\2\2\u01b0"+
		"\u01b1\7 \2\2\u01b1[\3\2\2\2\u01b2\u01b3\7\"\2\2\u01b3]\3\2\2\2\u01b4"+
		"\u01b5\7#\2\2\u01b5_\3\2\2\2\u01b6\u01b7\7$\2\2\u01b7a\3\2\2\2\u01b8\u01b9"+
		"\7%\2\2\u01b9c\3\2\2\2\u01ba\u01bb\7)\2\2\u01bbe\3\2\2\2\u01bc\u01bd\7"+
		"*\2\2\u01bdg\3\2\2\2\u01be\u01bf\7\u0094\2\2\u01bf\u01c0\5p9\2\u01c0\u01c1"+
		"\5\24\13\2\u01c1\u01c2\5p9\2\u01c2\u01c4\5\b\5\2\u01c3\u01c5\5p9\2\u01c4"+
		"\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5i\3\2\2\2\u01c6\u01c7\7\u0095"+
		"\2\2\u01c7\u01c8\5p9\2\u01c8\u01c9\5\24\13\2\u01c9\u01ca\5p9\2\u01ca\u01cc"+
		"\5\b\5\2\u01cb\u01cd\5p9\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"k\3\2\2\2\u01ce\u01d0\7\u00c7\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2m\3\2\2\2\u01d3\u01d5"+
		"\7\u00c8\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7o\3\2\2\2\u01d8\u01db\5l\67\2\u01d9\u01db"+
		"\5n8\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddq\3\2\2\2\u01de\u01df\7\2\2\3"+
		"\u01dfs\3\2\2\2\u01e0\u01fe\5\6\4\2\u01e1\u01e3\7\6\2\2\u01e2\u01e4\5"+
		"p9\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e7\5\4\3\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\5p9\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\b\2\2\u01ee"+
		"\u01fe\3\2\2\2\u01ef\u01f1\7\n\2\2\u01f0\u01f2\5p9\2\u01f1\u01f0\3\2\2"+
		"\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\5\4\3\2\u01f4\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f9\3\2\2\2\u01f8\u01fa\5p9\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2"+
		"\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7\13\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01e0\3\2\2\2\u01fd\u01e1\3\2\2\2\u01fd\u01ef\3\2\2\2\u01feu\3\2\2\2"+
		"$y~\u0081\u0085\u0089\u008c\u00b9\u00c0\u00c4\u00ca\u00cf\u00d3\u00d7"+
		"\u00dd\u00e4\u00f2\u0105\u010c\u0117\u0124\u0128\u01c4\u01cc\u01d1\u01d6"+
		"\u01da\u01dc\u01e3\u01e8\u01eb\u01f1\u01f6\u01f9\u01fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}