package interpreter.statements;

import interpreter.Executor;
import interpreter.math.MathStatement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class StatementRepeat extends AbstractStatement {
    private final MathStatement timesStatement;
    private final List<Statement> statementList;

    public StatementRepeat(ParserRuleContext ctx, MathStatement timesStatement, List<Statement> statementList) {
        super(ctx);
        this.timesStatement = timesStatement;
        this.statementList = statementList;
    }

    @Override
    public void customExecute(Executor executor) {
        int times = timesStatement.evaluate(executor).getIntValue();
        for (int i=0; i<times; i++) {
            executor.getEnvironment().enterBlock();
            for(Statement statement: statementList) {
                statement.execute(executor);
            }
            executor.getEnvironment().exitBlock();
        }
    }
}
