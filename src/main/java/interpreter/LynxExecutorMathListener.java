package interpreter;

import grammar.LynxParser;
import interpreter.statements.*;

import java.util.LinkedList;

public class LynxExecutorMathListener extends LynxMathListener {
    private Statement statement;
    private Executor executor;
    private final StatementCollector statementCollector = new StatementCollector();

    private final LinkedList<Integer> numbers = new LinkedList<>();

    @Override
    public void exitForward(LynxParser.ForwardContext ctx) {
        statement = new StatementForward(ctx.mathStatement().getText());
        exit();
    }



    @Override
    public void enterBack(LynxParser.BackContext ctx) {
        double n = Double.parseDouble(ctx.mathStatement().getText());
        statement = new StatementBack(n);
    }

    @Override
    public void exitBack(LynxParser.BackContext ctx) {
        exit();
    }

    @Override
    public void enterRight(LynxParser.RightContext ctx) {
        int n = Integer.parseInt(ctx.mathStatement().getText());
        statement = new StatementRight(n);
    }

    @Override
    public void exitRight(LynxParser.RightContext ctx) {
        exit();
    }

    @Override
    public void enterLeft(LynxParser.LeftContext ctx) {
        int n = Integer.parseInt(ctx.mathStatement().getText());
        statement = new StatementLeft(n);
    }

    @Override
    public void exitLeft(LynxParser.LeftContext ctx) {
        exit();
    }

    @Override
    public void exitHome(LynxParser.HomeContext ctx) {
        statement = new StatementHome();
        exit();
    }

    @Override
    public void enterRepeat(LynxParser.RepeatContext ctx) {
        numbers.addFirst(Integer.parseInt(ctx.naturalNumberArg().getText()));
        statementCollector.startCollecting();
    }

    @Override
    public void exitRepeat(LynxParser.RepeatContext ctx) {
        statement = new StatementRepeat(numbers.removeFirst(), statementCollector.endCollecting());
        exit();
    }

    @Override
    public void enterProcedure(LynxParser.ProcedureContext ctx) {
        statementCollector.startCollecting();
    }

    @Override
    public void exitProcedure(LynxParser.ProcedureContext ctx) {
        String name = ctx.stringArg().getText();
        Procedure procedure = new Procedure(name, statementCollector.endCollecting(), new LinkedList<>());
        statement = new StatementProcedureCreation(name, procedure);
        exit();
    }

    @Override
    public void exitLet(LynxParser.LetContext ctx) {
        String name = ctx.variableName().getText();
        VariableValue variableValue = new VariableValue(ctx.variableValue().getText());
        statement = new StatementLet(name, variableValue);
        exit();
    }


    @Override
    public void exitProcedureCall(LynxParser.ProcedureCallContext ctx) {
        String name = ctx.stringArg().getText();
        statement = new StatementProcedureCall(name, new LinkedList<>());
        exit();
    }

    @Override
    public void exitPd(LynxParser.PdContext ctx) {
        statement = new StatementPenDown();
        exit();
    }

    @Override
    public void exitPu(LynxParser.PuContext ctx) {
        statement = new StatementPenUp();
        exit();
    }

    private void exit() {
        if (!statementCollector.isCollecting()) {
            statement.execute(executor);
        }
        else {
            statementCollector.addStatement(statement);
        }
        statement = null;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }
}