package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementProcedureCall implements Statement {

    private final String name;

    public StatementProcedureCall(String name) {
        this.name = name;
    }

    @Override
    public void execute(Executor executor) {
        Procedure procedure = executor.getEnvironment().getProcedure(name);
        System.out.println(procedure);
        procedure.execute(executor);
    }
}