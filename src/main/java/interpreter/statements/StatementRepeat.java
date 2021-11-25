package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

import java.util.List;

public class StatementRepeat implements Statement {
    private final int times;
    private final List<Statement> statementList;

    public StatementRepeat(int times, List<Statement> statementList) {
        this.times = times;
        this.statementList = statementList;
    }

    @Override
    public void execute(Executor executor) {
        for (int i=0; i<times; i++) {
            for(Statement statement: statementList) {
                statement.execute(executor);
            }
        }
    }
}
