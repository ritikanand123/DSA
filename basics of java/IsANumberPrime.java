import java.util.*;
  
  public class Main{
  
  public static void checkprime(int num){
    int start = 2;
    int end=num-1;
    for(int i =start;i<=end;i++){
        if(num%i==0){
            System.out.println("not prime");
            return;
        }
    
    }
    System.out.println("prime");
    
  }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
      
       int testcases=scn.nextInt();
       
       for(int i=1;i<=testcases;i++){
          int num= scn.nextInt();
          checkprime(num);
       }
  
   }
  }
