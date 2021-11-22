package programme.utills;


/*
Class to represent logic connected with turning a turtle
 */
public class Rotation {
    private static final int BASIC_ROTATION = 0;
    private static final int MAX_DEGREES = 360;

    private int currentRotation = BASIC_ROTATION;

    public Rotation() {}

    public Rotation(int startingRotation) {
        currentRotation = startingRotation;
    }

    public void changeRotation(int degreesToChange) {
        currentRotation = degreesToChange % MAX_DEGREES;
    }

    public int getRotation() {
        return currentRotation;
    }
}
