package interpreter.math.operators;

import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import interpreter.math.Operators;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompBiggerEquals {

    @Test
    public void testCompBiggerEquals1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("3");
        linkedList.addLast(Operators.COMPBIGGEREQUALS.name());
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(true, value.getBooleanValue());

    }
}
