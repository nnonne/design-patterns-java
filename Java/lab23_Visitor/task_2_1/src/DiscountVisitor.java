public class DiscountVisitor implements PriceVisitor {
    @Override
    public void visit(Bread bread) {
        double price = bread.getPrice();
        price *= 0.9;
        bread.setPrice(price);
    }

    @Override
    public void visit(Milk milk) {
        double price = milk.getPrice();
        price *= 0.8;
        milk.setPrice(price);
    }
    @Override
    public void visit(Coffee coffee) {
        double price = coffee.getPrice();
        price *= 0.8;
        coffee.setPrice(price);
    }

    public void visit(Chocolate chocolate){
        double price = chocolate.getPrice();
        price *= 0.7;
        chocolate.setPrice(price);
    }
}
