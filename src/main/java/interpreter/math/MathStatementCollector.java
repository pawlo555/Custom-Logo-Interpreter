package interpreter.math;

import java.util.LinkedList;

public class MathStatementCollector {
    LinkedList<String> statements;


    public void startCollecting() {
        statements = new LinkedList<>();
    };

    public void endCollecting() {
        System.out.println(statements);
    };

    public void collect(String value) {
        statements.addLast(value);
    }
}
