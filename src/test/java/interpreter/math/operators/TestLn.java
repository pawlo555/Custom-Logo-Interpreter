package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import interpreter.math.operations.MathException;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLn {

    @Test
    public void testLn1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.LN.name());
        linkedList.addLast("1");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(0, value.getDoubleValue());

    }

    @Test
    public void testLn0() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.LN.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.LOG_ANTI_LOGARITHM + "0", thrown.getMessage());
    }

    @Test
    public void testLnFromNegative() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.LN.name());
        linkedList.addLast("-5.0");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.LOG_ANTI_LOGARITHM + "-5.0", thrown.getMessage());
    }
}
