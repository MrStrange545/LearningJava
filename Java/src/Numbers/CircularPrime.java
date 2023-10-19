package Numbers;
import java.util.*;
public class CircularPrime
{


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


}