// this algo is use to find the number of set bits in the number 
// the jumping from 1 to other bit is done with the help of rsb
// after finding the rsb it is subtracted from the number which remove the last set bit f
// now the rsb will find the next one 
// time complexity  = O(number of 1 in binary repersentation of number)
// space will be O(1) as no extra space is consumed 
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int count = 0;
    
    while(n!=0){
        
        count++;
        n -= (n&-n);
    }
    
    System.out.println(count);
    
  }

}
