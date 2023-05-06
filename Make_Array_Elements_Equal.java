import java.util.*;
public class Harsha
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int [n];
        for ( int i = 0 ; i < n ; i++ )
        {
            a[i] = s.nextInt();
        }
         int t = a [ 0 ] , c = 0 ;
        for ( int i = 0 ; i < n ; i++ )
        {
            if ( a [ i ] == t ) 
            {
                c++ ;
            }
        }
        if ( c == n )
        {
            System.out.println(0);
        }
        else
        {
            int d , p = 0 ;
            for ( int i = 0 ; i < n ; i++ )
            {
                d = 0 ;
                for ( int j = 0 ; j < n ; j++ )
                {
                    if ( a [ i ] == a [ j ] ) 
                    {
                        d++ ;
                    }
                }
                if ( d > p )
                {
                     p = d ;
                }
            }
            System.out.println(p);
    }
    }
}