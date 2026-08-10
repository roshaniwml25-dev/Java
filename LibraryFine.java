import java.util.*;

public class LibraryFine
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of days : ");
        int n = in.nextInt();
        
        double fine = 0.0;
        
        if (n <= 5)
            fine = n * 2.0 ;
        else if (n <= 10)
            fine = 10 + (n - 5) * 5.0 ;
        else
            fine = 10 + 25 + (n - 10) * 10 ;
            
        System.out.println("Fine to be paid = ₹" + fine);
    }
}