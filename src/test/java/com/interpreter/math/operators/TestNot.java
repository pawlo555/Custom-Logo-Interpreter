package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestNot {

    @Test
    public void testNot1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.NOT.name());
        linkedList.addLast("1.0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertFalse(value.getBooleanValue());

    }
}
