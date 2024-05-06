public class CommandTurnOn implements Command {

    final private Lamp lamp;

    public CommandTurnOn(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lightOn();
    }

}
