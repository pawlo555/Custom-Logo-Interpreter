package interpreter;

import interpreter.engine.Engine;

public class Executor {
    private final Engine engine;
    private final Environment environment = new Environment();

    public Executor(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Environment getEnvironment() { return environment;}


}
