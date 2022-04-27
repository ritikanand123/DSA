import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        int fact=factorial( n );
        System.out.println(fact);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int sum=(factorial(n-1));
        return n*sum;
        
    }

}
