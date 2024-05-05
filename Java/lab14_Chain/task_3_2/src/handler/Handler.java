package handler;

abstract public class Handler {

    private Handler next = null;

    final public void setNext(Handler handler) {
        next = handler;
    }

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}