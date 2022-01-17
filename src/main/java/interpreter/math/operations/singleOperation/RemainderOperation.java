package interpreter.math.operations.singleOperation;

import interpreter.math.MathValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorOperation;


public class RemainderOperation extends DoubleOperatorOperation {

    public RemainderOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int firstCheckValue = firstElement.checkValue();
        int secondCheckValue = secondElement.checkValue();
        if (firstCheckValue == 0 || secondCheckValue == 0) {
            double first = firstElement.getIntValue();
            double second = secondElement.getIntValue();
            return new MathValue(second%first);
        }
        else {
            int first = firstElement.getIntValue();
            int second = secondElement.getIntValue();
            return new MathValue(second%first);
        }
    }
}