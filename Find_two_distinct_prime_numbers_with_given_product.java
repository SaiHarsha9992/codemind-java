import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int flag = 0;
        for ( int i = 2 ; i < n ; i++)
        {
            for ( int j = i+1 ; j < n ; j++)
            {
                if ( i * j == n )
                {
                  System.out.println(i+" "+j);
                  flag = 1;
                }
            }
        }
        if ( flag == 0 )
        {
            System.out.println(-1);
        }
        
    }
}