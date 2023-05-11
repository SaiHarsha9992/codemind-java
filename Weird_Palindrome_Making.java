import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        while(t-->0)
        {
             int n = s.nextInt();
            int a [ ] = new int [n]; 
            int c = 0 ;
            for ( int i = 0 ; i < n ; i++ )
            {
                a[i] = s.nextInt();
                if ( a [ i ] % 2 != 0 )
                {
                    c++ ;
                }
            }
            if ( c % 2 != 0 )
            {
                c-- ;
            }
        System.out.println(c/2);
        }
    }
}