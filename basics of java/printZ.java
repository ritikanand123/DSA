import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    
    for(int i=0;i<5;i++){
        System.out.print("*");
    }
    System.out.println();
    for(int i=3;i>0;i--){
        
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }
    for(int i=0;i<5;i++){
        System.out.print("*");
    }
    System.out.println();
    
    

  }
}
