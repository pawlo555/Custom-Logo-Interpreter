package programme.elements;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LynxCanvas extends Canvas {
    private final static double WIDTH = 900;
    private final static double HEIGHT = 680;


    public LynxCanvas() throws FileNotFoundException {
        super();
        setHeight(HEIGHT);
        setWidth(WIDTH);

        GraphicsContext gc = getGraphicsContext2D();
        System.out.println("Image");
        Image image = new Image(new FileInputStream("src/main/resources/programme/elements/lynx.jpg"));
        gc.setFill(Color.DARKKHAKI);
        gc.drawImage(image, 0, 0, WIDTH, HEIGHT);
        System.out.println("End");
    }
}
