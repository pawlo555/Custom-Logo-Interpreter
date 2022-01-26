package com.interpreter;

import com.grammar.LogoLexer;
import com.grammar.LogoParser;
import com.programme.controllers.Controller;
import com.programme.elements.VariablesDisplayer;
import javafx.application.Platform;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserThread extends Thread {

    private final Executor executor;
    private final TextArea errorOutput;
    private final VariablesDisplayer displayer;
    private final String command;

    public ParserThread(Executor executor, Controller controller, String command) {
        this.executor = executor;
        this.errorOutput = controller.getErrorLabel();
        this.displayer = controller.getDisplayer();
        this.command = command;
    }

    @Override
    public void run() {
        try {
            Platform.runLater(() -> errorOutput.setText(" "));
            parseCommands();
        }
        catch (Exception exception) {
            System.out.println("Exception:" + exception.getMessage());
            errorOutput.setText(exception.getMessage());
        }
        finally {
            Platform.runLater(displayer::displayEnvironment);

        }
    }

    private LogoParser generateParser(String command) {
        CharStream charStream = CharStreams.fromString(command);
        LogoLexer lexer = new LogoLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        return new LogoParser(tokenStream);
    }

    private ErrorListener addErrorListenerToParser(LogoParser parser) {
        ErrorListener errorListener = new ErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        return errorListener;
    }

    private void checkParserErrors(ErrorListener errorListener) {
        if (errorListener.hasErrors()) {
            String message = errorListener.getErrors();
            errorListener.clearErrors();
            throw new IllegalStateException(message);
        }
    }

    private void walkTheTree(ParseTree tree) {
        LogoExecutorListener listener = new LogoExecutorListener();
        listener.setExecutor(executor);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    public void parseCommands() {
        try {
            operations();
        }
        catch (InterruptedException exception) {
            System.out.println("General interrupt");
            throw new IllegalStateException("Stopped clicked");
        }
    }

    private void operations() throws InterruptedException {
        LogoParser parser = generateParser(command);
        ErrorListener errorListener = addErrorListenerToParser(parser);
        ParseTree tree = parser.program();
        walkTheTree(tree);
        checkParserErrors(errorListener);
    }
}
