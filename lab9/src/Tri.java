public class Tri
		extends Object {
	private double side1;
	private double side2;
	private double side3;


	public Tri() {
		side1 = side2 = side3 = 1.0;
	}

	//gets sides 
	public Tri(double side1, double side2, double side3) 
		throws Exception {
		if (side1 + side2 <= side3 || 
			 side1 + side3 <= side2 || 
			 side2 + side3 <= side1) 
			throw new Exception();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
//gets sides
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}


	public double getSide3() {
		return side3;
	}
	//permintor
		public double getPerimeter() {
			return side1 + side2 + side3;
		}
	//area
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	
//gets string
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}
