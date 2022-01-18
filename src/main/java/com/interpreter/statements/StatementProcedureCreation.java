package com.interpreter.statements;

import com.interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementProcedureCreation extends AbstractStatement {

    private final String name;
    private final Procedure procedure;

    public StatementProcedureCreation(ParserRuleContext ctx, String name, Procedure procedure) {
        super(ctx);
        this.name = name;
        this.procedure = procedure;
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEnvironment().addProcedure(name, procedure);
    }
}
