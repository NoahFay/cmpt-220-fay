import java.util.ArrayList;

public class Course {
	// Data fields
	private String courseName;
	private ArrayList<String> students;
 
	// makes course
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	// Methods
	public void addStudent(String student) {
		students.add(student);
	}
	//makes array of kids 
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}
	//# in array 
	public int getNumberOfStudents() {
		return students.size();
	}

	// name of course 
	public String getCourseName() {
		return courseName;
	}

	//drop student 
	public void dropStudent(String student) {
		students.remove(student);
	}
}