package utills;

public class Pen {
    private Colour colour;
    private int size;

    public Pen(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
