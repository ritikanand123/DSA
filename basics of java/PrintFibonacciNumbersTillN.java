import java.util.*;
  
  public class PrintFibonacciNumbersTillN{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scan = new Scanner(System.in);
      int num=scan.nextInt();
      System.out.println("0");
      
      int first=1;
      System.out.println(1);
      System.out.println(1);
      int second=1;
      int count=3;
      while(count<num){
        
        int sum=first+second;
        System.out.println(sum);
        first=second;
        second=sum;
        count++;
      }
   }
  }
