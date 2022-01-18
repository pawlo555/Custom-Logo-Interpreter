package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementSetPenSize extends AbstractStatement{
    private final MathStatement mathStatement;

    public StatementSetPenSize(ParserRuleContext ctx, MathStatement mathStatement) {
        super(ctx);
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor);
        if (value.getIntValue() <= 0) {
            throw new IllegalStateException("PenSize must be positive got " + value +" instead.");
        }
        executor.getEngine().setPenSize((value.getIntValue()));
    }
}
