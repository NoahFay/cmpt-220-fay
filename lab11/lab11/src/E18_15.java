import java.util.Scanner;

public class E18_15 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		// Prompt the user to enter a string and a character
		System.out.print("Enter a string and a character: ");
		String[] str = input.nextLine().split("[ ]");

		// Display the number of times the character occurs in the string
		System.out.println("The character \'" + str[1] + "\' occurs " +
			count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
	}

	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}
	private static int count(String str, char a, int high) {
		if (high < 0)
			return 0;
		else if (str.charAt(high) ==  a) {
			return 1 + count(str, a, high - 1); 
		}
		else
			return count(str, a, high - 1); 
	}
}