package interpreter.statements;

import interpreter.Executor;
import interpreter.engine.MockEngine;
import interpreter.math.MathStatement;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatementLeft {

    @Test
    public void simpleLeft() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("90");

        StatementLeft left = new StatementLeft(new MathStatement(mathElements));
        left.execute(executor);

        assertEquals(1, engine.getLeftTimes());
        assertEquals(90, engine.getLeftAmount());
    }

    @Test
    public void multipleLeft() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("45");

        for (int i=0; i<4; i++) {
            StatementLeft left = new StatementLeft(new MathStatement(mathElements));
            left.execute(executor);
        }

        assertEquals(4, engine.getLeftTimes());
        assertEquals(180, engine.getLeftAmount());
    }
}
