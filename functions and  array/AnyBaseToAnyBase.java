import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int indecimal=getValueInDecimal(n,sourceBase);
     int tobase=getValueInBase(indecimal,destBase);
     System.out.println(tobase);
     
   } 
    public static int getValueInDecimal(int n, int b){
      // write your code here  
      int ans=0;
      int i=0;
      int rem;
      while(n>0){
        
        rem=n%10;
        n=n/10;
        
        ans=ans+(rem*(int)Math.pow(b,i));
        i++;
      }
      return ans;
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
