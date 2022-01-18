package com.utils;

import javafx.scene.paint.Color;

public class Colour {
    private final static int BLACK_CODE = 9;
    private final static int BLUE_CODE = 8;
    private final static int RED_CODE = 7;
    private final static int GREEN_CODE = 6;
    private final static int YELLOW_CODE = 5;
    private final static int PINK_CODE = 4;
    private final static int PURPLE_CODE = 3;
    private final static int GREY_CODE = 2;
    private final static int GOLD_CODE = 1;
    private final static int WHITE_CODE = 0;

    public final static Colour BLACK = new Colour(BLACK_CODE);
    public final static Colour WHITE = new Colour(WHITE_CODE);

    private final int colourCode;

    public Colour(int colourCode) {
        this.colourCode = colourCode;
    }

    public Color toJavaFXColour() {
        return switch (colourCode) {
            case BLACK_CODE -> Color.BLACK;
            case WHITE_CODE -> Color.WHITE;
            case BLUE_CODE -> Color.BLUE;
            case RED_CODE -> Color.RED;
            case GREEN_CODE -> Color.GREEN;
            case YELLOW_CODE -> Color.YELLOW;
            case PINK_CODE -> Color.PINK;
            case PURPLE_CODE -> Color.PURPLE;
            case GREY_CODE -> Color.GREY;
            case GOLD_CODE -> Color.GOLD;
            default -> throw new IllegalStateException("Unexpected value: " + colourCode);
        };
    }
}
