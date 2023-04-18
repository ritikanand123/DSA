import java.io.*;
import java.util.*;

public class TargetSumSubsets {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]= new int [size];
        for(int i = 0 ; i < arr.length ;i++){
            arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        
        targetSumSubsets(arr,target);
    }
    
    public static void targetSumSubsets(int arr[],int tar){
        
        boolean  dp[][]=new boolean [arr.length+1][tar+1];
        
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ;j++){
                if(i==0&&j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
                else if(j==0){
                    dp[i][j]=true;
                    
                }
                else{
                    if(dp[i-1][j]==true){
                        dp[i][j]=true;
                    }
                    else{
                        int val=arr[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]){
                            dp[i][j]=true;
                            }
                        }
                        else{
                            dp[i][j]=false;
                        }
                    }
                }
            }
        }
        
        
        System.out.println(dp[arr.length][tar]);
        
        
    }
    
}
