import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int  cmp = n&(~n+1);          // and the number with 2's complement 
    
    System.out.println(Integer.toBinaryString(cmp));
    
    
  }

}
