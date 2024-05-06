public class Radio implements Device {

    private int volume;
    private int channel;
    private boolean isOn;

    public Radio() {
        this.isOn = false;
        this.volume = 50;
        this.channel = 1;
    }

    @Override
    public void on() {
        if (isOn) {
            return;
        }
        System.out.println("Radio is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) {
            return;
        }
        System.out.println("Radio is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            return;
        }
        volume++;
        System.out.println("Volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            return;
        }
        volume--;
        System.out.println("Volume = " + volume);
    }

    @Override
    public void nextChannel() {
        if (!isOn) {
            return;
        }
        channel++;
        System.out.println("Radio channel = " + channel);
    }

    @Override
    public void prevChannel() {
        if (!isOn) {
            return;
        }
        channel--;
        System.out.println("Radio channel = " + channel);
    }
}