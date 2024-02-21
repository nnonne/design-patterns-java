package tram;

public class TramHyundai extends Tram {
    public TramHyundai() {
        super(9500000, 6);
    }
    @Override
    public void goByRails() {
        System.out.println("Hyundai Tram runs!");
    }
}