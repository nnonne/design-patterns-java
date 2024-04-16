public class Cafe {

    public static void main(String[] args) {

        Coffee blackCoffee = new Coffee(3, true, new BlackBeverage(200), new Takeout());
        Tea blackTea = new Tea(3, new BlackBeverage(200), new InCafe());
        Chocolate blackChocolate = new Chocolate(3, new BlackBeverage(200), new Takeout());

        Coffee coffeeWithMilk = new Coffee(3, false, new BeverageWithMilk(250), new InCafe());
        Tea teaWithMilk = new Tea(3, new BeverageWithMilk(250), new Takeout());
        Chocolate chocolateWithMilk = new Chocolate(3, new BeverageWithMilk(250), new InCafe());

        beverageInfo(blackCoffee);
        beverageInfo(blackTea);
        beverageInfo(blackChocolate);

        beverageInfo(coffeeWithMilk);
        beverageInfo(teaWithMilk);
        beverageInfo(chocolateWithMilk);

    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
