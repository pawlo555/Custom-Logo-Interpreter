package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestOr {

    @Test
    public void testOr1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("0");
        linkedList.addLast(Operators.OR.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertFalse(value.getBooleanValue());

    }
}
