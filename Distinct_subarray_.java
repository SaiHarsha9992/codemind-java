import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int c = 0;
        for ( int i = l ; i <= r ; i++ )
        {
            int s = 0 ;
            for ( int j = i ; j <= r ; j++ )
            {
                s = s + j ;
                if ( s % 2 != 0 )
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}