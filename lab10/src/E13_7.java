public class E13_7 {

	public static void main(String[] args) {
		// array with squares
		Object[] squares = {new Square((double) 4), new Square(14), 
			new Square(4.6), new Square(3), new Square((double) 4.7)};

		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + ((Square) squares[i]).getArea());
		 	System.out.println("Perimeter: " + ((Square) squares[i]).getPerimeter());
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
} 
}
}