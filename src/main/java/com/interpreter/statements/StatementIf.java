package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.math.MathStatement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class StatementIf extends AbstractStatement {
    private final MathStatement mathStatement;
    private final List<Statement> statementList;

    public StatementIf(ParserRuleContext ctx, MathStatement mathStatement, List<Statement> statementList) {
        super(ctx);
        this.mathStatement = mathStatement;
        this.statementList = statementList;
    }

    @Override
    public void customExecute(Executor executor) {
        boolean value = mathStatement.evaluate(executor).getBooleanValue();
        if (value) {
            executor.getEnvironment().enterBlock();
            for (Statement statement: statementList) {
                statement.execute(executor);
            }
            executor.getEnvironment().exitBlock();
        }
    }
}