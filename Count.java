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
        int e = 0 , o = 0;
        for (int i = 0 ; i < n ; i++)
        {
            if ( a[i] % 2 == 0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        System.out.println(e+" "+o);
    }
}