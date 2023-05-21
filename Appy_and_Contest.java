import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k-- > 0 )
        {
            long n,a,b,l,i,c=0,m=0;
            n=sc.nextLong();
            a=sc.nextLong();
            b=sc.nextLong();
            l=sc.nextLong();
            for(i=1;i<=n;i++)
            {
                if(i%a==0 && i%b!=0)
                {
                    c++;
                }
                else if(i%a!=0 && i%b==0)
                {
                    c++;
                }
            if(c>=l)
            {
                System.out.println("Win");
                m=1;
                break;
            }
            }
            if(m==0)
            {
                System.out.println("Lose");
            }
        }
    }
}