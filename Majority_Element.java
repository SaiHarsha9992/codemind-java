import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int [n];
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = s.nextInt();
        }
         int  c , so = 0 , max = 0;
        for (int i = 0 ; i < n ; i++ )
        {
            c = 0 ;
            for (int j = 0 ; j < n ; j++ )
            {
                if (a [ i ] == a [ j ] )
                {
                    c++ ;
                }
            }
            if ( c > max )
            {
                max = c ;
                so = a [ i ] ;
            }
            else if( c == max )
            {
                if ( a [ i ] < so )
                {
                    so = a [ i ] ;
                }
            }
        }
        System.out.println(so);
    }
}