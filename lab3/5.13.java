import java.util.Scanner;

public class 5.12{
    public static void main(String[] args){
        int n = 1;
        while(n*n*n <= 12000)
        {
            n += 1;
        }

        System.out.printf("%d^3 is the smallest integer greater than 12,000", n);
    }
}