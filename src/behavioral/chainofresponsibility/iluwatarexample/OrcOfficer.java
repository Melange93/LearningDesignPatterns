package behavioral.chainofresponsibility.iluwatarexample;

public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request request) {
        if (RequestType.TORTURE_PRISONER == request.getRequestType()) {
            printHandling(request);
            request.markHandled();
            return;
        }
        super.handleRequest(request);
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
