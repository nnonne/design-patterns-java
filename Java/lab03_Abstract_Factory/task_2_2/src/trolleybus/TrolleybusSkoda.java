package trolleybus;

public class TrolleybusSkoda extends Trolleybus {
    public TrolleybusSkoda() {
        super(6800000, 12);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Skoda Trolleybus runs");
    }
}
