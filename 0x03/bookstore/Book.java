import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class Book {
	private String title;
	private String author;
	private double price;

	public Book(String title, String author, double price) throws Exception {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if (title.length() < 3) {
			throw new InvalidBookException("Invalid book title");
		}
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		if (author.split(" ").length < 2) {
			throw new InvalidAuthorException("Invalid author name");
		}
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if (price <= 0) {
			throw new InvalidBookException("Invalid book price");
		}
		this.price = price;
	}
}
