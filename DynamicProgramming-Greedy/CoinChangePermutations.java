import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[]=new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]=scan.nextInt();
        }
        int tar = scan.nextInt();
        coinPermutations(arr,tar);

    }
    
    public static void coinPermutations(int arr[],int tar){
        
        int dp[]=new int[tar+1];
        dp[0]=1;
        for(int i = 0 ; i < dp.length;i++){
            for(int j = 0 ; j < arr.length ;j++){
                if(i-arr[j]>=0){
                    dp[i]=dp[i]+dp[i-arr[j]];
                }
            }
           
        }
        
        System.out.println(dp[tar]);
        
        
    }
    
    
}
