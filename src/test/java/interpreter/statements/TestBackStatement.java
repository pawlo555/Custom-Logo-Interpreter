package interpreter.statements;

import interpreter.Executor;
import interpreter.engine.MockEngine;
import interpreter.math.MathStatement;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBackStatement {

    @Test
    public void simpleBack() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("100");

        StatementBack back = new StatementBack(null, new MathStatement(mathElements));
        back.execute(executor);

        assertEquals(1, engine.getBackTimes());
        assertEquals(100, engine.getBackAmount(), 4);
    }

    @Test
    public void multipleBack() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("50");

        for (int i=0; i<10; i++) {
            StatementBack back = new StatementBack(null, new MathStatement( mathElements));
            back.execute(executor);
        }

        assertEquals(10, engine.getBackTimes());
        assertEquals(500, engine.getBackAmount(), 4);
    }
}
