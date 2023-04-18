import java.io.*;
import java.util.*;

public class StateOfWakanda2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int row=scan.nextInt();
        int col = row;
        int arr[][]=new int[row][row];
        for(int i = 0 ;i<arr.length;i++){
            for(int j= 0;j<arr[0].length;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        
        
        for(int k = 0;k<arr.length;k++){
         for(int i = 0 , j = k ;i<arr.length-k;i++,j++){
            System.out.println(arr[i][j]);
         }
        }
    }

}
