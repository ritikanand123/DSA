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
            int  res  = IsExist(arr,tbf);
            System.out.println(res);
        }
        
        
    }
    
    public static int  IsExist(int arr[] , int x){
        
        int l = -1;
        int r =  arr.length;
        while( l+1 < r){
            
            int mid = (l+r)/2;
            if(arr[mid] < x ){
                l = mid;
            }else{
                r = mid;
            }
            
        }
        
       return r+1;
        
    }
    
    
}
