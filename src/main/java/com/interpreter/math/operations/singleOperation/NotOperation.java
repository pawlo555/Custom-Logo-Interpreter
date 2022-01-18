package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;


public class NotOperation extends SingleOperatorOperation {

    public NotOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        boolean value = element.getBooleanValue();
        return new MathValue(!value);
    }
}
