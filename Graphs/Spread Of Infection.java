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
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      boolean visited[] = new boolean[vtces];
      int count = getInfectedPersons(graph , src , t, 0,visited);
      System.out.println(count);
   }

    public static int getInfectedPersons(ArrayList<Edge>[] graph, int src, int t , int itn,boolean [] visited){
        
        
        for(int i = 0 ; i < graph.length ;i++){
            
            ArrayDeque<pair> queue= new ArrayDeque<>();
            
            queue.add(new pair(src,1));
            while(queue.size()>0){
                
                pair rem =  queue.removeFirst();
                if(visited[rem.v]==true){
                    continue;
                }
                visited[rem.v] = true;
                if(rem.t>t){
                    return itn;
                }
                itn++;
                for(Edge e: graph[rem.v]){
                    if(visited[e.nbr]==false){
                        queue.add(new pair(e.nbr ,rem.t+1));
                    }
                }
                
            }
            
            
        }
        
       return itn; 
    }
    
    
    public static class pair{
        
        int v ;
        int t;
        pair(int v , int t ){
            this.v = v;
            this.t = t;
        }
        
    }
    

}





