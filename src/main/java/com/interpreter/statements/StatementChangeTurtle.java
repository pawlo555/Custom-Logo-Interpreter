package com.interpreter.statements;

import com.interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementChangeTurtle extends AbstractStatement {
    private final String name;

    public StatementChangeTurtle(ParserRuleContext ctx, String name) {
        super(ctx);
        this.name = name;
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().changeTurtle(name);
    }
}