import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size =scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++ ){
            arr[i]=scan.nextInt();
        }
        int num=maxOfArray(arr,size-1);
        System.out.println(num);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==0){
            return arr[0];
        }
        int num=maxOfArray(arr,idx-1);
        if(num<arr[idx]){
            return arr[idx];
        }
        else{
            return num;
        }
        
        
        
    }

}
