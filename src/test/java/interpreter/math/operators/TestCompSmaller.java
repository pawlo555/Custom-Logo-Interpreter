package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompSmaller {

    @Test
    public void testCompSmaller1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast(Operators.COMPSMALLER.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(true, value.getBooleanValue());

    }
}
