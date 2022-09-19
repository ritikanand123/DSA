import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
      int colour[] = new int[vtces];
      boolean res  = IsBipartite(graph , colour);
      System.out.println(res);
   }
   
   public static boolean IsBipartite(ArrayList<Edge>[] graph , int colour[]){
       
       
       for(int i = 0 ; i < colour.length ;i++){
           
           if(colour[i] == 1 || colour[i] == -1){
               continue;
           }else{
               colour[i] = 1;
               
               ArrayDeque <Integer> queue = new ArrayDeque<>(); 
               
               queue.add(i);
               
               while(queue.size() > 0){
                   
                   int curr = queue.removeFirst();
                   
                   
                   for(Edge e:graph[curr]){
                       
                       if(colour[e.nbr] == 0){
                           colour[e.nbr] = -colour[curr];
                           queue.add(e.nbr);
                       }
                       
                       else{
                           if(colour[e.nbr]==colour[curr]){
                               return false;
                           }
                       }
                       
                   }
                   
                   
                   
               }
               
               
           }
       }
       
       return true;
       
   }
   
   
}







