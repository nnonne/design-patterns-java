package size;

public class UserSize implements SizeButton {

    final private String size;

    public UserSize(String size) {
        this.size = size;
    }

    @Override
    public void setSize() {
        System.out.println("Setting size to " + this.size);
    }
}
