import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int row =scan.nextInt();
    int column=scan.nextInt();
    int arr[][]=new int [row][column];
    for(int i=0;i<row;i++){
        for(int j = 0 ;j<column;j++){
            arr[i][j]=scan.nextInt();
        }
    }
    
    for(int i = 0 ;i<arr.length;i++){
        for(int j =0 ;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    
    
 }

}
