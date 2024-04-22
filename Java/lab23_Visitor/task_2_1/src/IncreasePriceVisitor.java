public class IncreasePriceVisitor implements PriceVisitor {
    @Override
    public void visit(Bread bread) {
        double price = bread.getPrice();
        price *= 1.1;
        bread.setPrice(price);
    }

    @Override
    public void visit(Milk milk) {
        double price = milk.getPrice();
        price += 3;
        milk.setPrice(price);
    }
    @Override
    public void visit(Coffee coffee) {
        double price = coffee.getPrice();
        price *= 1.2;
        coffee.setPrice(price);
    }
}
