import java.io.*;
import java.util.*;

public class BuyAndSellStocksTwoTransactionsAllowed {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int arr[]=new int [n];
        
        for(int i =  0 ; i < arr.length ;i++){
            arr[i]=scan.nextInt();
        }
        
        int mptnlr = 0;   //maximum profit till now 
        int minimum=Integer.MAX_VALUE;
        
       int dpl[]=new int [n];
        
        for(int i= 0 ;i < arr.length ;i++){
            if(arr[i] < minimum){
                minimum=arr[i];
            }
            if(arr[i]-minimum>mptnlr){
                mptnlr = arr[i]-minimum;
            }
            dpl[i]=mptnlr;
            
        }
       
        int dpr[]=new int [n];
        
        
        int mptnrl=0;
        int maximum=Integer.MIN_VALUE;
        for(int i = arr.length-1 ;i>=0;i--){
            
            if(arr[i]>maximum){
                maximum = arr[i];
            }
            if(maximum-arr[i]>mptnrl){
                mptnrl=maximum-arr[i];
            }
            dpr[i]=mptnrl;
            
        }
        
        int op=0;
        for(int i = 0 ;i < arr.length ;i++){
            
            if(dpl[i]+dpr[i]>op){
                op=dpl[i]+dpr[i];
            }
            
        }
        System.out.println(op);
        
    }

}




