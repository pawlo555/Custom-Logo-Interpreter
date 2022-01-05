package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementClean implements Statement {

    @Override
    public void execute(Executor executor) {
        executor.getEngine().cleanBackground();

    }
}
