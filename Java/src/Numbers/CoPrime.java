package Numbers;
import static Numbers.Reference.*;
public class CoPrime
{
    public static void manager()
    {
        int a=input();
        int b=input();
        if(!(checkInput(a)&&checkInput(b)))
            System.exit(0);
        boolean flag=isCoPrime(a,b);
        display(flag);
    }
    public static void main(String[] args)
    {
        manager();
    }
}
