import java.io.*;
import java.util.*;

public class Main {

     public static int precendence(char operator){

      if (operator=='+') {
        return 1;
      }
      else if (operator=='-') {
        return 1;
      }
      else if (operator=='*') {
        return 2;
      }
      else {
        return 2;
      }
    }
    
    public static int evaluate(int val1, int val2, char opertor) {

      if (opertor == '+') {
        return val1 + val2;
      }
      else if (opertor == '-') {
        return val1 - val2;
      }
      else if (opertor == '*') {
        return val1 * val2;
      }
       else{
        return val1 / val2;
      }
    }
    
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack<Integer>operand = new Stack<>();

    Stack<Character>operator=new Stack<>();


    for (int i  = 0 ; i < exp.length(); i++) {
      char chr = exp.charAt(i);

      if (chr == '(') {
        operator.push(chr);
      }
      else if (Character.isDigit(chr)) {
        operand.push(chr - '0');
      }
      else if (chr == ')') {
        while (operator.peek() != '(') {
          char op = operator.pop();
          int val2 = operand.pop();
          int val1 = operand.pop();
          int temp=evaluate(val1, val2, op);
          operand.push(temp);
        //   System.out.println(temp+"->"+op);
        }
        operator.pop();

      }
      else if(chr == '+' || chr == '-' || chr == '*' || chr == '/') {

        while ( operator.size()>0 && operator.peek() != '('&& precendence(chr)<=precendence(operator.peek())) {
          char op = operator.pop();
          int val2 = operand.pop();
          int val1 = operand.pop();
          int temp=evaluate(val1, val2, op);
          operand.push(temp);
        //  System.out.println(temp+"->"+op);
        }
        operator.push(chr);

      }

    }

    while (operator.size() !=0){
      char op = operator.pop();
      int val2 = operand.pop();
      int val1 = operand.pop();
      int temp=evaluate(val1, val2, op);
      operand.push(temp);
    //   System.out.println(temp+"->"+op);
    }

    System.out.println(operand.peek());

  }
}





