import java.util.Scanner;

public class Node{
private Node yes;
private Node no;
private String question;
private String object;


	//Constructor sets question to blank
	public Node(){
		question = "";
		object = "";
	}

	public boolean Leaf(){
		if(yes == null && no == null){
			return false;
		}
		else return true;
	}

	public boolean Question(){
		return !question.equals("");
	}
	

	//Prints question and returns the answer if has question otherwise it asks if it is the object
	public String ask(Scanner sc){
		if(Leaf()){
			System.out.println(question);
		}
		else System.out.println("Is it a " + object);
		return sc.nextLine();
	}


	public Node getYes(){
		return yes;
	}

	
	public Node getNo(){
		return no;
	}

	//true or false returns yes gmae wins no promts user to ask questions 
	public boolean hasObject(){
		return !object.equals("");
	}


	public void makeNewNode(Scanner sc){
		System.out.println("What is the Object you are thinking of?");
		String obj = sc.nextLine();
		System.out.println("What is a question that seperates it?");
		String ques = sc.nextLine();
		System.out.println("What is the answer to that question for this object?");
		String ans = sc.nextLine();
		question = ques;
		yes = new Node();
		no = new Node();

		if(ans.equals("yes")){
			yes.object = obj;
			no.object = object;
		}
		else{
			no.object = obj;
			yes.object = object;
		}
		object = "";
	}
}
