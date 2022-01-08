package interpreter.statements;

import interpreter.Executor;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementRight extends AbstractStatement {
    private final MathStatement mathStatement;

    public StatementRight(ParserRuleContext ctx, MathStatement mathStatement) {
        super(ctx);
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor.getEnvironment());
        executor.getEngine().right(value.getIntValue());
    }
}
