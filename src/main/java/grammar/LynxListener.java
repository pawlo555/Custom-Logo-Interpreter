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
	 * Enter a parse tree produced by {@link LynxParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LynxParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LynxParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#numberCommand}.
	 * @param ctx the parse tree
	 */
	void enterNumberCommand(LynxParser.NumberCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#numberCommand}.
	 * @param ctx the parse tree
	 */
	void exitNumberCommand(LynxParser.NumberCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#bracketCommand}.
	 * @param ctx the parse tree
	 */
	void enterBracketCommand(LynxParser.BracketCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#bracketCommand}.
	 * @param ctx the parse tree
	 */
	void exitBracketCommand(LynxParser.BracketCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#wordCommand}.
	 * @param ctx the parse tree
	 */
	void enterWordCommand(LynxParser.WordCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#wordCommand}.
	 * @param ctx the parse tree
	 */
	void exitWordCommand(LynxParser.WordCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#numberNumberCommand}.
	 * @param ctx the parse tree
	 */
	void enterNumberNumberCommand(LynxParser.NumberNumberCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#numberNumberCommand}.
	 * @param ctx the parse tree
	 */
	void exitNumberNumberCommand(LynxParser.NumberNumberCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#justCommand}.
	 * @param ctx the parse tree
	 */
	void enterJustCommand(LynxParser.JustCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#justCommand}.
	 * @param ctx the parse tree
	 */
	void exitJustCommand(LynxParser.JustCommandContext ctx);
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
	 * Enter a parse tree produced by {@link LynxParser#insideLoop}.
	 * @param ctx the parse tree
	 */
	void enterInsideLoop(LynxParser.InsideLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#insideLoop}.
	 * @param ctx the parse tree
	 */
	void exitInsideLoop(LynxParser.InsideLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#multipleInside}.
	 * @param ctx the parse tree
	 */
	void enterMultipleInside(LynxParser.MultipleInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#multipleInside}.
	 * @param ctx the parse tree
	 */
	void exitMultipleInside(LynxParser.MultipleInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#oneInside}.
	 * @param ctx the parse tree
	 */
	void enterOneInside(LynxParser.OneInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#oneInside}.
	 * @param ctx the parse tree
	 */
	void exitOneInside(LynxParser.OneInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link LynxParser#totalnumber}.
	 * @param ctx the parse tree
	 */
	void enterTotalnumber(LynxParser.TotalnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LynxParser#totalnumber}.
	 * @param ctx the parse tree
	 */
	void exitTotalnumber(LynxParser.TotalnumberContext ctx);
}