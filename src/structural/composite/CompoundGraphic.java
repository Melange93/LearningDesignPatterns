package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private List<Graphic> children;

    public CompoundGraphic() {
        this.children = new ArrayList<>();
    }

    public CompoundGraphic(List<Graphic> children) {
        this.children = children;
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void add(CompoundGraphic graphic) {
        children.addAll(graphic.getChildren());
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(int x, int y) {
        children.forEach(child -> child.move(x, y));
    }

    @Override
    public void draw() {
        children.forEach(Graphic::draw);
    }

    public List<Graphic> getChildren() {
        return children;
    }
}
