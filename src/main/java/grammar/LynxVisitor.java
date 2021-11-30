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
	 * Visit a parse tree produced by {@link LynxParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(LynxParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(LynxParser.ProcedureCallContext ctx);
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
	 * Visit a parse tree produced by {@link LynxParser#abs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(LynxParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#arctan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArctan(LynxParser.ArctanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(LynxParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LynxParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#intC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntC(LynxParser.IntCContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#ln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLn(LynxParser.LnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(LynxParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LynxParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(LynxParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#round}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRound(LynxParser.RoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(LynxParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(LynxParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#tan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(LynxParser.TanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#namefromcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamefromcolor(LynxParser.NamefromcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#setcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetcolor(LynxParser.SetcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#setpensize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetpensize(LynxParser.SetpensizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#setbg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetbg(LynxParser.SetbgContext ctx);
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
	 * Visit a parse tree produced by {@link LynxParser#clearname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearname(LynxParser.ClearnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#namex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamex(LynxParser.NamexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#thing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThing(LynxParser.ThingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#glide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlide(LynxParser.GlideContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#difference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference(LynxParser.DifferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#greaterx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterx(LynxParser.GreaterxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#lessx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessx(LynxParser.LessxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(LynxParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#product}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(LynxParser.ProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#quotient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotient(LynxParser.QuotientContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#remainder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemainder(LynxParser.RemainderContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(LynxParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LynxParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#ifC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfC(LynxParser.IfCContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(LynxParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LynxParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LynxParser.OrContext ctx);
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
	 * Visit a parse tree produced by {@link LynxParser#clearnames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearnames(LynxParser.ClearnamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(LynxParser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#pi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPi(LynxParser.PiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#bg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBg(LynxParser.BgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#cg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCg(LynxParser.CgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#clean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClean(LynxParser.CleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(LynxParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#colorrunder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorrunder(LynxParser.ColorrunderContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#fill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFill(LynxParser.FillContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#freezebg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreezebg(LynxParser.FreezebgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(LynxParser.PdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#pe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPe(LynxParser.PeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#pensize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPensize(LynxParser.PensizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#pu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu(LynxParser.PuContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#stamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStamp(LynxParser.StampContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#unfreezebg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnfreezebg(LynxParser.UnfreezebgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(LynxParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#make}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake(LynxParser.MakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#mathStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathStatment(LynxParser.MathStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(LynxParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#logicStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicStatment(LynxParser.LogicStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#logicbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicbrackets(LynxParser.LogicbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#logicSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicSign(LynxParser.LogicSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#mathSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathSign(LynxParser.MathSignContext ctx);
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
	 * Visit a parse tree produced by {@link LynxParser#anynumberArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnynumberArg(LynxParser.AnynumberArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LynxParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LynxParser.ListContext ctx);
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