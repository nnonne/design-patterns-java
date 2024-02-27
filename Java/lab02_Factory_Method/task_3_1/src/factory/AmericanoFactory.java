package machinefactory;

import coffee.Americano;
import coffee.Coffee;

public class AmericanoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee(double ingredientCost, double price) {
        return new Americano(ingredientCost, price);
    }
}
