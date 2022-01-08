package interpreter;

import grammar.LogoParser;
import grammar.LogoLexer;
import grammar.LogoParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import programme.elements.ErrorOutput;

public class Interpreter implements ConsoleListener {

    private final Executor executor;
    private final ErrorOutput error_output;

    public Interpreter(Executor executor, ErrorOutput error_output) {
        this.executor = executor;
        this.error_output = error_output;
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
        } catch (Exception exception) {
            error_output.setText(exception.getMessage());
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
            throw new IllegalArgumentException(message);
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
