import java.util.List;
import java.util.Stack;

public class IteratorDepth implements Iterator{
    private Stack<Component> stack;

    public IteratorDepth(Component root) {
        stack = new Stack<>();
        stack.push(root);
    }

    @Override
    public boolean hasMore() {
        return !stack.isEmpty();
    }

    @Override
    public Component getNext() {
        Component node = stack.pop();
        if (node instanceof Box) {
            Box box = (Box) node;
            List<Component> children = box.getChildren();
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }
        return node;
    }
}
