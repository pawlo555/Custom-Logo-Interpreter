package utills;


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

    /*
    Change the rotation, degreesToChange should be larger than MAX_DEGREES
     */
    public void changeRotation(int degreesToChange) {
        currentRotation = (currentRotation + degreesToChange + MAX_DEGREES) % MAX_DEGREES;
    }

    public Vector2D getUnitVector2D() {
        double x = Math.sin(currentRotation);
        double y = Math.cos(currentRotation);
        return new Vector2D(x,y);
    }

    public int getRotation() {
        return currentRotation;
    }

    public void setDegrees(int degrees) {
        currentRotation = degrees;
    }
}
