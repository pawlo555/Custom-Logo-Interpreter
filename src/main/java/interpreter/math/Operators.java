package interpreter.math;

// TODO add all operators for enum
public enum Operators {
    MINUS, LOG, MULTIPLY, PLUS, LN, MINUS_SINGLE;


    public int howManyArgumentsTakes() {
        return 1;
    }

    public boolean isRightCumulate() {
        return true;
    }

    public int getPriority() {
        return switch(this) {
            case MINUS, MINUS_SINGLE -> 1;
            case MULTIPLY, PLUS -> 2;
            case LOG, LN -> 3;
        };
    }
}


