package bus;

public class BusVolvo extends Bus {
    public BusVolvo() {
        super(6000000, 20);
    }
    @Override
    public void goByWay() {
        System.out.println("Volvo Bus runs!");
    }
}
