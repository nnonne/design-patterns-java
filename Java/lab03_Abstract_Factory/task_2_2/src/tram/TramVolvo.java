package tram;

public class TramVolvo extends Tram {
    public TramVolvo() {
        super(10000000, 7);
    }
    @Override
    public void goByRails() {
        System.out.println("Volvo Tram runs!");
    }
}