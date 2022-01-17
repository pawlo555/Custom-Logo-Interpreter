package interpreter.math.operations.singleOperation;

import interpreter.math.MathValue;
import interpreter.math.operations.MathException;

import static java.lang.Math.log;


public class LnOperation extends SingleOperatorOperation {

    public LnOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() throws MathException {
        if (element.getDoubleValue() <= 0 ) {
            throw new MathException(MathException.LOG_ANTI_LOGARITHM, element);
        }
        int checkVal = element.checkValue();
        if (checkVal == 0) {
            double value = element.getDoubleValue();
            return new MathValue(log(value));
        }
        else {
            int value = element.getIntValue();
            return new MathValue(log(value));
        }
    }
}
