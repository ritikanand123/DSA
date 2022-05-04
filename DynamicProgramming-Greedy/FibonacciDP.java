import java.io.*;
import java.util.*;

public class Main{
  //memorization

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int fib=fibonacci(num,new int[num+1]);
    System.out.println(fib);
 }
 
 public static int fibonacci(int n , int[]qb){
    
    if(n==0||n==1){
        return n;
    }
    if(qb[n]!=0){
        return qb[n];
    }
    
    int fib1=fibonacci(n-1,qb);
    int fib2=fibonacci(n-2,qb);
    int fibsum=fib1+fib2;
    qb[n]=fibsum;
    return fibsum ;
 
 }
 
 
 

}
