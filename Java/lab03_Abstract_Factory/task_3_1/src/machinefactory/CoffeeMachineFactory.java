package machinefactory;

import coffeemachine.CoffeeMachine;

interface CoffeeMachineFactory {

    CoffeeMachine createMachine(int machinePrice, int attendanceCost);

}
