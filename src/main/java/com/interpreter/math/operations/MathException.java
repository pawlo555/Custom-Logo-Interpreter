package com.interpreter.math.operations;

import com.interpreter.math.MathValue;

public class MathException extends RuntimeException {
    public final static String PREFIX = "Math exception: ";
    public final static String ZERO_DIVISION = "Illegal denominator ";
    public final static String LOG_BASE = "Illegal logarithm base: ";
    public final static String LOG_ANTI_LOGARITHM = "Illegal anti-logarithm: ";
    public final static String NEGATIVE_POWER_BASE = "Negative exponent base: ";
    public final static String NEGATIVE_SQRT = "Negative radicand: ";
    public final static String ZERO_TO_ZERO = "Zero to power: ";

    MathValue value;
    String message;

    public MathException(String message, MathValue value) {
        this.message = message;
        this.value = value;
    }

    @Override
    public String toString() {
        return PREFIX + message + value;
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
