import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int v,r = 0,f,rev=0,c = 0;
        while(n!=0)
        { 
            v=n%10;
            r=r*10+v;
            n=n/10;
        }    
        while(r!=0)
        {    
            f=r%10;
            if(r%10==6 && c==0) 
            { 
                rev=(rev*10)+9; 
                c++; 
            }
            else
            { 
                rev=(rev*10)+f;
            } 
            r=r/10; 
        } 
        System.out.println(rev);
    }
}