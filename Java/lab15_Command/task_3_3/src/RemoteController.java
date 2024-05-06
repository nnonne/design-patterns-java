public class RemoteController {

    private Command commandOn;
    private Command commandOff;
    private Command commandVolumeUp;
    private Command commandVolumeDown;
    private Command commandNextChannel;
    private Command commandPrevChannel;

    public void setCommandOff(Command commandOff) {
        this.commandOff = commandOff;
    }
    public void setCommandOn(Command commandOn) {
        this.commandOn = commandOn;
    }
    public void setCommandVolumeUp(Command commandVolumeUp) {
        this.commandVolumeUp = commandVolumeUp;
    }
    public void setCommandVolumeDown(Command commandVolumeDown) {
        this.commandVolumeDown = commandVolumeDown;
    }
    public void setCommandNextChannel(Command commandNextChannel) {
        this.commandNextChannel = commandNextChannel;
    }
    public void setCommandPrevChannel(Command commandPrevChannel) {
        this.commandPrevChannel = commandPrevChannel;
    }

    void deviceOn() {
        if (commandOn != null) {
            commandOn.execute();
        }
    }
    void deviceOff(){
        if (commandOff != null) {
            commandOff.execute();
        }
    }
    void deviceVolumeUp(){
        if (commandVolumeUp != null) {
            commandVolumeUp.execute();
        }
    }
    void deviceVolumeDown(){
        if (commandVolumeDown != null) {
            commandVolumeDown.execute();
        }
    }
    void deviceNextChanel(){
        if (commandNextChannel != null) {
            commandNextChannel.execute();
        }
    }
    void devicePrevChanel(){
        if (commandPrevChannel != null) {
            commandPrevChannel.execute();
        }
    }
}