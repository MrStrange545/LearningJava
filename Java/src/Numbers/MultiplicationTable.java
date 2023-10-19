package Numbers;
import static Numbers.Reference.*;
public class MultiplicationTable
{
    public static void manager()
    {
        int n = input();
        if (!checkInput(n))
            System.exit(0);
        display(n);
    }
        public static void display(int n)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(n*i);
            }
        }
    public static void main(String[]  args)
    {
        manager();
    }
}

