import java.util.HashMap;

public class Shop {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    public HashMap<String, ShopItem> getItems() {
        return items;
    }

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

}
