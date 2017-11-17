import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LearningGenie {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//File file = new File ("testfile.txt");
		DecisionTree t = new DecisionTree();
		System.out.println(
				"I am the learning genie!\nI can figure out whatever you are thinking of by asking questions.\nI know "
						+ t.countObjects() + " thing!");
		
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
