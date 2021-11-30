package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

import java.util.List;

public class Procedure implements Statement {

    public final String name;
    public final List<Statement> statementList;

    public Procedure(String name, List<Statement> statementList) {
        this.name = name;
        this.statementList = statementList;
    }

    @Override
    public void execute(Executor executor) {
        for (Statement statement: statementList) {
            statement.execute(executor);
        }
    }
}
