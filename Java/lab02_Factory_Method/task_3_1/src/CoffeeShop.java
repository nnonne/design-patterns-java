import coffee.Coffee;
import machinefactory.CoffeeFactory;

public class CoffeeShop {

    private double totalProfit = 0;

    public void makeCoffee(CoffeeFactory makeCoffee, double ingredientCost, double price, int amount) {
        Coffee coffee = makeCoffee.createCoffee(ingredientCost, price);
        totalProfit += coffee.calculatePrice(amount);
    }
    public void announceProfit() {
        System.out.printf("Total profit : %f", totalProfit);
    }
}
