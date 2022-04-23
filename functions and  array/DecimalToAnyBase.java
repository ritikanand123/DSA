import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int question=n;
       int pow=0;
       int ans=0;
       int rem;
       while(question!=0) 
       {
           rem=question%b;
        //   System.out.println(rem);
            if(rem!=0){
                ans=ans+(rem*(int)Math.pow(10,pow));
            }
            
           question=question/b;
        //   System.out.println(question);
           pow++;
           
       }
       return ans;
       
   }
  }
