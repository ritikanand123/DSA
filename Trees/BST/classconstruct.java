
import java.util.*;
class Main {
    
    private static class Node{
        
        int data ;
        Node left;
        Node right;
        
        Node(){
            
        }
        
        Node(int data ,Node left ,Node right ){
            this.data   = data;
            this.right  = right;
            this.left   = left;
        }
        
        
    }
    
    public static void display(Node node) {
        if (node == null) {
            return;
        }
    
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);
    
        display(node.left);
        display(node.right);
     }
    
    public static Node construct(int arr[] , int lo ,int  hi ){
        if(lo>hi){
            return null;
        }
        
        int mid  = (lo+hi)/2;
        Node mn = new Node();
        mn.data = arr[mid];
        mn.left = construct(arr,lo,mid-1);
        mn.right = construct(arr,mid+1,hi);
        
        return mn;
        
    }
    
    public static void main(String[]args){
        
        int [] arr = {1,2,3,4,5};
        
        Node root = construct(arr,0,arr.length-1);
        display(root);
        
    }
}




