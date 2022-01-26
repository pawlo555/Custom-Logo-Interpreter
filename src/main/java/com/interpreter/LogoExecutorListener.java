package com.interpreter;

import com.grammar.LogoParser;
import com.interpreter.math.MathStatement;
import com.interpreter.statements.*;

import java.util.LinkedList;

public class LogoExecutorListener extends LogoMathListener {
    private Statement statement;
    private Executor executor;
    private final StatementCollector statementCollector = new StatementCollector();


    @Override
    public void exitForward(LogoParser.ForwardContext ctx) {
        MathStatement mathStatement = mathCollector.getMathStatement();
        statement = new StatementForward(ctx, mathStatement);
        System.out.println(mathStatement);
        exit();
    }

    @Override
    public void exitBack(LogoParser.BackContext ctx) {
        statement = new StatementBack(ctx, mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitRight(LogoParser.RightContext ctx) {
        statement = new StatementRight(ctx, mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitLeft(LogoParser.LeftContext ctx) {
        statement = new StatementLeft(ctx, mathCollector.getMathStatement());
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
        statement = new StatementHome(ctx);
        exit();
    }

    @Override
    public void exitClean(LogoParser.CleanContext ctx) {
        statement = new StatementClean(ctx);
        exit();
    }

    @Override
    public void exitIfc(LogoParser.IfcContext ctx) {
        statement = new StatementIf(ctx, mathCollector.getMathStatement(), statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitIfElse(LogoParser.IfElseContext ctx) {
        statement = new StatementIfElse(ctx, mathCollector.getMathStatement(), statementCollector.getCollectedStatements(),
                statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitRepeat(LogoParser.RepeatContext ctx) {
        MathStatement statementMath = mathCollector.getMathStatement();

        statement = new StatementRepeat(ctx, statementMath, statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitWhile1(LogoParser.While1Context ctx) {
        MathStatement statementMath = mathCollector.getMathStatement();
        statement = new StatementWhile(ctx, statementMath, statementCollector.getCollectedStatements());
        exit();
    }

    @Override
    public void exitProcedure(LogoParser.ProcedureContext ctx) {
        String name = ctx.stringArg().getText();
        LinkedList<String> variableNames = new LinkedList<>();
        for (LogoParser.VariableNameContext variableNameContext: ctx.variableName()) {
            variableNames.addLast(variableNameContext.getText());
        }
        Procedure procedure = new Procedure(ctx, name, statementCollector.getCollectedStatements(), variableNames);
        statement = new StatementProcedureCreation(ctx, name, procedure);
        exit();
    }

    @Override
    public void exitLet(LogoParser.LetContext ctx) {
        String name = ctx.variableName().getText();
        MathStatement mathStatement = mathCollector.getMathStatement();
        statement = new StatementLet(ctx, name, mathStatement);
        exit();
    }

    @Override
    public void exitAssign(LogoParser.AssignContext ctx) {
        String name = ctx.variableName().getText();
        MathStatement mathStatement = mathCollector.getMathStatement();
        statement = new StatementAssign(ctx, name, mathStatement);
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
        statement = new StatementProcedureCall(ctx, name, mathStatementList);
        exit();
    }

    @Override
    public void exitPd(LogoParser.PdContext ctx) {
        statement = new StatementPenDown(ctx);
        exit();
    }

    @Override
    public void exitPu(LogoParser.PuContext ctx) {
        statement = new StatementPenUp(ctx);
        exit();
    }

    @Override
    public void exitSetpensize(LogoParser.SetpensizeContext ctx){
        statement = new StatementSetPenSize(ctx,mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitSetcolor(LogoParser.SetcolorContext ctx){
        statement = new StatementSetPenColor(ctx,mathCollector.getMathStatement());
        exit();
    }
    @Override
    public void exitNewTurtle(LogoParser.NewTurtleContext ctx){
        String name = ctx.stringArg().getText();
        if(!name.equals("<missing OTHERWORD>")){
            System.out.println("THIS IS NAME ----> " + name + "W\n");
            statement = new StatementNewTurtle(ctx,name);
            exit();
        }
    }

    @Override
    public void exitRename(LogoParser.RenameContext ctx){
        String name = ctx.stringArg().getText();
        statement = new StatementRename(ctx,name);
        exit();
    }

    @Override
    public void exitChangeTurtle (LogoParser.ChangeTurtleContext ctx){
        String name = ctx.stringArg().getText();
        statement = new StatementChangeTurtle(ctx,name);
        exit();
    }

    @Override
    public void exitRemoveTurtle (LogoParser.RemoveTurtleContext ctx){
        String name = ctx.stringArg().getText();
        statement = new StatementRemoveTurtle(ctx,name);
        exit();
    }

    @Override
    public void enterComment(LogoParser.CommentContext ctx){
        statementCollector.startEndComment();
    }

    @Override
    public void exitComment(LogoParser.CommentContext ctx){
        statementCollector.startEndComment();
    }

    private void exit() {
        if(!statementCollector.isComment()){
            if (!statementCollector.isCollecting()) {
                statement.execute(executor);
            }
            else {
                statementCollector.addStatement(statement);
            }
        }
        statement = null;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }
}