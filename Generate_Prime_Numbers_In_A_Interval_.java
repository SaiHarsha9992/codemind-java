import java.io.*;
import java.util.*;
import java.lang.*;
public class Sample{
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n%2 == 0){
            return false;
        }
        for(int i = 3; i<= (int)Math.sqrt(n); i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int stop = sc.nextInt();
        for(int i = start; i <= stop; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}