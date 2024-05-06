public class CommandVolumeUp implements Command {

    final private Device device;

    public CommandVolumeUp(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

}
