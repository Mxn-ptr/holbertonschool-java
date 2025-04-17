import providers.Shipping;

public class Order {
	private int code;
	private double weight;
	private double total;
	private Shipping shipping;

	public Order(int code, double weight, double total) {
		this.code = code;
		this.weight = weight;
		this.total = total;
	}

	public int getCode() {
		return this.code;
	}

	public double getWeight() {
		return this.weight;
	}

	public double getTotal() {
		return this.total;
	}

	public Shipping getShipping() {
		return this.shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
}
