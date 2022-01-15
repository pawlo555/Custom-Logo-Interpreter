package interpreter.statements;

import interpreter.Executor;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementSetPenSize extends AbstractStatement{
    private final MathStatement mathStatement;

    public StatementSetPenSize(ParserRuleContext ctx, MathStatement mathStatement) {
        super(ctx);
        this.mathStatement = mathStatement;
    }

    @Override
    public void customExecute(Executor executor) {
        System.out.println("statment ok start ");
        MathValue value = mathStatement.evaluate(executor);
        executor.getEngine().setPenSize((value.getIntValue()));
        System.out.println("statment ok end ");
    }
}
