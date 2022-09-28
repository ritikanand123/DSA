
// make an additonal vertce 0  and connect it according to well dig cost and make mst ans apply kruskals

import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] st = br.readLine().split(" ");
    int v = Integer.parseInt(st[0]);
    int e = Integer.parseInt(st[1]);

    int[] wells = new int[v];
    String[] words = br.readLine().split(" ");

    for (int i = 0; i < wells.length; i++) {
      wells[i] = Integer.parseInt(words[i]);
    }

    int[][] pipes = new int[e][3];
    for (int i = 0; i < e; i++) {
      String[] st1 = br.readLine().split(" ");
      pipes[i][0] = Integer.parseInt(st1[0]);
      pipes[i][1] = Integer.parseInt(st1[1]);
      pipes[i][2] = Integer.parseInt(st1[2]);

    }
    
    

    System.out.println(minCostToSupplyWater(v, wells, pipes));

  }
  
  static int parent[];
  static int rank[];
  
  public static class pair implements Comparable<pair>{
    
    int src;
    int dst;
    int wt;
    
    pair(int src , int dst , int wt){
        this.src = src;
        this.dst = dst;
        this.wt = wt;
    }
    
    public int compareTo(pair o){
        return this.wt-o.wt;
    }
      
  }
  
  
  public static void union(int x , int y){
      
      int rx = find(x);
      int ry = find(y);
      
      if(rx!=ry){
        
        if(rank[rx] <  rank[ry]){
            parent[rx] = ry;
        }
        
        else if(rank[rx] >  rank[ry]){
            parent[ry] = rx;
        }
        
        else{
            parent[ry] = parent[rx];
            rank[rx] = rank[rx]+ 1;
        }
          
      }
      
      
  }
  
  
  public static int find(int x){
      if(parent[x]!=x){
          parent[x] = parent[x];
      }
      
      return parent[x];
      
  }

  public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
      
    rank   = new int[n+1]; 
    parent = new int[n+1];
      
    for(int i= 0 ; i < parent.length ;i++ ){
        parent[i] = i;
    }  
      
    
   ArrayList<pair> graph = new ArrayList<>();
   
   for(int  i = 0 ; i < wells.length ;i++){
       graph.add(new pair(0,i+1,wells[i]));
   }
    
   for(int i = 0 ; i < pipes.length ;i++){
       graph.add(new pair(pipes[i][0],pipes[i][1],pipes[i][2]));
   }    
    
   Collections.sort(graph);
    
    
    int count = 1;
    int sum = 0;
    
    
    for(int i = 0 ; count < (n+1) ;i++){
        
        pair p = graph.get(i);
        
        int rx = find(p.src);
        int ry = find(p.dst);
        
        if(rx!=ry){
            union(rx,ry);
            count++;
            sum+= p.wt;
        }
        
    }
    
    
    
    
    return sum;
  }
}
