public class Chocolate extends Beverage {
    public Chocolate(int sugar, BeverageType beverageType, BeverageOrderingPlace beverageOrderingPlace) {
        super(sugar, beverageType, beverageOrderingPlace);
    }

    @Override
    public void prepare() {
        System.out.println("Put some chocolate");
        super.prepare();
        if (sugar > 0) System.out.println("Put some sugar: " + sugar + " cubes");
    }
    @Override
    public void drink() {
        super.drink();
        System.out.println("Drink a beverage with chocolate");
    }
    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
