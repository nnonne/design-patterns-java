public class Proxy implements DisplayObject {
    DisplayObject displayObject;
    final String path;

    public Proxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (displayObject == null){
            displayObject = new ImageFile(path);
        }
        displayObject.display();
    }
}
