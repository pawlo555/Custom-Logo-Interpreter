// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/com.grammar\Logo.g4 by ANTLR 4.9.2
package com.grammar;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SPECIAL_WORD=8, 
		BACK=9, FORWARD=10, HOME=11, LEFT=12, RIGHT=13, CLEAN=14, PD=15, PU=16, 
		SETPENSIZE=17, SETCOLOR=18, ABS=19, ARCTAN=20, COS=21, DIFFERENCE=22, 
		EXP=23, INT=24, LN=25, LOG=26, MINUS=27, PI=28, POWER=29, PRODUCT=30, 
		QUOTIENT=31, RANDOM=32, REMAINDER=33, ROUND=34, SIN=35, SQRT=36, SUM=37, 
		TAN=38, COMPARISONEQUALS=39, COMPARISONBIGGER=40, COMPARISONSMALLER=41, 
		COMPARISONSMALLEREQUALS=42, COMPARISONBIGGEREQUALS=43, NEWTURTLE=44, RENAME=45, 
		REMOVE=46, CHANGETURTLE=47, SET=48, LET=49, ASSIGN=50, AND=51, IF=52, 
		IFELSE=53, NOT=54, OR=55, REPEAT=56, WHILE=57, PROCEDURE=58, CALL=59, 
		DIVISION=60, COMMENTBRACKET=61, NATURALNUMBER=62, FLOATNUMBER=63, BOOLEAN=64, 
		OTHERWORD=65, WHITESPACE=66, NEWLINE=67;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_cmd = 2, RULE_mathStatement = 3, 
		RULE_mathSentence = 4, RULE_mathValue = 5, RULE_singleArgMathOperator = 6, 
		RULE_doubleArgMathOperator = 7, RULE_comment = 8, RULE_acction = 9, RULE_stringArg = 10, 
		RULE_variableName = 11, RULE_procedure = 12, RULE_procedureCall = 13, 
		RULE_repeat = 14, RULE_while1 = 15, RULE_back = 16, RULE_forward = 17, 
		RULE_left = 18, RULE_right = 19, RULE_setcolor = 20, RULE_setpensize = 21, 
		RULE_newTurtle = 22, RULE_rename = 23, RULE_changeTurtle = 24, RULE_removeTurtle = 25, 
		RULE_ifc = 26, RULE_ifElse = 27, RULE_home = 28, RULE_clean = 29, RULE_pd = 30, 
		RULE_pu = 31, RULE_let = 32, RULE_assign = 33, RULE_spaceArg = 34, RULE_newLineArg = 35, 
		RULE_brakeArg = 36, RULE_endFileArg = 37, RULE_commandsList = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "cmd", "mathStatement", "mathSentence", "mathValue", 
			"singleArgMathOperator", "doubleArgMathOperator", "comment", "acction", 
			"stringArg", "variableName", "procedure", "procedureCall", "repeat", 
			"while1", "back", "forward", "left", "right", "setcolor", "setpensize", 
			"newTurtle", "rename", "changeTurtle", "removeTurtle", "ifc", "ifElse", 
			"home", "clean", "pd", "pu", "let", "assign", "spaceArg", "newLineArg", 
			"brakeArg", "endFileArg", "commandsList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "']'", "'{'", "'}'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'!='", 
			null, null, null, null, "'-'", null, null, "'*'", null, null, null, null, 
			null, null, "'+'", null, "'=='", "'>'", "'<'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'/'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SPECIAL_WORD", "BACK", 
			"FORWARD", "HOME", "LEFT", "RIGHT", "CLEAN", "PD", "PU", "SETPENSIZE", 
			"SETCOLOR", "ABS", "ARCTAN", "COS", "DIFFERENCE", "EXP", "INT", "LN", 
			"LOG", "MINUS", "PI", "POWER", "PRODUCT", "QUOTIENT", "RANDOM", "REMAINDER", 
			"ROUND", "SIN", "SQRT", "SUM", "TAN", "COMPARISONEQUALS", "COMPARISONBIGGER", 
			"COMPARISONSMALLER", "COMPARISONSMALLEREQUALS", "COMPARISONBIGGEREQUALS", 
			"NEWTURTLE", "RENAME", "REMOVE", "CHANGETURTLE", "SET", "LET", "ASSIGN", 
			"AND", "IF", "IFELSE", "NOT", "OR", "REPEAT", "WHILE", "PROCEDURE", "CALL", 
			"DIVISION", "COMMENTBRACKET", "NATURALNUMBER", "FLOATNUMBER", "BOOLEAN", 
			"OTHERWORD", "WHITESPACE", "NEWLINE"
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
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				line();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (BACK - 9)) | (1L << (FORWARD - 9)) | (1L << (HOME - 9)) | (1L << (LEFT - 9)) | (1L << (RIGHT - 9)) | (1L << (CLEAN - 9)) | (1L << (PD - 9)) | (1L << (PU - 9)) | (1L << (SETPENSIZE - 9)) | (1L << (SETCOLOR - 9)) | (1L << (NEWTURTLE - 9)) | (1L << (RENAME - 9)) | (1L << (REMOVE - 9)) | (1L << (CHANGETURTLE - 9)) | (1L << (LET - 9)) | (1L << (ASSIGN - 9)) | (1L << (IF - 9)) | (1L << (IFELSE - 9)) | (1L << (REPEAT - 9)) | (1L << (WHILE - 9)) | (1L << (PROCEDURE - 9)) | (1L << (CALL - 9)) | (1L << (COMMENTBRACKET - 9)) | (1L << (WHITESPACE - 9)) | (1L << (NEWLINE - 9)))) != 0) );
			setState(83);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(85);
				brakeArg();
				}
				break;
			}
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(88);
						spaceArg();
						}
					}

					setState(91);
					cmd();
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(92);
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
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
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
		public HomeContext home() {
			return getRuleContext(HomeContext.class,0);
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
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public PuContext pu() {
			return getRuleContext(PuContext.class,0);
		}
		public SetcolorContext setcolor() {
			return getRuleContext(SetcolorContext.class,0);
		}
		public SetpensizeContext setpensize() {
			return getRuleContext(SetpensizeContext.class,0);
		}
		public NewTurtleContext newTurtle() {
			return getRuleContext(NewTurtleContext.class,0);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public ChangeTurtleContext changeTurtle() {
			return getRuleContext(ChangeTurtleContext.class,0);
		}
		public RemoveTurtleContext removeTurtle() {
			return getRuleContext(RemoveTurtleContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CleanContext clean() {
			return getRuleContext(CleanContext.class,0);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				repeat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				while1();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				procedure();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				procedureCall();
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				back();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				left();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				right();
				}
				break;
			case HOME:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				home();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				let();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				assign();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				ifc();
				}
				break;
			case IFELSE:
				enterOuterAlt(_localctx, 13);
				{
				setState(114);
				ifElse();
				}
				break;
			case PD:
				enterOuterAlt(_localctx, 14);
				{
				setState(115);
				pd();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 15);
				{
				setState(116);
				pu();
				}
				break;
			case SETCOLOR:
				enterOuterAlt(_localctx, 16);
				{
				setState(117);
				setcolor();
				}
				break;
			case SETPENSIZE:
				enterOuterAlt(_localctx, 17);
				{
				setState(118);
				setpensize();
				}
				break;
			case NEWTURTLE:
				enterOuterAlt(_localctx, 18);
				{
				setState(119);
				newTurtle();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 19);
				{
				setState(120);
				rename();
				}
				break;
			case CHANGETURTLE:
				enterOuterAlt(_localctx, 20);
				{
				setState(121);
				changeTurtle();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 21);
				{
				setState(122);
				removeTurtle();
				}
				break;
			case COMMENTBRACKET:
				enterOuterAlt(_localctx, 22);
				{
				setState(123);
				comment();
				}
				break;
			case CLEAN:
				enterOuterAlt(_localctx, 23);
				{
				setState(124);
				clean();
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
			setState(127);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new BraketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(130);
				match(T__0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(131);
					brakeArg();
					}
				}

				setState(134);
				mathSentence(0);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(135);
					brakeArg();
					}
				}

				setState(138);
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
				setState(140);
				singleArgMathOperator();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(141);
					brakeArg();
					}
				}

				setState(144);
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
				setState(146);
				mathValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
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
					setState(149);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(150);
						brakeArg();
						}
					}

					setState(153);
					doubleArgMathOperator();
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE || _la==NEWLINE) {
						{
						setState(154);
						brakeArg();
						}
					}

					setState(157);
					mathSentence(4);
					}
					} 
				}
				setState(163);
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
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(FLOATNUMBER);
				}
				break;
			case NATURALNUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(NATURALNUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(BOOLEAN);
				}
				break;
			case T__2:
			case SPECIAL_WORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				_localctx = new AbsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ABS);
				}
				break;
			case ARCTAN:
				_localctx = new ArctanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(ARCTAN);
				}
				break;
			case COS:
				_localctx = new CosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(COS);
				}
				break;
			case INT:
				_localctx = new Int1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(INT);
				}
				break;
			case LN:
				_localctx = new LnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(LN);
				}
				break;
			case MINUS:
				_localctx = new MinusSingleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(MINUS);
				}
				break;
			case RANDOM:
				_localctx = new RandomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(RANDOM);
				}
				break;
			case ROUND:
				_localctx = new RoundContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				match(ROUND);
				}
				break;
			case SIN:
				_localctx = new SinContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				match(SIN);
				}
				break;
			case SQRT:
				_localctx = new SqrtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				match(SQRT);
				}
				break;
			case TAN:
				_localctx = new TanContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(180);
				match(TAN);
				}
				break;
			case NOT:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(181);
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
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFFERENCE:
				_localctx = new DifferenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(DIFFERENCE);
				}
				break;
			case POWER:
				_localctx = new PowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(POWER);
				}
				break;
			case QUOTIENT:
				_localctx = new QuotientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(QUOTIENT);
				}
				break;
			case REMAINDER:
				_localctx = new RemainderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(REMAINDER);
				}
				break;
			case SUM:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(SUM);
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(MINUS);
				}
				break;
			case PRODUCT:
				_localctx = new ProductContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(PRODUCT);
				}
				break;
			case DIVISION:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				match(DIVISION);
				}
				break;
			case COMPARISONEQUALS:
				_localctx = new ComparisonEqualsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				match(COMPARISONEQUALS);
				}
				break;
			case COMPARISONBIGGER:
				_localctx = new ComparisonBiggerContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				match(COMPARISONBIGGER);
				}
				break;
			case COMPARISONSMALLER:
				_localctx = new ComparisonSmallerContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(194);
				match(COMPARISONSMALLER);
				}
				break;
			case COMPARISONBIGGEREQUALS:
				_localctx = new ComparisonBiggerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(195);
				match(COMPARISONBIGGEREQUALS);
				}
				break;
			case COMPARISONSMALLEREQUALS:
				_localctx = new ComparisonSmallerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(196);
				match(COMPARISONSMALLEREQUALS);
				}
				break;
			case EXP:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(197);
				match(EXP);
				}
				break;
			case LOG:
				_localctx = new LogContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(198);
				match(LOG);
				}
				break;
			case OR:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(199);
				match(OR);
				}
				break;
			case AND:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(200);
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> COMMENTBRACKET() { return getTokens(LogoParser.COMMENTBRACKET); }
		public TerminalNode COMMENTBRACKET(int i) {
			return getToken(LogoParser.COMMENTBRACKET, i);
		}
		public List<AcctionContext> acction() {
			return getRuleContexts(AcctionContext.class);
		}
		public AcctionContext acction(int i) {
			return getRuleContext(AcctionContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(COMMENTBRACKET);
			setState(205); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(204);
					acction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(209);
			match(COMMENTBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AcctionContext extends ParserRuleContext {
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public TerminalNode OTHERWORD() { return getToken(LogoParser.OTHERWORD, 0); }
		public AcctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAcction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAcction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAcction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcctionContext acction() throws RecognitionException {
		AcctionContext _localctx = new AcctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_acction);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				brakeArg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				program();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				mathStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(OTHERWORD);
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
		enterRule(_localctx, 20, RULE_stringArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 22, RULE_variableName);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					match(T__2);
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(225);
				match(OTHERWORD);
				}
				break;
			case SPECIAL_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
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
		enterRule(_localctx, 24, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(PROCEDURE);
			setState(230);
			brakeArg();
			setState(231);
			stringArg();
			setState(232);
			brakeArg();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==SPECIAL_WORD) {
				{
				{
				setState(233);
				variableName();
				setState(234);
				brakeArg();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
		enterRule(_localctx, 26, RULE_procedureCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(CALL);
			setState(244);
			brakeArg();
			setState(245);
			stringArg();
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					brakeArg();
					setState(247);
					mathStatement();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(254);
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
		enterRule(_localctx, 28, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(REPEAT);
			setState(258);
			brakeArg();
			setState(259);
			mathStatement();
			setState(260);
			brakeArg();
			setState(261);
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
		enterRule(_localctx, 30, RULE_while1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(WHILE);
			setState(264);
			brakeArg();
			setState(265);
			mathStatement();
			setState(266);
			brakeArg();
			setState(267);
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
		enterRule(_localctx, 32, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(BACK);
			setState(270);
			brakeArg();
			setState(271);
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
		enterRule(_localctx, 34, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FORWARD);
			setState(274);
			brakeArg();
			setState(275);
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
		enterRule(_localctx, 36, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LEFT);
			setState(278);
			brakeArg();
			setState(279);
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
		enterRule(_localctx, 38, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(RIGHT);
			setState(282);
			brakeArg();
			setState(283);
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
		enterRule(_localctx, 40, RULE_setcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(SETCOLOR);
			setState(286);
			brakeArg();
			setState(287);
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
		enterRule(_localctx, 42, RULE_setpensize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(SETPENSIZE);
			setState(290);
			brakeArg();
			setState(291);
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

	public static class NewTurtleContext extends ParserRuleContext {
		public TerminalNode NEWTURTLE() { return getToken(LogoParser.NEWTURTLE, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public NewTurtleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTurtle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNewTurtle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNewTurtle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNewTurtle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTurtleContext newTurtle() throws RecognitionException {
		NewTurtleContext _localctx = new NewTurtleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newTurtle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(NEWTURTLE);
			setState(294);
			brakeArg();
			setState(295);
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

	public static class RenameContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(LogoParser.RENAME, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(RENAME);
			setState(298);
			brakeArg();
			setState(299);
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

	public static class ChangeTurtleContext extends ParserRuleContext {
		public TerminalNode CHANGETURTLE() { return getToken(LogoParser.CHANGETURTLE, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public ChangeTurtleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeTurtle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterChangeTurtle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitChangeTurtle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitChangeTurtle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeTurtleContext changeTurtle() throws RecognitionException {
		ChangeTurtleContext _localctx = new ChangeTurtleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_changeTurtle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(CHANGETURTLE);
			setState(302);
			brakeArg();
			setState(303);
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

	public static class RemoveTurtleContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(LogoParser.REMOVE, 0); }
		public BrakeArgContext brakeArg() {
			return getRuleContext(BrakeArgContext.class,0);
		}
		public StringArgContext stringArg() {
			return getRuleContext(StringArgContext.class,0);
		}
		public RemoveTurtleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeTurtle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRemoveTurtle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRemoveTurtle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRemoveTurtle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveTurtleContext removeTurtle() throws RecognitionException {
		RemoveTurtleContext _localctx = new RemoveTurtleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_removeTurtle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(REMOVE);
			setState(306);
			brakeArg();
			setState(307);
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
		enterRule(_localctx, 52, RULE_ifc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IF);
			setState(310);
			brakeArg();
			setState(311);
			mathStatement();
			setState(312);
			brakeArg();
			setState(313);
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
		enterRule(_localctx, 54, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(IFELSE);
			setState(316);
			brakeArg();
			setState(317);
			mathStatement();
			setState(318);
			brakeArg();
			setState(319);
			commandsList();
			setState(320);
			brakeArg();
			setState(321);
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
		enterRule(_localctx, 56, RULE_home);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 58, RULE_clean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		enterRule(_localctx, 60, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 62, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 64, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(LET);
			setState(332);
			brakeArg();
			setState(333);
			variableName();
			setState(334);
			brakeArg();
			setState(335);
			mathStatement();
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(336);
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
		enterRule(_localctx, 66, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(ASSIGN);
			setState(340);
			brakeArg();
			setState(341);
			variableName();
			setState(342);
			brakeArg();
			setState(343);
			mathStatement();
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(344);
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
		enterRule(_localctx, 68, RULE_spaceArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(347);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(350); 
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
		enterRule(_localctx, 70, RULE_newLineArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(352);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(355); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 72, RULE_brakeArg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(359);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(357);
						spaceArg();
						}
						break;
					case NEWLINE:
						{
						setState(358);
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
				setState(361); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 74, RULE_endFileArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 76, RULE_commandsList);
		int _la;
		try {
			int _alt;
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK:
			case FORWARD:
			case HOME:
			case LEFT:
			case RIGHT:
			case CLEAN:
			case PD:
			case PU:
			case SETPENSIZE:
			case SETCOLOR:
			case NEWTURTLE:
			case RENAME:
			case REMOVE:
			case CHANGETURTLE:
			case LET:
			case ASSIGN:
			case IF:
			case IFELSE:
			case REPEAT:
			case WHILE:
			case PROCEDURE:
			case CALL:
			case COMMENTBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				cmd();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__3);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(367);
					brakeArg();
					}
					break;
				}
				setState(371); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(370);
						line();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(373); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(375);
					brakeArg();
					}
				}

				setState(378);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(T__5);
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(381);
					brakeArg();
					}
					break;
				}
				setState(385); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(384);
						line();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(387); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE || _la==NEWLINE) {
					{
					setState(389);
					brakeArg();
					}
				}

				setState(392);
				match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\6\2R\n\2\r\2\16"+
		"\2S\3\2\3\2\3\3\5\3Y\n\3\3\3\5\3\\\n\3\3\3\3\3\5\3`\n\3\6\3b\n\3\r\3\16"+
		"\3c\3\3\5\3g\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\6\3\6\3"+
		"\6\5\6\u0087\n\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\5\6\u0091\n\6\3"+
		"\6\3\6\3\6\5\6\u0096\n\6\3\6\3\6\5\6\u009a\n\6\3\6\3\6\5\6\u009e\n\6\3"+
		"\6\3\6\7\6\u00a2\n\6\f\6\16\6\u00a5\13\6\3\7\3\7\3\7\3\7\5\7\u00ab\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b9\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cc"+
		"\n\t\3\n\3\n\6\n\u00d0\n\n\r\n\16\n\u00d1\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00db\n\13\3\f\3\f\3\r\6\r\u00e0\n\r\r\r\16\r\u00e1\3\r\3\r"+
		"\5\r\u00e6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ef\n\16\f\16"+
		"\16\16\u00f2\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00fc"+
		"\n\17\f\17\16\17\u00ff\13\17\3\17\5\17\u0102\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u0154\n\"\3#\3#\3#\3#\3#\3#\5#\u015c\n#\3$\6$\u015f"+
		"\n$\r$\16$\u0160\3%\6%\u0164\n%\r%\16%\u0165\3&\3&\6&\u016a\n&\r&\16&"+
		"\u016b\3\'\3\'\3(\3(\3(\5(\u0173\n(\3(\6(\u0176\n(\r(\16(\u0177\3(\5("+
		"\u017b\n(\3(\3(\3(\3(\5(\u0181\n(\3(\6(\u0184\n(\r(\16(\u0185\3(\5(\u0189"+
		"\n(\3(\3(\5(\u018d\n(\3(\2\3\n)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\2\2\u01c1\2Q\3\2\2\2\4X\3\2\2\2\6"+
		"\177\3\2\2\2\b\u0081\3\2\2\2\n\u0095\3\2\2\2\f\u00aa\3\2\2\2\16\u00b8"+
		"\3\2\2\2\20\u00cb\3\2\2\2\22\u00cd\3\2\2\2\24\u00da\3\2\2\2\26\u00dc\3"+
		"\2\2\2\30\u00e5\3\2\2\2\32\u00e7\3\2\2\2\34\u00f5\3\2\2\2\36\u0103\3\2"+
		"\2\2 \u0109\3\2\2\2\"\u010f\3\2\2\2$\u0113\3\2\2\2&\u0117\3\2\2\2(\u011b"+
		"\3\2\2\2*\u011f\3\2\2\2,\u0123\3\2\2\2.\u0127\3\2\2\2\60\u012b\3\2\2\2"+
		"\62\u012f\3\2\2\2\64\u0133\3\2\2\2\66\u0137\3\2\2\28\u013d\3\2\2\2:\u0145"+
		"\3\2\2\2<\u0147\3\2\2\2>\u0149\3\2\2\2@\u014b\3\2\2\2B\u014d\3\2\2\2D"+
		"\u0155\3\2\2\2F\u015e\3\2\2\2H\u0163\3\2\2\2J\u0169\3\2\2\2L\u016d\3\2"+
		"\2\2N\u018c\3\2\2\2PR\5\4\3\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TU\3\2\2\2UV\5L\'\2V\3\3\2\2\2WY\5J&\2XW\3\2\2\2XY\3\2\2\2Ya\3\2\2\2Z"+
		"\\\5F$\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\5\6\4\2^`\5F$\2_^\3\2\2\2_"+
		"`\3\2\2\2`b\3\2\2\2a[\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2"+
		"eg\5J&\2fe\3\2\2\2fg\3\2\2\2g\5\3\2\2\2h\u0080\5\36\20\2i\u0080\5 \21"+
		"\2j\u0080\5\32\16\2k\u0080\5\34\17\2l\u0080\5$\23\2m\u0080\5\"\22\2n\u0080"+
		"\5&\24\2o\u0080\5(\25\2p\u0080\5:\36\2q\u0080\5B\"\2r\u0080\5D#\2s\u0080"+
		"\5\66\34\2t\u0080\58\35\2u\u0080\5> \2v\u0080\5@!\2w\u0080\5*\26\2x\u0080"+
		"\5,\27\2y\u0080\5.\30\2z\u0080\5\60\31\2{\u0080\5\62\32\2|\u0080\5\64"+
		"\33\2}\u0080\5\22\n\2~\u0080\5<\37\2\177h\3\2\2\2\177i\3\2\2\2\177j\3"+
		"\2\2\2\177k\3\2\2\2\177l\3\2\2\2\177m\3\2\2\2\177n\3\2\2\2\177o\3\2\2"+
		"\2\177p\3\2\2\2\177q\3\2\2\2\177r\3\2\2\2\177s\3\2\2\2\177t\3\2\2\2\177"+
		"u\3\2\2\2\177v\3\2\2\2\177w\3\2\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2"+
		"\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\7\3\2\2"+
		"\2\u0081\u0082\5\n\6\2\u0082\t\3\2\2\2\u0083\u0084\b\6\1\2\u0084\u0086"+
		"\7\3\2\2\u0085\u0087\5J&\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\5\n\6\2\u0089\u008b\5J&\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\4\2\2\u008d\u0096"+
		"\3\2\2\2\u008e\u0090\5\16\b\2\u008f\u0091\5J&\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\5\n\6\4\u0093\u0096\3\2"+
		"\2\2\u0094\u0096\5\f\7\2\u0095\u0083\3\2\2\2\u0095\u008e\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u00a3\3\2\2\2\u0097\u0099\f\5\2\2\u0098\u009a\5J"+
		"&\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\5\20\t\2\u009c\u009e\5J&\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5\n\6\6\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u0097\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\13\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ab\7A\2\2\u00a7\u00ab"+
		"\7@\2\2\u00a8\u00ab\7B\2\2\u00a9\u00ab\5\30\r\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\r\3\2\2\2"+
		"\u00ac\u00b9\7\25\2\2\u00ad\u00b9\7\26\2\2\u00ae\u00b9\7\27\2\2\u00af"+
		"\u00b9\7\32\2\2\u00b0\u00b9\7\33\2\2\u00b1\u00b9\7\35\2\2\u00b2\u00b9"+
		"\7\"\2\2\u00b3\u00b9\7$\2\2\u00b4\u00b9\7%\2\2\u00b5\u00b9\7&\2\2\u00b6"+
		"\u00b9\7(\2\2\u00b7\u00b9\78\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ad\3\2\2"+
		"\2\u00b8\u00ae\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1"+
		"\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\17\3\2\2"+
		"\2\u00ba\u00cc\7\30\2\2\u00bb\u00cc\7\37\2\2\u00bc\u00cc\7!\2\2\u00bd"+
		"\u00cc\7#\2\2\u00be\u00cc\7\'\2\2\u00bf\u00cc\7\35\2\2\u00c0\u00cc\7 "+
		"\2\2\u00c1\u00cc\7>\2\2\u00c2\u00cc\7)\2\2\u00c3\u00cc\7*\2\2\u00c4\u00cc"+
		"\7+\2\2\u00c5\u00cc\7-\2\2\u00c6\u00cc\7,\2\2\u00c7\u00cc\7\31\2\2\u00c8"+
		"\u00cc\7\34\2\2\u00c9\u00cc\79\2\2\u00ca\u00cc\7\65\2\2\u00cb\u00ba\3"+
		"\2\2\2\u00cb\u00bb\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00bd\3\2\2\2\u00cb"+
		"\u00be\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c1\3\2"+
		"\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00cf"+
		"\7?\2\2\u00ce\u00d0\5\24\13\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4\23\3\2\2\2\u00d5\u00db\5J&\2\u00d6\u00db\5\2\2\2\u00d7\u00db"+
		"\5\6\4\2\u00d8\u00db\5\b\5\2\u00d9\u00db\7C\2\2\u00da\u00d5\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\25\3\2\2\2\u00dc\u00dd\7C\2\2\u00dd\27\3\2\2\2\u00de\u00e0"+
		"\7\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\7C\2\2\u00e4\u00e6\7\n"+
		"\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\31\3\2\2\2\u00e7\u00e8"+
		"\7<\2\2\u00e8\u00e9\5J&\2\u00e9\u00ea\5\26\f\2\u00ea\u00f0\5J&\2\u00eb"+
		"\u00ec\5\30\r\2\u00ec\u00ed\5J&\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\5N(\2\u00f4\33\3\2\2\2"+
		"\u00f5\u00f6\7=\2\2\u00f6\u00f7\5J&\2\u00f7\u00fd\5\26\f\2\u00f8\u00f9"+
		"\5J&\2\u00f9\u00fa\5\b\5\2\u00fa\u00fc\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\5J&\2\u0101\u0100\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\35\3\2\2\2\u0103\u0104\7:\2\2\u0104\u0105\5J&\2\u0105\u0106"+
		"\5\b\5\2\u0106\u0107\5J&\2\u0107\u0108\5N(\2\u0108\37\3\2\2\2\u0109\u010a"+
		"\7;\2\2\u010a\u010b\5J&\2\u010b\u010c\5\b\5\2\u010c\u010d\5J&\2\u010d"+
		"\u010e\5N(\2\u010e!\3\2\2\2\u010f\u0110\7\13\2\2\u0110\u0111\5J&\2\u0111"+
		"\u0112\5\b\5\2\u0112#\3\2\2\2\u0113\u0114\7\f\2\2\u0114\u0115\5J&\2\u0115"+
		"\u0116\5\b\5\2\u0116%\3\2\2\2\u0117\u0118\7\16\2\2\u0118\u0119\5J&\2\u0119"+
		"\u011a\5\b\5\2\u011a\'\3\2\2\2\u011b\u011c\7\17\2\2\u011c\u011d\5J&\2"+
		"\u011d\u011e\5\b\5\2\u011e)\3\2\2\2\u011f\u0120\7\24\2\2\u0120\u0121\5"+
		"J&\2\u0121\u0122\5\b\5\2\u0122+\3\2\2\2\u0123\u0124\7\23\2\2\u0124\u0125"+
		"\5J&\2\u0125\u0126\5\b\5\2\u0126-\3\2\2\2\u0127\u0128\7.\2\2\u0128\u0129"+
		"\5J&\2\u0129\u012a\5\26\f\2\u012a/\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d"+
		"\5J&\2\u012d\u012e\5\26\f\2\u012e\61\3\2\2\2\u012f\u0130\7\61\2\2\u0130"+
		"\u0131\5J&\2\u0131\u0132\5\26\f\2\u0132\63\3\2\2\2\u0133\u0134\7\60\2"+
		"\2\u0134\u0135\5J&\2\u0135\u0136\5\26\f\2\u0136\65\3\2\2\2\u0137\u0138"+
		"\7\66\2\2\u0138\u0139\5J&\2\u0139\u013a\5\b\5\2\u013a\u013b\5J&\2\u013b"+
		"\u013c\5N(\2\u013c\67\3\2\2\2\u013d\u013e\7\67\2\2\u013e\u013f\5J&\2\u013f"+
		"\u0140\5\b\5\2\u0140\u0141\5J&\2\u0141\u0142\5N(\2\u0142\u0143\5J&\2\u0143"+
		"\u0144\5N(\2\u01449\3\2\2\2\u0145\u0146\7\r\2\2\u0146;\3\2\2\2\u0147\u0148"+
		"\7\20\2\2\u0148=\3\2\2\2\u0149\u014a\7\21\2\2\u014a?\3\2\2\2\u014b\u014c"+
		"\7\22\2\2\u014cA\3\2\2\2\u014d\u014e\7\63\2\2\u014e\u014f\5J&\2\u014f"+
		"\u0150\5\30\r\2\u0150\u0151\5J&\2\u0151\u0153\5\b\5\2\u0152\u0154\5J&"+
		"\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154C\3\2\2\2\u0155\u0156"+
		"\7\64\2\2\u0156\u0157\5J&\2\u0157\u0158\5\30\r\2\u0158\u0159\5J&\2\u0159"+
		"\u015b\5\b\5\2\u015a\u015c\5J&\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2"+
		"\2\u015cE\3\2\2\2\u015d\u015f\7D\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161G\3\2\2\2\u0162\u0164"+
		"\7E\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166I\3\2\2\2\u0167\u016a\5F$\2\u0168\u016a\5H%\2\u0169"+
		"\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016cK\3\2\2\2\u016d\u016e\7\2\2\3\u016eM\3\2"+
		"\2\2\u016f\u018d\5\6\4\2\u0170\u0172\7\6\2\2\u0171\u0173\5J&\2\u0172\u0171"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0176\5\4\3\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u017b\5J&\2\u017a\u0179\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\7\2\2\u017d\u018d\3\2\2\2\u017e"+
		"\u0180\7\b\2\2\u017f\u0181\5J&\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2"+
		"\2\u0181\u0183\3\2\2\2\u0182\u0184\5\4\3\2\u0183\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0189\5J&\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2"+
		"\2\u018a\u018b\7\t\2\2\u018b\u018d\3\2\2\2\u018c\u016f\3\2\2\2\u018c\u0170"+
		"\3\2\2\2\u018c\u017e\3\2\2\2\u018dO\3\2\2\2\'SX[_cf\177\u0086\u008a\u0090"+
		"\u0095\u0099\u009d\u00a3\u00aa\u00b8\u00cb\u00d1\u00da\u00e1\u00e5\u00f0"+
		"\u00fd\u0101\u0153\u015b\u0160\u0165\u0169\u016b\u0172\u0177\u017a\u0180"+
		"\u0185\u0188\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}