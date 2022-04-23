import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int size= scan.nextInt();
    int arr[]=new int[size];
    int max= 0;
    for(int i=0;i<arr.length;i++){
     arr[i]=scan.nextInt();
     if(arr[i]>max){
         max= arr[i];
     }
    }
    
    for(int j= 0;j<max;j++){
    
    for(int i =0;i<arr.length;i++){
        
        if(arr[i]>0){
            System.out.print("*\t");
        }else{
            System.out.print("\t");
        }
        arr[i]=arr[i]-1;
    }
    System.out.println();
    
  }

}
}
