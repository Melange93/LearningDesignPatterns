package behavioral.chainofresponsibility.guruexample;

public class Container extends Component {

    private Component children;

    public void add(Component children) {
        this.children = children;
    }

}
