package interpreter.math;

public class MathElement {

    public MathElement() {

    }

    public static boolean isValue(String name) {
        try {
            MathValue mathValue = new MathValue(name);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    public static boolean isOperator(String name) {
        try {
            Operators.valueOf(name);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
