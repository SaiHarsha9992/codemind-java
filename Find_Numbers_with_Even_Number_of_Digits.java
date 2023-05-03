import java.util.*;
public class Sample 
{
    public static void main ( String args [])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a [] = new int [n];
        for ( int i = 0 ; i < n ; i++ )
        {
            a[i] = s.nextInt();
        }
        int c = 0 ;
        for ( int i = 0 ; i < n ; i++ )
        {
            int t = a[i] , r = 0 , d = 0 ;
            while (t!=0)
            {
                r = t % 10 ;
                d++;
                t = t / 10 ;
            }
            if ( d % 2 == 0 )
            {
                c++;
            }
        }
        System.out.println(c);
    }
}