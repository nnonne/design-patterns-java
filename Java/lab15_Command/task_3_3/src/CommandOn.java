public class CommandOn implements Command {

    final private Device device;

    public CommandOn(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

}
