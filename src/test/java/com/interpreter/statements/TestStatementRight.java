package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.engine.MockEngine;
import com.interpreter.math.MathStatement;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatementRight {
    @Test
    public void simpleRight() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("90");

        StatementRight right = new StatementRight(null, new MathStatement(mathElements));
        right.execute(executor);

        assertEquals(1, engine.getRightTimes());
        assertEquals(90, engine.getRightAmount());
    }

    @Test
    public void multipleLeft() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("90");

        for (int i=0; i<2; i++) {
            StatementRight right = new StatementRight(null, new MathStatement(mathElements));
            right.execute(executor);
        }

        assertEquals(2, engine.getRightTimes());
        assertEquals(180, engine.getRightAmount());
    }
}
