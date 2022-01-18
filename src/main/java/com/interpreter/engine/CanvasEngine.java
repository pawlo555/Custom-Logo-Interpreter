package com.interpreter.engine;

import com.interpreter.SpecialName;
import com.interpreter.Turtle;
import com.programme.elements.LogoCanvas;
import com.utils.Colour;
import com.utils.Rotation;
import com.utils.Vector2D;

import java.util.HashMap;

public class CanvasEngine implements Engine {
    private final static String BASE_TURTLE_NAME = "t";

    private final HashMap<String, Turtle> turtlesMap = new HashMap<>();
    private final LogoCanvas logoCanvas;
    private String currentTurtleName = BASE_TURTLE_NAME;
    private Turtle currentTurtle;

    public CanvasEngine(LogoCanvas canvas) {
        this.logoCanvas = canvas;
        Turtle turtle = new Turtle(new Vector2D(0,0));
        addTurtle(BASE_TURTLE_NAME, turtle);
        currentTurtle = turtle;
    }

    public void changeTurtle(String newTurtleName) {
        if (!turtlesMap.containsKey(newTurtleName)) {
            throw new IllegalStateException("Cannot change turtle to:" + newTurtleName + " there is no such turtle.");
        }
        currentTurtleName = newTurtleName;
        currentTurtle = turtlesMap.get(currentTurtleName);
        //System.out.println("[CHANGE TURTLE] " + currentTurtleName);
    }

    public void addTurtle(String newTurtleName, Turtle newTurtle) {
        if (turtlesMap.containsKey(newTurtleName)) {
            throw new IllegalStateException("Cannot add turtle with name: " + newTurtleName + " this turtle already exist");
        }
        turtlesMap.put(newTurtleName, newTurtle);
        logoCanvas.paintTurtle(newTurtle);
        //System.out.println("[ADD TURTLE] " +currentTurtleName + " " + newTurtleName);
    }

    public void removeTurtle(String toRemoveTurtleName,boolean toRename) {
        Turtle toRemove = turtlesMap.get(toRemoveTurtleName);
        if (toRemoveTurtleName.equals(currentTurtleName) && turtlesMap.size() == 1 && !toRename) {
            throw new IllegalStateException("Cannot delete last turtle");
        }
        logoCanvas.removeTurtle(toRemove.getPosition(),toRemove.getRotation().getRotationOnCanvas());
        turtlesMap.remove(toRemoveTurtleName);
        if (currentTurtleName.equals(toRemoveTurtleName) && turtlesMap.size() != 0) {
            currentTurtleName = (String) turtlesMap.keySet().toArray()[0];
            currentTurtle = turtlesMap.get(currentTurtleName);
        }
    }

    public void renameTurtle(String name){
        Turtle temp = currentTurtle;
        removeTurtle(currentTurtleName,true);
        currentTurtleName = name;
        addTurtle(currentTurtleName,temp);
        System.out.println(currentTurtleName + " " + turtlesMap.size());


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
        Vector2D oldPosition = currentTurtle.getPosition();
        int oldAngle = currentTurtle.getRotation().getRotationOnCanvas();
        currentTurtle.forward(n);

        if (currentTurtle.isDown()) {
            logoCanvas.paintLine(oldPosition, currentTurtle);
        }
        logoCanvas.repaintTurtle(oldPosition, oldAngle, currentTurtle);
        if(turtlesMap.size() > 1){
            for(Turtle t : turtlesMap.values()){
                logoCanvas.paintTurtle(t);
            }
        }
    }

    public void backward(double n) {
        forward(-n);
    }

    public void right(int degrees) {
        int oldAngle = currentTurtle.getRotation().getRotationOnCanvas();
        currentTurtle.left(degrees); // we swap axes when displaying
        logoCanvas.repaintTurtle(currentTurtle.getPosition(), oldAngle, currentTurtle);
        if(turtlesMap.size() > 1){
            for(Turtle t : turtlesMap.values()){
                logoCanvas.paintTurtle(t);

            }
        }
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
        Vector2D old = currentTurtle.getPosition();
        int oldAngle = currentTurtle.getRotation().getRotationOnCanvas();
        currentTurtle.setPosition(newX, newY);
        logoCanvas.repaintTurtle(old, oldAngle, currentTurtle);
    }

    public Rotation getRotation() {
        return currentTurtle.getRotation();
    }

    public void setRotation(Rotation rotation) {
        currentTurtle.setRotation(rotation);
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

    public void cleanBackground() {
        logoCanvas.clean();
    }

    public String getValue(SpecialName name) {
        return switch (name) {
            case GETX, getx  -> String.valueOf(getX());
            case GETY, gety -> String.valueOf(getY());
        };
    }
}