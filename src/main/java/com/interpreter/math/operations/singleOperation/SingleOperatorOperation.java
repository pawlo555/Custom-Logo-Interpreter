package com.interpreter.math.operations.singleOperation;

import com.interpreter.math.MathValue;
import com.interpreter.math.operations.Operation;


public abstract class SingleOperatorOperation implements Operation {

    protected final MathValue element;

    public SingleOperatorOperation(MathValue element) {
        this.element = element;
    }

    public abstract MathValue evaluate();
}
