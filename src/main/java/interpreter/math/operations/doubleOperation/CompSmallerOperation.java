package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;

public class CompSmallerOperation extends DoubleOperatorOperation {

    public CompSmallerOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        return new CompBiggerEqualsOperation(secondElement, firstElement).evaluate();
    }


}