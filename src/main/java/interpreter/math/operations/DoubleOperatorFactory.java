package interpreter.math.operations;

import interpreter.math.MathValue;
import interpreter.math.Operators;

public class DoubleOperatorFactory {

    public static DoubleOperatorOperation factorOperation(Operators operator, MathValue firstValue, MathValue secondValue) {
        return switch(operator) {
            case PLUS -> new AddOperation(firstValue, secondValue);
            case MINUS -> new MinusDoubleOperation(firstValue, secondValue);
            default -> throw new IllegalStateException("Unsupported operator");
        };
    }

}
