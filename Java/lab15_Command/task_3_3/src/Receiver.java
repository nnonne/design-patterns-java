public class Receiver {

    public RemoteController controller;
    public Receiver next = null;

    public Receiver(RemoteController controller) {
        this.controller = controller;
    }
}