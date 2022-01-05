package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.VariableValue;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;

public class StatementAssign implements Statement {

    private final String variableName;
    private final MathStatement mathStatement;

    public StatementAssign(String variableName, MathStatement mathStatement) {
        this.variableName = variableName;
        this.mathStatement = mathStatement;
    }

    @Override
    public void execute(Executor executor) {
        MathValue mathValue = this.mathStatement.evaluate(executor.getEnvironment());
        VariableValue variableValue = new VariableValue(mathValue.toString());
        executor.getEnvironment().assignVariable(variableName, variableValue);
    }

}