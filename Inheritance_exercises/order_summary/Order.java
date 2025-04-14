package order_summary;

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

	public void presentOrderSummary() {
		System.out.println("------- ORDER SUMMARY -------");
		double total = 0;
		for (ItemOrder item: this.items) {
			double totalItemOrder = item.getProduct().getNetPrice() * item.getQuantity();
			total += totalItemOrder;
			System.out.printf("Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f\n", item.getProduct().getClass().getSimpleName(), item.getProduct().getTitle(), item.getProduct().getNetPrice(), item.getQuantity(), totalItemOrder);
		}
		System.out.println("----------------------------");
		double discount = total * (discountPercentage / 100);
		System.out.printf("DISCOUNT: %.2f\n", discount);
		System.out.printf("TOTAL PRODUCTS: %.2f\n", total);
		System.out.println("----------------------------");
		System.out.printf("TOTAL ORDER: %.2f\n", total - discount);
		System.out.println("----------------------------");
	}
}
