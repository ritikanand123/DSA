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
    int k = Integer.parseInt(br.readLine());
    
    int rlidx[]=new int[arr.length]; //right largest element index
    Stack<Integer>st=new Stack<>();
    st.push(arr.length-1);
    rlidx[arr.length-1]=arr.length;
    for(int i =arr.length-1;i>=0;i--){
        
        while(st.size()>0&&arr[i]>=arr[st.peek()]){
            st.pop();
        }
        if(st.size()==0){
            rlidx[i]=arr.length;
        }else{
            rlidx[i]=st.peek();
        }
        st.push(i);
    }
    
    
 
 
    int j =0;
    for(int i = 0 ; i<=arr.length-k;i++){
        if(j<i){
            j=i;
        }
        while(rlidx[j]<i+k){
            j=rlidx[j];
        }
        System.out.println(arr[j]);
    }
}
 
}




