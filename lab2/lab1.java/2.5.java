import java.util.Scanner;

public class Exercise_02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	

		// rates
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		// Calc
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		//  results
		System.out.println("The gratuity is $" + gratuity +
			" and total is $" + total);
	}
}