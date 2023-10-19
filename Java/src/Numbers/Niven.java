package Numbers;
import static Numbers.Reference.*;

public class Niven
{
    public static boolean isNiven(int n)
    {
        return (n%sumOfDigits(n))==0;
    }
    public static void manager()
    {
        int n=input();
        if(!(checkInput(n)))
            System.exit(0);
        boolean flag=isNiven(n);
        display(flag);

    }
    public static void main(String... args)
    {
        manager();
    }
}