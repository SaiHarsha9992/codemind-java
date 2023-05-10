import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int max = 0 , r ; 
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            if(max<r)
            {
                max=r;
            }
        }
        System.out.println(max);
    }
}