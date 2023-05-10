import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int c = 0;
        int a[] = new int [n];
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 1 ; i < n ; i++)
        {
            if ( a[i-1] > a[i])
            {
                c++;
            }
        }
        if ( c+1 == n )
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}