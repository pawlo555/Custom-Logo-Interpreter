package interpreter.math;

import interpreter.Environment;

public class MathValue {

    private final Integer intValue;
    private final Double doubleValue;
    private final Boolean booleanValue;

    public MathValue(int element) {
        intValue = element;
        doubleValue = null;
        booleanValue = null;
    }

    public MathValue(double element) {
        intValue = null;
        doubleValue = element;
        booleanValue = null;
    }

    public MathValue(boolean element) {
        intValue = null;
        doubleValue = null;
        booleanValue = element;
    }


    public double getDoubleValue() {
        if (doubleValue != null) {
            return doubleValue;
        }
        else if (intValue != null) {
            return intValue;
        }
        else if (booleanValue != null) {
            if (booleanValue) {
                return 1.0;
            }
            else {
                return 0.0;
            }
        }
        else {
            throw new IllegalStateException("Math value don't have value");
        }
    }

    public int getIntValue() {
        if (intValue != null) {
            return intValue;
        }
        else if (doubleValue != null) {
            return (int) Math.round(doubleValue);
        }
        else if (booleanValue != null) {
            if (booleanValue) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            throw new IllegalStateException("Math value don't have value");
        }
    }

    public boolean getBooleanValue() {
        if (booleanValue != null) {
            return booleanValue;
        }
        else if (intValue != null) {
            return intValue == 1;
        }
        else if (doubleValue != null) {
            return doubleValue == 1.0;
        }
        else {
            throw new IllegalStateException("Math value don't have value");
        }
    }
}
