package JAVA.Numbers;
import java.util.*;
public class ArmStrong
{
    //private variable n  to hold the value given by the user and c to count the number of digits in the number;
    private int n,c;
    //  default constructor to take input and initialise n.
    ArmStrong()
    {
        //Using try catch to avoid any runtime exception generated due to invalid input.
        try
        {
        //using the Scanner class to take input. I have taken the object as scr.
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number");
        n=scr.nextInt();
        c=0;
        }
        catch(Exception e)
        {
            System.out.println("Invalid Output.");
            System.exit(0);
        }
    }
    // counter to count the number of digit in the number. Later on we will use it.
    // Reason behind making it public is that i can use it lator on in other classes also.
    public static int counter(int n)
    {
        while(n>0)
        {
           c++;   
           n/=10;     
        }
    }
    // method to do all the internal logic calculation of ArmStrong Number.
    public static void calculate()
    {
        int sum=0,num=n;

        while (num>0)
        {
            sum += Math.pow(n%10,c);
            n/=10;
        }

    }
    
    
}