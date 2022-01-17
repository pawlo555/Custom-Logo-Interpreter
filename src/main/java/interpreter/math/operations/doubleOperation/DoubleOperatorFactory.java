package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;
import interpreter.math.Operators;

public class DoubleOperatorFactory {

    public static DoubleOperatorOperation factorOperation(Operators operator, MathValue firstValue, MathValue secondValue) {
        return switch(operator) {
            case PLUS -> new AddOperation(firstValue, secondValue);
            case MINUS -> new MinusDoubleOperation(firstValue, secondValue);
            case COMP -> new CompereOperation(firstValue, secondValue);
            case COMPSMALLER -> new CompSmallerOperation(firstValue, secondValue);
            case COMPSMALLEREQUALS -> new CompSmallerEqualsOperation(firstValue, secondValue);
            case COMPBIGGER -> new CompBiggerOperation(firstValue, secondValue);
            case COMPBIGGEREQUALS -> new CompBiggerEqualsOperation(firstValue, secondValue);
            case AND -> new AndOperation(firstValue, secondValue);
            case OR -> new OrOperation(firstValue, secondValue);
            case REMAINDER -> new RemainderOperation(firstValue, secondValue);
            case DIVIDE -> new DivideOperation(firstValue, secondValue);
            case POW -> new PowerOperation(firstValue, secondValue);
            case LOG -> new LogOperation(firstValue, secondValue);
            case MULTIPLY -> new MultiplyOperation(firstValue, secondValue);
            default -> throw new IllegalStateException("Unsupported operator");
        };
    }
}
