import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int i=1;
       int c=0;
       int ans=0;
    //   int small=n1<n2?n1:n2;
       
       while(n1>0||n2>0||c>0){
        int rem1=n1%10;
        int rem2=n2%10;
        n1=n1/10;
        n2=n2/10;
        int remsum=rem1+rem2+c;
        c=remsum/b;
        remsum=remsum%b;
        ans+=remsum*i;
        i=i*10;
        
        
       }
       return ans;
       
       
   }
  }
