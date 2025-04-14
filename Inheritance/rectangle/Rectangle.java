public class Rectangle extends GeometricShape {
	private double width;
	private double height;

	public Rectangle() {}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		if (width < 0)
			throw new IllegalArgumentException("Width must be greater than or equal to 0");
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if (height < 0)
			throw new IllegalArgumentException("Height must be greater than or equal to 0");
		this.height = height;
	}
}
