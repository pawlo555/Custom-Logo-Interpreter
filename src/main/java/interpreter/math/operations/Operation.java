package interpreter.math.operations;

import interpreter.math.MathValue;
import interpreter.math.operations.MathException;

public interface Operation {

    MathValue evaluate() throws MathException;
}
