package com.interpreter;

import com.grammar.LogoBaseListener;
import com.grammar.LogoParser;
import com.interpreter.math.MathStatementCollector;
import com.interpreter.math.Operators;


public class LogoMathListener extends LogoBaseListener {
    protected final MathStatementCollector mathCollector = new MathStatementCollector();

    @Override
    public void enterMathStatement(LogoParser.MathStatementContext ctx) {
        mathCollector.startCollecting();
    }

    @Override
    public void exitMathStatement(LogoParser.MathStatementContext ctx) {
        mathCollector.endCollecting();
    }

    @Override
    public void enterMathValue(LogoParser.MathValueContext ctx) {
        mathCollector.collect(ctx.getText());
    }

    @Override
    public void enterBrakets(LogoParser.BraketsContext ctx) {
        mathCollector.collect("(");
    }

    @Override
    public void exitBrakets(LogoParser.BraketsContext ctx) {
        mathCollector.collect(")");
    }

    @Override
    public void enterAbs(LogoParser.AbsContext ctx) { mathCollector.collect(Operators.ABS.name()); }

    @Override
    public void enterArctan(LogoParser.ArctanContext ctx) { mathCollector.collect(Operators.ARCTAN.name()); }

    @Override
    public void enterCos(LogoParser.CosContext ctx) {
        mathCollector.collect(Operators.COS.name());
    }

    @Override
    public void enterInt1(LogoParser.Int1Context ctx) {
        mathCollector.collect(Operators.INT.name());
    }

    @Override
    public void enterLn(LogoParser.LnContext ctx) {
        mathCollector.collect(Operators.LN.name());
    }

    @Override
    public void enterMinusSingle(LogoParser.MinusSingleContext ctx) { mathCollector.collect(Operators.MINUS_SINGLE.name());}

    @Override
    public void enterRandom(LogoParser.RandomContext ctx) { mathCollector.collect(Operators.RAND.name()); }

    @Override
    public void enterRound(LogoParser.RoundContext ctx) {
        mathCollector.collect(Operators.ROUND.name());
    }

    @Override
    public void enterSin(LogoParser.SinContext ctx) {
        mathCollector.collect(Operators.SIN.name());
    }

    @Override
    public void enterSqrt(LogoParser.SqrtContext ctx) {
        mathCollector.collect(Operators.SQRT.name());
    }

    @Override
    public void enterTan(LogoParser.TanContext ctx) {
        mathCollector.collect(Operators.TAN.name());
    }

    @Override
    public void enterNot(LogoParser.NotContext ctx) {
        mathCollector.collect(Operators.NOT.name());
    }

    @Override
    public void enterDifference(LogoParser.DifferenceContext ctx) { mathCollector.collect(Operators.DIFFERENCE.name()); }

    @Override
    public void enterPower(LogoParser.PowerContext ctx) { mathCollector.collect(Operators.POW.name()); }

    @Override
    public void enterQuotient(LogoParser.QuotientContext ctx) {
        mathCollector.collect(Operators.QUOT.name());
    }

    @Override
    public void enterRemainder(LogoParser.RemainderContext ctx) {
        mathCollector.collect(Operators.REMAINDER.name());
    }

    @Override
    public void enterSum(LogoParser.SumContext ctx) {
        mathCollector.collect(Operators.PLUS.name());
    }

    @Override
    public void enterMinus(LogoParser.MinusContext ctx) {
        mathCollector.collect(Operators.MINUS.name());
    }

    @Override
    public void enterProduct(LogoParser.ProductContext ctx) {
        mathCollector.collect(Operators.MULTIPLY.name());
    }

    @Override
    public void enterDivision(LogoParser.DivisionContext ctx) { mathCollector.collect(Operators.DIVIDE.name()); }

    @Override
    public void enterComparisonEquals(LogoParser.ComparisonEqualsContext ctx) { mathCollector.collect(Operators.COMP.name()); }

    @Override
    public void enterComparisonSmaller(LogoParser.ComparisonSmallerContext ctx) { mathCollector.collect(Operators.COMPSMALLER.name()); }

    @Override
    public void enterComparisonSmallerEquals(LogoParser.ComparisonSmallerEqualsContext ctx) { mathCollector.collect(Operators.COMPSMALLEREQUALS.name()); }

    @Override
    public void enterComparisonBigger(LogoParser.ComparisonBiggerContext ctx) { mathCollector.collect(Operators.COMPBIGGER.name()); }

    @Override
    public void enterComparisonBiggerEquals(LogoParser.ComparisonBiggerEqualsContext ctx) { mathCollector.collect(Operators.COMPBIGGEREQUALS.name()); }

    @Override
    public void enterExp(LogoParser.ExpContext ctx) {
        mathCollector.collect(Operators.EXP.name());
    }

    @Override
    public void enterLog(LogoParser.LogContext ctx) {
        mathCollector.collect(Operators.LOG.name());
    }

    @Override
    public void enterOr(LogoParser.OrContext ctx) {
        mathCollector.collect(Operators.OR.name());
    }

    @Override
    public void enterAnd(LogoParser.AndContext ctx) {
        mathCollector.collect(Operators.AND.name());
    }


}
