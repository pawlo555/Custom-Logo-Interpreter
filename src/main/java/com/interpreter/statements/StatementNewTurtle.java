package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.Turtle;
import org.antlr.v4.runtime.ParserRuleContext;
import com.utils.Vector2D;

public class StatementNewTurtle extends AbstractStatement{
    private final String name;

    public StatementNewTurtle(ParserRuleContext ctx, String name) {
        super(ctx);
        this.name = name;
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().addTurtle(name,new Turtle(new Vector2D(0,0)));
    }
}