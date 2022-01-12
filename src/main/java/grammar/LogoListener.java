// Generated from C:/Custom-Logo-Interpreter/src/main/java/grammar\Logo.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LogoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LogoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LogoParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LogoParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LogoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LogoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void enterMathStatement(LogoParser.MathStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void exitMathStatement(LogoParser.MathStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleArgs}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgs(LogoParser.SingleArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleArgs}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgs(LogoParser.SingleArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleArgs}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void enterDoubleArgs(LogoParser.DoubleArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleArgs}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void exitDoubleArgs(LogoParser.DoubleArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void enterValue(LogoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void exitValue(LogoParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brakets}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void enterBrakets(LogoParser.BraketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brakets}
	 * labeled alternative in {@link LogoParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void exitBrakets(LogoParser.BraketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#mathValue}.
	 * @param ctx the parse tree
	 */
	void enterMathValue(LogoParser.MathValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#mathValue}.
	 * @param ctx the parse tree
	 */
	void exitMathValue(LogoParser.MathValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abs}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterAbs(LogoParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitAbs(LogoParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arctan}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterArctan(LogoParser.ArctanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arctan}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitArctan(LogoParser.ArctanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cos}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterCos(LogoParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cos}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitCos(LogoParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int1}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterInt1(LogoParser.Int1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int1}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitInt1(LogoParser.Int1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ln}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterLn(LogoParser.LnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ln}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitLn(LogoParser.LnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusSingle}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusSingle(LogoParser.MinusSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusSingle}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusSingle(LogoParser.MinusSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code random}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterRandom(LogoParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code random}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitRandom(LogoParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code round}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterRound(LogoParser.RoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code round}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitRound(LogoParser.RoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sin}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterSin(LogoParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sin}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitSin(LogoParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(LogoParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(LogoParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tan}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterTan(LogoParser.TanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tan}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitTan(LogoParser.TanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterNot(LogoParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LogoParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitNot(LogoParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code difference}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterDifference(LogoParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code difference}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitDifference(LogoParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterPower(LogoParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitPower(LogoParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotient}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterQuotient(LogoParser.QuotientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotient}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitQuotient(LogoParser.QuotientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code remainder}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterRemainder(LogoParser.RemainderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remainder}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitRemainder(LogoParser.RemainderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterSum(LogoParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitSum(LogoParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinus(LogoParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinus(LogoParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code product}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterProduct(LogoParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by the {@code product}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitProduct(LogoParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivision(LogoParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivision(LogoParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonEquals(LogoParser.ComparisonEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonEquals(LogoParser.ComparisonEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonBigger}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonBigger(LogoParser.ComparisonBiggerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonBigger}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonBigger(LogoParser.ComparisonBiggerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonSmaller}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonSmaller(LogoParser.ComparisonSmallerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonSmaller}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonSmaller(LogoParser.ComparisonSmallerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonBiggerEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonBiggerEquals(LogoParser.ComparisonBiggerEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonBiggerEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonBiggerEquals(LogoParser.ComparisonBiggerEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonSmallerEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonSmallerEquals(LogoParser.ComparisonSmallerEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonSmallerEquals}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonSmallerEquals(LogoParser.ComparisonSmallerEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterExp(LogoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitExp(LogoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code log}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterLog(LogoParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code log}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitLog(LogoParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterOr(LogoParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitOr(LogoParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LogoParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LogoParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LogoParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void enterStringArg(LogoParser.StringArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void exitStringArg(LogoParser.StringArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(LogoParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(LogoParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(LogoParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(LogoParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(LogoParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(LogoParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(LogoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(LogoParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#while1}.
	 * @param ctx the parse tree
	 */
	void enterWhile1(LogoParser.While1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#while1}.
	 * @param ctx the parse tree
	 */
	void exitWhile1(LogoParser.While1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#back}.
	 * @param ctx the parse tree
	 */
	void enterBack(LogoParser.BackContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#back}.
	 * @param ctx the parse tree
	 */
	void exitBack(LogoParser.BackContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#forward}.
	 * @param ctx the parse tree
	 */
	void enterForward(LogoParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#forward}.
	 * @param ctx the parse tree
	 */
	void exitForward(LogoParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(LogoParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(LogoParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(LogoParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(LogoParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#setheading}.
	 * @param ctx the parse tree
	 */
	void enterSetheading(LogoParser.SetheadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#setheading}.
	 * @param ctx the parse tree
	 */
	void exitSetheading(LogoParser.SetheadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#setx}.
	 * @param ctx the parse tree
	 */
	void enterSetx(LogoParser.SetxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#setx}.
	 * @param ctx the parse tree
	 */
	void exitSetx(LogoParser.SetxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#sety}.
	 * @param ctx the parse tree
	 */
	void enterSety(LogoParser.SetyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#sety}.
	 * @param ctx the parse tree
	 */
	void exitSety(LogoParser.SetyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#namefromcolor}.
	 * @param ctx the parse tree
	 */
	void enterNamefromcolor(LogoParser.NamefromcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#namefromcolor}.
	 * @param ctx the parse tree
	 */
	void exitNamefromcolor(LogoParser.NamefromcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#setcolor}.
	 * @param ctx the parse tree
	 */
	void enterSetcolor(LogoParser.SetcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#setcolor}.
	 * @param ctx the parse tree
	 */
	void exitSetcolor(LogoParser.SetcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#setpensize}.
	 * @param ctx the parse tree
	 */
	void enterSetpensize(LogoParser.SetpensizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#setpensize}.
	 * @param ctx the parse tree
	 */
	void exitSetpensize(LogoParser.SetpensizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#setbg}.
	 * @param ctx the parse tree
	 */
	void enterSetbg(LogoParser.SetbgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#setbg}.
	 * @param ctx the parse tree
	 */
	void exitSetbg(LogoParser.SetbgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#setpos}.
	 * @param ctx the parse tree
	 */
	void enterSetpos(LogoParser.SetposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#setpos}.
	 * @param ctx the parse tree
	 */
	void exitSetpos(LogoParser.SetposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#distance}.
	 * @param ctx the parse tree
	 */
	void enterDistance(LogoParser.DistanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#distance}.
	 * @param ctx the parse tree
	 */
	void exitDistance(LogoParser.DistanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#towards}.
	 * @param ctx the parse tree
	 */
	void enterTowards(LogoParser.TowardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#towards}.
	 * @param ctx the parse tree
	 */
	void exitTowards(LogoParser.TowardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#clearname}.
	 * @param ctx the parse tree
	 */
	void enterClearname(LogoParser.ClearnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#clearname}.
	 * @param ctx the parse tree
	 */
	void exitClearname(LogoParser.ClearnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#namex}.
	 * @param ctx the parse tree
	 */
	void enterNamex(LogoParser.NamexContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#namex}.
	 * @param ctx the parse tree
	 */
	void exitNamex(LogoParser.NamexContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#thing}.
	 * @param ctx the parse tree
	 */
	void enterThing(LogoParser.ThingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#thing}.
	 * @param ctx the parse tree
	 */
	void exitThing(LogoParser.ThingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#newTurtle}.
	 * @param ctx the parse tree
	 */
	void enterNewTurtle(LogoParser.NewTurtleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#newTurtle}.
	 * @param ctx the parse tree
	 */
	void exitNewTurtle(LogoParser.NewTurtleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(LogoParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(LogoParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#changeTurtle}.
	 * @param ctx the parse tree
	 */
	void enterChangeTurtle(LogoParser.ChangeTurtleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#changeTurtle}.
	 * @param ctx the parse tree
	 */
	void exitChangeTurtle(LogoParser.ChangeTurtleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#removeTurtle}.
	 * @param ctx the parse tree
	 */
	void enterRemoveTurtle(LogoParser.RemoveTurtleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#removeTurtle}.
	 * @param ctx the parse tree
	 */
	void exitRemoveTurtle(LogoParser.RemoveTurtleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ifc}.
	 * @param ctx the parse tree
	 */
	void enterIfc(LogoParser.IfcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ifc}.
	 * @param ctx the parse tree
	 */
	void exitIfc(LogoParser.IfcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(LogoParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(LogoParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(LogoParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(LogoParser.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(LogoParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(LogoParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pos}.
	 * @param ctx the parse tree
	 */
	void enterPos(LogoParser.PosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pos}.
	 * @param ctx the parse tree
	 */
	void exitPos(LogoParser.PosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#clearnames}.
	 * @param ctx the parse tree
	 */
	void enterClearnames(LogoParser.ClearnamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#clearnames}.
	 * @param ctx the parse tree
	 */
	void exitClearnames(LogoParser.ClearnamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(LogoParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(LogoParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#bg}.
	 * @param ctx the parse tree
	 */
	void enterBg(LogoParser.BgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#bg}.
	 * @param ctx the parse tree
	 */
	void exitBg(LogoParser.BgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#cg}.
	 * @param ctx the parse tree
	 */
	void enterCg(LogoParser.CgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#cg}.
	 * @param ctx the parse tree
	 */
	void exitCg(LogoParser.CgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#clean}.
	 * @param ctx the parse tree
	 */
	void enterClean(LogoParser.CleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#clean}.
	 * @param ctx the parse tree
	 */
	void exitClean(LogoParser.CleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(LogoParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(LogoParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#colorrunder}.
	 * @param ctx the parse tree
	 */
	void enterColorrunder(LogoParser.ColorrunderContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#colorrunder}.
	 * @param ctx the parse tree
	 */
	void exitColorrunder(LogoParser.ColorrunderContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#fill}.
	 * @param ctx the parse tree
	 */
	void enterFill(LogoParser.FillContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fill}.
	 * @param ctx the parse tree
	 */
	void exitFill(LogoParser.FillContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#freezebg}.
	 * @param ctx the parse tree
	 */
	void enterFreezebg(LogoParser.FreezebgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#freezebg}.
	 * @param ctx the parse tree
	 */
	void exitFreezebg(LogoParser.FreezebgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(LogoParser.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(LogoParser.PdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pe}.
	 * @param ctx the parse tree
	 */
	void enterPe(LogoParser.PeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pe}.
	 * @param ctx the parse tree
	 */
	void exitPe(LogoParser.PeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pensize}.
	 * @param ctx the parse tree
	 */
	void enterPensize(LogoParser.PensizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pensize}.
	 * @param ctx the parse tree
	 */
	void exitPensize(LogoParser.PensizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void enterPu(LogoParser.PuContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void exitPu(LogoParser.PuContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#stamp}.
	 * @param ctx the parse tree
	 */
	void enterStamp(LogoParser.StampContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#stamp}.
	 * @param ctx the parse tree
	 */
	void exitStamp(LogoParser.StampContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#unfreezebg}.
	 * @param ctx the parse tree
	 */
	void enterUnfreezebg(LogoParser.UnfreezebgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#unfreezebg}.
	 * @param ctx the parse tree
	 */
	void exitUnfreezebg(LogoParser.UnfreezebgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(LogoParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(LogoParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LogoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LogoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#spaceArg}.
	 * @param ctx the parse tree
	 */
	void enterSpaceArg(LogoParser.SpaceArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#spaceArg}.
	 * @param ctx the parse tree
	 */
	void exitSpaceArg(LogoParser.SpaceArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#newLineArg}.
	 * @param ctx the parse tree
	 */
	void enterNewLineArg(LogoParser.NewLineArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#newLineArg}.
	 * @param ctx the parse tree
	 */
	void exitNewLineArg(LogoParser.NewLineArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#brakeArg}.
	 * @param ctx the parse tree
	 */
	void enterBrakeArg(LogoParser.BrakeArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#brakeArg}.
	 * @param ctx the parse tree
	 */
	void exitBrakeArg(LogoParser.BrakeArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#endFileArg}.
	 * @param ctx the parse tree
	 */
	void enterEndFileArg(LogoParser.EndFileArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#endFileArg}.
	 * @param ctx the parse tree
	 */
	void exitEndFileArg(LogoParser.EndFileArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#commandsList}.
	 * @param ctx the parse tree
	 */
	void enterCommandsList(LogoParser.CommandsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#commandsList}.
	 * @param ctx the parse tree
	 */
	void exitCommandsList(LogoParser.CommandsListContext ctx);
}