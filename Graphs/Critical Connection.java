import java.util.*;
import java.io.*;

class Main {


  static ArrayList<List<Integer>> ans = new ArrayList<>();
  static int tin[];
  static boolean visited[];
  static int low[];

  public static List<List<Integer>> criticalConnections(int n, ArrayList<ArrayList<Integer>> Edges) {
    
    
    ArrayList<ArrayList<Integer>> graph  = new ArrayList<>();
    
    for(int i  = 0  ; i < n ; i++){
        graph.add(new ArrayList<>());
    }
    
    for(int i = 0 ; i < Edges.size() ;i++){
        int v =  Edges.get(i).get(0); 
        int u =  Edges.get(i).get(1);
        
        graph.get(v).add(u);
        graph.get(u).add(v);
        
    }
    

    tin = new int[n];
    low = new int[n];
    visited = new boolean[n];
    
    for(int i = 0 ; i < n ; i++){
        if(visited[i]==false){
            dfs(i,-1,1,1,graph);
        }
    }
    
    
    return ans;

  }
  
  
  public static void dfs(int src , int parent ,int lowval , int vis , ArrayList<ArrayList<Integer>> Edges){
      
     
     visited[src] = true;
     tin[src] = vis;
     low[src] = lowval;
     
     for(int nbr :Edges.get(src)){ //most important thing is nbr==parent continue
         if(nbr == parent){
                 continue;
             }
         if(visited[nbr] == false){
            
             dfs(nbr, src,lowval+1 , vis+1 ,Edges);
             
             low[src] = Math.min(low[src] ,low[nbr]) ;
           
             if(low[nbr] > tin[src]){
                 ArrayList<Integer> a1 = new ArrayList<>();
                 a1.add(src);
                 a1.add(nbr);
                 ans.add(a1);
             }
             
             
         }else{
             
             low[src] = Math.min(tin[nbr] ,low[src]);
             
         }
     }
      
      
      
  }
  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] st = br.readLine().split(" ");
    int n = Integer.parseInt(st[0]);
    int e = Integer.parseInt(st[1]);
    ArrayList<ArrayList<Integer>> edges = new ArrayList<>();


    for (int i = 0; i < e; i++) {
      edges.add(new ArrayList<>());
      st = br.readLine().split(" ");
      edges.get(i).add(Integer.parseInt(st[0]));
      edges.get(i).add(Integer.parseInt(st[1]));
    }

    System.out.println(criticalConnections(n, edges));

  }

}
