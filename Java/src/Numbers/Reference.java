package Numbers;
import java.util.Scanner;
public class Reference
{
    public static int input()
    {
        try
        {
            Scanner scr = new Scanner(System.in);
            System.out.println("Please ,Enter the number");
            return scr.nextInt();
        }
        catch(Exception e)
        {
            return 0;
        }
    }
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
    public static void display(boolean flag)
    {
        if(flag)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    public static boolean checkInput(int n)
    {
        if(n>0)
        {
            return true;
        }
        else if(n<0)
        {
            System.out.println("Negative number is not allowed");
            return false;
        }
        else
        {
            System.out.println("Invalid Input");
            return false;
        }
    }
    public static int sumOfDigits(int n)
    {

        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isCoPrime(int a,int b)
    {
        int n=Math.min(a,b);
        for(int i=2;i<=n;i++)
        {
            if(a%i==0&&b%i==0)
                return false;
        }
        return true;
    }
}

