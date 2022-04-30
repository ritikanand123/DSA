import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        printSS(str,"");

    }

    public static void printSS(String ques, String ans) {
        
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0); 
        String ros = ques.substring(1);
        
        printSS(ros,ans+ch);
        printSS(ros,ans+"");
        
        
    }

}
