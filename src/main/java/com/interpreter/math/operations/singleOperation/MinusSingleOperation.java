package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;

public class MinusSingleOperation extends SingleOperatorOperation {

    public MinusSingleOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if(checkVal == 0) {
            double value = element.getIntValue();
            return new MathValue(-value);
        }
        else {
            int value = element.getIntValue();
            return new MathValue(-value);
        }
    }
}
