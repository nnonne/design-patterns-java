public class CommandNextChannel implements Command {

    final private Device device;

    public CommandNextChannel(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.nextChannel();
    }

}
