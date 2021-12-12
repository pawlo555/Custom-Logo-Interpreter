package interpreter.math.operations;

import interpreter.math.MathValue;


public abstract class SingleOperatorOperation implements Operation {

    protected final MathValue element;

    public SingleOperatorOperation(MathValue element) {
        this.element = element;
    }

    public abstract MathValue evaluate();
}
