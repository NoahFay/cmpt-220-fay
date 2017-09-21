import java.util.Scanner;

// JA: There is a problem in the logic
public class Exercise_04_21{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("SSN: ");
        String ssn = in.next();
        
        for (int i = 0; i < ssn.length(); i++)
        {
            char ssnDigit = ssn.charAt(i);
            
            if (i == 3 || i == 6)
            {
                if (ssnDigit != '-')        
                {
                    System.out.printf(" social security", ssn);   
                    System.exit(1);
                }   
            }
            {
                if (!Character.isDigit(ssnDigit))
                {
                    System.out.printf("%s is an invalid social security ", ssn);   
                    System.exit(1);
                }
            }
        }
        
        System.out.printf("%s is a valid social security", ssn);
    }
}  // JA: You were missing this }