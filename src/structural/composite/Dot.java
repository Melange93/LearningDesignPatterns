package structural.composite;

public class Dot implements Graphic {
    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("Move from x: %d y: %d to x: %d y: %d%n", this.x, this.y, this.x + x, this.y + y);
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.printf("Draw dot. x: %d, y: %d%n", this.x, this.y);
    }
}
