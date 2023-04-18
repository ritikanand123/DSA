import java.util.*;
import java.io.*;
 
 
public class ClosestToTheLeft{
 
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
            int  res  = IsExist(arr,tbf);
            System.out.println(res);
        }
        
        
    }
    
    public static int  IsExist(int arr[] , int x){
        
        int low = -1;
        int high =  arr.length;
        while( low+1 < high){
            
            int mid = (low+high)/2;
            if(arr[mid] > x ){
                high = mid;
            }else{
                low = mid;
            }
            
        }
        
       return low+1;
        
    }
    
    
}
