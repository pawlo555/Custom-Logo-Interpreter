package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;

import java.util.Random;


public class RandOperation extends SingleOperatorOperation {

    public RandOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int value = element.getIntValue();
        Random r = new Random();
        return new MathValue(r.nextInt(value));
    }
}