import java.io.*;
import java.util.*;

public class MinCostInMazeTraversal {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int oarr[][] = new int[n][m];
        for(int i = 0 ; i < oarr.length ; i++){
            for(int j = 0 ; j < oarr[0].length ;j++){
                oarr[i][j]=scan.nextInt();
            }
        }
        minCostTravel(oarr,n,m);
    }
    public static void minCostTravel(int [][] oarr,int n ,int m){
        
        int dp[][]=new int[oarr.length][oarr[0].length];
        
        for(int i = n-1 ; i >=0 ; i--){
            for(int j = m-1 ; j>=0 ;j--){
                if(i==n-1&&j==m-1){
                    dp[i][j]=oarr[i][j];
                }
                else if(i==n-1){
                    dp[i][j]=oarr[i][j]+dp[i][j+1];
                }
                else if(j==m-1){
                    dp[i][j]=oarr[i][j]+dp[i+1][j];
                }
                else{
                    if(dp[i+1][j]<=dp[i][j+1]){
                        dp[i][j]=oarr[i][j]+dp[i+1][j];
                    }
                    else if(dp[i][j+1]<dp[i+1][j]){
                        dp[i][j]=oarr[i][j]+dp[i][j+1];
                    }
                    
                }
                
            }
        }
        
        System.out.println(dp[0][0]);
        
    }

}
