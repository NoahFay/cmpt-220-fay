import java.util.Scanner;

public class Factors {

    public static void main(String[] args){
        int n = 420;
        // JAQ: You were supposed to ask the number from the user
        for(int i=2; i<=n; i++){
            while(n%i==0){
                System.out.println(i + "| " + n);
                System.out.println(" -----");
                n = n/i;
            }
        }
    }
}