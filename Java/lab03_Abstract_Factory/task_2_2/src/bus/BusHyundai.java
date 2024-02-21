package bus;

public class BusHyundai extends Bus {
    public BusHyundai() {
        super(5500000, 20);
    }
    @Override
    public void goByWay() {
        System.out.println("Hyundai Bus runs!");
    }
}
