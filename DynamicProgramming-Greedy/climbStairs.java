import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int paths=stairpathsTab(num);
        System.out.println(paths);
    }
    public static int stairpathsTab(int num){
        int dp []= new int[num+1];
        dp[0]=1;
        
        for(int i = 1 ; i <= num ;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[num];
        
        
        
    }

}
