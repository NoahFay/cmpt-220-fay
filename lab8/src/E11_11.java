import java.util.Scanner;
import java.util.ArrayList;

public class E11_11 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		// makes array 
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 5 numbers 
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		// order 
		sort(list);
		System.out.println(list.toString());
	}

	// makes array 
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}