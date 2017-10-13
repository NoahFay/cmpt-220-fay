import java.util.GregorianCalendar;
import java.util.Calendar`
public class E95 {
	public static void main(String[] args) {
		
		GregorianCalendar calender = new GregorianCalendar();

		System.out.print(" Mth/Day/Year: ");
		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
		calender.setTimeInMillis(1234567898765L);
		System.out.print("time since January 1, 1970   +
			"1234567898765L in format Mth/Day/Year: ");
		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}