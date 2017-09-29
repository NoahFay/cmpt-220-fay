import java.util.Scanner;

public class 6.19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three edges for a triangle
		System.out.println("Enter three edges for a triangle:");
		System.out.print(" Edge 1 points x, y: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print(" Edge 2 points x, y: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print(" Edge 3 points x, y: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		// Test if input is valid
		boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
							 (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
							 (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

		if (!valid)
		{
			System.out.println("Input is invalid.");
			System.exit(1);
		}

		// Compute the sides of the triangle
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

		public static void main(String[] args) {
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.printf("Enter length of first side of triangle : ");
				double side1 = scanner.nextDouble();		
				
				System.out.printf("Enter length of second side of triangle : ");
				double side2 = scanner.nextDouble();	
				
				System.out.printf("Enter length of third side of triangle : ");
				double side3 = scanner.nextDouble();		
					
				boolean isValidTriangle = (side1 + side2) > side3 && (side1 + side3) > side2 &&
													(side1 + side3) > side2;
				if(!isValidTriangle) {
					System.out.println("Side of triangle are invalid");
					return;
				}
				
				double semiPerimeter = (side1 + side2 + side3)/2;   
				
				double area =  Math.sqrt(semiPerimeter*(semiPerimeter-side1)
										*(semiPerimeter-side2)*(semiPerimeter-side3));
				System.out.printf("Area of triangle is : %4.2f",area);
			}
		}
	}