package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import interpreter.math.operations.MathException;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDivide {

    @Test
    public void testDivide1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("16");
        linkedList.addLast(Operators.DIVIDE.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(8, value.getIntValue());

    }

    @Test
    public void zeroDivision() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("16");
        linkedList.addLast(Operators.DIVIDE.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);

        MathException thrown = assertThrows(MathException.class, () -> statement.evaluate(null));
        assertEquals(MathException.PREFIX+MathException.ZERO_DIVISION + "0", thrown.getMessage());
    }
}
