import java.util.HashMap;
import java.util.Map;

public abstract class Warehouse<T> implements Storable<T> {
    private Map<String, T> storage = new HashMap<>();
    @Override
    public void addToInventory(String itemName, T item) {
        this.storage.put(itemName, item);
    }

    @Override
    public T getFromInventory(String itemName) {
        return this.storage.get(itemName);
    }
}
