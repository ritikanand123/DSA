import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int arr []=new int[size];
        for(int i =0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int tofind=scan.nextInt();
        int index=firstIndex(arr,0,tofind);
        System.out.println(index);
        
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }else{
        int index=firstIndex(arr,idx+1,x);
        return index;
        }
    }

}
