package com.interpreter.math.operations.doubleOperation;

import com.interpreter.math.MathValue;


public class CompSmallerEqualsOperation extends DoubleOperatorOperation {

    public CompSmallerEqualsOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        return new CompBiggerEqualsOperation(secondElement, firstElement).evaluate();
    }


}
