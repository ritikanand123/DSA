import java.io.*;
import java.util.*;

public class BuyAndSellStocksWithTransactionFeeInfiniteTransactionsAllowed {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]=new int [size];

        for(int i = 0 ;i < arr.length ;i++){
            arr[i]=scan.nextInt();
        }
        int fee= scan.nextInt();

        int obsp= -arr[0];
        int ossp=0;
        
        for(int i =1 ;i < arr.length ;i++){
            
            int nbsp=0;
            int nssp=0; 
            
            if(ossp-arr[i]>obsp){
                nbsp=ossp-arr[i];
            }else{
                nbsp=obsp;
            }
            
            if(arr[i]+nbsp-fee>ossp){
                nssp=arr[i]+nbsp-fee;
            }else{
                nssp=ossp;
            }
            
            obsp=nbsp;
            ossp=nssp;
            
        }
        
        System.out.println(ossp);

  }
}
