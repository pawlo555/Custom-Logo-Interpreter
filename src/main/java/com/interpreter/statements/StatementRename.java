package com.interpreter.statements;

import com.interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementRename extends AbstractStatement{
    private final String name;

    public StatementRename(ParserRuleContext ctx, String name) {
        super(ctx);
        this.name = name;
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().renameTurtle(name);
    }
}