package order_summary.products;

public class Book extends Product {
	private int pages;
	private String author;
	private int edition;

	public Book(String title, int year, String country, double grossPrice, int pages, String author, int edition) {
		super(title, year, country, grossPrice);
		this.pages = pages;
		this.author = author;
		this.edition = edition;
	}

	public int getPages() {
		return this.pages;
	}

	public void setPages(int pages) {
		if (pages > 0)
			this.pages = pages;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		if (!author.isEmpty())
			this.author = author;
	}

	public int getEdition() {
		return this.edition;
	}

	public void setEdition(int edition) {
		if (edition > 0)
			this.edition = edition;
	} 

	@Override
	public double getNetPrice() {
		return this.grossPrice * 1.15;
	}
}
