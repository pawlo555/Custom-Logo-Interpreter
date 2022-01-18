package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCompere {

    @Test
    public void testComp1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("2");
        linkedList.addLast(Operators.COMP.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertTrue(value.getBooleanValue());
    }
}
