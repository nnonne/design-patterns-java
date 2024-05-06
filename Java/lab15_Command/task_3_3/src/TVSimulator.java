public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();

        RemoteController tvController = new RemoteController();

        tvController.setCommandOn(new CommandOn(tv));
        tvController.setCommandOff(new CommandOff(tv));
        tvController.setCommandVolumeUp(new CommandVolumeUp(tv));
        tvController.setCommandVolumeDown(new CommandVolumeDown(tv));
        tvController.setCommandNextChannel(new CommandNextChannel(tv));
        tvController.setCommandPrevChannel(new CommandPrevChannel(tv));

        tvController.deviceOn();

        for (int i = 0; i < 30; i++) {
            tvController.deviceNextChanel();
        }
        tvController.deviceVolumeUp();
        tvController.deviceVolumeUp();
        tvController.deviceVolumeUp();

        tvController.devicePrevChanel();

        tvController.deviceVolumeDown();

        tvController.deviceOff();


        Device radio = new Radio();
        RemoteController radioController = new RemoteController();
        radioController.setCommandOn(new CommandOn(radio));
        radioController.setCommandOff(new CommandOff(radio));
        radioController.setCommandVolumeUp(new CommandVolumeUp(radio));
        radioController.setCommandVolumeDown(new CommandVolumeDown(radio));
        radioController.setCommandNextChannel(new CommandNextChannel(radio));
        radioController.setCommandPrevChannel(new CommandPrevChannel(radio));


        radioController.deviceOn();

        for (int i = 0; i < 30; i++) {
            radioController.deviceNextChanel();
        }
        radioController.deviceVolumeUp();
        radioController.deviceVolumeUp();
        radioController.deviceVolumeUp();

        radioController.devicePrevChanel();

        radioController.deviceVolumeDown();

        radioController.deviceOff();

        ControllerUniversal controllerUniversal = new ControllerUniversal();
        controllerUniversal.addController(tvController);
        controllerUniversal.addController(radioController);

        controllerUniversal.turnAllOn();
        controllerUniversal.turnAllOff();

    }
}
