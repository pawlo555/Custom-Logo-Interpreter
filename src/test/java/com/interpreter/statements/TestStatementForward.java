package com.interpreter.statements;

import com.interpreter.Executor;
import com.interpreter.engine.MockEngine;
import com.interpreter.math.MathStatement;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatementForward {

    @Test
    public void simpleForward() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("100");

        StatementForward forward = new StatementForward(null, new MathStatement(mathElements));
        forward.execute(executor);

        assertEquals(1, engine.getForwardTimes());
        assertEquals(100, engine.getForwardAmount(), 4);
    }

    @Test
    public void multipleForward() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> mathElements = new LinkedList<>();
        mathElements.addLast("50");

        StatementForward forward = new StatementForward(null, new MathStatement(mathElements));
        forward.execute(executor);

        StatementForward secondForward = new StatementForward(null, new MathStatement(mathElements));
        secondForward.execute(executor);

        assertEquals(2, engine.getForwardTimes());
        assertEquals(100, engine.getForwardAmount(), 4);
    }
}
