public class Receiver {

    public Controller controller;
    public Receiver next = null;

    public Receiver(Controller controller) {
        this.controller = controller;
    }

}
