public class ControllerUniversal {

    private Receiver topReceiver = null;

    public void addController(RemoteController controller) {
        Receiver newReceiver = new Receiver(controller);
        if (topReceiver == null) {
            topReceiver = newReceiver;
        }
        else {
            Receiver current = topReceiver;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newReceiver;
        }
    }

    public void turnAllOff() {
        Receiver current = topReceiver;
        while (current != null) {
            current.controller.deviceOff();
            current = current.next;
        }
    }
    public void turnAllOn() {
        Receiver current = topReceiver;
        while (current != null) {
            current.controller.deviceOn();
            current = current.next;
        }
    }
}
