package interpreter.statements;

import interpreter.ConditionStatement;
import interpreter.Executor;
import interpreter.Statement;

import java.util.List;

public class StatementIf implements Statement {
    private ConditionStatement conditionStatement;
    private List<Statement> statementList;

    public StatementIf(ConditionStatement conditionStatement, List<Statement> statementList) {
        this.conditionStatement = conditionStatement;
        this.statementList = statementList;
    }

    @Override
    public void execute(Executor executor) {
        if (conditionStatement.getBooleanValue(executor)) {
            for (Statement statement: statementList) {
                statement.execute(executor);
            }
        }
    }
}