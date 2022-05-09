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
        unBoundedKnapsack(value,weight,cap);
    }
    
    public static void unBoundedKnapsack(int values[],int weight[],int cap){
        
        int dp[]=new int [cap+1];
        dp[0]=0;
        
        for(int i = 0 ; i < dp.length ;i++ ){
            int max = 0 ;
            for(int j = 0 ;j < values.length ;j++){
                int mbg=0;
                if(i-weight[j]>=0){
                    mbg=dp[i-weight[j]]+values[j];
                    
                }
                if(mbg>max){
                    max = mbg;
                }
            }
            dp[i]=max;
        }
        
     
         System.out.println(dp[cap]);
      
        
    } 
    
    
}
