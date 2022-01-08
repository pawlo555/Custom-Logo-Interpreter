package interpreter.statements;

import interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementClean extends AbstractStatement {

    public StatementClean(ParserRuleContext ctx) {
        super(ctx);
    }

    @Override
    public void customExecute(Executor executor) {
        executor.getEngine().cleanBackground();

    }
}
