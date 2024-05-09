import java.util.*;

public class AmountDecreaseIterator implements Iterator {

    private final  HashMap<String, ShopItem> items;
    private ArrayList<ShopItem> values;
    private int iterationState;

    public AmountDecreaseIterator(Shop items) {
        this.items = items.getItems();
        values = new ArrayList<>(items.getItems().values());
        iterationState = 0;
        Collections.sort(values, (i1, i2) -> Integer.compare(i2.getQuantity(), i1.getQuantity()));
    }

    @Override
    public boolean hasMore() {
        return iterationState < values.size();
    }

    @Override
    public ShopItem getNext() {
        return values.get(iterationState++);
    }
}
