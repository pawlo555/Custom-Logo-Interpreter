package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMinusSingle {

    @Test
    public void testMinusSingle1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.MINUS_SINGLE.name());
        linkedList.addLast("5.0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(-5, value.getDoubleValue());

    }
}
