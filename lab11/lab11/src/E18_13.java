import java.util.Scanner;

public class E18_13 {
	private static Scanner input;

	
	public static void main(String[] args) {
		input = new Scanner(System.in);

		// Prompt the user to enter a list of eight integers
		System.out.print("Enter eight integers: ");
		int[] list = new int[8]; // Create array of eight integers
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}

		// Display the largest element
		System.out.println("The largest element is " + max(list));
	}

	//makes array 
	public static int max(int[] list) {
		int max = list[list.length - 1]; // Largest number
		int index = list.length - 1; // List index
		return max(list, index, max);
	}

	private static int max(int[] list, int index, int max) {
		if (index < 0) // Base case
			return max;
		else if (list[index] > max) { 
			return max(list, index - 1, list[index]); 
		}
		else
			return max(list, index - 1, max); 
	}
}