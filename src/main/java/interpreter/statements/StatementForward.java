package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementForward implements Statement {
    private final double n;

    public StatementForward(double n) {
        this.n = n;
    }

    @Override
    public void execute(Executor executor) {
        executor.getEngine().forward(n);
    }
}
