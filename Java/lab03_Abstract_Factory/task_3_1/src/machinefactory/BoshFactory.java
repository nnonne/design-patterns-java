package machinefactory;

import coffee.*;
import coffeemachine.BoshCoffeeMachine;
import coffeemachine.CoffeeMachine;

public class BoshFactory implements CoffeeMachineFactory {

    @Override
    public CoffeeMachine createMachine(int machinePrice, int attendanceCost){
        return new BoshCoffeeMachine(machinePrice, attendanceCost);
    }

}
