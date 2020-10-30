package structural.flyweight;

import java.awt.*;

public class TreeType {

    private String name;
    private Color color;
    private String texture;

    public TreeType(String name, Color color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw() {
        System.out.printf("Tree type: name: %s, color: %s, texture: %s%n", name, color, texture);
    }
}
