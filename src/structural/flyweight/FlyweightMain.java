package structural.flyweight;

import java.awt.*;

/**
 * Description: https://refactoring.guru/design-patterns/flyweight
 *
 * Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM
 * by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
 *
 * In this example, the Flyweight pattern helps to reduce memory usage when rendering millions of tree objects
 * on a canvas.
 */

public class FlyweightMain {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 3, "Simple tree", Color.GREEN, "Tree likes");
        forest.plantTree(10, 12, "Maple tree", Color.ORANGE, "Beautiful orange leafs");
        forest.plantTree(1, 3, "Yaw", Color.DARK_GRAY, "Very dark bark");

        forest.draw();
    }
}
