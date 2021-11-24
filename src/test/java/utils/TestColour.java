package utils;

import javafx.scene.paint.Color;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestColour {

    @Test
    public void testToJavaFXColour() {
        Colour black = Colour.BLACK;
        assertEquals(Color.BLACK, black.toJavaFXColour());
        Colour white = Colour.WHITE;
        assertEquals(Color.WHITE, white.toJavaFXColour());
    }
}
