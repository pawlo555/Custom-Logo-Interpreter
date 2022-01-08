package interpreter.statements;

import interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementPenUp extends AbstractStatement {

    public StatementPenUp(ParserRuleContext ctx) {
        super(ctx);
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().setUp();
    }
}
