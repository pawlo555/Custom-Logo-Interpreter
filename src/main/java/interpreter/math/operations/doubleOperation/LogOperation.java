package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;
import interpreter.math.operations.MathException;

public class LogOperation extends DoubleOperatorOperation {

    public LogOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int firstCheckValue = firstElement.checkValue();
        int secondCheckValue = secondElement.checkValue();
        if(firstCheckValue == 0 || secondCheckValue == 0){
            double base = firstElement.getIntValue();
            double antiLogarithm = secondElement.getIntValue();
            if (base < 0.0 || base == 1) {
                throw new MathException(MathException.LOG_BASE, base);
            }
            if (antiLogarithm < 0.0) {
                throw new MathException(MathException.LOG_ANTI_LOGARITHM, antiLogarithm);
            }
            return new MathValue(Math.log(antiLogarithm) / Math.log(base));
        }
        else{
            int base = firstElement.getIntValue();
            int antiLogarithm = secondElement.getIntValue();
            if (base < 0 || base == 1) {
                throw new MathException(MathException.LOG_BASE, base);
            }
            if (antiLogarithm < 0.0) {
                throw new MathException(MathException.LOG_ANTI_LOGARITHM, antiLogarithm);
            }
            return new MathValue(Math.log(antiLogarithm) / Math.log(base));
        }
    }
}
