import java.util.*;
import java.io.*;

public class Main{
    
    public static class Node{
        
        int data ;
        Node left ;
        Node right ;
        
        Node( Node left ,Node right,int data){
            
            this.data = data;
            this.left = left;
            this.right =right;
            
        }
    }
    
    public static class pair{
        
        int state ;
        Node node ;
        
        pair( Node node,int state ){
            this.state = state;
            this.node = node;
        }
        
    }
    
    public static void display(Node node){
        
        String str = "";
        
        if(node.left==null){
            str+=" .  ";
        }else{
            str+= node.left.data + "";
        }
        str+=" <- "+node.data+" -> ";
        if(node.right==null){
            str+="  . ";
        }else{
            str+= node.right.data + ""; 
        }
        
        System.out.println(str);
        if(node.left!=null){
        display(node.left);
        }if(node.right!=null){
        display(node.right);
        }
    }
    
    public static void main(String[]args){
        
        Integer arr[] = {50,25,12,null,null,32,30,null,null,null,75,47,null,40,null,null,60,null,null};
        Node root = new Node(null,null,arr[0]);
        pair rt = new pair(root , 1);
        
        Stack <pair>st = new Stack<>();
        st.push(rt);
        
        int idx =0;
        while(st.size()>0){
            pair top = st.peek();
            if(top.state == 1){
              idx++;    
              if(arr[idx]!=null){
                top.node.left=new Node(null,null,arr[idx]);
                pair left = new pair(top.node.left,1);
                st.push(left);
              
              }else{
                top.node.left=null;
                
              }
              top.state++;
                
            }else if(top.state == 2){
              idx++;    
              if(arr[idx]!=null){
                top.node.right=new Node(null,null,arr[idx]);
                pair right = new pair(top.node.right,1);
                st.push(right);
              
              }else{
                top.node.right=null;
                
              }
              top.state++;
            }else {
                st.pop();
            }
        }
        
        display(root);
    }
    
}


