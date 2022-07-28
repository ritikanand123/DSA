import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int s1 = scan.nextInt();
    int a1[] =new int[s1];
    for(int i = 0 ; i < s1 ;i++){
        a1[i] = scan.nextInt();
    }
    int s2 = scan.nextInt();
    int a2[] =new int[s2];
    for(int i = 0 ; i < s2 ;i++){
        a2[i] = scan.nextInt();
    }
    
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    for(int i = 0 ; i < s1 ;i++){
        
        if(hm.containsKey(a1[i])){
            int of  = hm.get(a1[i]);
            int nf  = of+1;
            hm.put(a1[i],nf);
        }else{
            hm.put(a1[i],1);
        }
        
    }
    
    for(int i = 0; i< s2 ;i++){
        
        if(hm.containsKey(a2[i])){
            int of  = hm.get(a2[i]);
            System.out.println(a2[i]);
            int nf  = of-1;
            if(nf == 0){
                hm.remove(a2[i]);
            }else{
                hm.put(a2[i],nf);
            }
        }
        
        
    }
    
    
 }

}
