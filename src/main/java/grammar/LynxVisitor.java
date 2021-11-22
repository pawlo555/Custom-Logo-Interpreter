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
	 * Visit a parse tree produced by {@link LynxParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(LynxParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#numberCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCommand(LynxParser.NumberCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#bracketCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketCommand(LynxParser.BracketCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#wordCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCommand(LynxParser.WordCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#numberNumberCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberNumberCommand(LynxParser.NumberNumberCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#justCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustCommand(LynxParser.JustCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LynxParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#insideLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideLoop(LynxParser.InsideLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#multipleInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleInside(LynxParser.MultipleInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#oneInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneInside(LynxParser.OneInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#totalnumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalnumber(LynxParser.TotalnumberContext ctx);
}