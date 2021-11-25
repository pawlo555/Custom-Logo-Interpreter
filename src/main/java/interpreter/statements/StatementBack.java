package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementBack implements Statement {
    private final double n;

    public StatementBack(double n) {
        this.n = n;
    }

    @Override
    public void execute(Executor executor) {
        executor.getEngine().backward(n);
    }
}
