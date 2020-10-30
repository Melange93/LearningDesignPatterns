package structural.adapter;

public class SquarePeg {

    private double width;

    public SquarePeg(int width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
