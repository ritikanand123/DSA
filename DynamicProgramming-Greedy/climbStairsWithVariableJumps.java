import java.io.*;
import java.util.*;

public class climbStairsWithVariableJumps {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      int arr[]= new int [size];
      for(int i = 0 ; i < arr.length ;i++){
          arr[i]=scan.nextInt();
      }
      int paths=climbStairs(size,arr);
      System.out.println(paths);
    }
    
    public static int climbStairs(int n,int[] arr){
        int dp[] = new int[n+1];
        dp[dp.length-1]=1;
        
        for(int i = arr.length-1;i>=0;i--){
            
            for(int j = 1 ;j <= arr[i];j++){
             
                if(i+j<=dp.length-1){
                dp[i]=dp[i]+dp[i+j];
                
                }else{
                    break;
                }
            }
            // System.out.println(dp[i]);
        }
        return dp[0];
        
        
        
        
        
        
    }

}
