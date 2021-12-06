// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/grammar\Lynx.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LynxParser}.
 */
public interface LynxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LynxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LynxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LynxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LynxParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LynxParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LynxParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LynxParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void enterMathStatement(LynxParser.MathStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void exitMathStatement(LynxParser.MathStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void enterMathSentence(LynxParser.MathSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#mathSentence}.
	 * @param ctx the parse tree
	 */
	void exitMathSentence(LynxParser.MathSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#mathValue}.
	 * @param ctx the parse tree
	 */
	void enterMathValue(LynxParser.MathValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#mathValue}.
	 * @param ctx the parse tree
	 */
	void exitMathValue(LynxParser.MathValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgMathOperator(LynxParser.SingleArgMathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#singleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgMathOperator(LynxParser.SingleArgMathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void enterDoubleArgMathOperator(LynxParser.DoubleArgMathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#doubleArgMathOperator}.
	 * @param ctx the parse tree
	 */
	void exitDoubleArgMathOperator(LynxParser.DoubleArgMathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void enterStringArg(LynxParser.StringArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#stringArg}.
	 * @param ctx the parse tree
	 */
	void exitStringArg(LynxParser.StringArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(LynxParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(LynxParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(LynxParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(LynxParser.VariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(LynxParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(LynxParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(LynxParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(LynxParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(LynxParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(LynxParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#back}.
	 * @param ctx the parse tree
	 */
	void enterBack(LynxParser.BackContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#back}.
	 * @param ctx the parse tree
	 */
	void exitBack(LynxParser.BackContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#forward}.
	 * @param ctx the parse tree
	 */
	void enterForward(LynxParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#forward}.
	 * @param ctx the parse tree
	 */
	void exitForward(LynxParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(LynxParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(LynxParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(LynxParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(LynxParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#setheading}.
	 * @param ctx the parse tree
	 */
	void enterSetheading(LynxParser.SetheadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#setheading}.
	 * @param ctx the parse tree
	 */
	void exitSetheading(LynxParser.SetheadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#setx}.
	 * @param ctx the parse tree
	 */
	void enterSetx(LynxParser.SetxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#setx}.
	 * @param ctx the parse tree
	 */
	void exitSetx(LynxParser.SetxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#sety}.
	 * @param ctx the parse tree
	 */
	void enterSety(LynxParser.SetyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#sety}.
	 * @param ctx the parse tree
	 */
	void exitSety(LynxParser.SetyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#namefromcolor}.
	 * @param ctx the parse tree
	 */
	void enterNamefromcolor(LynxParser.NamefromcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#namefromcolor}.
	 * @param ctx the parse tree
	 */
	void exitNamefromcolor(LynxParser.NamefromcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#setcolor}.
	 * @param ctx the parse tree
	 */
	void enterSetcolor(LynxParser.SetcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#setcolor}.
	 * @param ctx the parse tree
	 */
	void exitSetcolor(LynxParser.SetcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#setpensize}.
	 * @param ctx the parse tree
	 */
	void enterSetpensize(LynxParser.SetpensizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#setpensize}.
	 * @param ctx the parse tree
	 */
	void exitSetpensize(LynxParser.SetpensizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#setbg}.
	 * @param ctx the parse tree
	 */
	void enterSetbg(LynxParser.SetbgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#setbg}.
	 * @param ctx the parse tree
	 */
	void exitSetbg(LynxParser.SetbgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#setpos}.
	 * @param ctx the parse tree
	 */
	void enterSetpos(LynxParser.SetposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#setpos}.
	 * @param ctx the parse tree
	 */
	void exitSetpos(LynxParser.SetposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#distance}.
	 * @param ctx the parse tree
	 */
	void enterDistance(LynxParser.DistanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#distance}.
	 * @param ctx the parse tree
	 */
	void exitDistance(LynxParser.DistanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#towards}.
	 * @param ctx the parse tree
	 */
	void enterTowards(LynxParser.TowardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#towards}.
	 * @param ctx the parse tree
	 */
	void exitTowards(LynxParser.TowardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#clearname}.
	 * @param ctx the parse tree
	 */
	void enterClearname(LynxParser.ClearnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#clearname}.
	 * @param ctx the parse tree
	 */
	void exitClearname(LynxParser.ClearnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#namex}.
	 * @param ctx the parse tree
	 */
	void enterNamex(LynxParser.NamexContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#namex}.
	 * @param ctx the parse tree
	 */
	void exitNamex(LynxParser.NamexContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#thing}.
	 * @param ctx the parse tree
	 */
	void enterThing(LynxParser.ThingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#thing}.
	 * @param ctx the parse tree
	 */
	void exitThing(LynxParser.ThingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#ifc}.
	 * @param ctx the parse tree
	 */
	void enterIfc(LynxParser.IfcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#ifc}.
	 * @param ctx the parse tree
	 */
	void exitIfc(LynxParser.IfcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(LynxParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(LynxParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(LynxParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(LynxParser.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(LynxParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(LynxParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#pos}.
	 * @param ctx the parse tree
	 */
	void enterPos(LynxParser.PosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#pos}.
	 * @param ctx the parse tree
	 */
	void exitPos(LynxParser.PosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#xcor}.
	 * @param ctx the parse tree
	 */
	void enterXcor(LynxParser.XcorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#xcor}.
	 * @param ctx the parse tree
	 */
	void exitXcor(LynxParser.XcorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#ycor}.
	 * @param ctx the parse tree
	 */
	void enterYcor(LynxParser.YcorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#ycor}.
	 * @param ctx the parse tree
	 */
	void exitYcor(LynxParser.YcorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#clearnames}.
	 * @param ctx the parse tree
	 */
	void enterClearnames(LynxParser.ClearnamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#clearnames}.
	 * @param ctx the parse tree
	 */
	void exitClearnames(LynxParser.ClearnamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(LynxParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(LynxParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#bg}.
	 * @param ctx the parse tree
	 */
	void enterBg(LynxParser.BgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#bg}.
	 * @param ctx the parse tree
	 */
	void exitBg(LynxParser.BgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#cg}.
	 * @param ctx the parse tree
	 */
	void enterCg(LynxParser.CgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#cg}.
	 * @param ctx the parse tree
	 */
	void exitCg(LynxParser.CgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#clean}.
	 * @param ctx the parse tree
	 */
	void enterClean(LynxParser.CleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#clean}.
	 * @param ctx the parse tree
	 */
	void exitClean(LynxParser.CleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(LynxParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(LynxParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#colorrunder}.
	 * @param ctx the parse tree
	 */
	void enterColorrunder(LynxParser.ColorrunderContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#colorrunder}.
	 * @param ctx the parse tree
	 */
	void exitColorrunder(LynxParser.ColorrunderContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#fill}.
	 * @param ctx the parse tree
	 */
	void enterFill(LynxParser.FillContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#fill}.
	 * @param ctx the parse tree
	 */
	void exitFill(LynxParser.FillContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#freezebg}.
	 * @param ctx the parse tree
	 */
	void enterFreezebg(LynxParser.FreezebgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#freezebg}.
	 * @param ctx the parse tree
	 */
	void exitFreezebg(LynxParser.FreezebgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(LynxParser.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(LynxParser.PdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#pe}.
	 * @param ctx the parse tree
	 */
	void enterPe(LynxParser.PeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#pe}.
	 * @param ctx the parse tree
	 */
	void exitPe(LynxParser.PeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#pensize}.
	 * @param ctx the parse tree
	 */
	void enterPensize(LynxParser.PensizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#pensize}.
	 * @param ctx the parse tree
	 */
	void exitPensize(LynxParser.PensizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#pu}.
	 * @param ctx the parse tree
	 */
	void enterPu(LynxParser.PuContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#pu}.
	 * @param ctx the parse tree
	 */
	void exitPu(LynxParser.PuContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#stamp}.
	 * @param ctx the parse tree
	 */
	void enterStamp(LynxParser.StampContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#stamp}.
	 * @param ctx the parse tree
	 */
	void exitStamp(LynxParser.StampContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#unfreezebg}.
	 * @param ctx the parse tree
	 */
	void enterUnfreezebg(LynxParser.UnfreezebgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#unfreezebg}.
	 * @param ctx the parse tree
	 */
	void exitUnfreezebg(LynxParser.UnfreezebgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(LynxParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(LynxParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#make}.
	 * @param ctx the parse tree
	 */
	void enterMake(LynxParser.MakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#make}.
	 * @param ctx the parse tree
	 */
	void exitMake(LynxParser.MakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#spaceArg}.
	 * @param ctx the parse tree
	 */
	void enterSpaceArg(LynxParser.SpaceArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#spaceArg}.
	 * @param ctx the parse tree
	 */
	void exitSpaceArg(LynxParser.SpaceArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#newLineArg}.
	 * @param ctx the parse tree
	 */
	void enterNewLineArg(LynxParser.NewLineArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#newLineArg}.
	 * @param ctx the parse tree
	 */
	void exitNewLineArg(LynxParser.NewLineArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#brakeArg}.
	 * @param ctx the parse tree
	 */
	void enterBrakeArg(LynxParser.BrakeArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#brakeArg}.
	 * @param ctx the parse tree
	 */
	void exitBrakeArg(LynxParser.BrakeArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#naturalNumberArg}.
	 * @param ctx the parse tree
	 */
	void enterNaturalNumberArg(LynxParser.NaturalNumberArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#naturalNumberArg}.
	 * @param ctx the parse tree
	 */
	void exitNaturalNumberArg(LynxParser.NaturalNumberArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LynxParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LynxParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#endFileArg}.
	 * @param ctx the parse tree
	 */
	void enterEndFileArg(LynxParser.EndFileArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#endFileArg}.
	 * @param ctx the parse tree
	 */
	void exitEndFileArg(LynxParser.EndFileArgContext ctx);
}