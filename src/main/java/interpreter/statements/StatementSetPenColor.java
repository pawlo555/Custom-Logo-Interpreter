package interpreter.statements;

import interpreter.Executor;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;
import utils.Colour;

public class StatementSetPenColor extends AbstractStatement{
    private final MathStatement mathStatement;

    public StatementSetPenColor(ParserRuleContext ctx, MathStatement mathStatement) {
        super(ctx);
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor);
        executor.getEngine().setPenColour(new Colour((value.getIntValue())));
    }
}

