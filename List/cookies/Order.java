import java.util.ArrayList;

public class Order {
	private ArrayList<CookieOrder> cookies;

	public Order() {
		this.cookies = new ArrayList<>();
	}

	public void addCookieOrder(CookieOrder cookieOrder) {
		this.cookies.add(cookieOrder);
	}

	public int getTotalBoxes() {
		int count = 0;
		for (CookieOrder cookieOrder: this.cookies) {
			count += cookieOrder.getBoxQuantity();
		}
		return count;
	}

	public int removeFlavor(String flavor) {
		int removedCount = 0;
		for (int i = 0; i < this.cookies.size(); i++) {
			if (this.cookies.get(i).getFlavor().equals(flavor)) {
				removedCount += this.cookies.get(i).getBoxQuantity();
				this.cookies.remove(i);
				i--;
			}
		}
		return removedCount;
	} 
}
