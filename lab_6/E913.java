import java.util.Scanner;

public class E913 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] array = new double[rows][columns]; 
		System.out.println("Enter the array: ");
		for (int y = 0; y < array.length; i++) {
			for (int k = 0; k < array[y].length; k++) {
				array[y][k] = input.nextDouble();}}
				Location max = locateLargest(array);
				System.out.println("e largest # is " +
				max.maxValue + (" at " + max.row + max.column + );
			}
		}
		public static Location locateLargest(double[][] a) {
		return new Location(a);
	}
}