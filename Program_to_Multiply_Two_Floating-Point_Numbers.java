import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = (float) (a*b);
        System.out.printf("%.2f",c);
    }
}