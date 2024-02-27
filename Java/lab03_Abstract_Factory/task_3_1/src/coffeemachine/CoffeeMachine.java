package coffeemachine;

import coffee.*;
import coffeefactory.*;

public class CoffeeMachine {
    private final int machinePrice;
    private final int attendanceCost;

    private final AmericanoFactory americanoFactory = new AmericanoFactory();
    private final CappuchinoFactory cappuchinoFactory = new CappuchinoFactory();
    private final CoffeeWithMilkFactory coffeeWithMilkFactory = new CoffeeWithMilkFactory();
    private final CortadoFactory cortadoFactory = new CortadoFactory();
    private final EspressoFactory espressoFactory = new EspressoFactory();
    private final LatteFactory latteFactory = new LatteFactory();


    public CoffeeMachine(int machinePrice, int attendanceCost) {
        this.machinePrice = machinePrice;
        this.attendanceCost = attendanceCost;
    }

    public int getMachinePrice() {
        return machinePrice;
    }

    public int getAttendanceCost() {
        return attendanceCost;
    }

    public Coffee makeAmericano(double ingredientCost, double price){
        Coffee coffee = americanoFactory.createCoffee(ingredientCost, price);
        return coffee;
    }

    public Coffee makeCappuchino(double ingredientCost, double price){
        Coffee coffee = cappuchinoFactory.createCoffee(ingredientCost, price);
        return coffee;
    }

    public Coffee makeCoffeeWithMilk(double ingredientCost, double price){
        Coffee coffee = coffeeWithMilkFactory.createCoffee(ingredientCost, price);
        return coffee;
    }

    public Coffee makeCortado(double ingredientCost, double price){
        Coffee coffee = cortadoFactory.createCoffee(ingredientCost, price);
        return coffee;
    }

    public Coffee makeEspresso(double ingredientCost, double price){
        Coffee coffee = espressoFactory.createCoffee(ingredientCost, price);
        return coffee;
    }

    public Coffee makeLatte(double ingredientCost, double price){
        Coffee coffee = latteFactory.createCoffee(ingredientCost, price);
        return coffee;
    }



}
