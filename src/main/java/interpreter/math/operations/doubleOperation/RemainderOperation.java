package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;


public class RemainderOperation extends DoubleOperatorOperation {

    public RemainderOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int first = firstElement.getIntValue();
        int second = secondElement.getIntValue();
        return new MathValue(second%first);
    }
}