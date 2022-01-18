package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInt {

    @Test
    public void testInt1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.INT.name());
        linkedList.addLast("2.7");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(3, value.getDoubleValue());

    }
}
