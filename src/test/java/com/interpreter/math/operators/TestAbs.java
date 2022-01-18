package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class TestAbs {

    @Test
    public void testAbs1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.ABS.name());
        linkedList.addLast("-5");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(5, value.getIntValue());

    }

    @Test
    public void testAbsDouble2() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.ABS.name());
        linkedList.addLast("-5.7");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(5.7, value.getDoubleValue());


    }
}
