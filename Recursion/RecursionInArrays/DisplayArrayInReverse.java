import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        displayArrReverse(arr,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
    
      if(idx==arr.length){
            return;
        }
        
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }

}
