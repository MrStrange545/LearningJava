package Numbers;
import static Numbers.Reference.*;
public class Buzz
{
    public static boolean isBuzz(int n)
    {
        return (n%10==7||n%7==0);
    }
    public static void manager()
    {
        int n=input();
       if(!(checkInput(n)))
           System.exit(0);
        boolean flag=isBuzz(n);
        display(flag);
    }
    public static void main(String[] args)
    {
        manager();
    }
}