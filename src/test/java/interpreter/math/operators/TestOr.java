package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOr {

    @Test
    public void testOr1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("0");
        linkedList.addLast(Operators.OR.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(false, value.getBooleanValue());

    }
}
