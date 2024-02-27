
import coffee.Coffee;
import coffeemachine.CoffeeMachine;


public class CoffeeShop {

    private double totalProfit = 0;

    public void runShop(CoffeeMachine coffeeMachine, int days, int coffees){
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < coffees; j++) {
                Coffee cortado = coffeeMachine.makeCortado(30, 20);
                totalProfit += cortado.calculatePrice(1);
                Coffee americano = coffeeMachine.makeAmericano(20,30);
                totalProfit += americano.calculatePrice(1);
                Coffee cappuchino = coffeeMachine.makeCappuchino(12,17);
                totalProfit += cappuchino.calculatePrice(1);
                Coffee coffeeWithMilk = coffeeMachine.makeCoffeeWithMilk(30,40);
                totalProfit += coffeeWithMilk.calculatePrice(1);
                Coffee espresso = coffeeMachine.makeEspresso(34, 47);
                totalProfit += espresso.calculatePrice(1);
                Coffee latte = coffeeMachine.makeLatte(26, 27);
                totalProfit += latte.calculatePrice(1);
            }
        }
        totalProfit -= coffeeMachine.getMachinePrice();
        totalProfit -= coffeeMachine.getAttendanceCost()*days;
        System.out.println("Total profit: " + totalProfit);
    }


}
