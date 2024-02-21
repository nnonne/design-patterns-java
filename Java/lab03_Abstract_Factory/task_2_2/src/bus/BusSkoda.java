package bus;

public class BusSkoda extends Bus {
    public BusSkoda() {
        super(4500000, 25);
    }
    @Override
    public void goByWay() {
        System.out.println("Skoda Bus runs!");
    }
}
