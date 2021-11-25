package interpreter.statements;

import interpreter.ConditionStatement;
import interpreter.Executor;
import interpreter.Statement;

import java.util.List;

public class StatementIfElse implements Statement {
    private final ConditionStatement conditionStatement;
    private final List<Statement> trueStatementList;
    private final List<Statement> falseStatementList;

    public StatementIfElse(ConditionStatement conditionStatement, List<Statement> trueStatementList, List<Statement> falseStatementList) {
        this.conditionStatement = conditionStatement;
        this.trueStatementList = trueStatementList;
        this.falseStatementList = falseStatementList;
    }

    @Override
    public void execute(Executor executor) {
        if (conditionStatement.getBooleanValue(executor)) {
            for (Statement statement : trueStatementList) {
                statement.execute(executor);
            }
        }
        else {
            for (Statement statement: falseStatementList) {
                statement.execute(executor);
            }
        }
    }
}