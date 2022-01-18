package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReminder {

    @Test
    public void testRemainder1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("7");
        linkedList.addLast(Operators.REMAINDER.name());
        linkedList.addLast("5");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(2, value.getIntValue());

    }
}
