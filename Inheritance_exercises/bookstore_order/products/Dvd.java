package bookstore_order.products;

public class Dvd extends Product {
	private String director;
	private String genre;
	private int duration;

	public Dvd(String title, int year, String country, double grossPrice, String director, String genre, int duration) {
		super(title, year, country, grossPrice);
		this.director = director;
		this.genre = genre;
		this.duration = duration;
	}

	public String getDirector() {
		return this.director;
	}
	
	public void setDirector(String director) {
		if (!director.isEmpty())
			this.director = director;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		if (!genre.isEmpty())
			this.genre = genre;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		if (duration > 0)
			this.duration = duration;
	}

	@Override
	public double getNetPrice() {
		return this.grossPrice * 1.2;
	}
}
