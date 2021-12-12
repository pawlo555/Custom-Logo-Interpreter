package interpreter.math;

// TODO add all operators for enum
public enum Operators {
    MINUS, LOG, MULTIPLY, PLUS, LN, MINUS_SINGLE;


    public int howManyArgumentsTakes() {
        return switch(this) {
            case LN, MINUS_SINGLE -> 1;
            case MULTIPLY, PLUS, MINUS, LOG -> 2;
        };
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


