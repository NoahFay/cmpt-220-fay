import java.util.Scanner;

public class 7.9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("10 numbers: ");
        
        for (int i = 0; i < vals.length; i++) {
            vals[i] = in.nextDouble();
        }

        System.out.printf("The minimum number is: %.2f",min(vals));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double val : array) {
            if (val < min)
                min = val;
        }
        return min;
    }
}