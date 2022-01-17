package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import interpreter.math.operations.MathException;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPower {

    @Test
    public void testPow1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("2");
        linkedList.addLast(Operators.POW.name());
        linkedList.addLast("3");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(8, value.getIntValue());
    }

    @Test
    public void testZeroToZero() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("0");
        linkedList.addLast(Operators.POW.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.ZERO_TO_ZERO + "0", thrown.getMessage());
    }

    @Test
    public void testInvalidState() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("-2");
        linkedList.addLast(Operators.POW.name());
        linkedList.addLast("3.4");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.NEGATIVE_POWER_BASE + "3.4", thrown.getMessage());
    }
}
