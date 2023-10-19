package Numbers;
import static Numbers.Reference.*;
public class CircularPrime
{
    public static void manager()
    {
        int n=input();
        if(!(checkInput(n)))
            System.exit(0);
        int c=counter(n);
        boolean flag = isCircularPrime(n,c);
        display(flag);
    }
    public static boolean isCircularPrime(int n,int c)
    {
        int num,quo,r;
         for(int i=1;i<=c;i++)
         {
             r=n%10;
             quo=n/10;
             num=r*(int)(Math.pow(10,c-1))+quo;
             if(!isPrime(num))
                 return false;
             n=num;
         }
         return true;
    }
    public static void main(String[] args)
    {
        manager();
    }
}