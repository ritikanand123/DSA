import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scan =new Scanner(System.in);
      int n=scan.nextInt();
      int temp=n;
      int cod=0;
      while(temp>0){
          temp=temp%10; 
          cod++;
      }
      int div=(int)Math.pow(10,cod-1);
      while(n!=0){
          int print=n/div;
          System.out.println(print);
           n=n%div;
          
          div=div/10;
      }
      
     }
    }
