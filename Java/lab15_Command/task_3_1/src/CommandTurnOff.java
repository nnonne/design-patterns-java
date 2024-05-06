public class CommandTurnOff implements Command {

    final private Lamp lamp;

    public CommandTurnOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lightOff();
    }

}
