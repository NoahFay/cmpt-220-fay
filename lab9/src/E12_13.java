import java.io.*;
import java.util.*;

public class E12_13 {
	private static String line;

	/** Main method */
	public static void main(String[] args) throws Exception {
		// Check command line parameter usage
		if (args.length != 1) {
			System.out.println("Usage: java filename");
			System.exit(1);
		}	

		// Check if file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}

		int characters = 0;
		int words = 0;			
		int lines = 0;			

		try (
			
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				lines++;
				String line = input.nextLine();
				characters += line.length();
			}
		}

		try (
			// Create input file
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				setLine(input.next());
				words++;
			}
		}

		// Display results
		System.out.println("File " + file.getName() + " has");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}

	public static String getLine() {
		return line;
	}

	public static void setLine(String line) {
		E12_13.line = line;
	}
}