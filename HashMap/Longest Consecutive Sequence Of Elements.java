import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scan = new Scanner(System.in);
    int s1 = scan.nextInt();
    int arr[] = new int[s1];
    
    for(int i = 0; i<s1;i++){
        arr[i] = scan.nextInt();
    }
    
    HashMap <Integer,Boolean> hm  = new HashMap<>();
    
    for(int i = 0 ; i < s1 ;i++){
        hm.put(arr[i],true);
    }
    
    for(int i = 0 ; i < s1 ;i++){
        int temp = arr[i]-1;
        if(hm.containsKey(temp)){
            hm.put(arr[i],false);
        }
    }
    
    
    int msp = 0 ;
    int ml = 0;
    for(int i = 0 ; i < s1 ;i++){
        if(hm.get(arr[i])==true){
            int tl = 1;
            int tsp = arr[i];
            while(hm.containsKey(tsp+tl)){
                tl++;
            }
            
            if(tl>ml){
                msp = tsp;
                ml  = tl;
            }
        }
        
        
        
    }
    
    for(int i = 0 ;i < ml;i++){
        System.out.println(msp+i);
    }
    
 }

}
