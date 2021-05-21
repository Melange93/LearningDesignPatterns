package behavioral.chainofresponsibility.guruexample;

public class Panel extends Container {
    private String modalHelpText;

    @Override
    public void showHelp() {
        if (modalHelpText != null) {
            System.out.println("Panel class");
            return;
        }
        super.showHelp();
    }
}
