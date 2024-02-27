package machinefactory;

import coffee.Cappuchino;
import coffee.Coffee;

public class CappuchinoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee(double ingredientCost, double price) {
        return new Cappuchino(ingredientCost, price);
    }
}
