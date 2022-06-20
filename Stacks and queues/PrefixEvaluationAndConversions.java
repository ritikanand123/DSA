import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer>evaluate=new Stack <>();
    Stack<String>infix=new Stack <>();
    Stack<String>pre=new Stack <>();
    
    
    for(int i  = exp.length()-1;i>=0;i--){
        
        char ch =exp.charAt(i);
        
        if(Character.isDigit(ch)){
            evaluate.push(ch-'0');
            infix.push(ch+"");
            pre.push(ch+"");
        }else{
            
            String infixval1=infix.pop();
            String infixval2=infix.pop();
            infix.push('('+infixval1+(ch+"")+infixval2+')');
            String preval1=pre.pop();
            String preval2=pre.pop();
            pre.push(preval1+preval2+(ch+""));
        }
        
    }
    System.out.println(evaluate.pop());
    System.out.println(infix.pop());
    System.out.println(pre.pop());
 }
}
