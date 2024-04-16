public class Coffee extends Beverage {

    final private boolean extraCoffee;
    public Coffee(int sugar, boolean extraCoffee, BeverageType beverageType, BeverageOrderingPlace beverageOrderingPlace) {
        super(sugar, beverageType, beverageOrderingPlace);
        this.extraCoffee = extraCoffee;
    }

    @Override
    public void prepare() {
        if (extraCoffee) {
            System.out.println("Put extra coffee");
        }
        else {
            System.out.println("Put some coffee");
        }
        super.prepare();
        if (sugar > 0) System.out.println("Put some sugar: " + sugar + " cubes");
    }

    @Override
    public void drink() {
        super.drink();
        if (extraCoffee) {
            System.out.println("Drunk extra coffee");
        }
        System.out.println("Drunk coffee");

    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
