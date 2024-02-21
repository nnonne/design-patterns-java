package tram;

public class TramSkoda extends Tram {
    public TramSkoda() {
        super(9000000, 8);
    }
    @Override
    public void goByRails() {
        System.out.println("Skoda Tram runs!");
    }
}