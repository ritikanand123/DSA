import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int arrsize = scan.nextInt();
    int arr[] = new int[arrsize];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scan.nextInt();
    }

    for (int i = 0; i < Math.pow(2, arr.length); i++) {
      String str = "";
      int temp = i;
      for (int j = arr.length - 1; j >= 0; j--) {
        int rem = temp % 2;
        temp = temp / 2;

        if (rem == 0) {
          str = "-\t"+str;
        } else {
          str = arr[j] + "\t" + str;
        }

      }
      System.out.println(str);
    }

  }

}
