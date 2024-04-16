public class BeverageWithMilk implements BeverageType {

    private final int milkVolume;
    public BeverageWithMilk(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    @Override
    public void prepare() {
        System.out.println("Prepared coffee with milk: " + this.milkVolume);
    }

    @Override
    public void drink() {
        System.out.println("Drunk coffee with milk");
    }

    @Override
    public int cost() {
        return (int) (this.milkVolume / 10.0);
    }

}
