public abstract class Beverage {

    protected final int sugar;
    private final BeverageType beverageType;
    private final BeverageOrderingPlace beverageOrderingPlace;

    public Beverage(int sugar, BeverageType beverageType, BeverageOrderingPlace beverageOrderingPlace) {
        this.sugar = sugar;
        this.beverageType = beverageType;
        this.beverageOrderingPlace = beverageOrderingPlace;
    }

    public void prepare() {
        beverageType.prepare();
    }
    public void drink() {
        beverageOrderingPlace.drink();
        beverageType.drink();
    }
    public int cost() {
        return beverageType.cost();
    }
}
