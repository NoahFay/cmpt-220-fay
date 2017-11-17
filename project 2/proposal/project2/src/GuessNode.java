import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuessNode implements DecisionNode {
	
	private String guess;
	private static boolean exit = false;
	
	/**
	 * @param guess
	 * constructor for GuessNode
	 */
	public GuessNode (String guess) {
		this.guess = guess;
	}
	
	/**
	 * @return this method exits the program
	 */
	public static boolean exit(){
		return exit;
	}

	/**
	 * the count for a guess node is 1
	 */
	@Override
	public int countObjects() {
		return 1;
	}

	/**
	 * this method guesses what the user is thinking of, finds out if the guess was correct,
	 *  and learns from the interaction to be used in a later interaction, and clarifies what the
	 *  user was thinking of
	 */
	@Override
	public DecisionNode guess(Scanner in) {
		System.out.println("Are you thinking of a " + this.guess + "?");
		String str = in.nextLine();
		if (str.equals("yes")) {
			System.out.println("Excellent, thanks");
			System.out.println("Do you want to continue?");
			String con = in.nextLine();
			if (con.equals("yes")) {
				return this;
			} else if (con.equals("no")) {
				exit = true;
				return this;
			} else {
				System.out.println("valid inputs are yes or no. Game will now continue.");
				return this;
			}
		}
		else if (str.equals("no")) {
			System.out.println("Oh no! I was wrong!");
			System.out.println("What were you thinking of?");
			String newGuess = in.nextLine();
			System.out.println("What is a yes/no question that distinguishes a " + this.guess + " from a "+ newGuess + "?");
			System.out.print ("(Yes corresponds to " + this.guess + " ; No corresponds to " + newGuess + ") ");
			String question = in.nextLine();
			System.out.println("Thanks!  I'll learn from this experience!");
			System.out.println("Do you want to continue?");
			String cont = in.nextLine();
			if (cont.equals("yes")) {
				return new QuestionNode (this, new GuessNode (newGuess), question);
			} else if (cont.equals("no")) {
				exit = true;
				return new QuestionNode (this, new GuessNode (newGuess), question);
			} else {
				System.out.println("valid inputs are yes or no. Game will now continue.");
				return new QuestionNode (this, new GuessNode (newGuess), question);
			}
		}
		else {
			System.out.println("valid inputs are yes or no. Game will now continue.");
			return this;
		}
	}

	/**
	 * this writes to the file
	 */
	@Override
	public void write(FileWriter out) throws IOException {
		out.write(this.guess+"\n");		
	}

}
