public class Chocolate implements Groceries {
    double price = 5;
    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void accept(PriceVisitor visitor) {
        visitor.visit(this);
    }
}
