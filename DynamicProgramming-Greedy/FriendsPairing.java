import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scan = new Scanner(System.in);
        
        int f= scan.nextInt();
        
        
        int dp[]=new int[f+1];
        dp[1]=1;
        dp[2]=2;
     
        for(int i = 3 ; i <=f ;i++){
            dp[i] =dp[i-1]+((i-1)*(dp[i-2]));
        }
        System.out.println(dp[f]);
        
        
    }

}
