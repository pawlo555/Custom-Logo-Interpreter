package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementRight implements Statement {
    private final int n;

    public StatementRight(int n) {
        this.n = n;
    }

    @Override
    public void execute(Executor executor) {
        executor.getEngine().right(n);
    }
}
