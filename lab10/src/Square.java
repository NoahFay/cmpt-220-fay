public class Square extends Object implements Color {
	private double side;

	public Square() {
	}

	public Square(double side) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super();
		setSide(side);
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}

	@Override
	public String howToColor() {
		return "Color all four sides";
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}
}