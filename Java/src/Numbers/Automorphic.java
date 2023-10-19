package Numbers;
public class Automorphic
{
    public static boolean isAutomorphic(int n, int c)
    {
        return n*n%(int)(Math.pow(10,c))==n;
    }
    public static void manager()
    {
        int n=Reference.input();
        if(!(Reference.checkInput(n)))
            System.exit(0);
        int c=Reference.counter(n);
        boolean flag=isAutomorphic(n,c);
        Reference.display(flag);
    }
    public static void main(String[] args)
    {
        manager();
    }
}