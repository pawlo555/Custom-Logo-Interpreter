package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExp {

    @Test
    public void testExp1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.EXP.name());
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(1, value.getDoubleValue());

    }
}
