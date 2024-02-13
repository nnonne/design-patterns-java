package coffee;

public class Latte implements Coffee {
    private double ingredientCost;
    private double price;

    public Latte(double ingredientCost, double price) {
        this.ingredientCost = ingredientCost;
        this.price = price;
    }

    @Override
    public double calculatePrice(int amount) {
        return (price - ingredientCost) * amount;
    }

}
