package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCompSmaller {

    @Test
    public void testCompSmaller1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast(Operators.COMPSMALLER.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertTrue(value.getBooleanValue());
    }
}
