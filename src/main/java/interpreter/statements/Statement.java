package interpreter.statements;

import interpreter.Executor;

public interface Statement {

    void execute(Executor executor);
}
