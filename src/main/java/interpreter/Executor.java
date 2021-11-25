package interpreter;

public class Executor {
    private Engine engine;

    public Executor(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
