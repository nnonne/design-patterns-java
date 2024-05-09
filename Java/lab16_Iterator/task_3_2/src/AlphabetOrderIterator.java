import java.util.*;
import java.util.ArrayList;

public class AlphabetOrderIterator implements Iterator {

    private final  HashMap<String, ShopItem> items;
    private ArrayList<String> keys;
    private int iterationState;

    public AlphabetOrderIterator(Shop shop) {
        this.items = shop.getItems();
        keys = new ArrayList<>(shop.getItems().keySet());
        keys.sort(String::compareTo);
        iterationState = 0;
    }

    @Override
    public boolean hasMore() {
        return iterationState < keys.size();
    }

    @Override
    public ShopItem getNext() {
        return items.get(keys.get(iterationState++));
    }
}
