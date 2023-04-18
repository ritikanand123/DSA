import java.io.*;
import java.util.*;

public class SaddlePrice {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int rowcol = scan.nextInt();
        int arr[][]= new int[rowcol][rowcol];
        for(int i =0 ;i<arr.length;i++){
            for(int j = 0 ; j <arr[0].length;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        
        for(int i  = 0 ;i<arr.length;i++){
            int smallestincol=0;
             for(int j = 1 ; j<arr[0].length;j++){
                if(arr[i][j]<arr[i][smallestincol]){
                    smallestincol=j;
                }
            }
        boolean result=true;
        for(int k=0;k<arr.length;k++){
            if(arr[i][smallestincol]<arr[k][smallestincol]){
                result =false;
                break;
            }
            
        }
            if(result==true){
                System.out.println(arr[i][smallestincol]);
                return;
            }
        }
        System.out.println("Invalid input");
}
}
