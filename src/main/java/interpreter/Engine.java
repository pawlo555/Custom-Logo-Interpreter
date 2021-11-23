package interpreter;

import utills.Vector2D;

import java.util.HashMap;

public class Engine {
    private final HashMap<String, Turtle> turtlesMap = new HashMap<>();


    public Engine() {
        Turtle turtle = new Turtle(new Vector2D(100, 100));
        turtlesMap.put("new", turtle);
    }
}
