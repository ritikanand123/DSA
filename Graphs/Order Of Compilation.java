import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
      }
        
      boolean visited[] = new boolean[vtces];    
      Stack<Integer> st = new Stack<>();    
      for(int i  = 0 ; i < vtces ;i++){
          if(visited[i] == false){
              getTheOrder(graph,visited , i , st);
          }
          
      }
      
      while(st.size()>0){
          
          System.out.println(st.pop());
          
      }
      
   }
  // the stack is being used to print in reverse or in topological sort in preorder the dependent files are already in the stack 
  //so src file can come in stack as requiredd files are a;ready [resent  
   
   public static void getTheOrder(ArrayList<Edge> graph[] , boolean visited[],int src,  Stack<Integer>st){
       
      //what ever comes first need to be mark visited as what ever is coming is guarnteed to be false 
       //if written inside if will miss source only its neighbour will be added
       visited[src] = true;
       for(Edge e : graph[src]){
           if(visited[e.nbr]==false){
               
               getTheOrder(graph,visited,e.nbr,st);
               
           }
       }
       st.push(src);
       
   }
   

}
