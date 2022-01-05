package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.engine.MockEngine;
import interpreter.math.MathStatement;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatementRepeat {

    @Test
    public void simpleRepeat() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> timesMathElement = new LinkedList<>();
        timesMathElement.addLast("4");

        LinkedList<String> forwardMathElements = new LinkedList<>();
        forwardMathElements.addLast("100");
        StatementForward forward = new StatementForward(new MathStatement(forwardMathElements));
        LinkedList<String> leftMathElements = new LinkedList<>();
        leftMathElements.addLast("90");
        StatementLeft left = new StatementLeft(new MathStatement(leftMathElements));

        LinkedList<Statement> statementList = new LinkedList<>();
        statementList.addLast(forward);
        statementList.addLast(left);
        StatementRepeat repeat = new StatementRepeat(new MathStatement(timesMathElement), statementList);
        repeat.execute(executor);

        assertEquals(4, engine.getLeftTimes());
        assertEquals(4, engine.getForwardTimes());
        assertEquals(360, engine.getLeftAmount());
        assertEquals(400, engine.getForwardAmount());
    }

    @Test
    public void nestedRepeat() {
        MockEngine engine = new MockEngine();
        Executor executor = new Executor(engine);
        LinkedList<String> timesMathElement = new LinkedList<>();
        timesMathElement.addLast("4");

        LinkedList<String> leftMathElements = new LinkedList<>();
        leftMathElements.addLast("50");
        StatementForward forward = new StatementForward(new MathStatement(leftMathElements));
        LinkedList<Statement> nestedLoopStatements = new LinkedList<>();
        nestedLoopStatements.addLast(forward);

        LinkedList<String> nestedLoopElements = new LinkedList<>();
        nestedLoopElements.addLast("20");
        StatementRepeat nestedLoop = new StatementRepeat(new MathStatement(nestedLoopElements), nestedLoopStatements);


        LinkedList<Statement> statementList = new LinkedList<>();
        statementList.addLast(nestedLoop);
        statementList.addLast(forward);
        StatementRepeat repeat = new StatementRepeat(new MathStatement(timesMathElement), statementList);
        repeat.execute(executor);

        assertEquals((20+1)*4, engine.getForwardTimes());
        assertEquals(50*(20+1)*4, engine.getForwardAmount());
    }
}
