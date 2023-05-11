import java.util.*;
import java.lang.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int t = n , flag = 0;
        int m = (int)Math.log10(n)+1;
        int a[] = new int [m];
        int k = 0;
        while(t>0)
        {
            a[k++] = t % 10;
            t /= 10;
        }
        Arrays.sort(a);
        for ( int i = 1; i < m ; i++)
        {
            if ( a[i-1] == a[i])
            {
                flag = 1;
                break;
            }
        }
        if ( flag == 1)
        {
            System.out.println("Not Unique Number");
        }
        else
        {
            System.out.println("Unique Number");
        }
        }
    }