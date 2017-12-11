import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


 // the DecisionNode  has three methods: countObjects, guess, and write witch saves the data to a file.

public interface DecisionNode {
	public int countObjects();
	public DecisionNode guess(Scanner in);
	public void write(FileWriter out) throws IOException;
}