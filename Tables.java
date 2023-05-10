import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        for ( int i = 1 ; i <= r ; i+=2 )
        {
            if(i%2==1)
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}