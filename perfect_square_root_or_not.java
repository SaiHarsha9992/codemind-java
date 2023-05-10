import java.util.*;
import java.lang.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c = (int)Math.sqrt(n);
        if ( c * c == n )
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}