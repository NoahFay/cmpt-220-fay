import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

 //  count Objects, guess, and writes to a file
 
public interface DecisionNode {
	public int countObjects();
	public DecisionNode guess(Scanner in);
	public void write(FileWriter out) throws IOException;
}
