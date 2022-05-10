import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int oczeros=1;
    int ocones=1;
    
    
    for(int i = 2 ;i <= n;i++){
        
        int nczeros=oczeros+ocones;
        int ncones=oczeros;
        oczeros=nczeros;
        ocones=ncones;
   
    }
    long  ans = oczeros+ocones;
    System.out.println(ans*ans);
 }

}
