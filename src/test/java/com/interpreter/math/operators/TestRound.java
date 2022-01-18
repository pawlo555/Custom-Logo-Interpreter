package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRound {

    @Test
    public void testRound1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.ROUND.name());
        linkedList.addLast("2.99");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(3, value.getDoubleValue());

    }
}
