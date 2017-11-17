public class E13_11 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon octagon1 = new Octagon(5);

				System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + 
			"\nPerimeter: " + octagon1.getPerimeter());

		
		System.out.println("clone");
		Octagon octagon2 = (Octagon)octagon1.clone();

	
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("greather than its clone.");
		else if (result == -1)
			System.out.println(" less than its clone."); 
		else
			System.out.println("equal to its  clone.");
	}
}

