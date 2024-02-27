package coffee;

import coffee.Coffee;

public class CoffeeWithMilk implements Coffee {

    private double ingredientCost;
    private double price;

    public CoffeeWithMilk(double ingredientCost, double price) {
        this.ingredientCost = ingredientCost;
        this.price = price;
    }

    @Override
    public double calculatePrice(int amount) {
        return (price - ingredientCost) * amount;
    }

}
