package interpreter.engine;

import interpreter.SpecialName;
import interpreter.Turtle;
import utils.Colour;
import utils.Rotation;
import utils.Vector2D;

// TODO write all methods and add getters about data
public class MockEngine implements Engine{

    private int forwardTimes = 0;
    private int backTimes = 0;
    private int leftTimes = 0;
    private int rightTimes = 0;

    private double forwardAmount = 0.0;
    private double backAmount = 0.0;
    private double leftAmount = 0;
    private double rightAmount = 0;

    @Override
    public void changeTurtle(String newTurtleName) {

    }

    @Override
    public void addTurtle(String newTurtleName, Turtle newTurtle) {

    }

    @Override
    public void removeTurtle(String toRemoveTurtleName,boolean toRename) {

    }

    @Override
    public void renameTurtle(String newTurtleName) {

    }

    @Override
    public boolean isDown() {
        return false;
    }

    @Override
    public void setUp() {

    }

    @Override
    public void setDown() {

    }

    @Override
    public boolean isErasing() {
        return false;
    }

    @Override
    public void setErasing() {

    }

    @Override
    public void setNotErasing() {

    }

    @Override
    public void forward(double n) {
        forwardTimes++;
        forwardAmount += n;
    }

    @Override
    public void backward(double n) {
        backTimes++;
        backAmount += n;
    }

    @Override
    public void right(int degrees) {
        rightTimes++;
        rightAmount += degrees;
    }

    @Override
    public void left(int degrees) {
        leftTimes++;
        leftAmount += degrees;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public Vector2D getPosition() {
        return null;
    }

    @Override
    public void setX(double newX) {

    }

    @Override
    public void setY(double newY) {

    }

    @Override
    public void setPosition(double newX, double newY) {

    }

    @Override
    public Rotation getRotation() {
        return null;
    }

    @Override
    public void setRotation(Rotation rotation) {

    }

    @Override
    public Colour getPenColour() {
        return null;
    }

    @Override
    public void setPenColour(Colour newPenColour) {

    }

    @Override
    public int getPenSize() {
        return 0;
    }

    @Override
    public void setPenSize(int size) {

    }

    @Override
    public Colour getTurtleColour() {
        return null;
    }

    @Override
    public void setTurtleColour(Colour turtleColor) {

    }

    @Override
    public void cleanBackground() {

    }

    @Override
    public String getValue(SpecialName name) {
        return null;
    }

    public double getBackAmount() {
        return backAmount;
    }

    public double getForwardAmount() {
        return forwardAmount;
    }

    public double getLeftAmount() {
        return leftAmount;
    }

    public double getRightAmount() {
        return rightAmount;
    }

    public int getBackTimes() {
        return backTimes;
    }

    public int getForwardTimes() {
        return forwardTimes;
    }

    public int getLeftTimes() {
        return leftTimes;
    }

    public int getRightTimes() {
        return rightTimes;
    }
}

