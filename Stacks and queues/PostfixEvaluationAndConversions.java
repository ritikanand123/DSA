import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack <String>infix=new Stack<>();
    Stack <String>pre=new Stack<>();
    Stack <Integer>evaluate=new Stack<>();
    
    for(int i = 0 ;i < exp.length();i++){
        
        char ch = exp.charAt(i);
        
        if(Character.isDigit(ch)){
            evaluate.push(ch-'0');
            infix.push(ch+"");
            pre.push(ch+"");
        }    
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            
            int val2 = evaluate.pop();
            int val1 = evaluate.pop();
            evaluate.push(calvalue(val1,val2,ch));
            String infixval2=infix.pop();
            String infixval1=infix.pop();
            infix.push('('+infixval1+(ch+"")+infixval2+')');
            String preval2 = pre.pop();
            String preval1 = pre.pop();
            pre.push((ch+"")+preval1+preval2);
        }
     
    }
    System.out.println(evaluate.peek());
    System.out.println(infix.peek());
    System.out.println(pre.peek());
 }
 
    public static int calvalue(int val1,int val2,char op){
            
        if(op=='+'){
            return val1+val2;
        }else if(op=='-'){
            return val1-val2;
        }else if(op=='*'){
            return val1*val2;
        }else {
            return val1/val2;
        }  
    }
 
}
