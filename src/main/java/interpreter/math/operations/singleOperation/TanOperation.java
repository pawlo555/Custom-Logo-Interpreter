package interpreter.math.operations.singleOperation;

import interpreter.math.MathValue;

import static java.lang.Math.tan;


public class TanOperation extends SingleOperatorOperation {

    public TanOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if(checkVal == 0) {
            double value = element.getDoubleValue();
            return new MathValue(tan(value));
        }
        else {
            int value = element.getIntValue();
            return new MathValue(tan(value));
        }
    }
}