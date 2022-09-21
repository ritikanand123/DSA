import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] st = br.readLine().split(" ");
    int m = Integer.parseInt(st[0]);
    int n = Integer.parseInt(st[1]);

    int[][] arr = new int[m][n];

    for (int i = 0; i < m; i++) {
      st = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st[j]);
      }
    }

    System.out.println(numEnclaves(arr));

  }

  public static int numEnclaves(int[][] arr) {
    
    
    for(int i  = 0 ; i < arr.length ;i++){
        for(int j =0 ; j< arr[0].length ;j++){
            if(i==0){
                if(arr[i][j]==1){
                    getConnected(arr,i,j);
                }
            }else if(j==arr[0].length-1){
                if(arr[i][j]==1){
                    getConnected(arr,i,j);
                }
            }else if(j==0){
                if(arr[i][j]==1){
                    getConnected(arr,i,j);
                }
            }else if(i==arr.length-1){
                if(arr[i][j]==1){
                    getConnected(arr,i,j);
                }
            }
        }
    }
    
    int count =0;
    for(int i = 0; i< arr.length ;i++){
        for(int j = 0 ; j<arr[0].length ;j++){
            if(arr[i][j]==1){
                count++;
            }
        }
    }
    
    return count;
    
  }
  
  public static void getConnected(int arr[][] , int  row ,int col){
        if(row<0||col<0||row>=arr.length||col>=arr[0].length||arr[row][col]==0){
            return;
        }
        
        arr[row][col]=0;
        
        getConnected(arr,row-1,col);
        getConnected(arr,row+1,col);
        getConnected(arr,row,col-1);
        getConnected(arr,row,col+1);
    }

}
