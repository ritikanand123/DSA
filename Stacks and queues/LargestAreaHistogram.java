import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    int rindex [] = new int [n];
    Stack<Integer>str=new Stack<>();
    str.push(arr.length-1);
    rindex[arr.length-1]=arr.length-1;
    for(int i  = arr.length -2;i>=0;i--){
        
        while(str.size()>0&&arr[i]<=arr[str.peek()]){
            str.pop();
        }
        if(str.size()==0){
            rindex[i]=arr.length-1;
        }else{
            rindex[i]=str.peek()-1;
        }
        str.push(i);
    }
    
    int lindex [] = new int [n];
    str=new Stack<>();
    str.push(0);
    lindex[0]=0;
    for(int i  = 0;i<arr.length;i++){
        
        while(str.size()>0&&arr[i]<=arr[str.peek()]){
            str.pop();
        }
        if(str.size()==0){
            lindex[i]=0;
        }else{
            lindex[i]=str.peek()+1;
        }
        str.push(i);
    }
    int max=Integer.MIN_VALUE;
    for(int i = 0 ;i < arr.length ;i++){
       
       
    //   System.out.println(rindex[i]+"->"+lindex[i]+"->"+arr[i]);
        int ans = ((rindex[i]-lindex[i])+1)*arr[i];
        if(ans>max){
            max=ans;
        }
    }
    System.out.println(max);
 }
}



