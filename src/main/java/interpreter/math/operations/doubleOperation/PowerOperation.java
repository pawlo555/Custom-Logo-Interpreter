package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;
import interpreter.math.operations.MathException;

public class PowerOperation extends DoubleOperatorOperation {

    public PowerOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int firstCheckValue = firstElement.checkValue();
        int secondCheckValue = secondElement.checkValue();
        if(firstCheckValue == 0 || secondCheckValue == 0){
            double first = firstElement.getIntValue();
            double second = secondElement.getIntValue();
            if (first < 0) {
                throw new MathException(MathException.NEGATIVE_POWER_BASE, first);
            }
            if (first == 0.0 && second == 0.0) {
                throw new MathException(MathException.ZERO_TO_ZERO, first);
            }
            return new MathValue(Math.pow(second,first));
        }
        else{
            int first = firstElement.getIntValue();
            int second = secondElement.getIntValue();
            if (first == 0 && second == 0) {
                throw new MathException(MathException.ZERO_TO_ZERO, first);
            }
            return new MathValue((int) Math.pow(second,first));
        }
    }


}
