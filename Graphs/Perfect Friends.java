import java.io.*;
import java.util.*;

public class Main {
   
   public static class Edge{
       
       int nbr;
       int src;
       
       Edge(int src , int nbr){
           this.nbr = nbr;
           this.src = src;
       }
       
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      ArrayList<Edge> [] graph = new ArrayList[n];
      
      for(int i = 0 ; i < n ;i++){
        graph[i] = new ArrayList<>();  
      }
      
      for(int e = 0 ; e < k ;e++){
        
        String line  = br.readLine();
        String [] str = line.split(" ");
        int v1 = Integer.parseInt(str[0]);
        int v2 = Integer.parseInt(str[1]);
        
        graph[v1].add(new Edge(v1,v2));
        graph[v2].add(new Edge(v2,v1));
        
      }
      boolean visited[] = new boolean[n]; 
      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      for(int i = 0 ; i < n ;i++){
        if(visited[i]==false){
            ArrayList<Integer> temp = new ArrayList<>();
            getConnectedComponent(graph,i,visited,temp);
            comps.add(temp);
        }
        
      }
      //System.out.println(comps);
      int count  = 0;
      
      for(int i = 0 ; i < comps.size();i++){
        for(int j = i+1 ; j < comps.size();j++){
            count+= (comps.get(i).size()*comps.get(j).size());
        }  
      }
      System.out.println(count);
   }
   
   
   public static void getConnectedComponent(ArrayList<Edge> [] graph , int src ,boolean visited[],ArrayList<Integer> subComps ){
       
       
       visited[src]=true;
       subComps.add(src);
       
       for(Edge e : graph[src]){
           if(visited[e.nbr]==false){
              getConnectedComponent(graph,e.nbr,visited,subComps);
           }
       }
   }
   

}











