import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner (System.in);
        int size = scan.nextInt();
        int value[] = new int[size];
        for(int i = 0 ; i < value.length ;i++){
            value[i]=scan.nextInt();   
        }
        int weight []= new int[size];
        for(int i = 0 ; i < weight.length ;i++){
            weight[i]=scan.nextInt();
        }
        int cap = scan.nextInt();
        zerOneKnapsack(value,weight,cap);
    }
    
    public static void zerOneKnapsack(int []value,int [] weight,int cap){
        
        int dp[][]= new int[value.length+1][cap+1];
        
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ;j++){
                if(i==0&&j==0){
                    dp[i][j]=0;
                }
                else if(i==0){
                    dp[i][j]=0;
                }
                else if(j==0){
                    dp[i][j]=0;
                }
                else{
                    if(j-weight[i-1]>=0&&dp[i-1][j-weight[i-1]]+value[i-1]>dp[i-1][j]){
                        dp[i][j]=dp[i-1][j-weight[i-1]]+value[i-1];
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
    
        
      System.out.println(dp[dp.length-1][dp[0].length-1]);
        
        
    } 
    
    
    
}
