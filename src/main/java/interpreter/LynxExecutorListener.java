package interpreter;

import grammar.LynxBaseListener;
import grammar.LynxParser;
import interpreter.statements.*;

import java.util.LinkedList;

public class LynxExecutorListener extends LynxBaseListener {
    private Statement statement;
    private Executor executor;


    private boolean isExecuting = true;
    private LinkedList<Statement> statements = new LinkedList<>();
    private int number;

    @Override
    public void enterForward(LynxParser.ForwardContext ctx) {
        double n = Double.parseDouble(ctx.stop.getText());
        statement = new StatementForward(n);
    }

    @Override
    public void exitForward(LynxParser.ForwardContext ctx) {
        exit();
    }

    @Override
    public void enterBack(LynxParser.BackContext ctx) {
        double n = Double.parseDouble(ctx.stop.getText());
        statement = new StatementBack(n);
    }

    @Override
    public void exitBack(LynxParser.BackContext ctx) {
        exit();
    }

    @Override
    public void enterRight(LynxParser.RightContext ctx) {
        int n = Integer.parseInt(ctx.stop.getText());
        statement = new StatementRight(n);
    }

    @Override
    public void exitRight(LynxParser.RightContext ctx) {
        exit();
    }

    @Override
    public void enterLeft(LynxParser.LeftContext ctx) {
        int n = Integer.parseInt(ctx.stop.getText());
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
        number = Integer.parseInt(ctx.naturalNumberArg().start.getText());
        isExecuting = false;
    }

    @Override
    public void exitRepeat(LynxParser.RepeatContext ctx) {
        statement = new StatementRepeat(number, statements);
        number = -1;
        statements = new LinkedList<>();
        isExecuting = true;
        exit();
    }

    private void exit() {
        if (isExecuting) {
            statement.execute(executor);
        }
        else {
            statements.addLast(statement);
        }
        statement = null;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }
}