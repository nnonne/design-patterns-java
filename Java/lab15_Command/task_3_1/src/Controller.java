public class Controller {

    private Command on;
    private Command off;

    public void setOff(Command off) {
        this.off = off;
    }
    public void setOn(Command on) {
        this.on = on;
    }
    public void on() {
        if (on != null) {
            on.execute();
        }
    }
    public void off() {
        if (off != null) {
            off.execute();
        }
    }

}
