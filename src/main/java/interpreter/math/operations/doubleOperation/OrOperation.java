package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;


public class OrOperation extends DoubleOperatorOperation {

    public OrOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        boolean first = firstElement.getBooleanValue();
        boolean second = secondElement.getBooleanValue();
        return new MathValue(first || second);
    }
}
