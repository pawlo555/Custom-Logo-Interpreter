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
        checkErrors();
        if(firstCheckValue == 0 || secondCheckValue == 0){
            double base = firstElement.getDoubleValue();
            double antiLogarithm = secondElement.getDoubleValue();
            return new MathValue(Math.log(antiLogarithm) / Math.log(base));
        }
        else{
            int base = firstElement.getIntValue();
            int antiLogarithm = secondElement.getIntValue();
            return new MathValue(Math.log(antiLogarithm) / Math.log(base));
        }
    }

    private void checkErrors() {
        double base = firstElement.getDoubleValue();
        if (base == 1 || base <= 0) {
            throw new MathException(MathException.LOG_BASE, firstElement);
        }

        double antiLogarithm = secondElement.getDoubleValue();
        if (antiLogarithm <= 0.0) {
            throw new MathException(MathException.LOG_ANTI_LOGARITHM, secondElement);
        }
    }
}
