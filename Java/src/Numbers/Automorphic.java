package Numbers;
import static Numbers.Reference.*;
public class Automorphic
{
    public static boolean isAutomorphic(int n, int c)
    {
        return n*n%(int)(Math.pow(10,c))==n;
    }
    public static void manager()
    {
        int n= input();
        if(!(checkInput(n)))
            System.exit(0);
        int c= counter(n);
        boolean flag=isAutomorphic(n,c);
        display(flag);
    }
    public static void main(String[] args)
    {
        manager();
    }
}