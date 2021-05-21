package behavioral.chainofresponsibility.iluwatarexample;


public abstract class RequestHandler {
    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        System.out.printf("%s, handling request \"%s\"%n", this, request);
    }

    @Override
    public abstract String toString();
}
