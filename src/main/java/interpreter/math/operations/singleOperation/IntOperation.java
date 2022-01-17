package interpreter.math.operations.singleOperation;

import interpreter.math.MathValue;



public class IntOperation extends SingleOperatorOperation {

    public IntOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int value = element.getIntValue();
        return new MathValue(value);
    }
}