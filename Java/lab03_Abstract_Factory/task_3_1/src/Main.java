import coffeefactory.CoffeeFactory;
import coffeemachine.CoffeeMachine;
import machinefactory.BoshFactory;
import machinefactory.KeurigFactory;
import machinefactory.MelittaFactory;

public class Main {
    public static void main(String[] args) {
        BoshFactory boshFactory = new BoshFactory();
        CoffeeMachine boshMachine = boshFactory.createMachine(10000, 100);

        KeurigFactory keurigFactory = new KeurigFactory();
        CoffeeMachine keurigMachine = keurigFactory.createMachine(12000, 70);

        MelittaFactory melittaFactory = new MelittaFactory();
        CoffeeMachine melittaMachine = melittaFactory.createMachine(9000, 150);

        int N = 30;
        int coffees = 20;

        CoffeeShop boshShop = new CoffeeShop();
        System.out.println("Bosh machine:");
        boshShop.runShop(boshMachine, N, coffees);

        CoffeeShop keurigShop = new CoffeeShop();
        System.out.println("Keurig machine:");
        keurigShop.runShop(keurigMachine, N, coffees);

        CoffeeShop melittaShop = new CoffeeShop();
        System.out.println("Melitta machine: ");
        melittaShop.runShop(melittaMachine, N, coffees);
    }
}
