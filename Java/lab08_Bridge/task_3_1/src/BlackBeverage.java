public class BlackBeverage implements BeverageType {

    private final int waterVolume;
    public BlackBeverage(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    @Override
    public void prepare() {
        System.out.println("Prepared black coffee with water: " + waterVolume);
    }

    @Override
    public void drink() {
        System.out.println("Drunk black coffee");
    }

    @Override
    public int cost() {
        return 0;
    }

}
