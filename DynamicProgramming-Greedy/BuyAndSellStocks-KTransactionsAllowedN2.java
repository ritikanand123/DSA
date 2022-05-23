import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int n =scan.nextInt();
        int arr[]=new int[n];
        for(int i =0 ;i< arr.length ;i++){
            arr[i]=scan.nextInt();
        }
        int trns=scan.nextInt();
        
        int dp[][]=new int[trns+1][n];
        
        for(int i =1 ;i <= trns ;i++){
            int max = Integer.MIN_VALUE;
            for(int j=1;j< arr.length ;j++){
               
               if(dp[i-1][j-1]-arr[j-1]>max){
                   max=dp[i-1][j-1]-arr[j-1];
               }
             
               if(max+arr[j]>dp[i][j-1]){
                   dp[i][j]=max+arr[j];
               }else{
                   dp[i][j]=dp[i][j-1];
               }
              
            }
            
        }
        
        System.out.println(dp[trns][n-1]);
    }

}



