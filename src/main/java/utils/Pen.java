package utils;

public class Pen {
    private Colour colour;
    private int size;

    public Pen(Colour colour, int size) {
        this.colour = colour;
        this.size = size;
        penAssertion();
    }

    private void penAssertion() {
        assert size > 0: "Pen size need to be positive";
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
        penAssertion();
    }
}
