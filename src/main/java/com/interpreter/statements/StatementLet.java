package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.VariableValue;
import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
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
