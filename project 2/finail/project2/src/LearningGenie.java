import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LearningGenie {
	
	public static void main(String[] args) throws IOException {
		//main method if theres a question to ask will not: will guess 
		DecisionTree t = new DecisionTree();
		System.out.println(
				"I will know all!\nI can figure out whatever you are thinking of by asking questions.\nI know "
						+ t.countObjects() + " thing so far!");
		
		while (!GuessNode.exit()) {
			System.out.println("Think of an object!");
			Scanner s = new Scanner (System.in);
			t.guess(s);
		}
		
		FileWriter w = new FileWriter ("testfile.txt");
		t.write(w);
		w.close();
	}
}
