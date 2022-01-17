package interpreter.math.operations.singleOperation;

import interpreter.math.MathValue;
import interpreter.math.operations.MathException;

import static java.lang.Math.sqrt;


public class SqrtOperation extends SingleOperatorOperation {

    public SqrtOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if (element.getDoubleValue() < 0) {
            throw new MathException(MathException.NEGATIVE_SQRT, element);
        }
        if (checkVal == 0) {
            double value = element.getDoubleValue();
            return new MathValue(sqrt(value));
        }
        else {
            int value = element.getIntValue();
            return new MathValue(sqrt(value));
        }
    }
}