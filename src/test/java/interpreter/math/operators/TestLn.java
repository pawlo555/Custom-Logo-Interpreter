package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
