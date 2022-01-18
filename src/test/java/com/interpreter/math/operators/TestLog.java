package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import com.interpreter.math.operations.MathException;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLog {

    @Test
    public void testLog1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("100");
        linkedList.addLast(Operators.LOG.name());
        linkedList.addLast("10");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(2, value.getDoubleValue());
    }

    @Test
    public void testNegativeBase() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("23425");
        linkedList.addLast(Operators.LOG.name());
        linkedList.addLast(Operators.MINUS_SINGLE.name());
        linkedList.addLast("3");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.LOG_BASE + "-3", thrown.getMessage());
    }

    @Test
    public void testBaseEqualsOne() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast(Operators.LOG.name());
        linkedList.addLast("1");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.LOG_BASE + "1", thrown.getMessage());
    }

    @Test
    public void wrongAntiLogarithm() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("-100");
        linkedList.addLast(Operators.LOG.name());
        linkedList.addLast("1.5");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.LOG_ANTI_LOGARITHM + "-100", thrown.getMessage());
    }
}
