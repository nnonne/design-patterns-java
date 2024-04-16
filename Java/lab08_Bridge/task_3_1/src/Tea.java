public class Tea extends Beverage {
    public Tea(int sugar, BeverageType beverageType, BeverageOrderingPlace beverageOrderingPlace) {
        super(sugar, beverageType, beverageOrderingPlace);
    }

    @Override
    public void prepare() {
        System.out.println("Prepared tea");
        super.prepare();
        if (sugar > 0) System.out.println("Put some sugar: " + sugar + " cubes");
    }
    @Override
    public void drink() {
        super.drink();
        System.out.println("Drunk tea");
    }
    @Override
    public int cost() {
        return super.cost() + 7;
    }
}
