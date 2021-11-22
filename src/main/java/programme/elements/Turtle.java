package programme.elements;

import programme.utills.Rotation;

public class Turtle {

    private int x;
    private int y;

    private boolean isDown = true;
    private final LynxCanvas canvas;
    private final Rotation rotation = new Rotation();

    public Turtle(LynxCanvas canvas, int x, int y) {
        this.canvas = canvas;
        this.x = x;
        this.y = y;
        canvas.paintTurtle(x, y);
    }

    public void setUp() {
        isDown = false;
    }

    public void setDown() {
        isDown = true;
    }

    public void moveTo(int newX, int newY) {
        paintLineIfNeeded(newX, newY);
        changeTurtlePosition(newX, newY);
    }

    private void paintLineIfNeeded(int newX, int newY) {
        if (isDown) {
            System.out.println(" " + x +" " + y);
            canvas.paintLine(x,y, newX, newY);
        }
    }

    private void changeTurtlePosition(int newX, int newY) {
        canvas.repaintTurtle(x, y, newX, newY);
        this.x = newX;
        this.y = newY;
    }
}
