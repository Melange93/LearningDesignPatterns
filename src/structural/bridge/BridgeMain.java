package structural.bridge;

/**
 * Description: https://refactoring.guru/design-patterns/bridge
 * <p>
 * Bridge is a structural design pattern that lets you split a large class or a set of closely related classes
 * into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 * <p>
 * The Bridge pattern attempts to solve this problem by switching from inheritance to
 * the object composition. What this means is that you extract one of the dimensions
 * into a separate class hierarchy, so that the original classes will reference
 * an object of the new hierarchy, instead of having all of its state and
 * behaviors within one class.
 * <p>
 * Following this approach, we can extract the color-related code into its own class
 * with two subclasses: Red and Blue. The Shape class then gets a reference field
 * pointing to one of the color objects. Now the shape can delegate any color-related work
 * to the linked color object. That reference will act as a structural.bridge between the Shape
 * and Color classes. From now on, adding new colors won’t require changing the shape hierarchy,
 * and vice versa.
 **/

public class BridgeMain {
    public static void main(String[] args) {
        Device radio = new Radio();
        Remote advRemote = new AdvancedRemote(radio);
        System.out.println(radio.getChannel());
        advRemote.channelUp();
        System.out.println(radio.getChannel());
    }
}
