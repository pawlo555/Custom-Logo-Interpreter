package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.VariableValue;

public class StatementForward implements Statement {
    private final VariableValue variableValue;
    private final String variableName;

    public StatementForward(String variableName) {
        if(variableName.charAt(0) == ':') {
            this.variableName = variableName;
            this.variableValue = null;
        }
        else {
            this.variableValue = new VariableValue(variableName);
            this.variableName = null;
        }
    }

    @Override
    public void execute(Executor executor) {
        double value = getValue(executor);
        executor.getEngine().forward(value);
    }

    private double getValue(Executor executor) {
        if (variableValue != null) {
            return variableValue.getDoubleValue();
        }
        else {
            assert variableName != null: "Forward - dont specify correct value";
            return executor.getEnvironment().getVariable(variableName).getDoubleValue();
        }
    }
}
