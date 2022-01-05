package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMinusSingle {

    @Test
    public void testMinusSingle1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.MINUS_SINGLE.name());
        linkedList.addLast("5.0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(-5, value.getDoubleValue());

    }
}
