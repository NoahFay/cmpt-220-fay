import java.util.Scanner;
 
public class 7.11 
{
 //intergers
    int[] a;
    double m;
    double sd;
 
    public void stat() {
        a = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        m = mean();
        sd = standardDeviation();
    }
 //mean
    public double mean() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + a[i];
        }
        double mean = sum / 10.0;
        return mean;
    }
 //dev
    public double standardDeviation() {
        double sumOfSquaredDifferences = 0;
        for (int i = 0; i < 10; i++) {
            sumOfSquaredDifferences = sumOfSquaredDifferences + Math.pow(m - a[i], 2);
        }
        double variance = sumOfSquaredDifferences / 10;
        double standardDeviation = Math.sqrt(variance);
        return standardDeviation;
    }
 
    public void dev() {
        for (int i = 0; i < 10; i++) {
            double dev = m - a[i];
            System.out.println("Deviation of " + a[i] + " = " + dev);
        }
    }
 //mean/dev
    public static void main(String[] args) {
        Stat stat = new Stat();
        stat.stat();
        System.out.println("Mean = " + stat.m);
        System.out.println("Standard Deviation = " + stat.sd);
        stat.dev();
    }
 
}
//hhj