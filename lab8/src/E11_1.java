import java.util.Scanner;

public class E11_1 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		// sides 
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();
		// filled 
		System.out.print("Is the triangle filled (ture / false)? ");
		boolean filled = input.nextBoolean();
		//color
		System.out.print("Enter a color: ");
		String color = input.next();
		//outputs tri
		Tri triangle = new Tri (side1, side2, side3);
		triangle.setFilled(filled);
		triangle.setColor(color);
		
// out print 
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not") + " filled");
	}
}

 