// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/grammar\Lynx.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LynxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LynxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LynxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LynxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LynxParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LynxParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LynxParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#back}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack(LynxParser.BackContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#forward}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(LynxParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(LynxParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(LynxParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#setheading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetheading(LynxParser.SetheadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#setx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetx(LynxParser.SetxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#sety}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSety(LynxParser.SetyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#setpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetpos(LynxParser.SetposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#distance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistance(LynxParser.DistanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#towards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTowards(LynxParser.TowardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#gilde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGilde(LynxParser.GildeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeading(LynxParser.HeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(LynxParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#pos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPos(LynxParser.PosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#xcor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXcor(LynxParser.XcorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#ycor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYcor(LynxParser.YcorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#spaceArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceArg(LynxParser.SpaceArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#newLineArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLineArg(LynxParser.NewLineArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#brakeArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrakeArg(LynxParser.BrakeArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#naturalNumberArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalNumberArg(LynxParser.NaturalNumberArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#totalnumberArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalnumberArg(LynxParser.TotalnumberArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#stringArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArg(LynxParser.StringArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#endFileArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndFileArg(LynxParser.EndFileArgContext ctx);
}