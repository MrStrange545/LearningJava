//import package for Scanner Class.
import java.util.*;
public class ArmStrong
{
    //creating input() function to take one integer number.
    public static int input()
    {
        //using try catch block to avoid RE:
        try
        {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter the number");
            return scr.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Invalid output");
            //To Shut Down the JVM we have to write the statement System.exit(0);
            System.exit(0);
            return 0;

        }
    }
    //this method is for counting digits in a number.
    public static int counter(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static boolean isArmStrong(int n,int c)
    {
        int n1=n,sum=0;
        while(n>0)
        {
            sum+=(int)Math.pow(n%10,c);
            n/=10;
        }
        return n1==sum;
    }
    public static void display(boolean flag)
    {
        if(flag)
        {
            System.out.println("Yes it is a ArmStrong Number");
        }
        else
        {
            System.out.println("No, it is not a ArmStrong number");
        }
    }
   public static void manager()
   {
       int n=input();
       int c=counter(n);
       boolean flag=isArmStrong(n,c);
       display(flag);
   }
   public static void main(String[] args)
   {
       manager();
   }
}