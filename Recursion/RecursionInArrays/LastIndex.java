import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i =0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int tofind=scan.nextInt();
        int index=lastIndex(arr,0,tofind);
        System.out.println(index);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int index=lastIndex(arr,idx+1,x);
        if(index==-1){
            if(arr[idx]==x){
                return idx;
            }
        }
        return index;
        
    }

}
