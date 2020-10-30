package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: https://refactoring.guru/design-patterns/composite
 * <p>
 * Composite is a structural design pattern that lets you compose objects into tree structures
 * and then work with these structures as if they were individual objects.
 * <p>
 * Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
 * <p>
 * Armies of most countries are structured as hierarchies.
 * An army consists of several divisions; a division is a set of brigades, and a brigade consists of platoons,
 * which can be broken down into squads. Finally, a squad is a small group of real soldiers.
 * Orders are given at the top of the hierarchy and passed down onto each level until every soldier knows
 * what needs to be done.
 */

public class CompositeMain {

    public static void main(String[] args) {
        Graphic dot = new Dot(1, 2);
        Graphic dot2 = new Dot(7, 8);
        Graphic circle = new Circle(5, 3, 10);
        Graphic circle2 = new Circle(20, 18, 8);
        List<Graphic> graphics = new ArrayList<>(Arrays.asList(dot, dot2, circle, circle2));

        ImageEditor editor = new ImageEditor();
        editor.load(graphics);
        Graphic dot3 = new Dot(3, 4);
        editor.groupSelected(Arrays.asList(dot, circle2, dot3));
        editor.moveSelectedGroup(2, -2, Arrays.asList(dot, circle, dot3));
    }
}
