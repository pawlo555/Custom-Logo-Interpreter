package com.interpreter.statements;

import com.interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementRemoveTurtle extends AbstractStatement {
    private final String name;

    public StatementRemoveTurtle(ParserRuleContext ctx, String name) {
        super(ctx);
        this.name = name;
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().removeTurtle(name,false);
    }
}