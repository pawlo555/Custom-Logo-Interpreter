package com.interpreter.math.operations.doubleOperation;

import com.interpreter.math.MathValue;
import com.interpreter.math.operations.Operation;


public abstract class DoubleOperatorOperation implements Operation {

    protected final MathValue firstElement;
    protected final MathValue secondElement;

    public DoubleOperatorOperation(MathValue firstElement, MathValue secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public abstract MathValue evaluate();
}
