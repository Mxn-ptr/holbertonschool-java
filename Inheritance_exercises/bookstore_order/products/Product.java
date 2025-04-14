package bookstore_order.products;

import java.time.Year;

public abstract class Product {
	protected String title;
	protected int year;
	protected String country;
	protected double grossPrice;

	public Product(String title, int year, String country, double grossPrice) {
		this.title = title;
		this.year = year;
		this.country = country;
		this.grossPrice = grossPrice;
	}

	public void setTitle(String title) {
		if (!title.isEmpty())
			this.title = title;
	}

	public void setYear(int year) {
		if (year > 1500 && year < Year.now().getValue())
			this.year = year;
	}

	public void setCountry(String country) {
		if (!country.isEmpty())
			this.country = country;
	}

	public void setGrossPrice(double grossPrice) {
		if (grossPrice > 0)
			this.grossPrice = grossPrice;
	}

	public abstract double getNetPrice();
}
