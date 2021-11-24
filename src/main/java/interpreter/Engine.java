package interpreter;

import programme.elements.LynxCanvas;
import utills.Colour;
import utills.Vector2D;

import java.util.HashMap;

public class Engine {
    private final static String BASE_TURTLE_NAME = "t";

    private final HashMap<String, Turtle> turtlesMap = new HashMap<>();
    private final LynxCanvas lynxCanvas;
    private String currentTurtleName = BASE_TURTLE_NAME;
    private Turtle currentTurtle;

    public Engine(LynxCanvas canvas) {
        this.lynxCanvas = canvas;
        Turtle turtle = new Turtle(new Vector2D(0,0));
        addTurtle("t", turtle);
    }

    public void changeTurtle(String newTurtleName) {
        if (!turtlesMap.containsKey(newTurtleName)) {
            throw new IllegalStateException("Cannot change turtle to:" + newTurtleName + " there is no such turtle.");
        }
        currentTurtleName = newTurtleName;
        currentTurtle = turtlesMap.get(currentTurtleName);
    }

    public void addTurtle(String newTurtleName, Turtle newTurtle) {
        if (turtlesMap.containsKey(newTurtleName)) {
            throw new IllegalStateException("Cannot add turtle with name: " + newTurtleName + " this turtle already exist");
        }
        turtlesMap.put(newTurtleName, newTurtle);
        Vector2D turtlePosition = newTurtle.getPosition();
        Vector2D toPaint = LynxCanvas.toCanvasCoordinates(turtlePosition);
        lynxCanvas.paintTurtle(toPaint.x, toPaint.y);
    }

    public void removeTurtle(String toRemoveTurtleName) {
        if (toRemoveTurtleName.equals(currentTurtleName) && turtlesMap.size() == 1) {
            throw new IllegalStateException("Cannot delete last turtle");
        }
        turtlesMap.remove(toRemoveTurtleName);
        if (currentTurtleName.equals(toRemoveTurtleName)) {
            currentTurtleName = (String) turtlesMap.keySet().toArray()[0];
            currentTurtle = turtlesMap.get(currentTurtleName);
        }
    }

    public boolean isDown() {
        return currentTurtle.isDown();
    }

    public void setUp() {
        currentTurtle.setUp();
    }

    public void setDown() {
        currentTurtle.setDown();
    }

    public boolean isErasing() {
        return currentTurtle.isErasing();
    }

    public void setErasing() {
        currentTurtle.setErasing();
    }

    public void setNotErasing() {
        currentTurtle.setNotErasing();
    }

    public void forward(double n) {
        Vector2D old = LynxCanvas.toCanvasCoordinates(currentTurtle.getPosition());
        currentTurtle.forward(n);
        Vector2D current = LynxCanvas.toCanvasCoordinates(currentTurtle.getPosition());

        if (currentTurtle.isDown()) {
            lynxCanvas.paintLine(old.x, old.y, current.x, current.y);
        }
        lynxCanvas.repaintTurtle(old.x, old.y, current.x, current.y);
    }

    public void backward(double n) {
        forward(-n);
    }

    // TODO we should turn the turtle on screen to
    public void right(int degrees) {
        currentTurtle.right(degrees);
    }

    public void left(int degrees) {
        right(-degrees);
    }

    public double getX() {
        return currentTurtle.getX();
    }

    public double getY() {
        return currentTurtle.getY();
    }

    public Vector2D getPosition() {
        return currentTurtle.getPosition();
    }

    public void setX(double newX) {
        currentTurtle.setX(newX);
    }

    public void setY(double newY) {
        currentTurtle.setY(newY);
    }

    public void setPosition(double newX, double newY) {
        currentTurtle.setPosition(newX, newY);
    }

    public int getRotation() {
        return currentTurtle.getRotation();
    }

    public void setRotation(int degrees) {
        currentTurtle.setRotation(degrees);
    }

    public Colour getPenColour() {
        return currentTurtle.getPenColour();
    }

    public void setPenColour(Colour newPenColour) {
        currentTurtle.setPenColour(newPenColour);
    }

    public int getPenSize() {
        return currentTurtle.getPenSize();
    }

    public void setPenSize(int size) {
        currentTurtle.setPenSize(size);
    }

    public Colour getTurtleColour() {
        return currentTurtle.getTurtleColour();
    }

    public void setTurtleColour(Colour turtleColor) {
        currentTurtle.setTurtleColour(turtleColor);
    }

}
