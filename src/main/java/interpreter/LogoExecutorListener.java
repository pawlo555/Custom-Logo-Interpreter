package interpreter;

import grammar.LogoParser;
import interpreter.math.MathStatement;
import interpreter.statements.*;

import java.util.LinkedList;

public class LogoExecutorListener extends LogoMathListener {
    private Statement statement;
    private Executor executor;
    private final StatementCollector statementCollector = new StatementCollector();


    @Override
    public void exitForward(LogoParser.ForwardContext ctx) {
        statement = new StatementForward(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitBack(LogoParser.BackContext ctx) {
        statement = new StatementBack(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitRight(LogoParser.RightContext ctx) {
        statement = new StatementRight(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitLeft(LogoParser.LeftContext ctx) {
        statement = new StatementLeft(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void enterCommandsList(LogoParser.CommandsListContext ctx) {
        statementCollector.startCollecting();
    }

    @Override
    public void exitCommandsList(LogoParser.CommandsListContext ctx) {
        statementCollector.endCollecting();
    }

    @Override
    public void exitHome(LogoParser.HomeContext ctx) {
        statement = new StatementHome();
        exit();
    }

    @Override
    public void exitClean(LogoParser.CleanContext ctx) {
        statement = new StatementClean();
        exit();
    }

    @Override
    public void exitIfc(LogoParser.IfcContext ctx) {
        statement = new StatementIf(mathCollector.getMathStatement(), statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitIfElse(LogoParser.IfElseContext ctx) {
        statement = new StatementIfElse(mathCollector.getMathStatement(), statementCollector.getCollectedStatements(),
                statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitRepeat(LogoParser.RepeatContext ctx) {
        MathStatement statementMath = mathCollector.getMathStatement();

        statement = new StatementRepeat(statementMath, statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitWhile1(LogoParser.While1Context ctx) {
        MathStatement statementMath = mathCollector.getMathStatement();
        statement = new StatementWhile(statementMath, statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitProcedure(LogoParser.ProcedureContext ctx) {
        String name = ctx.stringArg().getText();
        LinkedList<String> variableNames = new LinkedList<>();
        for (LogoParser.VariableNameContext variableNameContext: ctx.variableName()) {
            variableNames.addLast(variableNameContext.getText());
        }
        Procedure procedure = new Procedure(name, statementCollector.getCollectedStatements(), variableNames);
        statement = new StatementProcedureCreation(name, procedure);
        exit();
    }

    @Override
    public void exitLet(LogoParser.LetContext ctx) {
        String name = ctx.variableName().getText();
        MathStatement mathStatement = mathCollector.getMathStatement();
        statement = new StatementLet(name, mathStatement);
        exit();
    }

    @Override
    public void exitAssign(LogoParser.AssignContext ctx) {
        String name = ctx.variableName().getText();
        MathStatement mathStatement = mathCollector.getMathStatement();
        statement = new StatementLet(name, mathStatement);
        exit();
    }

    @Override
    public void exitProcedureCall(LogoParser.ProcedureCallContext ctx) {
        String name = ctx.stringArg().getText();
        ctx.mathStatement();
        LinkedList<MathStatement> mathStatementList = new LinkedList<>();
        for (int i=0; i<ctx.mathStatement().size(); i++) {
            mathStatementList.addLast(mathCollector.getMathStatement());
        }
        statement = new StatementProcedureCall(name, mathStatementList);
        exit();
    }

    @Override
    public void exitPd(LogoParser.PdContext ctx) {
        statement = new StatementPenDown();
        exit();
    }

    @Override
    public void exitPu(LogoParser.PuContext ctx) {
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