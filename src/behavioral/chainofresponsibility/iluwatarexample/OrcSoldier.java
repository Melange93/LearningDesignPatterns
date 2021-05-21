package behavioral.chainofresponsibility.iluwatarexample;

public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request request) {
        if (RequestType.COLLECT_TAX == request.getRequestType()) {
            printHandling(request);
            request.markHandled();
            return;
        }
        super.handleRequest(request);
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
