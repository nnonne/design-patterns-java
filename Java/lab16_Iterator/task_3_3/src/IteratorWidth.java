import java.util.LinkedList;
import java.util.Queue;

public class IteratorWidth implements Iterator {

    private Queue<Component> queue;

    public IteratorWidth(Component root) {
        queue = new LinkedList<>();
        queue.offer(root);
    }

    @Override
    public boolean hasMore() {
        return !queue.isEmpty();
    }

    @Override
    public Component getNext() {
        Component node = queue.poll();
        if (node instanceof Box) {
            Box box = (Box) node;
            for (Component child : box.getChildren()) {
                queue.offer(child);
            }
        }
        return node;
    }
}
