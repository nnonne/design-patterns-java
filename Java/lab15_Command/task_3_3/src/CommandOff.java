public class CommandOff implements Command {

    final private Device device;

    public CommandOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

}
