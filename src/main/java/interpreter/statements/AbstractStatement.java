package interpreter.statements;

import interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;
import interpreter.LogoError;


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
        catch (LogoError error) {
            throw error;
        }
        catch (Exception | Error exception) {
            throw new LogoError(line, index, exception.getMessage());
        }
    }

    public abstract void customExecute(Executor executor);
}
