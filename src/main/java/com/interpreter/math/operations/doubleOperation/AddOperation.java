package com.interpreter.math.operations.doubleOperation;

import com.interpreter.math.MathValue;

public class AddOperation extends DoubleOperatorOperation {

    public AddOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int firstCheckValue = firstElement.checkValue();
        int secondCheckValue = secondElement.checkValue();
        if(firstCheckValue == 0 || secondCheckValue == 0){
            double first = firstElement.getDoubleValue();
            double second = secondElement.getDoubleValue();
            return new MathValue(first+second);
        }
        else{
            int first = firstElement.getIntValue();
            int second = secondElement.getIntValue();
            return new MathValue(first+second);
        }
    }
}
