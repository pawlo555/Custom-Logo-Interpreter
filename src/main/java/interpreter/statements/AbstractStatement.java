package interpreter.statements;

import interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;
import utils.ErrorMessageComposer;

public abstract class AbstractStatement implements Statement {
    private final int line;
    private final int index;

    public AbstractStatement(ParserRuleContext ctx) {
        if (ctx != null) {
            line = ctx.getStart().getLine();
            index = ctx.getStart().getCharPositionInLine();
        }
        else {
            line = 1;
            index = 1;
        }
    }

    @Override
    public void execute(Executor executor) {
        try {
            customExecute(executor);
        }
        catch (IllegalStateException exception) {
            String errorMessage = ErrorMessageComposer.buildErrorMessage(line, index, exception.getMessage());
            System.out.println(errorMessage);
            throw new RuntimeException(errorMessage);
        }
    }

    public abstract void customExecute(Executor executor);
}
