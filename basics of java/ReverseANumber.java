import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        
        while(num>0){
            int temp =num%10;
            System.out.println(temp);
            num=num/10;
        }
    }
   }
