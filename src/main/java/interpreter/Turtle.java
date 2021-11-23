package interpreter;

import utills.Colour;
import utills.Pen;
import utills.Rotation;
import utills.Vector2D;

public class Turtle {

    private Vector2D position;
    private final Rotation rotation = new Rotation();

    private boolean isDown = true;
    private boolean isErasing = false;

    private Colour turtleColor;
    private final Pen pen = new Pen(Colour.BLACK);

    public Turtle(Vector2D position) {
        this.position = position;
    }

    public boolean isDown() {
        return isDown;
    }

    public void setUp() {
        isDown = false;
    }

    public void setDown() {
        isDown = true;
    }

    public boolean isErasing() {
        return isErasing;
    }

    public void setErasing() {
        isErasing = true;
    }

    public void setNotErasing() {
        isErasing = false;
    }

    public void moveTo(Vector2D newPosition) {
        paintLineIfNeeded(newPosition);
        changeTurtlePosition(newPosition);
    }

    private void paintLineIfNeeded(Vector2D newPosition) {
        if (isDown) {
            System.out.println(position);
        }
    }

    private void changeTurtlePosition(Vector2D newPosition) {
        position = newPosition;
    }


    public void forward(double n) {
        Vector2D move = rotation.getUnitVector2D().multiply(n);
        position = position.add(move);
    }

    public void backward(double n) {
        forward(-n);
    }

    public void right(int degrees) {
        rotation.changeRotation(degrees);
    }

    public void left(int degrees) {
        right(-degrees);
    }

    public double getX() {
        return position.x;
    }

    public double getY() {
        return position.y;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setX(double newX) {
        position = new Vector2D(newX, position.y);
    }

    public void setY(double newY) {
        position = new Vector2D(position.x, newY);
    }

    public void setPosition(double newX, double newY) {
        position = new Vector2D(newX, newY);
    }

    public int getRotation() {
        return rotation.getRotation();
    }

    public void setRotation(int degrees) {
        rotation.setDegrees(degrees);
    }

    public Colour setPenColour() {
        return pen.getColour();
    }

    public void getPenColour(Colour newPenColour) {
        pen.setColour(newPenColour);
    }

    public int getPenSize() {
        return pen.getSize();
    }

    public void setPenSize(int size) {
        pen.setSize(size);
    }

    public Colour getTurtleColor() {
        return turtleColor;
    }

    public void setTurtleColor(Colour turtleColor) {
        this.turtleColor = turtleColor;
    }
}
