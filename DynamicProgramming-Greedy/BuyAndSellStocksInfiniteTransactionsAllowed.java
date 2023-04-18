import java.io.*;
import java.util.*;

public class BuyAndSellStocksInfiniteTransactionsAllowed {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]=new int [size];
        
        for(int i = 0 ;i < arr.length ;i++){
            arr[i]=scan.nextInt();
        }
        
        int bd=0;
        int sd=0;
        int profit=0;
        
        for(int i = 1 ;  i < arr.length ;i++){
            
            if(arr[i]>=arr[i-1]){
                sd++;
            }else{
                profit+=arr[sd]-arr[bd];
                sd=bd=i;
            }
            
            
        }
        profit+=arr[sd]-arr[bd];
        System.out.println(profit);
        
    }

}
