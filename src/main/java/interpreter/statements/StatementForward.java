package interpreter.statements;

import interpreter.Executor;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementForward extends AbstractStatement {
    private final MathStatement mathStatement;

    public StatementForward(ParserRuleContext ctx, MathStatement mathStatement) {
        super(ctx);
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor.getEnvironment());
        executor.getEngine().forward(value.getDoubleValue());
    }
}
