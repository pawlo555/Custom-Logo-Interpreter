package interpreter.statements;

import interpreter.Executor;
import interpreter.VariableValue;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementAssign extends AbstractStatement {

    private final String variableName;
    private final MathStatement mathStatement;

    public StatementAssign(ParserRuleContext ctx, String variableName, MathStatement mathStatement) {
        super(ctx);
        this.variableName = variableName;
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        MathValue mathValue = this.mathStatement.evaluate(executor.getEnvironment());
        VariableValue variableValue = new VariableValue(mathValue.toString());
        executor.getEnvironment().assignVariable(variableName, variableValue);
    }

}