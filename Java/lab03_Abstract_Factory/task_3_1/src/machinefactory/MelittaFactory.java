package machinefactory;

import coffeemachine.CoffeeMachine;
import coffeemachine.MelittaCoffeeMachine;

public class MelittaFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createMachine(int machinePrice, int attendanceCost){
        return new MelittaCoffeeMachine(machinePrice, attendanceCost);
    }
}
