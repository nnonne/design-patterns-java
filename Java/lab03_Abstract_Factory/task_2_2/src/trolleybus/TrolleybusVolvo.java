package trolleybus;

public class TrolleybusVolvo extends Trolleybus {
    public TrolleybusVolvo() {
        super(7000000, 13);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Volvo Trolleybus runs");
    }
}
