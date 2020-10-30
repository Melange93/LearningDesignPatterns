package structural.flyweight;

public class Tree {

    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        System.out.printf("Draw tree in x: %d, y: %d coordination. ", x, y);
        treeType.draw();
    }
}
