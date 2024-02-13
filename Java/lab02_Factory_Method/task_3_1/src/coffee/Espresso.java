package coffee;

public class Espresso implements Coffee {
    private double ingredientCost;
    private double cost;
    private double price;

    public Espresso(double ingredientCost, double price) {
        this.ingredientCost = ingredientCost;
        this.price = price;
    }

    @Override
    public double calculatePrice(int amount) {
        return (price - ingredientCost) * amount;
    }

}
