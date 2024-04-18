abstract public class Handler  {
    private Handler next = null;

    final public void setNext(Handler handler) {
        next = handler;
    }

    public void handle(Account account) {
        if (next != null) {
            next.handle(account);
        }
    }
}
