package interpreter.statements;

import interpreter.Executor;
import interpreter.math.MathStatement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class StatementWhile extends AbstractStatement {
    private final MathStatement conditionStatement;
    private final List<Statement> statementList;

    public StatementWhile(ParserRuleContext ctx, MathStatement timesStatement, List<Statement> statementList) {
        super(ctx);
        this.conditionStatement = timesStatement;
        this.statementList = statementList;
    }

    @Override
    public void customExecute(Executor executor) {
        while (conditionStatement.evaluate(executor.getEnvironment()).getBooleanValue()) {
            for(Statement statement: statementList) {
                statement.execute(executor);
            }
        }
    }
}
