import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuestionNode implements DecisionNode {
	
	private DecisionNode left;
	private DecisionNode right;
	private String question;
	
	public QuestionNode (DecisionNode left, DecisionNode right, String question) {
		this.left = left;
		this.right = right;
		this.question = question;
	}

	@Override
	public int countObjects() {
		return countObjectsH (this);
	}
	
	public static int countObjectsH (DecisionNode d) {
		if (d instanceof GuessNode) {
			return 1;
		}
		return countObjectsH (((QuestionNode) d).left) + countObjectsH (((QuestionNode) d).right);
	}

	@Override
	public DecisionNode guess(Scanner in) {
		System.out.println(this.question);
		String str = in.nextLine();
		if (str.equals("yes")) {
			this.left = (this.left).guess(in);
			return this;
		} if (str.equals("no")) {
			this.right = (this.right).guess(in);
			return this;
		} else {
			//throw
			return null;
		}
	}

	@Override
	public void write(FileWriter out) throws IOException {
		out.write("#"+this.question+"\n");
		this.left.write(out);
		this.right.write(out);
	}

}
