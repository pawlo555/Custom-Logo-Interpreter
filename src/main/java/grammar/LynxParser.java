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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BACK=7, DISTANCE=8, FORWARD=9, 
		GLIDE=10, HEADING=11, HOME=12, LEFT=13, POS=14, RIGHT=15, SETHEADING=16, 
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
		EXP=108, GREATERX=109, INT=110, LESSX=111, LN=112, LOG=113, MINUS=114, 
		PI=115, POWER=116, PRODUCT=117, QUOTIENT=118, RANDOM=119, REMAINDER=120, 
		ROUND=121, SIN=122, SQRT=123, SUM=124, TAN=125, ASK=126, FREEZE=127, GET=128, 
		NEWPAGE=129, NEWSLIDER=130, NEWTEXT=131, NEWTURTLE=132, REMOVE=133, RENAME=134, 
		SET=135, TALKTO=136, UNFREEZE=137, RESETT=138, TIMER=139, CLEARNAME=140, 
		CLEARNAMES=141, LET=142, MAKE=143, NAMEX=144, NAMES=145, THING=146, GETPAGE=147, 
		NAMEPAGE=148, NEXTPAGE=149, PAGELIST=150, PREVPAGE=151, PROJECTSIZE=152, 
		AND=153, IF=154, IFELSE=155, NOT=156, OR=157, ANSWER=158, KEYX=159, MOUSEPOS=160, 
		PEEKCHAR=161, QUESTION=162, READCHAR=163, SAY=164, SAYAS=165, SKIPCHAR=166, 
		VOICES=167, BROADCAST=168, CANCEL=169, CAREFULLY=170, DOLIST=171, DOTIMES=172, 
		ERRORMESSAGE=173, EVERYONE=174, FOREVER=175, LAUNCH=176, OUTPUT=177, REPEAT=178, 
		RUN=179, STOP=180, STOPALL=181, STOPME=182, WAIT=183, PROCEDURE=184, CALL=185, 
		PLUSS=186, MINUSS=187, DIVIDES=188, MULTIPLYS=189, LESSS=190, MORES=191, 
		EQUALS=192, LESSEQUALS=193, MOREEQUALS=194, NATURALNUMBER=195, NEGATINATURALNUMBER=196, 
		FLOATNUMBER=197, OTHERWORD=198, WHITESPACE=199, NEWLINE=200;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_cmd = 2, RULE_procedure = 3, RULE_procedureCall = 4, 
		RULE_repeat = 5, RULE_back = 6, RULE_forward = 7, RULE_left = 8, RULE_right = 9, 
		RULE_setheading = 10, RULE_setx = 11, RULE_sety = 12, RULE_abs = 13, RULE_arctan = 14, 
		RULE_cos = 15, RULE_exp = 16, RULE_intC = 17, RULE_ln = 18, RULE_log = 19, 
		RULE_minus = 20, RULE_random = 21, RULE_round = 22, RULE_sin = 23, RULE_sqrt = 24, 
		RULE_tan = 25, RULE_namefromcolor = 26, RULE_setcolor = 27, RULE_setpensize = 28, 
		RULE_setbg = 29, RULE_setpos = 30, RULE_distance = 31, RULE_towards = 32, 
		RULE_clearname = 33, RULE_namex = 34, RULE_thing = 35, RULE_glide = 36, 
		RULE_difference = 37, RULE_greaterx = 38, RULE_lessx = 39, RULE_power = 40, 
		RULE_product = 41, RULE_quotient = 42, RULE_remainder = 43, RULE_sum = 44, 
		RULE_and = 45, RULE_ifC = 46, RULE_ifelse = 47, RULE_not = 48, RULE_or = 49, 
		RULE_heading = 50, RULE_home = 51, RULE_pos = 52, RULE_xcor = 53, RULE_ycor = 54, 
		RULE_clearnames = 55, RULE_names = 56, RULE_pi = 57, RULE_bg = 58, RULE_cg = 59, 
		RULE_clean = 60, RULE_color = 61, RULE_colorrunder = 62, RULE_fill = 63, 
		RULE_freezebg = 64, RULE_pd = 65, RULE_pe = 66, RULE_pensize = 67, RULE_pu = 68, 
		RULE_stamp = 69, RULE_unfreezebg = 70, RULE_let = 71, RULE_make = 72, 
		RULE_mathStatment = 73, RULE_brackets = 74, RULE_logicStatment = 75, RULE_logicbrackets = 76, 
		RULE_logicSign = 77, RULE_mathSign = 78, RULE_spaceArg = 79, RULE_newLineArg = 80, 
		RULE_brakeArg = 81, RULE_naturalNumberArg = 82, RULE_totalnumberArg = 83, 
		RULE_anynumberArg = 84, RULE_list = 85, RULE_stringArg = 86, RULE_endFileArg = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "cmd", "procedure", "procedureCall", "repeat", "back", 
			"forward", "left", "right", "setheading", "setx", "sety", "abs", "arctan", 
			"cos", "exp", "intC", "ln", "log", "minus", "random", "round", "sin", 
			"sqrt", "tan", "namefromcolor", "setcolor", "setpensize", "setbg", "setpos", 
			"distance", "towards", "clearname", "namex", "thing", "glide", "difference", 
			"greaterx", "lessx", "power", "product", "quotient", "remainder", "sum", 
			"and", "ifC", "ifelse", "not", "or", "heading", "home", "pos", "xcor", 
			"ycor", "clearnames", "names", "pi", "bg", "cg", "clean", "color", "colorrunder", 
			"fill", "freezebg", "pd", "pe", "pensize", "pu", "stamp", "unfreezebg", 
			"let", "make", "mathStatment", "brackets", "logicStatment", "logicbrackets", 
			"logicSign", "mathSign", "spaceArg", "newLineArg", "brakeArg", "naturalNumberArg", 
			"totalnumberArg", "anynumberArg", "list", "stringArg", "endFileArg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "','", "'''", "'('", "')'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'+'", "'-'", "'/'", "'*'", 
			"'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BACK", "DISTANCE", "FORWARD", 
			"GLIDE", "HEADING", "HOME", "LEFT", "POS", "RIGHT", "SETHEADING", "SETPOS", 
			"SETX", "SETY", "TOWARDS", "XCOR", "YCOR", "BG", "CG", "CLEAN", "COLOR", 
			"COLORUNDER", "FILL", "FREEZEBG", "NAMEFROMCOLOUR", "PD", "PE", "PENSIZE", 
			"PU", "SETBG", "SETCOLOR", "SETPENSIZE", "STAMP", "UNFREEZEBG", "HT", 
			"INBACK", "INFRONT", "OPACITY", "SETOPACITY", "SETSHAPE", "SETSIZE", 
			"SHAPE", "SIZE", "ST", "CLICKOFF", "CLICKON", "CLONE", "TELL", "TOUCHINGX", 
			"WHO", "ANNOUNCE", "ASCII", "BOTTOM", "CB", "CC", "CD", "CF", "CHAR", 
			"CLEARTEXT", "CU", "DELETE", "EOL", "EOT", "HIDETEXT", "INSERT", "PRINT", 
			"SELECT", "SELECTED", "SHOW", "SHOWTEXT", "SOL", "TEXTCOUNT", "TEXTITEM", 
			"TEXTPICK", "TEXTWHO", "TOP", "TRANSPARENT", "UNSELECT", "BUTFIRST", 
			"BUTLAST", "COUNT", "EMPTY", "EQUALX", "FIRST", "FPUT", "IDENTICALX", 
			"ITEM", "LAST", "LIST", "LISTX", "LPUT", "MEMBERX", "NUMBER", "PARSE", 
			"PICK", "SENTENCE", "WORD", "WORDX", "ABS", "ARCTAN", "COS", "DIFFERENCE", 
			"EXP", "GREATERX", "INT", "LESSX", "LN", "LOG", "MINUS", "PI", "POWER", 
			"PRODUCT", "QUOTIENT", "RANDOM", "REMAINDER", "ROUND", "SIN", "SQRT", 
			"SUM", "TAN", "ASK", "FREEZE", "GET", "NEWPAGE", "NEWSLIDER", "NEWTEXT", 
			"NEWTURTLE", "REMOVE", "RENAME", "SET", "TALKTO", "UNFREEZE", "RESETT", 
			"TIMER", "CLEARNAME", "CLEARNAMES", "LET", "MAKE", "NAMEX", "NAMES", 
			"THING", "GETPAGE", "NAMEPAGE", "NEXTPAGE", "PAGELIST", "PREVPAGE", "PROJECTSIZE", 
			"AND", "IF", "IFELSE", "NOT", "OR", "ANSWER", "KEYX", "MOUSEPOS", "PEEKCHAR", 
			"QUESTION", "READCHAR", "SAY", "SAYAS", "SKIPCHAR", "VOICES", "BROADCAST", 
			"CANCEL", "CAREFULLY", "DOLIST", "DOTIMES", "ERRORMESSAGE", "EVERYONE", 
			"FOREVER", "LAUNCH", "OUTPUT", "REPEAT", "RUN", "STOP", "STOPALL", "STOPME", 
			"WAIT", "PROCEDURE", "CALL", "PLUSS", "MINUSS", "DIVIDES", "MULTIPLYS", 
			"LESSS", "MORES", "EQUALS", "LESSEQUALS", "MOREEQUALS", "NATURALNUMBER", 
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
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				line();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACK) | (1L << DISTANCE) | (1L << FORWARD) | (1L << GLIDE) | (1L << HEADING) | (1L << HOME) | (1L << LEFT) | (1L << POS) | (1L << RIGHT) | (1L << SETHEADING) | (1L << SETPOS) | (1L << SETX) | (1L << SETY) | (1L << TOWARDS) | (1L << XCOR) | (1L << YCOR) | (1L << BG) | (1L << CG) | (1L << CLEAN) | (1L << COLOR) | (1L << COLORUNDER) | (1L << FILL) | (1L << FREEZEBG) | (1L << NAMEFROMCOLOUR) | (1L << PD) | (1L << PE) | (1L << PENSIZE) | (1L << PU) | (1L << SETBG) | (1L << SETCOLOR) | (1L << SETPENSIZE) | (1L << STAMP) | (1L << UNFREEZEBG))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (ABS - 104)) | (1L << (ARCTAN - 104)) | (1L << (COS - 104)) | (1L << (DIFFERENCE - 104)) | (1L << (EXP - 104)) | (1L << (GREATERX - 104)) | (1L << (INT - 104)) | (1L << (LESSX - 104)) | (1L << (LN - 104)) | (1L << (LOG - 104)) | (1L << (MINUS - 104)) | (1L << (PI - 104)) | (1L << (POWER - 104)) | (1L << (PRODUCT - 104)) | (1L << (QUOTIENT - 104)) | (1L << (RANDOM - 104)) | (1L << (REMAINDER - 104)) | (1L << (ROUND - 104)) | (1L << (SIN - 104)) | (1L << (SQRT - 104)) | (1L << (SUM - 104)) | (1L << (TAN - 104)) | (1L << (CLEARNAME - 104)) | (1L << (CLEARNAMES - 104)) | (1L << (LET - 104)) | (1L << (MAKE - 104)) | (1L << (NAMEX - 104)) | (1L << (NAMES - 104)) | (1L << (THING - 104)) | (1L << (AND - 104)) | (1L << (IF - 104)) | (1L << (IFELSE - 104)) | (1L << (NOT - 104)) | (1L << (OR - 104)))) != 0) || ((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & ((1L << (REPEAT - 178)) | (1L << (PROCEDURE - 178)) | (1L << (CALL - 178)) | (1L << (WHITESPACE - 178)) | (1L << (NEWLINE - 178)))) != 0) );
			setState(181);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(183);
				brakeArg();
				}
				break;
			}
			setState(193); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(186);
						spaceArg();
						}
					}

					setState(189);
					cmd();
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(190);
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
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(197);
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
		public GlideContext glide() {
			return getRuleContext(GlideContext.class,0);
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
		public ArctanContext arctan() {
			return getRuleContext(ArctanContext.class,0);
		}
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IntCContext intC() {
			return getRuleContext(IntCContext.class,0);
		}
		public LnContext ln() {
			return getRuleContext(LnContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public RoundContext round() {
			return getRuleContext(RoundContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public TanContext tan() {
			return getRuleContext(TanContext.class,0);
		}
		public DifferenceContext difference() {
			return getRuleContext(DifferenceContext.class,0);
		}
		public GreaterxContext greaterx() {
			return getRuleContext(GreaterxContext.class,0);
		}
		public LessxContext lessx() {
			return getRuleContext(LessxContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public QuotientContext quotient() {
			return getRuleContext(QuotientContext.class,0);
		}
		public RemainderContext remainder() {
			return getRuleContext(RemainderContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
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
		public IfCContext ifC() {
			return getRuleContext(IfCContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				repeat();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				procedure();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				procedureCall();
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				back();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				right();
				}
				break;
			case SETHEADING:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				setheading();
				}
				break;
			case SETX:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				setx();
				}
				break;
			case SETY:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				sety();
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				setpos();
				}
				break;
			case DISTANCE:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				distance();
				}
				break;
			case TOWARDS:
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				towards();
				}
				break;
			case GLIDE:
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				glide();
				}
				break;
			case HEADING:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				heading();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				home();
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				pos();
				}
				break;
			case XCOR:
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				xcor();
				}
				break;
			case YCOR:
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				ycor();
				}
				break;
			case ARCTAN:
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				arctan();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 21);
				{
				setState(220);
				abs();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 22);
				{
				setState(221);
				cos();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 23);
				{
				setState(222);
				exp();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 24);
				{
				setState(223);
				intC();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 25);
				{
				setState(224);
				ln();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 26);
				{
				setState(225);
				log();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 27);
				{
				setState(226);
				minus();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 28);
				{
				setState(227);
				random();
				}
				break;
			case ROUND:
				enterOuterAlt(_localctx, 29);
				{
				setState(228);
				round();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 30);
				{
				setState(229);
				sin();
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 31);
				{
				setState(230);
				sqrt();
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 32);
				{
				setState(231);
				tan();
				}
				break;
			case DIFFERENCE:
				enterOuterAlt(_localctx, 33);
				{
				setState(232);
				difference();
				}
				break;
			case GREATERX:
				enterOuterAlt(_localctx, 34);
				{
				setState(233);
				greaterx();
				}
				break;
			case LESSX:
				enterOuterAlt(_localctx, 35);
				{
				setState(234);
				lessx();
				}
				break;
			case POWER:
				enterOuterAlt(_localctx, 36);
				{
				setState(235);
				power();
				}
				break;
			case PRODUCT:
				enterOuterAlt(_localctx, 37);
				{
				setState(236);
				product();
				}
				break;
			case QUOTIENT:
				enterOuterAlt(_localctx, 38);
				{
				setState(237);
				quotient();
				}
				break;
			case REMAINDER:
				enterOuterAlt(_localctx, 39);
				{
				setState(238);
				remainder();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 40);
				{
				setState(239);
				sum();
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 41);
				{
				setState(240);
				pi();
				}
				break;
			case CLEARNAME:
				enterOuterAlt(_localctx, 42);
				{
				setState(241);
				clearname();
				}
				break;
			case NAMEX:
				enterOuterAlt(_localctx, 43);
				{
				setState(242);
				namex();
				}
				break;
			case THING:
				enterOuterAlt(_localctx, 44);
				{
				setState(243);
				thing();
				}
				break;
			case CLEARNAMES:
				enterOuterAlt(_localctx, 45);
				{
				setState(244);
				clearnames();
				}
				break;
			case NAMES:
				enterOuterAlt(_localctx, 46);
				{
				setState(245);
				names();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 47);
				{
				setState(246);
				let();
				}
				break;
			case MAKE:
				enterOuterAlt(_localctx, 48);
				{
				setState(247);
				make();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 49);
				{
				setState(248);
				ifC();
				}
				break;
			case IFELSE:
				enterOuterAlt(_localctx, 50);
				{
				setState(249);
				ifelse();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 51);
				{
				setState(250);
				not();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 52);
				{
				setState(251);
				or();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 53);
				{
				setState(252);
				and();
				}
				break;
			case BG:
				enterOuterAlt(_localctx, 54);
				{
				setState(253);
				bg();
				}
				break;
			case CG:
				enterOuterAlt(_localctx, 55);
				{
				setState(254);
				cg();
				}
				break;
			case CLEAN:
				enterOuterAlt(_localctx, 56);
				{
				setState(255);
				clean();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 57);
				{
				setState(256);
				color();
				}
				break;
			case COLORUNDER:
				enterOuterAlt(_localctx, 58);
				{
				setState(257);
				colorrunder();
				}
				break;
			case FILL:
				enterOuterAlt(_localctx, 59);
				{
				setState(258);
				fill();
				}
				break;
			case FREEZEBG:
				enterOuterAlt(_localctx, 60);
				{
				setState(259);
				freezebg();
				}
				break;
			case NAMEFROMCOLOUR:
				enterOuterAlt(_localctx, 61);
				{
				setState(260);
				namefromcolor();
				}
				break;
			case PD:
				enterOuterAlt(_localctx, 62);
				{
				setState(261);
				pd();
				}
				break;
			case PE:
				enterOuterAlt(_localctx, 63);
				{
				setState(262);
				pe();
				}
				break;
			case PENSIZE:
				enterOuterAlt(_localctx, 64);
				{
				setState(263);
				pensize();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 65);
				{
				setState(264);
				pu();
				}
				break;
			case SETBG:
				enterOuterAlt(_localctx, 66);
				{
				setState(265);
				setbg();
				}
				break;
			case SETCOLOR:
				enterOuterAlt(_localctx, 67);
				{
				setState(266);
				setcolor();
				}
				break;
			case SETPENSIZE:
				enterOuterAlt(_localctx, 68);
				{
				setState(267);
				setpensize();
				}
				break;
			case STAMP:
				enterOuterAlt(_localctx, 69);
				{
				setState(268);
				stamp();
				}
				break;
			case UNFREEZEBG:
				enterOuterAlt(_localctx, 70);
				{
				setState(269);
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
		enterRule(_localctx, 6, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(PROCEDURE);
			setState(273);
			brakeArg();
			setState(274);
			stringArg();
			setState(275);
			brakeArg();
			setState(276);
			match(T__0);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(277);
				brakeArg();
				}
				break;
			}
			setState(281); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(280);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(285);
				brakeArg();
				}
			}

			setState(288);
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

	public static class ProcedureCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(LynxParser.CALL, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
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
		enterRule(_localctx, 8, RULE_procedureCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(CALL);
			setState(291);
			brakeArg();
			setState(292);
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
		enterRule(_localctx, 10, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(REPEAT);
			setState(295);
			brakeArg();
			setState(296);
			naturalNumberArg();
			setState(297);
			brakeArg();
			setState(298);
			match(T__0);
			setState(299);
			line();
			setState(300);
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 12, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(BACK);
			setState(303);
			brakeArg();
			setState(304);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 14, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(FORWARD);
			setState(307);
			brakeArg();
			setState(308);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 16, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(LEFT);
			setState(311);
			brakeArg();
			setState(312);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 18, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(RIGHT);
			setState(315);
			brakeArg();
			setState(316);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 20, RULE_setheading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SETHEADING);
			setState(319);
			brakeArg();
			setState(320);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 22, RULE_setx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(SETX);
			setState(323);
			brakeArg();
			setState(324);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 24, RULE_sety);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(SETY);
			setState(327);
			brakeArg();
			setState(328);
			mathStatment();
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

	public static class AbsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(LynxParser.ABS, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public AbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs; }
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

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ABS);
			setState(331);
			brakeArg();
			setState(332);
			mathStatment();
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

	public static class ArctanContext extends ParserRuleContext {
		public TerminalNode ARCTAN() { return getToken(LynxParser.ARCTAN, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public ArctanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arctan; }
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

	public final ArctanContext arctan() throws RecognitionException {
		ArctanContext _localctx = new ArctanContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arctan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ARCTAN);
			setState(335);
			brakeArg();
			setState(336);
			mathStatment();
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(LynxParser.COS, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
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

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(COS);
			setState(339);
			brakeArg();
			setState(340);
			mathStatment();
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(LynxParser.EXP, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
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

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(EXP);
			setState(343);
			brakeArg();
			setState(344);
			mathStatment();
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

	public static class IntCContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LynxParser.INT, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public IntCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterIntC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitIntC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitIntC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntCContext intC() throws RecognitionException {
		IntCContext _localctx = new IntCContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_intC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(INT);
			setState(347);
			brakeArg();
			setState(348);
			mathStatment();
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

	public static class LnContext extends ParserRuleContext {
		public TerminalNode LN() { return getToken(LynxParser.LN, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public LnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ln; }
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

	public final LnContext ln() throws RecognitionException {
		LnContext _localctx = new LnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(LN);
			setState(351);
			brakeArg();
			setState(352);
			mathStatment();
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(LynxParser.LOG, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
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

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LOG);
			setState(355);
			brakeArg();
			setState(356);
			mathStatment();
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

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(LynxParser.MINUS, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
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

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(MINUS);
			setState(359);
			brakeArg();
			setState(360);
			mathStatment();
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

	public static class RandomContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(LynxParser.RANDOM, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
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

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_random);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(RANDOM);
			setState(363);
			brakeArg();
			setState(364);
			mathStatment();
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

	public static class RoundContext extends ParserRuleContext {
		public TerminalNode ROUND() { return getToken(LynxParser.ROUND, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public RoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round; }
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

	public final RoundContext round() throws RecognitionException {
		RoundContext _localctx = new RoundContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_round);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ROUND);
			setState(367);
			brakeArg();
			setState(368);
			mathStatment();
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

	public static class SinContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(LynxParser.SIN, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
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

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(SIN);
			setState(371);
			brakeArg();
			setState(372);
			mathStatment();
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

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(LynxParser.SQRT, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
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

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(SQRT);
			setState(375);
			brakeArg();
			setState(376);
			mathStatment();
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

	public static class TanContext extends ParserRuleContext {
		public TerminalNode TAN() { return getToken(LynxParser.TAN, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public TanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tan; }
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

	public final TanContext tan() throws RecognitionException {
		TanContext _localctx = new TanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(TAN);
			setState(379);
			brakeArg();
			setState(380);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 52, RULE_namefromcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(NAMEFROMCOLOUR);
			setState(383);
			brakeArg();
			setState(384);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 54, RULE_setcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(SETCOLOR);
			setState(387);
			brakeArg();
			setState(388);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 56, RULE_setpensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(SETPENSIZE);
			setState(391);
			brakeArg();
			setState(392);
			mathStatment();
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
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
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
		enterRule(_localctx, 58, RULE_setbg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(SETBG);
			setState(395);
			brakeArg();
			setState(396);
			mathStatment();
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
		enterRule(_localctx, 60, RULE_setpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(SETPOS);
			setState(399);
			brakeArg();
			setState(400);
			match(T__0);
			setState(401);
			brakeArg();
			setState(402);
			totalnumberArg();
			setState(403);
			brakeArg();
			setState(404);
			match(T__2);
			setState(405);
			brakeArg();
			setState(406);
			totalnumberArg();
			setState(407);
			brakeArg();
			setState(408);
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
		enterRule(_localctx, 62, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(DISTANCE);
			setState(411);
			brakeArg();
			setState(412);
			match(T__3);
			setState(413);
			stringArg();
			setState(414);
			match(T__3);
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
		enterRule(_localctx, 64, RULE_towards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(TOWARDS);
			setState(417);
			brakeArg();
			setState(418);
			match(T__3);
			setState(419);
			stringArg();
			setState(420);
			match(T__3);
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
		enterRule(_localctx, 66, RULE_clearname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(CLEARNAME);
			setState(423);
			brakeArg();
			setState(424);
			match(T__3);
			setState(425);
			stringArg();
			setState(426);
			match(T__3);
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
		enterRule(_localctx, 68, RULE_namex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(NAMEX);
			setState(429);
			brakeArg();
			setState(430);
			match(T__3);
			setState(431);
			stringArg();
			setState(432);
			match(T__3);
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
		enterRule(_localctx, 70, RULE_thing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(THING);
			setState(435);
			brakeArg();
			setState(436);
			match(T__3);
			setState(437);
			stringArg();
			setState(438);
			match(T__3);
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

	public static class GlideContext extends ParserRuleContext {
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
		public GlideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterGlide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitGlide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitGlide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlideContext glide() throws RecognitionException {
		GlideContext _localctx = new GlideContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_glide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(GLIDE);
			setState(441);
			brakeArg();
			setState(442);
			totalnumberArg();
			setState(443);
			brakeArg();
			setState(444);
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

	public static class DifferenceContext extends ParserRuleContext {
		public TerminalNode DIFFERENCE() { return getToken(LynxParser.DIFFERENCE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public DifferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference; }
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

	public final DifferenceContext difference() throws RecognitionException {
		DifferenceContext _localctx = new DifferenceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_difference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(DIFFERENCE);
			setState(447);
			brakeArg();
			setState(448);
			mathStatment();
			setState(449);
			brakeArg();
			setState(450);
			mathStatment();
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

	public static class GreaterxContext extends ParserRuleContext {
		public TerminalNode GREATERX() { return getToken(LynxParser.GREATERX, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public GreaterxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterGreaterx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitGreaterx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitGreaterx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterxContext greaterx() throws RecognitionException {
		GreaterxContext _localctx = new GreaterxContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_greaterx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(GREATERX);
			setState(453);
			brakeArg();
			setState(454);
			mathStatment();
			setState(455);
			brakeArg();
			setState(456);
			mathStatment();
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

	public static class LessxContext extends ParserRuleContext {
		public TerminalNode LESSX() { return getToken(LynxParser.LESSX, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public LessxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLessx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLessx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLessx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessxContext lessx() throws RecognitionException {
		LessxContext _localctx = new LessxContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lessx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LESSX);
			setState(459);
			brakeArg();
			setState(460);
			mathStatment();
			setState(461);
			brakeArg();
			setState(462);
			mathStatment();
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

	public static class PowerContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(LynxParser.POWER, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
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

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(POWER);
			setState(465);
			brakeArg();
			setState(466);
			mathStatment();
			setState(467);
			brakeArg();
			setState(468);
			mathStatment();
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

	public static class ProductContext extends ParserRuleContext {
		public TerminalNode PRODUCT() { return getToken(LynxParser.PRODUCT, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
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

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(PRODUCT);
			setState(471);
			brakeArg();
			setState(472);
			mathStatment();
			setState(473);
			brakeArg();
			setState(474);
			mathStatment();
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

	public static class QuotientContext extends ParserRuleContext {
		public TerminalNode QUOTIENT() { return getToken(LynxParser.QUOTIENT, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public QuotientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotient; }
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

	public final QuotientContext quotient() throws RecognitionException {
		QuotientContext _localctx = new QuotientContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_quotient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(QUOTIENT);
			setState(477);
			brakeArg();
			setState(478);
			mathStatment();
			setState(479);
			brakeArg();
			setState(480);
			mathStatment();
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

	public static class RemainderContext extends ParserRuleContext {
		public TerminalNode REMAINDER() { return getToken(LynxParser.REMAINDER, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public RemainderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remainder; }
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

	public final RemainderContext remainder() throws RecognitionException {
		RemainderContext _localctx = new RemainderContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_remainder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(REMAINDER);
			setState(483);
			brakeArg();
			setState(484);
			mathStatment();
			setState(485);
			brakeArg();
			setState(486);
			mathStatment();
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

	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(LynxParser.SUM, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
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

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(SUM);
			setState(489);
			brakeArg();
			setState(490);
			mathStatment();
			setState(491);
			brakeArg();
			setState(492);
			mathStatment();
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LynxParser.AND, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<LogicStatmentContext> logicStatment() {
			return getRuleContexts(LogicStatmentContext.class);
		}
		public LogicStatmentContext logicStatment(int i) {
			return getRuleContext(LogicStatmentContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
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

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(AND);
			setState(495);
			brakeArg();
			setState(496);
			logicStatment();
			setState(497);
			brakeArg();
			setState(498);
			logicStatment();
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

	public static class IfCContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LynxParser.IF, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public LogicStatmentContext logicStatment() {
			return getRuleContext(LogicStatmentContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public IfCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterIfC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitIfC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitIfC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCContext ifC() throws RecognitionException {
		IfCContext _localctx = new IfCContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ifC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(IF);
			setState(501);
			brakeArg();
			setState(502);
			logicStatment();
			setState(503);
			brakeArg();
			setState(504);
			match(T__0);
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(505);
				brakeArg();
				}
				break;
			}
			setState(508);
			line();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(509);
				brakeArg();
				}
			}

			setState(512);
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

	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IFELSE() { return getToken(LynxParser.IFELSE, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public LogicStatmentContext logicStatment() {
			return getRuleContext(LogicStatmentContext.class,0);
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
		enterRule(_localctx, 94, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(IFELSE);
			setState(515);
			brakeArg();
			setState(516);
			logicStatment();
			setState(517);
			brakeArg();
			setState(518);
			match(T__0);
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(519);
				brakeArg();
				}
				break;
			}
			setState(522);
			line();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(523);
				brakeArg();
				}
			}

			setState(526);
			match(T__1);
			setState(527);
			brakeArg();
			setState(528);
			match(T__0);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(529);
				brakeArg();
				}
				break;
			}
			setState(532);
			line();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(533);
				brakeArg();
				}
			}

			setState(536);
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LynxParser.NOT, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public LogicStatmentContext logicStatment() {
			return getRuleContext(LogicStatmentContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
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

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(NOT);
			setState(539);
			brakeArg();
			setState(540);
			logicStatment();
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(LynxParser.OR, 0); }
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public List<LogicStatmentContext> logicStatment() {
			return getRuleContexts(LogicStatmentContext.class);
		}
		public LogicStatmentContext logicStatment(int i) {
			return getRuleContext(LogicStatmentContext.class,i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
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

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(OR);
			setState(543);
			brakeArg();
			setState(544);
			logicStatment();
			setState(545);
			brakeArg();
			setState(546);
			logicStatment();
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
		enterRule(_localctx, 100, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		enterRule(_localctx, 102, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		enterRule(_localctx, 104, RULE_pos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
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
		enterRule(_localctx, 106, RULE_xcor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
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
		enterRule(_localctx, 108, RULE_ycor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
		enterRule(_localctx, 110, RULE_clearnames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		enterRule(_localctx, 112, RULE_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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

	public static class PiContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(LynxParser.PI, 0); }
		public PiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitPi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(PI);
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
		enterRule(_localctx, 116, RULE_bg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		enterRule(_localctx, 118, RULE_cg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 120, RULE_clean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 122, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		enterRule(_localctx, 124, RULE_colorrunder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		enterRule(_localctx, 126, RULE_fill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		enterRule(_localctx, 128, RULE_freezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		enterRule(_localctx, 130, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
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
		enterRule(_localctx, 132, RULE_pe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
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
		enterRule(_localctx, 134, RULE_pensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
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
		enterRule(_localctx, 136, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
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
		enterRule(_localctx, 138, RULE_stamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		enterRule(_localctx, 140, RULE_unfreezebg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
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
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
		enterRule(_localctx, 142, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(LET);
			setState(591);
			brakeArg();
			setState(592);
			list();
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
		enterRule(_localctx, 144, RULE_make);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(MAKE);
			setState(595);
			brakeArg();
			setState(596);
			match(T__3);
			setState(597);
			stringArg();
			setState(598);
			match(T__3);
			setState(599);
			brakeArg();
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(600);
				match(WORD);
				}
				break;
			case T__0:
				{
				setState(601);
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

	public static class MathStatmentContext extends ParserRuleContext {
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public List<MathSignContext> mathSign() {
			return getRuleContexts(MathSignContext.class);
		}
		public MathSignContext mathSign(int i) {
			return getRuleContext(MathSignContext.class,i);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public MathStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMathStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMathStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMathStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathStatmentContext mathStatment() throws RecognitionException {
		MathStatmentContext _localctx = new MathStatmentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_mathStatment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(612); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(604);
						brackets();
						setState(606);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITESPACE || _la==NEWLINE) {
							{
							setState(605);
							brakeArg();
							}
						}

						setState(608);
						mathSign();
						setState(610);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITESPACE || _la==NEWLINE) {
							{
							setState(609);
							brakeArg();
							}
						}

						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(614); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(618);
			brackets();
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

	public static class BracketsContext extends ParserRuleContext {
		public AnynumberArgContext anynumberArg() {
			return getRuleContext(AnynumberArgContext.class,0);
		}
		public MathStatmentContext mathStatment() {
			return getRuleContext(MathStatmentContext.class,0);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public ArctanContext arctan() {
			return getRuleContext(ArctanContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IntCContext intC() {
			return getRuleContext(IntCContext.class,0);
		}
		public LnContext ln() {
			return getRuleContext(LnContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public QuotientContext quotient() {
			return getRuleContext(QuotientContext.class,0);
		}
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public RemainderContext remainder() {
			return getRuleContext(RemainderContext.class,0);
		}
		public RoundContext round() {
			return getRuleContext(RoundContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TanContext tan() {
			return getRuleContext(TanContext.class,0);
		}
		public DifferenceContext difference() {
			return getRuleContext(DifferenceContext.class,0);
		}
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_brackets);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				anynumberArg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(T__4);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(622);
					brakeArg();
					}
				}

				setState(625);
				mathStatment();
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(626);
					brakeArg();
					}
				}

				setState(629);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				abs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				arctan();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(633);
				cos();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(634);
				exp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(635);
				intC();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(636);
				ln();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(637);
				log();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(638);
				minus();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(639);
				pi();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(640);
				power();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(641);
				product();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(642);
				quotient();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(643);
				random();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(644);
				remainder();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(645);
				round();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(646);
				sin();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(647);
				sqrt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(648);
				sum();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(649);
				sum();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(650);
				tan();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(651);
				difference();
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

	public static class LogicStatmentContext extends ParserRuleContext {
		public List<LogicbracketsContext> logicbrackets() {
			return getRuleContexts(LogicbracketsContext.class);
		}
		public LogicbracketsContext logicbrackets(int i) {
			return getRuleContext(LogicbracketsContext.class,i);
		}
		public List<LogicSignContext> logicSign() {
			return getRuleContexts(LogicSignContext.class);
		}
		public LogicSignContext logicSign(int i) {
			return getRuleContext(LogicSignContext.class,i);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public GreaterxContext greaterx() {
			return getRuleContext(GreaterxContext.class,0);
		}
		public LessxContext lessx() {
			return getRuleContext(LessxContext.class,0);
		}
		public LogicStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLogicStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLogicStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLogicStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicStatmentContext logicStatment() throws RecognitionException {
		LogicStatmentContext _localctx = new LogicStatmentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_logicStatment);
		int _la;
		try {
			int _alt;
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case ABS:
			case ARCTAN:
			case COS:
			case DIFFERENCE:
			case EXP:
			case INT:
			case LN:
			case LOG:
			case MINUS:
			case PI:
			case POWER:
			case PRODUCT:
			case QUOTIENT:
			case RANDOM:
			case REMAINDER:
			case ROUND:
			case SIN:
			case SQRT:
			case SUM:
			case TAN:
			case AND:
			case NOT:
			case OR:
			case NATURALNUMBER:
			case NEGATINATURALNUMBER:
			case FLOATNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(662); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(654);
							logicbrackets();
							setState(656);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WHITESPACE || _la==NEWLINE) {
								{
								setState(655);
								brakeArg();
								}
							}

							setState(658);
							logicSign();
							setState(660);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WHITESPACE || _la==NEWLINE) {
								{
								setState(659);
								brakeArg();
								}
							}

							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(664); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				setState(668);
				logicbrackets();
				}
				break;
			case GREATERX:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				greaterx();
				}
				break;
			case LESSX:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				lessx();
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

	public static class LogicbracketsContext extends ParserRuleContext {
		public LogicStatmentContext logicStatment() {
			return getRuleContext(LogicStatmentContext.class,0);
		}
		public List<BrakeArgContext> brakeArg() {
			return getRuleContexts(BrakeArgContext.class);
		}
		public BrakeArgContext brakeArg(int i) {
			return getRuleContext(BrakeArgContext.class,i);
		}
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public LogicbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLogicbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLogicbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLogicbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicbracketsContext logicbrackets() throws RecognitionException {
		LogicbracketsContext _localctx = new LogicbracketsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_logicbrackets);
		int _la;
		try {
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(T__4);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(674);
					brakeArg();
					}
				}

				setState(677);
				logicStatment();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(678);
					brakeArg();
					}
				}

				setState(681);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				brackets();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				and();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				or();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(686);
				not();
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

	public static class LogicSignContext extends ParserRuleContext {
		public TerminalNode LESSS() { return getToken(LynxParser.LESSS, 0); }
		public TerminalNode MORES() { return getToken(LynxParser.MORES, 0); }
		public TerminalNode EQUALS() { return getToken(LynxParser.EQUALS, 0); }
		public TerminalNode MOREEQUALS() { return getToken(LynxParser.MOREEQUALS, 0); }
		public TerminalNode LESSEQUALS() { return getToken(LynxParser.LESSEQUALS, 0); }
		public LogicSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterLogicSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitLogicSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitLogicSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicSignContext logicSign() throws RecognitionException {
		LogicSignContext _localctx = new LogicSignContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_logicSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (LESSS - 190)) | (1L << (MORES - 190)) | (1L << (EQUALS - 190)) | (1L << (LESSEQUALS - 190)) | (1L << (MOREEQUALS - 190)))) != 0)) ) {
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

	public static class MathSignContext extends ParserRuleContext {
		public TerminalNode PLUSS() { return getToken(LynxParser.PLUSS, 0); }
		public TerminalNode MINUSS() { return getToken(LynxParser.MINUSS, 0); }
		public TerminalNode DIVIDES() { return getToken(LynxParser.DIVIDES, 0); }
		public TerminalNode MULTIPLYS() { return getToken(LynxParser.MULTIPLYS, 0); }
		public MathSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterMathSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitMathSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitMathSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathSignContext mathSign() throws RecognitionException {
		MathSignContext _localctx = new MathSignContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_mathSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_la = _input.LA(1);
			if ( !(((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (PLUSS - 186)) | (1L << (MINUSS - 186)) | (1L << (DIVIDES - 186)) | (1L << (MULTIPLYS - 186)))) != 0)) ) {
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
		enterRule(_localctx, 158, RULE_spaceArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(693);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(696); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 160, RULE_newLineArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(698);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(701); 
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
		enterRule(_localctx, 162, RULE_brakeArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(705);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(703);
						spaceArg();
						}
						break;
					case NEWLINE:
						{
						setState(704);
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
				setState(707); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 164, RULE_naturalNumberArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
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
		enterRule(_localctx, 166, RULE_totalnumberArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
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

	public static class AnynumberArgContext extends ParserRuleContext {
		public TerminalNode FLOATNUMBER() { return getToken(LynxParser.FLOATNUMBER, 0); }
		public TotalnumberArgContext totalnumberArg() {
			return getRuleContext(TotalnumberArgContext.class,0);
		}
		public AnynumberArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anynumberArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).enterAnynumberArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LynxListener ) ((LynxListener)listener).exitAnynumberArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LynxVisitor ) return ((LynxVisitor<? extends T>)visitor).visitAnynumberArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnynumberArgContext anynumberArg() throws RecognitionException {
		AnynumberArgContext _localctx = new AnynumberArgContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_anynumberArg);
		try {
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(FLOATNUMBER);
				}
				break;
			case NATURALNUMBER:
			case NEGATINATURALNUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				totalnumberArg();
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
		public List<StringArgContext> stringArg() {
			return getRuleContexts(StringArgContext.class);
		}
		public StringArgContext stringArg(int i) {
			return getRuleContext(StringArgContext.class,i);
		}
		public List<MathStatmentContext> mathStatment() {
			return getRuleContexts(MathStatmentContext.class);
		}
		public MathStatmentContext mathStatment(int i) {
			return getRuleContext(MathStatmentContext.class,i);
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
		enterRule(_localctx, 170, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__0);
			setState(723); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(723);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OTHERWORD:
					case WHITESPACE:
					case NEWLINE:
						{
						setState(719);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITESPACE || _la==NEWLINE) {
							{
							setState(718);
							brakeArg();
							}
						}

						setState(721);
						stringArg();
						}
						break;
					case T__4:
					case ABS:
					case ARCTAN:
					case COS:
					case DIFFERENCE:
					case EXP:
					case INT:
					case LN:
					case LOG:
					case MINUS:
					case PI:
					case POWER:
					case PRODUCT:
					case QUOTIENT:
					case RANDOM:
					case REMAINDER:
					case ROUND:
					case SIN:
					case SQRT:
					case SUM:
					case TAN:
					case NATURALNUMBER:
					case NEGATINATURALNUMBER:
					case FLOATNUMBER:
						{
						setState(722);
						mathStatment();
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
				setState(725); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE || _la==NEWLINE) {
				{
				setState(727);
				brakeArg();
				}
			}

			setState(730);
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
		enterRule(_localctx, 172, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
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
		enterRule(_localctx, 174, RULE_endFileArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ca\u02e3\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\6\2\u00b4\n\2\r\2\16\2\u00b5\3\2\3"+
		"\2\3\3\5\3\u00bb\n\3\3\3\5\3\u00be\n\3\3\3\3\3\5\3\u00c2\n\3\6\3\u00c4"+
		"\n\3\r\3\16\3\u00c5\3\3\5\3\u00c9\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0111\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0119\n\5\3\5\6\5\u011c\n\5\r\5\16\5\u011d\3\5\5\5\u0121\n"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01fd\n\60\3\60\3\60\5\60\u0201\n"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u020b\n\61\3\61\3\61"+
		"\5\61\u020f\n\61\3\61\3\61\3\61\3\61\5\61\u0215\n\61\3\61\3\61\5\61\u0219"+
		"\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\5J\u025d\nJ\3K\3K\5K\u0261\nK\3K\3"+
		"K\5K\u0265\nK\6K\u0267\nK\rK\16K\u0268\5K\u026b\nK\3K\3K\3L\3L\3L\5L\u0272"+
		"\nL\3L\3L\5L\u0276\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\5L\u028f\nL\3M\3M\5M\u0293\nM\3M\3M\5M\u0297\nM"+
		"\6M\u0299\nM\rM\16M\u029a\5M\u029d\nM\3M\3M\3M\5M\u02a2\nM\3N\3N\5N\u02a6"+
		"\nN\3N\3N\5N\u02aa\nN\3N\3N\3N\3N\3N\3N\5N\u02b2\nN\3O\3O\3P\3P\3Q\6Q"+
		"\u02b9\nQ\rQ\16Q\u02ba\3R\6R\u02be\nR\rR\16R\u02bf\3S\3S\6S\u02c4\nS\r"+
		"S\16S\u02c5\3T\3T\3U\3U\3V\3V\5V\u02ce\nV\3W\3W\5W\u02d2\nW\3W\3W\6W\u02d6"+
		"\nW\rW\16W\u02d7\3W\5W\u02db\nW\3W\3W\3X\3X\3Y\3Y\3Y\2\2Z\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\2\5\3\2\u00c0\u00c4\3\2\u00bc\u00bf\3\2\u00c5"+
		"\u00c6\2\u0310\2\u00b3\3\2\2\2\4\u00ba\3\2\2\2\6\u0110\3\2\2\2\b\u0112"+
		"\3\2\2\2\n\u0124\3\2\2\2\f\u0128\3\2\2\2\16\u0130\3\2\2\2\20\u0134\3\2"+
		"\2\2\22\u0138\3\2\2\2\24\u013c\3\2\2\2\26\u0140\3\2\2\2\30\u0144\3\2\2"+
		"\2\32\u0148\3\2\2\2\34\u014c\3\2\2\2\36\u0150\3\2\2\2 \u0154\3\2\2\2\""+
		"\u0158\3\2\2\2$\u015c\3\2\2\2&\u0160\3\2\2\2(\u0164\3\2\2\2*\u0168\3\2"+
		"\2\2,\u016c\3\2\2\2.\u0170\3\2\2\2\60\u0174\3\2\2\2\62\u0178\3\2\2\2\64"+
		"\u017c\3\2\2\2\66\u0180\3\2\2\28\u0184\3\2\2\2:\u0188\3\2\2\2<\u018c\3"+
		"\2\2\2>\u0190\3\2\2\2@\u019c\3\2\2\2B\u01a2\3\2\2\2D\u01a8\3\2\2\2F\u01ae"+
		"\3\2\2\2H\u01b4\3\2\2\2J\u01ba\3\2\2\2L\u01c0\3\2\2\2N\u01c6\3\2\2\2P"+
		"\u01cc\3\2\2\2R\u01d2\3\2\2\2T\u01d8\3\2\2\2V\u01de\3\2\2\2X\u01e4\3\2"+
		"\2\2Z\u01ea\3\2\2\2\\\u01f0\3\2\2\2^\u01f6\3\2\2\2`\u0204\3\2\2\2b\u021c"+
		"\3\2\2\2d\u0220\3\2\2\2f\u0226\3\2\2\2h\u0228\3\2\2\2j\u022a\3\2\2\2l"+
		"\u022c\3\2\2\2n\u022e\3\2\2\2p\u0230\3\2\2\2r\u0232\3\2\2\2t\u0234\3\2"+
		"\2\2v\u0236\3\2\2\2x\u0238\3\2\2\2z\u023a\3\2\2\2|\u023c\3\2\2\2~\u023e"+
		"\3\2\2\2\u0080\u0240\3\2\2\2\u0082\u0242\3\2\2\2\u0084\u0244\3\2\2\2\u0086"+
		"\u0246\3\2\2\2\u0088\u0248\3\2\2\2\u008a\u024a\3\2\2\2\u008c\u024c\3\2"+
		"\2\2\u008e\u024e\3\2\2\2\u0090\u0250\3\2\2\2\u0092\u0254\3\2\2\2\u0094"+
		"\u026a\3\2\2\2\u0096\u028e\3\2\2\2\u0098\u02a1\3\2\2\2\u009a\u02b1\3\2"+
		"\2\2\u009c\u02b3\3\2\2\2\u009e\u02b5\3\2\2\2\u00a0\u02b8\3\2\2\2\u00a2"+
		"\u02bd\3\2\2\2\u00a4\u02c3\3\2\2\2\u00a6\u02c7\3\2\2\2\u00a8\u02c9\3\2"+
		"\2\2\u00aa\u02cd\3\2\2\2\u00ac\u02cf\3\2\2\2\u00ae\u02de\3\2\2\2\u00b0"+
		"\u02e0\3\2\2\2\u00b2\u00b4\5\4\3\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\5\u00b0Y\2\u00b8\3\3\2\2\2\u00b9\u00bb\5\u00a4S\2\u00ba\u00b9\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c3\3\2\2\2\u00bc\u00be\5\u00a0Q\2"+
		"\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\5\6\4\2\u00c0\u00c2\5\u00a0Q\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2"+
		"\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\5\u00a4S"+
		"\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\5\3\2\2\2\u00ca\u0111"+
		"\5\f\7\2\u00cb\u0111\5\b\5\2\u00cc\u0111\5\n\6\2\u00cd\u0111\5\20\t\2"+
		"\u00ce\u0111\5\16\b\2\u00cf\u0111\5\22\n\2\u00d0\u0111\5\24\13\2\u00d1"+
		"\u0111\5\26\f\2\u00d2\u0111\5\30\r\2\u00d3\u0111\5\32\16\2\u00d4\u0111"+
		"\5> \2\u00d5\u0111\5@!\2\u00d6\u0111\5B\"\2\u00d7\u0111\5J&\2\u00d8\u0111"+
		"\5f\64\2\u00d9\u0111\5h\65\2\u00da\u0111\5j\66\2\u00db\u0111\5l\67\2\u00dc"+
		"\u0111\5n8\2\u00dd\u0111\5\36\20\2\u00de\u0111\5\34\17\2\u00df\u0111\5"+
		" \21\2\u00e0\u0111\5\"\22\2\u00e1\u0111\5$\23\2\u00e2\u0111\5&\24\2\u00e3"+
		"\u0111\5(\25\2\u00e4\u0111\5*\26\2\u00e5\u0111\5,\27\2\u00e6\u0111\5."+
		"\30\2\u00e7\u0111\5\60\31\2\u00e8\u0111\5\62\32\2\u00e9\u0111\5\64\33"+
		"\2\u00ea\u0111\5L\'\2\u00eb\u0111\5N(\2\u00ec\u0111\5P)\2\u00ed\u0111"+
		"\5R*\2\u00ee\u0111\5T+\2\u00ef\u0111\5V,\2\u00f0\u0111\5X-\2\u00f1\u0111"+
		"\5Z.\2\u00f2\u0111\5t;\2\u00f3\u0111\5D#\2\u00f4\u0111\5F$\2\u00f5\u0111"+
		"\5H%\2\u00f6\u0111\5p9\2\u00f7\u0111\5r:\2\u00f8\u0111\5\u0090I\2\u00f9"+
		"\u0111\5\u0092J\2\u00fa\u0111\5^\60\2\u00fb\u0111\5`\61\2\u00fc\u0111"+
		"\5b\62\2\u00fd\u0111\5d\63\2\u00fe\u0111\5\\/\2\u00ff\u0111\5v<\2\u0100"+
		"\u0111\5x=\2\u0101\u0111\5z>\2\u0102\u0111\5|?\2\u0103\u0111\5~@\2\u0104"+
		"\u0111\5\u0080A\2\u0105\u0111\5\u0082B\2\u0106\u0111\5\66\34\2\u0107\u0111"+
		"\5\u0084C\2\u0108\u0111\5\u0086D\2\u0109\u0111\5\u0088E\2\u010a\u0111"+
		"\5\u008aF\2\u010b\u0111\5<\37\2\u010c\u0111\58\35\2\u010d\u0111\5:\36"+
		"\2\u010e\u0111\5\u008cG\2\u010f\u0111\5\u008eH\2\u0110\u00ca\3\2\2\2\u0110"+
		"\u00cb\3\2\2\2\u0110\u00cc\3\2\2\2\u0110\u00cd\3\2\2\2\u0110\u00ce\3\2"+
		"\2\2\u0110\u00cf\3\2\2\2\u0110\u00d0\3\2\2\2\u0110\u00d1\3\2\2\2\u0110"+
		"\u00d2\3\2\2\2\u0110\u00d3\3\2\2\2\u0110\u00d4\3\2\2\2\u0110\u00d5\3\2"+
		"\2\2\u0110\u00d6\3\2\2\2\u0110\u00d7\3\2\2\2\u0110\u00d8\3\2\2\2\u0110"+
		"\u00d9\3\2\2\2\u0110\u00da\3\2\2\2\u0110\u00db\3\2\2\2\u0110\u00dc\3\2"+
		"\2\2\u0110\u00dd\3\2\2\2\u0110\u00de\3\2\2\2\u0110\u00df\3\2\2\2\u0110"+
		"\u00e0\3\2\2\2\u0110\u00e1\3\2\2\2\u0110\u00e2\3\2\2\2\u0110\u00e3\3\2"+
		"\2\2\u0110\u00e4\3\2\2\2\u0110\u00e5\3\2\2\2\u0110\u00e6\3\2\2\2\u0110"+
		"\u00e7\3\2\2\2\u0110\u00e8\3\2\2\2\u0110\u00e9\3\2\2\2\u0110\u00ea\3\2"+
		"\2\2\u0110\u00eb\3\2\2\2\u0110\u00ec\3\2\2\2\u0110\u00ed\3\2\2\2\u0110"+
		"\u00ee\3\2\2\2\u0110\u00ef\3\2\2\2\u0110\u00f0\3\2\2\2\u0110\u00f1\3\2"+
		"\2\2\u0110\u00f2\3\2\2\2\u0110\u00f3\3\2\2\2\u0110\u00f4\3\2\2\2\u0110"+
		"\u00f5\3\2\2\2\u0110\u00f6\3\2\2\2\u0110\u00f7\3\2\2\2\u0110\u00f8\3\2"+
		"\2\2\u0110\u00f9\3\2\2\2\u0110\u00fa\3\2\2\2\u0110\u00fb\3\2\2\2\u0110"+
		"\u00fc\3\2\2\2\u0110\u00fd\3\2\2\2\u0110\u00fe\3\2\2\2\u0110\u00ff\3\2"+
		"\2\2\u0110\u0100\3\2\2\2\u0110\u0101\3\2\2\2\u0110\u0102\3\2\2\2\u0110"+
		"\u0103\3\2\2\2\u0110\u0104\3\2\2\2\u0110\u0105\3\2\2\2\u0110\u0106\3\2"+
		"\2\2\u0110\u0107\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u0109\3\2\2\2\u0110"+
		"\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\7\3\2\2\2\u0112\u0113"+
		"\7\u00ba\2\2\u0113\u0114\5\u00a4S\2\u0114\u0115\5\u00aeX\2\u0115\u0116"+
		"\5\u00a4S\2\u0116\u0118\7\3\2\2\u0117\u0119\5\u00a4S\2\u0118\u0117\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5\4\3\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u0121\5\u00a4S\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\4\2\2\u0123\t\3\2\2\2"+
		"\u0124\u0125\7\u00bb\2\2\u0125\u0126\5\u00a4S\2\u0126\u0127\5\u00aeX\2"+
		"\u0127\13\3\2\2\2\u0128\u0129\7\u00b4\2\2\u0129\u012a\5\u00a4S\2\u012a"+
		"\u012b\5\u00a6T\2\u012b\u012c\5\u00a4S\2\u012c\u012d\7\3\2\2\u012d\u012e"+
		"\5\4\3\2\u012e\u012f\7\4\2\2\u012f\r\3\2\2\2\u0130\u0131\7\t\2\2\u0131"+
		"\u0132\5\u00a4S\2\u0132\u0133\5\u0094K\2\u0133\17\3\2\2\2\u0134\u0135"+
		"\7\13\2\2\u0135\u0136\5\u00a4S\2\u0136\u0137\5\u0094K\2\u0137\21\3\2\2"+
		"\2\u0138\u0139\7\17\2\2\u0139\u013a\5\u00a4S\2\u013a\u013b\5\u0094K\2"+
		"\u013b\23\3\2\2\2\u013c\u013d\7\21\2\2\u013d\u013e\5\u00a4S\2\u013e\u013f"+
		"\5\u0094K\2\u013f\25\3\2\2\2\u0140\u0141\7\22\2\2\u0141\u0142\5\u00a4"+
		"S\2\u0142\u0143\5\u0094K\2\u0143\27\3\2\2\2\u0144\u0145\7\24\2\2\u0145"+
		"\u0146\5\u00a4S\2\u0146\u0147\5\u0094K\2\u0147\31\3\2\2\2\u0148\u0149"+
		"\7\25\2\2\u0149\u014a\5\u00a4S\2\u014a\u014b\5\u0094K\2\u014b\33\3\2\2"+
		"\2\u014c\u014d\7j\2\2\u014d\u014e\5\u00a4S\2\u014e\u014f\5\u0094K\2\u014f"+
		"\35\3\2\2\2\u0150\u0151\7k\2\2\u0151\u0152\5\u00a4S\2\u0152\u0153\5\u0094"+
		"K\2\u0153\37\3\2\2\2\u0154\u0155\7l\2\2\u0155\u0156\5\u00a4S\2\u0156\u0157"+
		"\5\u0094K\2\u0157!\3\2\2\2\u0158\u0159\7n\2\2\u0159\u015a\5\u00a4S\2\u015a"+
		"\u015b\5\u0094K\2\u015b#\3\2\2\2\u015c\u015d\7p\2\2\u015d\u015e\5\u00a4"+
		"S\2\u015e\u015f\5\u0094K\2\u015f%\3\2\2\2\u0160\u0161\7r\2\2\u0161\u0162"+
		"\5\u00a4S\2\u0162\u0163\5\u0094K\2\u0163\'\3\2\2\2\u0164\u0165\7s\2\2"+
		"\u0165\u0166\5\u00a4S\2\u0166\u0167\5\u0094K\2\u0167)\3\2\2\2\u0168\u0169"+
		"\7t\2\2\u0169\u016a\5\u00a4S\2\u016a\u016b\5\u0094K\2\u016b+\3\2\2\2\u016c"+
		"\u016d\7y\2\2\u016d\u016e\5\u00a4S\2\u016e\u016f\5\u0094K\2\u016f-\3\2"+
		"\2\2\u0170\u0171\7{\2\2\u0171\u0172\5\u00a4S\2\u0172\u0173\5\u0094K\2"+
		"\u0173/\3\2\2\2\u0174\u0175\7|\2\2\u0175\u0176\5\u00a4S\2\u0176\u0177"+
		"\5\u0094K\2\u0177\61\3\2\2\2\u0178\u0179\7}\2\2\u0179\u017a\5\u00a4S\2"+
		"\u017a\u017b\5\u0094K\2\u017b\63\3\2\2\2\u017c\u017d\7\177\2\2\u017d\u017e"+
		"\5\u00a4S\2\u017e\u017f\5\u0094K\2\u017f\65\3\2\2\2\u0180\u0181\7 \2\2"+
		"\u0181\u0182\5\u00a4S\2\u0182\u0183\5\u0094K\2\u0183\67\3\2\2\2\u0184"+
		"\u0185\7&\2\2\u0185\u0186\5\u00a4S\2\u0186\u0187\5\u0094K\2\u01879\3\2"+
		"\2\2\u0188\u0189\7\'\2\2\u0189\u018a\5\u00a4S\2\u018a\u018b\5\u0094K\2"+
		"\u018b;\3\2\2\2\u018c\u018d\7%\2\2\u018d\u018e\5\u00a4S\2\u018e\u018f"+
		"\5\u0094K\2\u018f=\3\2\2\2\u0190\u0191\7\23\2\2\u0191\u0192\5\u00a4S\2"+
		"\u0192\u0193\7\3\2\2\u0193\u0194\5\u00a4S\2\u0194\u0195\5\u00a8U\2\u0195"+
		"\u0196\5\u00a4S\2\u0196\u0197\7\5\2\2\u0197\u0198\5\u00a4S\2\u0198\u0199"+
		"\5\u00a8U\2\u0199\u019a\5\u00a4S\2\u019a\u019b\7\4\2\2\u019b?\3\2\2\2"+
		"\u019c\u019d\7\n\2\2\u019d\u019e\5\u00a4S\2\u019e\u019f\7\6\2\2\u019f"+
		"\u01a0\5\u00aeX\2\u01a0\u01a1\7\6\2\2\u01a1A\3\2\2\2\u01a2\u01a3\7\26"+
		"\2\2\u01a3\u01a4\5\u00a4S\2\u01a4\u01a5\7\6\2\2\u01a5\u01a6\5\u00aeX\2"+
		"\u01a6\u01a7\7\6\2\2\u01a7C\3\2\2\2\u01a8\u01a9\7\u008e\2\2\u01a9\u01aa"+
		"\5\u00a4S\2\u01aa\u01ab\7\6\2\2\u01ab\u01ac\5\u00aeX\2\u01ac\u01ad\7\6"+
		"\2\2\u01adE\3\2\2\2\u01ae\u01af\7\u0092\2\2\u01af\u01b0\5\u00a4S\2\u01b0"+
		"\u01b1\7\6\2\2\u01b1\u01b2\5\u00aeX\2\u01b2\u01b3\7\6\2\2\u01b3G\3\2\2"+
		"\2\u01b4\u01b5\7\u0094\2\2\u01b5\u01b6\5\u00a4S\2\u01b6\u01b7\7\6\2\2"+
		"\u01b7\u01b8\5\u00aeX\2\u01b8\u01b9\7\6\2\2\u01b9I\3\2\2\2\u01ba\u01bb"+
		"\7\f\2\2\u01bb\u01bc\5\u00a4S\2\u01bc\u01bd\5\u00a8U\2\u01bd\u01be\5\u00a4"+
		"S\2\u01be\u01bf\5\u00a8U\2\u01bfK\3\2\2\2\u01c0\u01c1\7m\2\2\u01c1\u01c2"+
		"\5\u00a4S\2\u01c2\u01c3\5\u0094K\2\u01c3\u01c4\5\u00a4S\2\u01c4\u01c5"+
		"\5\u0094K\2\u01c5M\3\2\2\2\u01c6\u01c7\7o\2\2\u01c7\u01c8\5\u00a4S\2\u01c8"+
		"\u01c9\5\u0094K\2\u01c9\u01ca\5\u00a4S\2\u01ca\u01cb\5\u0094K\2\u01cb"+
		"O\3\2\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\5\u00a4S\2\u01ce\u01cf\5\u0094"+
		"K\2\u01cf\u01d0\5\u00a4S\2\u01d0\u01d1\5\u0094K\2\u01d1Q\3\2\2\2\u01d2"+
		"\u01d3\7v\2\2\u01d3\u01d4\5\u00a4S\2\u01d4\u01d5\5\u0094K\2\u01d5\u01d6"+
		"\5\u00a4S\2\u01d6\u01d7\5\u0094K\2\u01d7S\3\2\2\2\u01d8\u01d9\7w\2\2\u01d9"+
		"\u01da\5\u00a4S\2\u01da\u01db\5\u0094K\2\u01db\u01dc\5\u00a4S\2\u01dc"+
		"\u01dd\5\u0094K\2\u01ddU\3\2\2\2\u01de\u01df\7x\2\2\u01df\u01e0\5\u00a4"+
		"S\2\u01e0\u01e1\5\u0094K\2\u01e1\u01e2\5\u00a4S\2\u01e2\u01e3\5\u0094"+
		"K\2\u01e3W\3\2\2\2\u01e4\u01e5\7z\2\2\u01e5\u01e6\5\u00a4S\2\u01e6\u01e7"+
		"\5\u0094K\2\u01e7\u01e8\5\u00a4S\2\u01e8\u01e9\5\u0094K\2\u01e9Y\3\2\2"+
		"\2\u01ea\u01eb\7~\2\2\u01eb\u01ec\5\u00a4S\2\u01ec\u01ed\5\u0094K\2\u01ed"+
		"\u01ee\5\u00a4S\2\u01ee\u01ef\5\u0094K\2\u01ef[\3\2\2\2\u01f0\u01f1\7"+
		"\u009b\2\2\u01f1\u01f2\5\u00a4S\2\u01f2\u01f3\5\u0098M\2\u01f3\u01f4\5"+
		"\u00a4S\2\u01f4\u01f5\5\u0098M\2\u01f5]\3\2\2\2\u01f6\u01f7\7\u009c\2"+
		"\2\u01f7\u01f8\5\u00a4S\2\u01f8\u01f9\5\u0098M\2\u01f9\u01fa\5\u00a4S"+
		"\2\u01fa\u01fc\7\3\2\2\u01fb\u01fd\5\u00a4S\2\u01fc\u01fb\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\5\4\3\2\u01ff\u0201\5\u00a4"+
		"S\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\7\4\2\2\u0203_\3\2\2\2\u0204\u0205\7\u009d\2\2\u0205\u0206\5\u00a4"+
		"S\2\u0206\u0207\5\u0098M\2\u0207\u0208\5\u00a4S\2\u0208\u020a\7\3\2\2"+
		"\u0209\u020b\5\u00a4S\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020e\5\4\3\2\u020d\u020f\5\u00a4S\2\u020e\u020d"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7\4\2\2\u0211"+
		"\u0212\5\u00a4S\2\u0212\u0214\7\3\2\2\u0213\u0215\5\u00a4S\2\u0214\u0213"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\5\4\3\2\u0217"+
		"\u0219\5\u00a4S\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021b\7\4\2\2\u021ba\3\2\2\2\u021c\u021d\7\u009e\2\2\u021d"+
		"\u021e\5\u00a4S\2\u021e\u021f\5\u0098M\2\u021fc\3\2\2\2\u0220\u0221\7"+
		"\u009f\2\2\u0221\u0222\5\u00a4S\2\u0222\u0223\5\u0098M\2\u0223\u0224\5"+
		"\u00a4S\2\u0224\u0225\5\u0098M\2\u0225e\3\2\2\2\u0226\u0227\7\r\2\2\u0227"+
		"g\3\2\2\2\u0228\u0229\7\16\2\2\u0229i\3\2\2\2\u022a\u022b\7\20\2\2\u022b"+
		"k\3\2\2\2\u022c\u022d\7\27\2\2\u022dm\3\2\2\2\u022e\u022f\7\30\2\2\u022f"+
		"o\3\2\2\2\u0230\u0231\7\u008f\2\2\u0231q\3\2\2\2\u0232\u0233\7\u0093\2"+
		"\2\u0233s\3\2\2\2\u0234\u0235\7u\2\2\u0235u\3\2\2\2\u0236\u0237\7\31\2"+
		"\2\u0237w\3\2\2\2\u0238\u0239\7\32\2\2\u0239y\3\2\2\2\u023a\u023b\7\33"+
		"\2\2\u023b{\3\2\2\2\u023c\u023d\7\34\2\2\u023d}\3\2\2\2\u023e\u023f\7"+
		"\35\2\2\u023f\177\3\2\2\2\u0240\u0241\7\36\2\2\u0241\u0081\3\2\2\2\u0242"+
		"\u0243\7\37\2\2\u0243\u0083\3\2\2\2\u0244\u0245\7!\2\2\u0245\u0085\3\2"+
		"\2\2\u0246\u0247\7\"\2\2\u0247\u0087\3\2\2\2\u0248\u0249\7#\2\2\u0249"+
		"\u0089\3\2\2\2\u024a\u024b\7$\2\2\u024b\u008b\3\2\2\2\u024c\u024d\7(\2"+
		"\2\u024d\u008d\3\2\2\2\u024e\u024f\7)\2\2\u024f\u008f\3\2\2\2\u0250\u0251"+
		"\7\u0090\2\2\u0251\u0252\5\u00a4S\2\u0252\u0253\5\u00acW\2\u0253\u0091"+
		"\3\2\2\2\u0254\u0255\7\u0091\2\2\u0255\u0256\5\u00a4S\2\u0256\u0257\7"+
		"\6\2\2\u0257\u0258\5\u00aeX\2\u0258\u0259\7\6\2\2\u0259\u025c\5\u00a4"+
		"S\2\u025a\u025d\7h\2\2\u025b\u025d\5\u00acW\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025b\3\2\2\2\u025d\u0093\3\2\2\2\u025e\u0260\5\u0096L\2\u025f\u0261"+
		"\5\u00a4S\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2"+
		"\2\u0262\u0264\5\u009eP\2\u0263\u0265\5\u00a4S\2\u0264\u0263\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u025e\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0266\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\5\u0096"+
		"L\2\u026d\u0095\3\2\2\2\u026e\u028f\5\u00aaV\2\u026f\u0271\7\7\2\2\u0270"+
		"\u0272\5\u00a4S\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u0275\5\u0094K\2\u0274\u0276\5\u00a4S\2\u0275\u0274\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\b\2\2\u0278"+
		"\u028f\3\2\2\2\u0279\u028f\5\34\17\2\u027a\u028f\5\36\20\2\u027b\u028f"+
		"\5 \21\2\u027c\u028f\5\"\22\2\u027d\u028f\5$\23\2\u027e\u028f\5&\24\2"+
		"\u027f\u028f\5(\25\2\u0280\u028f\5*\26\2\u0281\u028f\5t;\2\u0282\u028f"+
		"\5R*\2\u0283\u028f\5T+\2\u0284\u028f\5V,\2\u0285\u028f\5,\27\2\u0286\u028f"+
		"\5X-\2\u0287\u028f\5.\30\2\u0288\u028f\5\60\31\2\u0289\u028f\5\62\32\2"+
		"\u028a\u028f\5Z.\2\u028b\u028f\5Z.\2\u028c\u028f\5\64\33\2\u028d\u028f"+
		"\5L\'\2\u028e\u026e\3\2\2\2\u028e\u026f\3\2\2\2\u028e\u0279\3\2\2\2\u028e"+
		"\u027a\3\2\2\2\u028e\u027b\3\2\2\2\u028e\u027c\3\2\2\2\u028e\u027d\3\2"+
		"\2\2\u028e\u027e\3\2\2\2\u028e\u027f\3\2\2\2\u028e\u0280\3\2\2\2\u028e"+
		"\u0281\3\2\2\2\u028e\u0282\3\2\2\2\u028e\u0283\3\2\2\2\u028e\u0284\3\2"+
		"\2\2\u028e\u0285\3\2\2\2\u028e\u0286\3\2\2\2\u028e\u0287\3\2\2\2\u028e"+
		"\u0288\3\2\2\2\u028e\u0289\3\2\2\2\u028e\u028a\3\2\2\2\u028e\u028b\3\2"+
		"\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028f\u0097\3\2\2\2\u0290"+
		"\u0292\5\u009aN\2\u0291\u0293\5\u00a4S\2\u0292\u0291\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\5\u009cO\2\u0295\u0297\5\u00a4"+
		"S\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298"+
		"\u0290\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029d\3\2\2\2\u029c\u0298\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u02a2\5\u009aN\2\u029f\u02a2\5N(\2\u02a0\u02a2\5"+
		"P)\2\u02a1\u029c\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u0099\3\2\2\2\u02a3\u02a5\7\7\2\2\u02a4\u02a6\5\u00a4S\2\u02a5\u02a4"+
		"\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\5\u0098M"+
		"\2\u02a8\u02aa\5\u00a4S\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ac\7\b\2\2\u02ac\u02b2\3\2\2\2\u02ad\u02b2\5\u0096"+
		"L\2\u02ae\u02b2\5\\/\2\u02af\u02b2\5d\63\2\u02b0\u02b2\5b\62\2\u02b1\u02a3"+
		"\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b2\u009b\3\2\2\2\u02b3\u02b4\t\2\2\2\u02b4\u009d\3\2"+
		"\2\2\u02b5\u02b6\t\3\2\2\u02b6\u009f\3\2\2\2\u02b7\u02b9\7\u00c9\2\2\u02b8"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u00a1\3\2\2\2\u02bc\u02be\7\u00ca\2\2\u02bd\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u00a3\3\2"+
		"\2\2\u02c1\u02c4\5\u00a0Q\2\u02c2\u02c4\5\u00a2R\2\u02c3\u02c1\3\2\2\2"+
		"\u02c3\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u00a5\3\2\2\2\u02c7\u02c8\7\u00c5\2\2\u02c8\u00a7\3\2\2"+
		"\2\u02c9\u02ca\t\4\2\2\u02ca\u00a9\3\2\2\2\u02cb\u02ce\7\u00c7\2\2\u02cc"+
		"\u02ce\5\u00a8U\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u00ab"+
		"\3\2\2\2\u02cf\u02d5\7\3\2\2\u02d0\u02d2\5\u00a4S\2\u02d1\u02d0\3\2\2"+
		"\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d6\5\u00aeX\2\u02d4"+
		"\u02d6\5\u0094K\2\u02d5\u02d1\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7"+
		"\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9"+
		"\u02db\5\u00a4S\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02dd\7\4\2\2\u02dd\u00ad\3\2\2\2\u02de\u02df\7\u00c8\2"+
		"\2\u02df\u00af\3\2\2\2\u02e0\u02e1\7\2\2\3\u02e1\u00b1\3\2\2\2+\u00b5"+
		"\u00ba\u00bd\u00c1\u00c5\u00c8\u0110\u0118\u011d\u0120\u01fc\u0200\u020a"+
		"\u020e\u0214\u0218\u025c\u0260\u0264\u0268\u026a\u0271\u0275\u028e\u0292"+
		"\u0296\u029a\u029c\u02a1\u02a5\u02a9\u02b1\u02ba\u02bf\u02c3\u02c5\u02cd"+
		"\u02d1\u02d5\u02d7\u02da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}