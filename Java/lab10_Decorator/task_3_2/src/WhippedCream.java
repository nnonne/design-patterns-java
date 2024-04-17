public class WhippedCream extends CondimentDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " +whipped cream";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.4f;
    }
}
