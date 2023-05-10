import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c = 2;
        for ( int i = 2 ; i < n/2 ; i++)
        {
            if ( n%i == 0 )
            {
                c++;
            }
        }
        if ( c == 2 )
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}