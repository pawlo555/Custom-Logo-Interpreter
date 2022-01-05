package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSin {

    @Test
    public void testSin1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.SIN.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(0, value.getDoubleValue());

    }
}
