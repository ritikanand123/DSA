import java.util.*;
import java.io.*;
 
 
public class Main{
 
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[n];
        for(int i  = 0 ; i < n ;i++){
            arr[i]  = scan.nextInt();
        }
        Arrays.sort(arr);
        
        int k = scan.nextInt();
        for(int i  = 0 ; i < k ;i++){
            int l = scan.nextInt();
            int r = scan.nextInt();
            NumbersInBetween(arr , l  ,r);
        }
        
    }    
    public static void NumbersInBetween(int arr[] , int  l ,int r){
        
        int  rr = getRight(arr, l);
        int ll  = getLeft(arr , r);
        
        System.out.println((ll-rr)+1);
    }
    
    public static int getRight(int arr[] ,  int x){
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
    
    public static int  getLeft(int arr[] ,  int x){
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
