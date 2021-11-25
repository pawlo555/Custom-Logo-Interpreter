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
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LynxParser parser = new LynxParser(tokenStream);
        System.out.println(parser);
        ParseTree tree = parser.program();
        String result = tree.toStringTree(parser);
        System.out.println(result);
        ParseTree child = tree.getChild(0);
        ParseTree command = child.getChild(0);
        parseCommand(command);
        System.out.println(tree.getChildCount());
        System.out.println( parser.getBuildParseTree());
        ParseTree commandName = tree.getChild(0);

    }

    public void parseCommand(ParseTree command) {
        String commandName = command.getChild(0).getText();
        String commandValue = command.getChild(2).getText();
        int value = Integer.parseInt(commandValue);
        switch(commandName) {
            case "forward": engine.forward(value); break;
            case "BACK": engine.backward(value); break;
            case "LEFT": engine.left(value); break;
            case "RIGHT": engine.right(value);  break;
            default: throw new IllegalStateException("Invalid commandName");
        }

    }

    public void enterPressed(String command) {
        parseCommands(command);
    }
}
