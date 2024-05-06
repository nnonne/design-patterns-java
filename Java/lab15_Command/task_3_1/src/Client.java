public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();

        controllerKitchenLamp.setOn(new CommandTurnOn(kitchenLamp));
        controllerKitchenLamp.setOff(new CommandTurnOff(kitchenLamp));
        controllerHallLamp.setOn(new CommandTurnOn(hallLamp));
        controllerHallLamp.setOff(new CommandTurnOff(hallLamp));
        controllerBedroomLamp.setOn(new CommandTurnOn(bedroomLamp));
        controllerBedroomLamp.setOff(new CommandTurnOff(bedroomLamp));
        controllerBathroomLamp.setOn(new CommandTurnOn(bathroomLamp));
        controllerBathroomLamp.setOff(new CommandTurnOff(bathroomLamp));

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();


        ControllerUniversal controllerUniversal = new ControllerUniversal();
        controllerUniversal.addController(controllerKitchenLamp);
        controllerUniversal.addController(controllerHallLamp);
        controllerUniversal.addController(controllerBedroomLamp);
        controllerUniversal.addController(controllerBathroomLamp);

        System.out.println("\n");
        controllerUniversal.turnAllOff();
        controllerUniversal.turnAllOn();

    }
}