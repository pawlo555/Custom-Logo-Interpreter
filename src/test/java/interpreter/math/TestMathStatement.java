package interpreter.math;

import interpreter.Turtle;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class TestMathStatement {

    @Test
    public void testAdding() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("2");
        linkedList.addLast("PLUS");
        linkedList.addLast("2");
        linkedList.addLast("PLUS");
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(6, value.getIntValue());

    }
}