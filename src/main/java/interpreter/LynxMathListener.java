package interpreter;

import grammar.LynxBaseListener;
import grammar.LynxParser;
import interpreter.math.MathStatementCollector;
import interpreter.math.MathValue;


public class LynxMathListener extends LynxBaseListener {
    private final MathStatementCollector mathCollector = new MathStatementCollector();

    @Override
    public void enterMathStatement(LynxParser.MathStatementContext ctx) {
        mathCollector.startCollecting();
    }

    @Override
    public void exitMathStatement(LynxParser.MathStatementContext ctx) {
        mathCollector.endCollecting();
    }

    @Override
    public void enterMathValue(LynxParser.MathValueContext ctx) {
        mathCollector.collect(ctx.getText());
    }

    @Override
    public void enterBrakets(LynxParser.BraketsContext ctx) {
        mathCollector.collect("(");
    }

    @Override
    public void exitBrakets(LynxParser.BraketsContext ctx) {
        mathCollector.collect(")");
    }

    public MathValue getMathStatement() {
        return new MathValue();
    }

    @Override
    public void enterAbs(LynxParser.AbsContext ctx) {
        mathCollector.collect("abs");
    }

    @Override
    public void enterArctan(LynxParser.ArctanContext ctx) {
        mathCollector.collect("arctan");
    }

    @Override
    public void enterCos(LynxParser.CosContext ctx) {
        mathCollector.collect("cos");
    }

    @Override
    public void enterInt1(LynxParser.Int1Context ctx) {
        mathCollector.collect("int");
    }

    @Override
    public void enterLn(LynxParser.LnContext ctx) {
        mathCollector.collect("ln");
    }

    @Override
    public void enterMinusSingle(LynxParser.MinusSingleContext ctx) {
        mathCollector.collect("-single");
    }

    @Override
    public void enterRandom(LynxParser.RandomContext ctx) {
        mathCollector.collect("rand");
    }

    @Override
    public void enterRound(LynxParser.RoundContext ctx) {
        mathCollector.collect("round");
    }

    @Override
    public void enterSin(LynxParser.SinContext ctx) {
        mathCollector.collect("sin");
    }

    @Override
    public void enterSqrt(LynxParser.SqrtContext ctx) {
        mathCollector.collect("sqrt");
    }

    @Override
    public void enterTan(LynxParser.TanContext ctx) {
        mathCollector.collect("tan");
    }

    @Override
    public void enterNot(LynxParser.NotContext ctx) {
        mathCollector.collect("not");
    }

    @Override
    public void enterDifference(LynxParser.DifferenceContext ctx) {
        mathCollector.collect("-");
    }

    @Override
    public void enterPower(LynxParser.PowerContext ctx) {
        mathCollector.collect("pow");
    }

    @Override
    public void enterQuotient(LynxParser.QuotientContext ctx) {
        mathCollector.collect("quot");
    }

    @Override
    public void enterRemainder(LynxParser.RemainderContext ctx) {
        mathCollector.collect("remainder");
    }

    @Override
    public void enterSum(LynxParser.SumContext ctx) {
        mathCollector.collect("sum");
    }

    @Override
    public void enterMinus(LynxParser.MinusContext ctx) {
        mathCollector.collect("-");
    }

    @Override
    public void enterProduct(LynxParser.ProductContext ctx) {
        mathCollector.collect("*");
    }

    @Override
    public void enterDivision(LynxParser.DivisionContext ctx) {
        mathCollector.collect("/");
    }

    // TODO all other comparisons
    @Override
    public void enterComparison(LynxParser.ComparisonContext ctx) {
        mathCollector.collect("comp");
    }

    @Override
    public void enterExp(LynxParser.ExpContext ctx) {
        mathCollector.collect("exp");
    }

    @Override
    public void enterLog(LynxParser.LogContext ctx) {
        mathCollector.collect("log");
    }

    @Override
    public void enterOr(LynxParser.OrContext ctx) {
        mathCollector.collect("or");
    }

    @Override
    public void enterAnd(LynxParser.AndContext ctx) {
        mathCollector.collect("and");
    }
}
