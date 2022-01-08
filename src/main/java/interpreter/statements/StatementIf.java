package interpreter.statements;

import interpreter.Executor;
import interpreter.math.MathStatement;
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
        boolean value = mathStatement.evaluate(executor.getEnvironment()).getBooleanValue();
        if (value) {
            for (Statement statement: statementList) {
                statement.execute(executor);
            }
        }
    }
}