public class E11_5 {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		course1.addStudent(" names of students:");
		course1.addStudent(" james");
		course1.addStudent("sol");
		course1.addStudent("jake");

		course2.addStudent("oliver");
		course2.addStudent("noah");

		System.out.println("Number of students : "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + " , ");
		System.out.println();
		System.out.print("Number of students in course 2 : "
			+ course2.getNumberOfStudents());
		
}
}
