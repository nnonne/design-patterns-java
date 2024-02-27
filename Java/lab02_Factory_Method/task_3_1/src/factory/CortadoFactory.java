package machinefactory;

import coffee.Coffee;
import coffee.Cortado;

public class CortadoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee(double ingredientCost, double price) {
        return new Cortado(ingredientCost, price);
    }
}
