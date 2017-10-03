import java.util.Scanner;

public class Exercise_02_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	

		//  velocity 
		System.out.print("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

		// average 
		double a = (v1 - v0) / t;

		// result
		System.out.println("The average acceleration is " + a);
	}
}