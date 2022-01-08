package interpreter.statements;

import interpreter.Executor;
import interpreter.VariableValue;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementLet extends AbstractStatement {

    private final String variableName;
    private final MathStatement mathStatement;

    public StatementLet(ParserRuleContext ctx, String variableName, MathStatement mathStatement) {
        super(ctx);
        this.variableName = variableName;
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        MathValue mathValue = this.mathStatement.evaluate(executor);
        VariableValue variableValue = new VariableValue(mathValue.toString());
        executor.getEnvironment().addVariable(variableName, variableValue);
    }

}
