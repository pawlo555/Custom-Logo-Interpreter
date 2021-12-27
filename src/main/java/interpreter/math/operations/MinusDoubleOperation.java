package interpreter.math.operations;

import interpreter.math.MathValue;

public class MinusDoubleOperation extends DoubleOperatorOperation {

    public MinusDoubleOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int firstValue = secondElement.getIntValue();
        int secondValue = firstElement.getIntValue();

        return new MathValue(firstValue-secondValue);
    }
}
