import factory.*;

public class Main {
    public static void main(String[] args) {

        CoffeeShop shop = new CoffeeShop();

        shop.makeCoffee(new LatteFactory(), 20, 30, 20);
        shop.makeCoffee(new AmericanoFactory(), 40, 50, 15);
        shop.makeCoffee(new LatteFactory(), 16, 26, 4);
        shop.makeCoffee(new CappuchinoFactory(), 40, 49.5, 2);
        shop.makeCoffee(new EspressoFactory(), 50, 63, 0);
        shop.makeCoffee(new CoffeeWithMilkFactory(), 30, 38, 18);
        shop.makeCoffee(new CoffeeWithMilkFactory(), 40, 56, 5);
        shop.announceProfit();

    }
}