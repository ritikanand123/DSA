import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]=new int[size];
        for(int i = 0 ; i < arr.length ;i++){
            arr[i]=scan.nextInt();
        }
        int tar = scan.nextInt();
        coinChange(arr,tar);
    }
    public static void coinChange(int arr[],int tar){
        
        int dp []= new int[tar+1];
        dp[0]=1;
        for(int i = 0 ; i < arr.length;i++){
            for(int j = arr[i];j< dp.length;j++){
                dp[j]+=dp[j-arr[i]];
            }
        }
        
            System.out.println(dp[tar]);
        
        
        
    }
}
