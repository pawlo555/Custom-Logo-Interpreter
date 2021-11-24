package interpreter;

import grammar.LynxLexer;
import grammar.LynxParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter implements ConsoleListener {

    private final Engine engine;

    public Interpreter(Engine engine) {
        this.engine = engine;
    }

    public void parseCommands(String commands) {
        CharStream charStream = CharStreams.fromString(commands);
        LynxLexer lexer = new LynxLexer(charStream);
        Token token = lexer.getToken();
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LynxParser parser = new LynxParser(tokenStream);
        System.out.println(parser);
        ParseTree tree = parser.program();
        System.out.println(tree.getChildCount());
        System.out.println( parser.getBuildParseTree());
        //ParseTree tree = context.getChild(0);
        //System.out.println(tree);
    }

    public void enterPressed(String command) {
        parseCommands(command);
    }
}
