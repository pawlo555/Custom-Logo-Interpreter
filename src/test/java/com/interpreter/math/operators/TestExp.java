package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExp {

    @Test
    public void testExp1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.EXP.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(1, value.getDoubleValue());

    }
}
