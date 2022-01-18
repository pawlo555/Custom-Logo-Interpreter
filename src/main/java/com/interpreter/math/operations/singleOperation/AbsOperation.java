package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;

public class AbsOperation extends SingleOperatorOperation {

    public AbsOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if (checkVal == 0) {
            double value = element.getDoubleValue();
            if(value < 0) {
                return new MathValue(-value);
            }
            else {
                return new MathValue(value);
            }
        }
        else {
            int value = element.getIntValue();
            if (value < 0) {
                return new MathValue(-value);
            }
            else {
                return new MathValue(value);
            }
        }
    }
}
