package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLog {

    @Test
    public void testLog1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("10");
        linkedList.addLast(Operators.LOG.name());
        linkedList.addLast("10");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(1, value.getDoubleValue());

    }
}
