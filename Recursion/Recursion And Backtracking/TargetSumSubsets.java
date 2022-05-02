import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int [] arr=new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]=scan.nextInt();
        }
        int tofind=scan.nextInt();
        printTargetSumSubsets(arr,0,"",0,tofind);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set+".");
            }
            return;
        }
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
        
        
        
    }

}
