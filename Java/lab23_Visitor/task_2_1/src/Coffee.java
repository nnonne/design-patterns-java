public class Coffee implements Groceries {
    private  double price = 3;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void accept(PriceVisitor visitor) {
        visitor.visit(this);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
