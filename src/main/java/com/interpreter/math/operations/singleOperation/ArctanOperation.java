package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;

import static java.lang.StrictMath.atan;


public class ArctanOperation extends SingleOperatorOperation {

    public ArctanOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if (checkVal == 0) {
            double value = element.getDoubleValue();
            return new MathValue(atan(value));
        }
        else {
            int value = element.getIntValue();
            return new MathValue(atan(value));
        }
    }
}
