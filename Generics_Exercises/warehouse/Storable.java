public interface Storable<T> {
    public void addToInventory(String itemName, T item);
    public T getFromInventory(String itemName);
}
