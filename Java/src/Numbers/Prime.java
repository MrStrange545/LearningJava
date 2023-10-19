package Numbers;
import static Numbers.Reference.*;
public class Prime
{
    public static void manager()
    {
        int n=input();
        if(!(checkInput(n)))
            System.exit(0);
        boolean flag=isPrime(n);
        display(flag);
    }
    public static void  main(String[] args)
    {
        manager();
    }
}