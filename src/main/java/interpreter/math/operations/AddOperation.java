package interpreter.math.operations;

import interpreter.math.MathValue;


public class AddOperation extends DoubleOperatorOperation {

    public AddOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int first = firstElement.getIntValue();
        int second = secondElement.getIntValue();
        return new MathValue(first+second);
    }


}
