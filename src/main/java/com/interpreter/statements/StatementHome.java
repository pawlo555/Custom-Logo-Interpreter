package com.interpreter.statements;

import com.interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementHome extends AbstractStatement {

    public StatementHome(ParserRuleContext ctx) {
        super(ctx);
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().setPosition(0,0);
    }
}
