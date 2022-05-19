import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[]=new int[n];
        for(int i = 0 ; i < arr.length;i++){
            arr[i]=scan.nextInt();
        }
    
        int lowest = Integer.MAX_VALUE;
        int dp[]=new int [n];
        
        for(int i = 0 ; i < dp.length;i++){
            
            if(arr[i]<lowest){
                lowest=arr[i];
            }
            dp[i]=arr[i]-lowest;
            
        }
        int tbp=0;
        for(int i = 0 ; i < arr.length;i++){
            
            if(dp[i] > tbp ){
                tbp=dp[i];
            }
            
            
        }
        
        System.out.println(tbp);
        
        
        
    }

}
