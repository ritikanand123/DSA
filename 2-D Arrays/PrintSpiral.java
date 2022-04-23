import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int col = scan.nextInt();
    int arr[][] = new int[row][col];
    for (int i = 0 ; i < row; i++) {
      for (int j = 0 ; j < col; j++) {
        arr[i][j] = scan.nextInt();
      }
    }


    int minrow = 0;
    int maxrow = row-1;
    int mincol = 0;
    int maxcol = col-1;
    int tn = row * col;
    int count = 0;
    while (count < tn) {

      for (int i = minrow, j = mincol; i <= maxrow&&count<tn; i++) {
        System.out.println(arr[i][j]);
        count++;
      }
      mincol++;
      for (int i = maxrow, j = mincol ; j <= maxcol&&count<tn; j++) {
        System.out.println(arr[i][j]);
        count++;
      }
      maxrow--;
      for (int i  = maxrow, j = maxcol; i >= minrow&&count<tn; i--) {
        System.out.println(arr[i][j]);
        count++;
      }
      maxcol--;
      for (int i  = minrow, j = maxcol; j >= mincol&&count<tn; j--) {
        System.out.println(arr[i][j]);
        count++;
      }
      minrow++;
    }
  }

}
