import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int arr[][] = new int[n][m];
    for (int i = 0 ; i < arr.length ; i++) {
      for (int j = 0 ; j < arr[0].length ; j++) {
        arr[i][j] = scan.nextInt();
      }
    }
    maxGoldFromMine(arr, n, m);
   
  }

  public static void  maxGoldFromMine(int arr[][], int n, int m) {
    int dp[][] = new int [n][m];

    for (int i = 0, j = m - 1; i < n - 1; i++) {
      dp[i][j] = arr[i][j];
    }
    
    for(int j = arr[0].length-1 ; j >=0 ;j--){
      for(int i = 0 ; i < arr.length ; i++){
          if(j == m-1){
              dp[i][j]=arr[i][j];
          }
          else if(i==0){
              dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
          }
          else if(i==n-1){
              dp[i][j]=arr[i][j]+ Math.max(dp[i][j+1],dp[i-1][j+1]);;
          }
          else{
             
              dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]));
          }
          
          
      }  
    }
    int max = Integer.MIN_VALUE;
    for(int i = 0 ,j=0; i<arr.length ;i++){
        if(dp[i][j]>max){
            max=dp[i][j];
        }
        
    }
    System.out.println(max);
  }

}
