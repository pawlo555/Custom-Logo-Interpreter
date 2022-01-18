package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompBigger {

    @Test
    public void testCompBigger1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("3");
        linkedList.addLast(Operators.COMPBIGGER.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(true, value.getBooleanValue());

    }
}
