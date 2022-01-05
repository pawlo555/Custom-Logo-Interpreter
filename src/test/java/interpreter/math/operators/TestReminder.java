package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReminder {

    @Test
    public void testRemainder1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("7");
        linkedList.addLast(Operators.REMAINDER.name());
        linkedList.addLast("5");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(2, value.getIntValue());

    }
}
