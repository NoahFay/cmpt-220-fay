import java.util.Scanner;

public class 2.7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// minutes
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		// years to days
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		// results
		System.out.println(minutes + " minutes is approximately " + years
			+ " years and " + days + " days");
	}
}