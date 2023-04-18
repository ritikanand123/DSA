import java.util.*;

public class PrintAllPrimesTillN{
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int start =scan.nextInt();
        int end =scan.nextInt();
        for(int n=start;n<=end;n++){
            int count =0;
            
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                    break;
                }
            }
            
            
            
            
            if(count==0){
                System.out.println(n);
            }
        }
    }
}
