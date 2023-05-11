import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int a[] = new int [3];
        int b[] = new int [3];
        for (int i = 0 ; i < 3 ; i++)
        {
            a[i] = s.nextInt();
        }
        for (int j = 0 ; j < 3 ; j++ )
        {
            b [ j ] = s.nextInt();
        }
        int k = 0 , c = 0;
        for ( int i = 0 ; i < 3 ; i++)
        {
            if ( a[i] > b[i])
            {
                k++;
            }
            else if(a[i] < b[i])
            {
                c++;
            }
        }
        System.out.println(k+" "+c);
    }
}