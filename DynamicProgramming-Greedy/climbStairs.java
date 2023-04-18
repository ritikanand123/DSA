import java.io.*;
import java.util.*;

public class climbStairs {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int paths=stairpaths(num,new int[num+1]);
        System.out.println(paths);
    }
    
    public static int stairpaths(int n , int [] arr){
        
        if(n==0){
            return 1;
        }if(n<0){
            return 0;
        }
        if(arr[n]>0){
            return arr[n];
        }
        
        int p1 = stairpaths(n-1,arr);
        int p2 = stairpaths(n-2,arr);
        int p3 = stairpaths(n-3,arr);
        int cp = p1+p2+p3; 
        arr[n]=cp;
        
        return cp;
        
        
    } 
    
    public static int stairpathsTab(int num){
        int dp []= new int[num+1];
        dp[0]=1;
        
        for(int i = 0 ; i <= num ;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            if(i>=3){
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        
        return dp[num+1];
        
        
        
    }

}
