import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int row1 = scan.nextInt();
    int col1 = scan.nextInt();
    int arr[][] = new int[row1][col1];
    for (int  i = 0 ; i < arr.length; i++) {
      for (int j = 0 ; j < arr[0].length; j++) {
        arr[i][j] = scan.nextInt();
      }
    }

    int row2 = scan.nextInt();
    int col2 = scan.nextInt();
    int arr2[][] = new int[row2][col2];
    for (int i = 0; i < arr2.length; i++ ) {
      for (int j = 0; j < arr2[0].length; j++) {
        arr2[i][j] = scan.nextInt();
      }
    }

    if (col1 != row2) {
      System.out.println("Invalid input");
      return;
    } 
      int arr3[][] = new int [row1][col2];

      for (int i = 0 ; i < row1; i++) {
        for (int j = 0 ; j < col2; j++) {
          for (int k = 0 ; k < col1; k++) {
            arr3[i][j] += arr[i][k] * arr2[k][j];
          }
        }

      }

      for (int i = 0 ; i < arr3.length; i++) {
        for (int j = 0 ; j < arr3[i].length; j++) {
          System.out.print(arr3[i][j] + " ");
        }
        System.out.println();
      }

  }

}
