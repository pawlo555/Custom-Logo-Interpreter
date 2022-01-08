package interpreter.statements;

import interpreter.Executor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class Procedure extends AbstractStatement {

    public final String name;
    public final List<Statement> statementList;
    public final List<String> variableNamesList;
    public final String body;

    public Procedure(ParserRuleContext ctx, String name, List<Statement> statementList,
                     List<String> variableNamesList) {
        super(ctx);
        body = ctx.getText();
        this.name = name;
        this.statementList = statementList;
        this.variableNamesList = variableNamesList;
    }

    @Override
    public void customExecute(Executor executor) {
        for (Statement statement : statementList) {
            statement.execute(executor);
        }
    }

    public String getBody() {
        return body;
    }
}
