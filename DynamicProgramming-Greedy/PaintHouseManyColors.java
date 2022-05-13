import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int arr[][] = new int[n][m];
    for (int i = 0 ; i < arr.length ; i++) {
      for (int j = 0 ; j < arr[0].length; j++) {
        arr[i][j] = scan.nextInt();
      }
    }

    int dp[][] = new int[n][m];

    for (int i = 0 ; i < arr.length ; i++) {

      for (int j = 0 ; j < arr[0].length ; j++) {

        if (i == 0) {
          dp[i][j] = arr[i][j];
        }
        else {
          int min = Integer.MAX_VALUE;

          for (int k = 0 ; k < arr[0].length ; k++) {

            if (k != j) {
              if (dp[i - 1][k] < min) {
                min = dp[i - 1][k];
              }
            }

          }

          dp[i][j] = arr[i][j] + min;
        }

      }

    }

    int minimum = Integer.MAX_VALUE;
    for (int j = 0 ; j < dp[0].length; j++) {

      if (dp[dp.length - 1][j] < minimum) {
        minimum = dp[dp.length - 1][j];
      }

    }
    System.out.println(minimum);


  }

}
