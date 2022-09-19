import java.util.*;
import java.io.*;
 
 
public class Main{
 
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int t = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = scan.nextInt();
        }
        
        for(int i = 0 ; i < t ;i++){
            int tbf = scan.nextInt();
            // System.out.println("hi");
            boolean res  = IsExist(arr,tbf);
            System.out.println((res)?"YES":"NO");
        }
        
        
    }
    
    public static boolean IsExist(int arr[] , int tbf){
        
        int low = 0;
        int high =  arr.length-1;
        while(low <= high){
            
            int mid = (low+high)/2;
            if(arr[mid] == tbf ){
                return true;
            }else if(arr[mid] > tbf){
                high =  mid-1 ;
            }else{
                low = mid+1;
            }
            
        }
        
        return false;
        
    }
    
    
}
