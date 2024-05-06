public class CommandVolumeDown implements Command {

    final private Device device;

    public CommandVolumeDown(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

}
