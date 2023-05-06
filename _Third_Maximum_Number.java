import java.util.*;
import java.lang.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for ( int i = 0 ; i < n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int m1=-1,m2=-1,m3=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>m1)
            {
                m1=a[i];
            }   
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>m2 && a[i]!=m1)
            {
                m2=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>m3 && a[i]!=m2 && a[i]!=m1)
            {
                m3=a[i];
            }
        }
        if(m3==-1)
        {   
            System.out.println(m1);
        }
        else
        {
            System.out.println(m3);
        }
    }
}