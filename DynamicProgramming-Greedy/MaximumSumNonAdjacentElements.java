import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]= new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            
            arr[i]= scan.nextInt();
            
        }
        
        
        int inc = 0 ;
        int exc = 0 ;
        
        for(int i = 0  ; i < arr.length ; i++){
            int temp = exc;
            exc= Integer.max(inc,exc);
            inc = temp+arr[i];
           
        }
        
        System.out.println(Integer.max(inc,exc));
        
    }
}
