public class E93 {
	public static void main(String[] args) {
		
	java.util.Date date = new java.util.Date();

		
		System.out.println("10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000,");
		for (long y = 10000; y <= 1e11; y= y*10) {
			date.setTime(y);
			System.out.println(date.toString());
		}
	}
} // JA