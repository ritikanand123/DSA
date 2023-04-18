import java.io.*;
import java.util.*;

public class BuyAndSellStocksKTransactionsAllowedN3 {

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
            for(int j=1;j< arr.length ;j++){
               int max = dp[i][j-1];
               
               for(int d=0;d<j;d++){
                   
                   int pps= dp[i-1][d];//previous profit stored
                   int pttrns=arr[j]-arr[d];//profit this transaction
                   if((pps+pttrns)>max){
                       max=pps+pttrns;
                   }
               }
               
                dp[i][j]=max;
               
            }
            
        }
        
        System.out.println(dp[trns][n-1]);
    }

}



