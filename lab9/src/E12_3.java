import java.util.Scanner;

public class E12_3 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		// Invoke getArray method
		int[] array = getArray();

		// Prompt the user to enter the index of the array
		System.out.print("Enter the index of the array: ");
		try {
			// Display the corresponding element value
			System.out.println("The corresponding element value is " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}