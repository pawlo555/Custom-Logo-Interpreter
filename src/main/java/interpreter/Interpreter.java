package interpreter;

import grammar.LynxBaseListener;
import grammar.LynxBaseVisitor;
import grammar.LynxLexer;
import grammar.LynxParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Interpreter implements ConsoleListener {

    private final Executor executor;

    public Interpreter(Executor executor) {
        this.executor = executor;
    }

    public void parseCommands(String commands) {
        CharStream charStream = CharStreams.fromString(commands);
        LynxLexer lexer = new LynxLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LynxParser parser = new LynxParser(tokenStream);
        System.out.println(parser);
        ParseTree tree = parser.program();
        String result = tree.toStringTree(parser);
        LynxExecutorListener listener = new LynxExecutorListener();
        listener.setExecutor(executor);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

    }

    public void enterPressed(String command) {
        parseCommands(command);
    }
}
