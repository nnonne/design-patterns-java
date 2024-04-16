package decorators;

public class PostSpaceDecorator extends BaseDecorator{

    public PostSpaceDecorator(Component component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}
