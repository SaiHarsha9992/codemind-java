import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int [n];
        for ( int i = 0 ; i < n ; i++)
        {
            a[i] = s.nextInt();
        }
        int min=a[0];
    for(int i=0;i<n;i++)
    {
        if(min>a[i])
        {
            min=a[i];
        }
    }
    int c=0;
    for(int i=min;i>=1;i--)
    {
        c=0;
        for(int j=0;j<n;j++)
        {
            if(a[j]%i==0)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.println(i);
            break;
        }
    }
    }
}