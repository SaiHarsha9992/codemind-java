import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int c = 0;
        char k = sc.next().charAt(0);
        for (int i = 0 ; i < s.length() ; i++)
        {
            if(k == s.charAt(i))
            {
                c++;
            }
        }
        if(c>0)
        System.out.println(c);
        else
        System.out.println(-1);
    }
}