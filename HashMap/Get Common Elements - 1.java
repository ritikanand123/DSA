import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int sizea1 =scan.nextInt();
    int []a1 =new int [sizea1];
    for(int i = 0 ; i < sizea1 ; i++){
        a1[i] = scan.nextInt();
    }
    int sizea2 =scan.nextInt();
    int []a2 =new int [sizea2];
    for(int i = 0 ; i < sizea2 ; i++){
        a2[i] = scan.nextInt();
    }
    
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    for(int i = 0 ; i < sizea1 ;i++){
        
        if(hm.containsKey(a1[i])){
            
        }else{
            hm.put(a1[i],0);
        }
        
    }
    
    for(int i = 0 ; i < sizea2 ;i++){
        
        if(hm.containsKey(a2[i])){
            System.out.println(a2[i]);
            hm.remove(a2[i]);
        }
        
    }
    
   
  }
}





