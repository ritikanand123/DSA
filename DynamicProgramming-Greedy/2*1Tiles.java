import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);

    int length = scan.nextInt();

    int h = 1;
    int v = 1;
    int total= h+v;


    for (int i = 3 ; i <= length ; i++) {
        
        v=h;
        h=total;
        total= v+h;
    }

    System.out.println(total);


  }
}
