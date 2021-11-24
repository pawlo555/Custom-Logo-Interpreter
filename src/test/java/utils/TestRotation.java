package utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRotation {

    @Test
    public void testConstructor(){
        Rotation rotation = new Rotation(370);
        assertEquals(rotation.getRotation(), 10);
    }

    @Test
    public void testChangeRotation() {
        Rotation rotation = new Rotation(50);
        rotation.changeRotation(-60);
        assertEquals(rotation.getRotation(), 350);
    }

    @Test
    public void testGetUnit2DVectorSimpleAngle() {
        Rotation rotation = new Rotation(90);
        Vector2D unitVector = rotation.getUnitVector2D();
        Vector2D trueResult = new Vector2D(1,0);
        assertEquals(trueResult, unitVector);
    }

    @Test
    public void testGetUnit2DVectorOtherAngle() {
        Rotation rotation = new Rotation(60);
        Vector2D unitVector = rotation.getUnitVector2D();
        double x = Math.sqrt(3.0)/2.0;
        double y = 0.5;
        Vector2D trueResult = new Vector2D(x,y);
        assertEquals(trueResult, unitVector);
    }
}
