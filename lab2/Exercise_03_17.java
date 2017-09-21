import java.util.Random;
import java.util.Scanner;

// JA: This code is incomplete
public class RPS {
    public static void main(String args[]){

    String choice, choice1;
    int num = 0;
    Random r = new Random();
    num = r.nextInt(3);

    System.out.println("Choose: Rock, Paper or Scissors.");
    Scanner userChoice = new Scanner(System.in);
    choice1 = userChoice.next();
    choice = choice1.toLowerCase();



    switch (num){
    case 0:
        String num1 = "rock";
        System.out.println("System chose Rock"); 
        if (choice.matches(num1)){
            System.out.println("Its a tie!");

            }
        else if (choice.matches("paper")){
            System.out.println("You win!");

        }
        else if (choice.matches("scissors")){
            System.out.println("You lose!");
        }
        else {
            System.out.println();
            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
        }
    break;