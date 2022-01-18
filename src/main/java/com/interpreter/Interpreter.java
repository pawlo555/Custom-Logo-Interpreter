package com.interpreter;

import com.grammar.LogoParser;
import com.grammar.LogoLexer;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Interpreter implements ConsoleListener {

    private final Executor executor;
    private final TextArea errorOutput;

    public Interpreter(Executor executor, TextArea errorOutput) {
        this.executor = executor;
        this.errorOutput = errorOutput;
    }

    private void parseCommands(String command) {
        LogoParser parser = generateParser(command);
        ErrorListener errorListener = addErrorListenerToParser(parser);
        ParseTree tree = parser.program();
        walkTheTree(tree);
        checkParserErrors(errorListener);
    }

    public void executeCode(String command) {
        try {
            parseCommands(command);
            errorOutput.setText(" ");
        } catch (Exception exception) {
            errorOutput.setText(exception.getMessage());
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
            System.out.println("Message:" +  message);
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

    public Executor getExecutor() {
        return executor;
    }
}
