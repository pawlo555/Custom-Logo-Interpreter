package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementLeft implements Statement {
    private final int n;

    public StatementLeft(int n) {
        this.n = n;
    }

    @Override
    public void execute(Executor executor) {
        executor.getEngine().left(n);
    }
}
