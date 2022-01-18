package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.math.MathStatement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class StatementIfElse extends AbstractStatement {
    private final MathStatement mathStatement;
    private final List<Statement> trueStatementList;
    private final List<Statement> falseStatementList;

    public StatementIfElse(ParserRuleContext ctx, MathStatement mathStatement, List<Statement> trueStatementList, List<Statement> falseStatementList) {
        super(ctx);
        this.mathStatement = mathStatement;
        this.trueStatementList = trueStatementList;
        this.falseStatementList = falseStatementList;
    }

    @Override
    public void customExecute(Executor executor) {
        boolean value = mathStatement.evaluate(executor).getBooleanValue();
        executor.getEnvironment().enterBlock();
        if (value) {
            for (Statement statement : trueStatementList) {
                statement.execute(executor);
            }
        }
        else {
            for (Statement statement: falseStatementList) {
                statement.execute(executor);
            }
        }
        executor.getEnvironment().exitBlock();
    }
}