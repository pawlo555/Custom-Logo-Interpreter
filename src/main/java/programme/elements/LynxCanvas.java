package programme.elements;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import utils.Vector2D;


public class LynxCanvas extends Group {
    private final static double WIDTH = 900;
    private final static double HEIGHT = 680;
    private final static double TURTLE_SIZE = 10.;

    public final static Vector2D BASIC_POSITION = new Vector2D(WIDTH/2, HEIGHT/2);

    private final Canvas foreground;
    private final Canvas background;

    public LynxCanvas() {
        super();
        foreground = new Canvas(WIDTH, HEIGHT);
        background = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = foreground.getGraphicsContext2D();
        gc.setFill(Color.RED);

        this.getChildren().add(background);
        this.getChildren().add(foreground);
    }

    public void paintLine(double x, double y, double newX, double newY) {
        GraphicsContext gc = background.getGraphicsContext2D();
        gc.strokeLine(x,y,newX, newY);
    }

    public void paintTurtle(double x, double y) {
        System.out.println("Paint turtle");
        GraphicsContext gc = foreground.getGraphicsContext2D();
        gc.fillRect(x-TURTLE_SIZE/2, y-TURTLE_SIZE/2, TURTLE_SIZE, TURTLE_SIZE);
    }

    public void repaintTurtle(double x, double y, double newX, double newY) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(newX);
        System.out.println(newY);
        removeTurtle(x, y);
        paintTurtle(newX, newY);
    }

    public void removeTurtle(double x, double y) {
        GraphicsContext gc = foreground.getGraphicsContext2D();
        gc.clearRect(x-TURTLE_SIZE/2, y-TURTLE_SIZE/2, TURTLE_SIZE, TURTLE_SIZE);
    }

    public static Vector2D toCanvasCoordinates(Vector2D oldVector) {
        double newX = -(oldVector.x - WIDTH/2);
        double newY = -(oldVector.y - HEIGHT/2);
        return new Vector2D(newX, newY);
    }
}
