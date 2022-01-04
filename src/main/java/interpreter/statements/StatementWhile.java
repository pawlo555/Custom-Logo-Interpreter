package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.math.MathStatement;

import java.util.List;

public class StatementWhile implements Statement {
    private final MathStatement conditionStatement;
    private final List<Statement> statementList;

    public StatementWhile(MathStatement timesStatement, List<Statement> statementList) {
        this.conditionStatement = timesStatement;
        this.statementList = statementList;
    }

    @Override
    public void execute(Executor executor) {
        while (conditionStatement.evaluate(executor.getEnvironment()).getIntValue() != 1) {
            for(Statement statement: statementList) {
                statement.execute(executor);
            }
        }
    }
}
