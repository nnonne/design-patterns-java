package machinefactory;

import coffee.Coffee;
import coffee.Espresso;

public class EspressoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee(double ingredientCost, double price) {
        return new Espresso(ingredientCost, price);
    }
}
