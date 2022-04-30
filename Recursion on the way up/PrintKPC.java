import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printKPC(str,"");
    }
    static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String ques, String ans) {
        if(ques.length()==0){
            System.out.println(ans);
            return;
            
        }
        char ch = ques.charAt(0);
        String ros=ques.substring(1);
        String codesforch=codes[ch-'0'];
        for(int i = 0 ; i < codesforch.length() ;i++){
            char cho=codesforch.charAt(i);
            printKPC(ros,ans+cho);
        }
        
        
        
    }

}
