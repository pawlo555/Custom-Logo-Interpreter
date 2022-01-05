package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMultiply {

    @Test
    public void testMultiply1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("32");
        linkedList.addLast(Operators.MULTIPLY.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(64, value.getIntValue());

    }
}
