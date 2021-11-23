package programme.elements;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class LynxCanvas extends Canvas {
    private final static double WIDTH = 900;
    private final static double HEIGHT = 680;
    private final static double TURTLE_SIZE = 10.;


    public LynxCanvas() {
        super();
        setHeight(HEIGHT);
        setWidth(WIDTH);

        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.RED);
        System.out.println("End");
    }

    public void paintLine(double x, double y, double newX, double newY) {
        GraphicsContext gc = getGraphicsContext2D();
        gc.strokeLine(x,y,newX, newY);
    }

    public void paintTurtle(double x, double y) {
        GraphicsContext gc = getGraphicsContext2D();
        gc.fillRect(x-TURTLE_SIZE/2, y-TURTLE_SIZE/2, TURTLE_SIZE, TURTLE_SIZE);
    }

    public void repaintTurtle(double x, double y, double newX, double newY) {
        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(x-TURTLE_SIZE/2, y-TURTLE_SIZE/2, TURTLE_SIZE, TURTLE_SIZE);
        paintTurtle(newX, newY);
    }
}
