public class Square extends Rectangle {
	private double size;

	public Square() {}

	public double getSide() {
		return this.size;
	}

	public void setSide(double size) {
		if (size < 0)
			throw new IllegalArgumentException("Side must be greater than or equal to 0");
		this.size = size;
		this.width = size;
		this.height = size;
	}

	public String toString() {
		return String.format("[Size] %.2f", this.size);
	}
}
