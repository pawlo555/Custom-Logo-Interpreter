package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.VariableValue;

public class StatementLet implements Statement {

    private final String variableName;
    private final VariableValue variableValue;

    public StatementLet(String variableName, VariableValue variableValue) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    @Override
    public void execute(Executor executor) {
        executor.getEnvironment().addVariable(variableName, variableValue);
    }

}
