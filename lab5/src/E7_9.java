import java.util.Scanner;

// JA: Don't start your classes with a number
public class E7_9 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		double[] numbers = new double[10]; // Create array of length 10

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Display the minimum value
		System.out.println("The minimum number is: " + min(numbers));
	}

	/** Method min returns the smallest element in an array of double values */
	public static double min(double[] array) {
		double min = array[0];	// The minimum value
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}