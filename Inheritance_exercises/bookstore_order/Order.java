package bookstore_order;

public class Order {
	private double discountPercentage;
	private ItemOrder[] items;

	Order(double discountPercentage, ItemOrder[] items) {
		this.discountPercentage = discountPercentage;
		this.items = items;
	}

	public double getDiscountPercentage() {
		return this.discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		if (discountPercentage > 0 && discountPercentage <= 100)
			this.discountPercentage = discountPercentage;
	}

	public ItemOrder[] getItems() {
		return this.items;
	}

	public void setItems(ItemOrder[] items) {
		if (items.length > 0)
			this.items = items;
	}

	public double calculateTotal() {
		double total = 0;
		for (ItemOrder item: this.items) {
			total += item.getProduct().getNetPrice() * item.getQuantity();
		}
		total -= total * (discountPercentage / 100);
		return total;
	}
}
