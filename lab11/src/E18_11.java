import java.util.Scanner;

public class E18_11 {
	private static Scanner input;

public static void main(String[] args) {

		input = new Scanner(System.in);

		//  enter an integer
		System.out.print("Enter an integer: ");
		long n = input.nextLong();

		// Display the sum
		System.out.println("The sum of " + n + " = " + sumDigits(n));
	}
//sums
	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}


	private static int sumDigits(long n, int sum) {
		if (n == 0) // Base case
			return sum;
		else 
			// Recursive call
			return sumDigits(n / 10, sum + (int)(n % 10));
	}
}