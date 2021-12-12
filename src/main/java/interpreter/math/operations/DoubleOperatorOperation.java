package interpreter.math.operations;

import interpreter.math.MathValue;


public abstract class DoubleOperatorOperation implements Operation {

    protected final MathValue firstElement;
    protected final MathValue secondElement;

    public DoubleOperatorOperation(MathValue firstElement, MathValue secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public abstract MathValue evaluate();
}
