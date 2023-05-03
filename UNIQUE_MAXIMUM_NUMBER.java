import java.util.Scanner;
public class ArraysDemo
{
  public static void findPairs(int a[],int n)
  {
      int c = 0 , max = 0 ;
     for(int i=0 ; i<n ; i++ )
     {
         c=0;
        for(int j = 0 ; j < n ; j++ )
        {
            if(j != i && a[i] != a[j])
            {
                c++;
            }
        }
        if( c == n-1 && max < a[i] )
        {  
            max = a[i] ;
        }
    }
    if( max == 0 )
    {
        System.out.println(-1);
    }
    else
    {
        System.out.println(max);
    }
  }
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int n,x[],i;
     n=sc.nextInt();
     x=new int[n];
     for(i=0;i<n;i++)
      x[i]=sc.nextInt();
     findPairs(x,n);
 }
}