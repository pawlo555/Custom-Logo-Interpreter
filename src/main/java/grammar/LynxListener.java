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
	 * Enter a parse tree produced by {@link LynxParser#gilde}.
	 * @param ctx the parse tree
	 */
	void enterGilde(LynxParser.GildeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#gilde}.
	 * @param ctx the parse tree
	 */
	void exitGilde(LynxParser.GildeContext ctx);
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
	 * Enter a parse tree produced by {@link LynxParser#totalnumberArg}.
	 * @param ctx the parse tree
	 */
	void enterTotalnumberArg(LynxParser.TotalnumberArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#totalnumberArg}.
	 * @param ctx the parse tree
	 */
	void exitTotalnumberArg(LynxParser.TotalnumberArgContext ctx);
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