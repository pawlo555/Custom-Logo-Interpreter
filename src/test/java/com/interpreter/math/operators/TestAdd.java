package com.interpreter.math.operators;

import com.interpreter.math.MathStatement;
import com.interpreter.math.MathValue;
import com.interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class TestAdd {

    @Test
    public void testAdding1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("2");
        linkedList.addLast(Operators.PLUS.name());
        linkedList.addLast("2");
        linkedList.addLast(Operators.PLUS.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(6, value.getIntValue());

    }
}
