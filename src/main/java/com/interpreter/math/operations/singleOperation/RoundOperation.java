package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;

import static java.lang.Math.round;


public class RoundOperation extends SingleOperatorOperation {

    public RoundOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if (checkVal == 0) {
            double value = element.getIntValue();
            return new MathValue(round(value));
        }
        else {
            int value = element.getIntValue();
            return new MathValue(value);
        }
    }
}