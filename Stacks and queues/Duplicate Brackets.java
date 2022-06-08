import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    String eq = scan.nextLine();
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < eq.length(); i++) {
      char ch = eq.charAt(i);
      if (ch != ')') {
        st.push(ch);
      }
      else if(ch == ')') {
        if (st.peek()=='(') {
          System.out.println(true);
          return;
        }else {
            while(st.peek()!='('){
                st.pop();
            }
            st.pop();
            
        }

        }
    }
     System.out.println(false);

  }
}
