package machinefactory;

import coffeemachine.CoffeeMachine;
import coffeemachine.KeurigCoffeeMachine;

public class KeurigFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createMachine(int machinePrice, int attendanceCost){
        return new KeurigCoffeeMachine(machinePrice, attendanceCost);
    }
}
