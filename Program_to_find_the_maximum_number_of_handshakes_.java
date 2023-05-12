import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c = 0;
        for ( int i = n-1 ; i >=1 ; i--)
        {
            c = c + i ;
        }
        System.out.println(c);
    }
}