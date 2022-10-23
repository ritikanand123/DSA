// a tree has v-1 edges if one edge extra is added than the tree becomes graph to remove that edges 
//we use dsu if the edge form a cycle || the parents = x and y is same the edge is your ans 



import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] st = br.readLine().split(" ");
    int n = Integer.parseInt(st[0]);

    int[][] pos = new int[n][2];
    for (int i = 0; i < n; i++) {
      st = br.readLine().split(" ");
      pos[i][0] = Integer.parseInt(st[0]);
      pos[i][1] = Integer.parseInt(st[1]);
    }

    int[] ans = findRedundantConnection(pos);
    System.out.println(ans[0] + " " + ans[1]);
  }

  static int rank[];

  public static int[] findRedundantConnection(int[][] edges) {
    
    int parent[] = new int[edges.length+1];
    
    for(int i  = 0 ; i < parent.length ;i++){
        parent[i] =  i;
    }
    rank = new int[edges.length+1];
    
    int ans[] = new int[2];
    
    for(int i  = 0 ; i < edges.length ;i++){
        
        int x = find(parent , edges[i][0]);
        int y = find(parent , edges[i][1]);
        
        if(x == y){
           ans[0] = edges[i][0];
           ans[1] = edges[i][1];
            return ans;
        }else{
            union(parent ,edges[i][0],edges[i][1] );
        }
        
        
    }
    
    ans[0] = -1;
    ans[1] = -1;
    return ans;
    
  }
  
  
  public static void union(int [] parent , int x ,int y){
      int px = find(parent , x);
      int py = find(parent , y);
      
      
      if(px == py){
          return ;
      }
      
      if(rank[px]>rank[py]){
          
          parent[py] = px;
          
      }else if(rank[py] > rank[px]){
          
          parent[px] = py ;
          
      }else{
          
          parent[py] = px;
          rank[px] = px+1;
          
          
      }
      
      
  }

  private static int find(int[] parent, int f) {
    
    if(parent[f]!=f){
        parent[f] = find(parent , parent[f]);
    }
    
    return parent[f];
    
  }
}





