package structural.composite;

import java.util.List;

public class ImageEditor {
    private CompoundGraphic all;

    public void load(List<Graphic> graphics) {
        this.all = new CompoundGraphic(graphics);
    }

    public void groupSelected(List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic(components);
        components.forEach(graphic -> {
            all.remove(graphic);
        });

        System.out.println("Selected group");
        group.draw();
        all.add(group);

        System.out.println("All");
        all.draw();
    }

    public void moveSelectedGroup(int x, int y, List<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic(components);
        components.forEach(graphic -> {
            all.remove(graphic);
        });
        group.move(x, y);
        all.add(group);
        all.draw();
    }

}
