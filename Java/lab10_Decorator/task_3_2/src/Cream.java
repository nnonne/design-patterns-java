public class Cream extends CondimentDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " +cream";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.3f;
    }
}
