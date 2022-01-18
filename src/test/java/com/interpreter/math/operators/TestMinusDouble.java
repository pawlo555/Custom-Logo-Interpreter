package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMinusDouble {

    @Test
    public void testMinus1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("5");
        linkedList.addLast(Operators.MINUS.name());
        linkedList.addLast("1");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(4, value.getIntValue());

    }
}
