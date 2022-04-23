import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner (System.in);
    int size=scan.nextInt();
    int arr[]=new int[size];
    for(int i = 0;i<arr.length;i++){
        arr[i]=scan.nextInt();
    }
    int tofind =scan.nextInt();
    int first=-1;
    int last=-1;
    for(int i =0 ;i<arr.length;i++){
        if(arr[i]==tofind){
            first=i;
            break;
        }
    }
    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]==tofind){
            last =i;
            break;
        }
    }
    System.out.println(first);
    System.out.println(last);
 }

}
