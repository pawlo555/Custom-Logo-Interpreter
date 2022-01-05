package interpreter.math.operators;

import interpreter.Turtle;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class TestAbs {

    @Test
    public void testAbs1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.ABS.name());
        linkedList.addLast("-5");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(5, value.getIntValue());

    }

    @Test
    public void testAbsDouble2() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast(Operators.ABS.name());
        linkedList.addLast("-5.7");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(5.7, value.getDoubleValue());


    }
}
