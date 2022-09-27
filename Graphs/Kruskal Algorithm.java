
import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int v = Integer.parseInt(br.readLine());
    int e = Integer.parseInt(br.readLine());

    int[][] edges = new int[e][3];
    for (int i = 0; i < e; i++) {
      String[] st = br.readLine().split(" ");
      edges[i][0] = Integer.parseInt(st[0]);
      edges[i][1] = Integer.parseInt(st[1]);
      edges[i][2] = Integer.parseInt(st[2]);
    }

    System.out.println(minCostToSupplyWater(v, edges));
  }

  static int[] parent;
  static int[] rank;

  public static class Pair implements Comparable<Pair> {
    int u;
    int v;
    int wt;

    Pair(int u, int v, int wt) {
      this.u = u;
      this.v = v;
      this.wt = wt;
    }

    @Override
    public int compareTo(Pair o) {
      return this.wt - o.wt;
    }
  }

  public static int minCostToSupplyWater(int n, int[][] pipes) {

    parent  = new int[n];
    rank = new int[n];
    for(int i = 0 ; i < n ;i++){
        parent[i] = i;
    }
    
    Pair[]arr = new Pair[pipes.length];
    
    for(int i = 0 ; i < pipes.length ;i++ ){
        arr[i]  = new Pair(pipes[i][0],pipes[i][1],pipes[i][2]);
    }
    
    Arrays.sort(arr);
    
    int count  = 1;
    int ans = 0;
    for(int i = 0 ; count < n ;i++){
        
        Pair edge = arr[i];
        int rx = find(edge.u);
        int ry = find(edge.v);
        
        if(rx!=ry){
            union(rx,ry);
            count++;
            ans += edge.wt; 
            
        }
        
        
    }
    
    return ans;
    
    
    
    
  }
  
  public static int find(int x ){
      
    if(parent[x]!=x){
        parent[x] = find(parent[x]);
    }  
      
    return parent[x];
      
  }
  
  public static void union (int x,int y){
    
    
    int rx =  find(x);
    int ry =  find(y);
    
    if(rx!=ry){
        if(rank[rx]>rank[ry]){
            parent[ry] = rx;
        }
        else if(rank[rx]>rank[ry]){
            parent[rx] = ry;
        }
        else{
            parent[ry] = rx;
            rank[rx] = rank[rx]+1;
        }
    }
  }
}
