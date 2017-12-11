import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DecisionTree {
	
	DecisionNode root;
	
	
	 // constructor for DecisionTree has base guess of dog
	 
	public DecisionTree() {
		this.root = new GuessNode ("dog");
	}
	
	
	public DecisionTree(File file) throws FileNotFoundException {
		Scanner s = new Scanner (file);
		if (s.hasNextLine()) {
		this.root = DecisionTreeH (s);
		}
	}
	

	 // this method creates a DecisionTree from a file
	
	public static DecisionNode DecisionTreeH (Scanner s) {
		String str = s.nextLine();
		if (str.charAt(0) != '#') {
			return new GuessNode (str);
		}
		return new QuestionNode (DecisionTreeH (s), DecisionTreeH (s), str.substring(1));
	}

	//gets object from tree the root 
	public int countObjects() {
		return root.countObjects();
	}

	
	public void guess(Scanner in) {
		root = root.guess(in);
	}

	//writes to file 
	public void write(FileWriter out) throws IOException {
		root.write(out);
	}

}
