import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int sum;
        Scanner scan =new Scanner(System.in);
        int x=scan.nextInt();
        int n=scan.nextInt();
        sum = power(x,n);
        
        System.out.println(sum);
    }

    public static int power(int x, int n){
        
        if(n==0){
            return 1;
        }
        int sum=x*power(x,n-1);
        return sum;
    }

}
