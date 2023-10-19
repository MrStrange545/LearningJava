package Numbers;
import static Numbers.Reference.*;
public class ArmStrong
{
    public static boolean isArmStrong(int n,int c)
    {
        int n1=n , sum=0;
        while(n>0)
        {
            sum+=(int)Math.pow(n%10,c);
            n/=10;
        }
        return n1==sum;
    }
    public static void manager()
    {
        int n=input();
        if(!(checkInput(n)))
            System.exit(0);
        int c=counter(n);
        boolean flag=isArmStrong(n,c);
        display(flag);
    }
    public static void main(String[] args)
    {
        manager();
    }
}