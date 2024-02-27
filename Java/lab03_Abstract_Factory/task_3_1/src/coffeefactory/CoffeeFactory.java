package coffeefactory;

import coffee.Coffee;

public interface CoffeeFactory {
    Coffee createCoffee(double ingredientCost, double price);
}