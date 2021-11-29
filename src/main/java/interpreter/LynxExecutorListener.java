package interpreter;

import grammar.LynxBaseListener;
import grammar.LynxParser;
import interpreter.statements.*;

import java.util.LinkedList;

public class LynxExecutorListener extends LynxBaseListener {
    private Statement statement;
    private Executor executor;
    private final StatementCollector collector = new StatementCollector();

    private final LinkedList<Integer> numbers = new LinkedList<>();

    @Override
    public void enterForward(LynxParser.ForwardContext ctx) {
        double n = Double.parseDouble(ctx.totalnumberArg().getText());
        statement = new StatementForward(n);
    }

    @Override
    public void exitForward(LynxParser.ForwardContext ctx) {
        exit();
    }

    @Override
    public void enterBack(LynxParser.BackContext ctx) {
        double n = Double.parseDouble(ctx.totalnumberArg().getText());
        statement = new StatementBack(n);
    }

    @Override
    public void exitBack(LynxParser.BackContext ctx) {
        exit();
    }

    @Override
    public void enterRight(LynxParser.RightContext ctx) {
        int n = Integer.parseInt(ctx.totalnumberArg().getText());
        statement = new StatementRight(n);
    }

    @Override
    public void exitRight(LynxParser.RightContext ctx) {
        exit();
    }

    @Override
    public void enterLeft(LynxParser.LeftContext ctx) {
        int n = Integer.parseInt(ctx.totalnumberArg().getText());
        statement = new StatementLeft(n);
    }

    @Override
    public void exitLeft(LynxParser.LeftContext ctx) {
        exit();
    }

    @Override
    public void enterHome(LynxParser.HomeContext ctx) {
        statement = new StatementHome();
    }

    @Override
    public void exitHome(LynxParser.HomeContext ctx) {
        exit();
    }

    @Override
    public void enterRepeat(LynxParser.RepeatContext ctx) {
        numbers.addFirst(Integer.parseInt(ctx.naturalNumberArg().getText()));
        collector.startCollecting();
    }

    @Override
    public void exitRepeat(LynxParser.RepeatContext ctx) {
        statement = new StatementRepeat(numbers.removeFirst(), collector.endCollecting());
        exit();
    }

    private void exit() {
        if (!collector.isCollecting()) {
            statement.execute(executor);
        }
        else {
            collector.addStatement(statement);
        }
        statement = null;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }
}