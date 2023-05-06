import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int [n];
        int b[] = new int [n];
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = s.nextInt();
        }
        for (int j = 0 ; j < n ; j++)
        {
            b[j] = s.nextInt();
        }
        int c[] = new int [n];
        for ( int i = 0 ; i < n ; i++)
        {
            c[i] = a[i]+b[i];
        }
        for ( int i = 0 ; i < n ; i++ )
        {
            System.out.print(c[i]+" ");
        }
    }
}