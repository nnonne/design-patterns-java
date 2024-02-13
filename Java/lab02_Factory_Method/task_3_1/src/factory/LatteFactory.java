package factory;

import coffee.Coffee;
import coffee.Latte;

public class LatteFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee(double ingredientCost, double price) {
        return new Latte(ingredientCost, price);
    }
}
