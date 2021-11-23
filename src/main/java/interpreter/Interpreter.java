package interpreter;

import programme.elements.Console;

public class Interpreter implements ConsoleListener {

    private final Engine engine;

    public Interpreter(Engine engine) {
        this.engine = engine;
    }

    public void parseCommands(String commands) {
        System.out.println(commands);
    }

    public void enterPressed(String command) {
        parseCommands(command);
    }
}
