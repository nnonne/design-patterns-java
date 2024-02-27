package coffeefactory;

import coffee.Coffee;
import coffee.CoffeeWithMilk;

public class CoffeeWithMilkFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee(double ingredientCost, double price) {
        return new CoffeeWithMilk(ingredientCost, price);
    }
}
