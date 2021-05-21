package behavioral.chainofresponsibility.guruexample;

public class Component implements ComponentWithContextualHelp {

    private Container container;
    public String tooltipText;

    @Override
    public void showHelp() {
        if (tooltipText != null) {
            System.out.println("Component class");
            return;
        }
        container.showHelp();
    }
}
