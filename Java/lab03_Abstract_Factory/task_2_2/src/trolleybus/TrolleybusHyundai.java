package trolleybus;

public class TrolleybusHyundai extends Trolleybus {
    public TrolleybusHyundai() {
        super(7000000, 11);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Hyundai Trolleybus runs");
    }
}
