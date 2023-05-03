import java.util.*;
import java.io.*;
import java.lang.*;
public class Sample
{
    public static void main(String args [])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for ( int i = 0 ; i < n ; i++) 
        {
            a[i] = s.nextInt();
        }
        int c = 0 , k = 0 ,m;
        int b[] = new int [n];
        for ( int i = 0 ; i < n ; i++ )
        {
            c = 0 ;
            m = a[i];
            for ( int j = 0 ; j < n ; j++ )
            {
                if ( m-a[j]>0&& a[j] < a[i] && j != i)
                {
                    c++;
                }
            }
            b[k++] = c;
        }
        for ( int i = 0 ; i < n ; i++ )
        {
            System.out.print(b[i]+" ");
        }
    }
}




