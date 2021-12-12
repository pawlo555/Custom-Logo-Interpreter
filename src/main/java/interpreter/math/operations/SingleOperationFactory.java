package interpreter.math.operations;

import interpreter.math.MathValue;
import interpreter.math.Operators;

public class SingleOperationFactory {

    public static SingleOperatorOperation factorOperation(Operators operator, MathValue value) {
        return switch(operator) {
            case LN -> new LnOperation(value);
            case MINUS_SINGLE -> new MinusSingleOperation(value);
            default -> throw new IllegalStateException("Unsupported operator");
        };
    }
}
