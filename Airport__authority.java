import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a [] = new int [n];
        for ( int i = 0 ; i < n ; i++ )
        {
            a[i] = s.nextInt();
        }
        int t = s.nextInt();
        int c = 0 , d = 0 ; 
        for ( int  i = 0 ; i < n ; i++ )
        {
            if ( a [ i ] > t )
            {
               c++ ;
            }
            else
            {
                d++ ;
            }
            if( c > 0 )
            {
                c = c + 1 ;
            }
        }
        System.out.println(c + d ) ;
    }
}