import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String eq=scan.nextLine();
        
        Stack<Character>st = new Stack<>();
        
        for(int i = 0 ; i < eq.length();i++){
            
            char ch = eq.charAt(i);
            
            if(ch=='['|ch=='{'|ch=='('){
                st.push(ch);
                
            }
            else if(ch==')'){
                if(st.empty()){
                    System.out.println(false);
                    return;
                }
                if(st.peek()=='('){
                    st.pop();
                }else{
                    System.out.println(false);
                    return;
                }
            }
            else if(ch=='}'){
                if(st.empty()){
                    System.out.println(false);
                    return;
                }
                if(st.peek()=='{'){
                    st.pop();
                }else {
                    System.out.println(false);
                    return;
                }
            }
            else if(ch==']'){
                if(st.empty()){
                    System.out.println(false);
                    return;
                }
                if(st.peek()=='['){
                    st.pop();
                }else {
                    System.out.println(false);
                    return;
                }
            }
            
            
            
        }
        
        
        System.out.println(st.empty());
        
    }

}
