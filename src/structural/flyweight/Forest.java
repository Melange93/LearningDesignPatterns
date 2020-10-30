package structural.flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    public Tree plantTree(int x, int y, String name, Color color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
        return tree;
    }

    public void draw() {
        trees.forEach(Tree::draw);
    }
}
