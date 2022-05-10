import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int oczeros=1;
    int ocones=1;
    
    
    for(int i = 2 ;i <= n;i++){
        
        int nczeros=ocones;
        int ncones=oczeros+ocones;
        oczeros=nczeros;
        ocones=ncones;
       
        
    }
    
    System.out.println(oczeros+ocones);
 }

}
