public class CommandPrevChannel implements Command {

    final private Device device;

    public CommandPrevChannel(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.prevChannel();
    }

}
