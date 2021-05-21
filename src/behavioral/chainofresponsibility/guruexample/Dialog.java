package behavioral.chainofresponsibility.guruexample;

public class Dialog extends Component {
    private String wikiPageUrl;

    @Override
    public void showHelp() {
        if (wikiPageUrl != null) {
            System.out.println("Dialog class");
            return;
        }
        super.showHelp();
    }
}
