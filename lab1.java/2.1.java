import java.util.Scanner;

public class 2.1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//  input a two
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();

		// Celsius = Fahrenheit
		double fahrenheit = 9.0 / 5 * celsius + 32;

		// answer
		System.out.println(celsius + " Celsius is " + fahrenheit
			+ " Fahrenheit"); 
	}
}