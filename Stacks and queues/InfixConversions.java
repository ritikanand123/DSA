import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    
    Stack<String>pre=new Stack<>();
    Stack<String>post=new Stack<>();
    Stack<Character>operator=new Stack<>();
    
    for(int i =0 ; i < exp.length() ;i++){
        
        char ch = exp.charAt(i);
        
        if(ch=='('){
            operator.push(ch);
        }
    else if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            pre.push(ch+"");
            post.push(ch+"");
        }
        else if(ch==')'){
            while(operator.peek()!='('){
            char op=operator.pop();
            String preval2=pre.pop();
            String preval1=pre.pop();
            pre.push(op+preval1+preval2);
            String postval2=post.pop();
            String postval1=post.pop();
            post.push(postval1+postval2+op);
            }
            operator.pop();
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            while(operator.size()>0&&operator.peek()!='('&&precedence(ch                  )<=precedence(operator.peek())){
            char op=operator.pop();
            String preval2=pre.pop();
            String preval1=pre.pop();
            pre.push(op+preval1+preval2);
            String postval2=post.pop();
            String postval1=post.pop();
            post.push(postval1+postval2+op);
            }
            operator.push(ch);
        }
        
        
    }
     while(operator.size()!=0){
            char op=operator.pop();
            String preval2=pre.pop();
            String preval1=pre.pop();
            pre.push(op+preval1+preval2);
            String postval2=post.pop();
            String postval1=post.pop();
            post.push(postval1+postval2+op);
            }
    System.out.println(post.pop());
    System.out.println(pre.pop());
    
 }
 public static int precedence(char op){
        
        if(op=='+'||op=='-'){
            return 1;
        }else{
            return 2;
        }
        
        
    }
}   
