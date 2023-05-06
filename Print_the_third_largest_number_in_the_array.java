import java.util.*;
import java.lang.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int [n];
        int m1 = 0 , m2 = 0 , m3 = 0 ;
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0 ; i < n ; i++ )
        {
            if ( a [ i ] > m1 )
            {
                m1 = a [ i ] ;
            }
        }
        for (int i = 0 ; i < n ; i++ )
        {
            if ( a [ i ] > m2 && a [ i ] != m1 )
            {
                m2 = a [ i ] ;
            }
        }
        for (int i = 0 ; i < n ; i++ )
        {
            if ( a [ i ] > m3 && a [ i ] != m2 && a [ i ] != m1 )
            {
                m3 = a [ i ] ;
            }
        }
        if ( m3 == 0 )
        {
            System.out.println("It is not possible");
        }
        else
        {
            System.out.println(m3);
        }
    }
}