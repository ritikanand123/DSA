import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k= scan.nextInt();
        
        int same = k*1;
        int diffrent = k*(k-1);
        int total= same+diffrent;
         
        for(int i = 3 ; i <= n ;i++){
            same= diffrent;
            diffrent=total*(k-1);
            total = same + diffrent;
        }
        
        System.out.println(total);
        
        
    }
}
