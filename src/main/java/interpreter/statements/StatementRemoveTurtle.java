package interpreter.statements;

import interpreter.Executor;
import interpreter.Turtle;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.statements.AbstractStatement;
import org.antlr.v4.runtime.ParserRuleContext;
import utils.Colour;
import utils.Vector2D;

public class StatementRemoveTurtle extends AbstractStatement {
    private final String name;

    public StatementRemoveTurtle(ParserRuleContext ctx, String name) {
        super(ctx);
        this.name = name;
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().removeTurtle(name,false);
    }
}