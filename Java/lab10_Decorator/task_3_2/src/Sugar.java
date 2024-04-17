public class Sugar extends CondimentDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " +sugar";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.3f;
    }
}