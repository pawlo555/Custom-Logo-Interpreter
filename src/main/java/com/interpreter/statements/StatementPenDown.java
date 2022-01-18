package com.interpreter.statements;

import com.interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementPenDown extends AbstractStatement {

    public StatementPenDown(ParserRuleContext ctx) {
        super(ctx);
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().setDown();
    }
}
