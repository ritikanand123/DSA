import java.util.*;
import java.io.*;

class Main {

  public static class pair {

    int src;
    int dst;

    pair(int src, int dst) {
      this.src = src;
      this.dst = dst;
    }


  }


  static int low[];
  static boolean vis[];
  static int tin[];
  static boolean isap[];
  
  static int time;

  public static void main(String[] args) {
    

    Scanner scan = new Scanner(System.in);

    int v = scan.nextInt();
    int e = scan.nextInt();

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    for (int i = 0 ; i < v ; i++ ) {
      graph.add(new ArrayList<Integer>());
    }


    for (int i = 0 ; i < e ; i++) {

      int src = scan.nextInt() - 1;
      int dst = scan.nextInt() - 1;

      graph.get(src).add(dst);
      graph.get(dst).add(src);
    }

    time = 0;
    vis = new boolean[v];
    low = new int[v];
    tin = new int[v];
    isap = new boolean[v];
   
    
    for(int i  = 0 ; i < v ;i++){
        if(vis[i] == false){
            dfs(graph,i,-1);
        }
    }
    int cnt = 0;
    for(int i  = 0 ; i < vis.length ;i++){
        if(isap[i]==true){
            cnt++;
        }
    }
    
    System.out.println(cnt);
  }

  public static void dfs(ArrayList<ArrayList<Integer>> graph , int src ,int parent){
      
    vis[src] = true;
    low[src] = tin[src] = time++;
    int child = 0;
    for(int nbr : graph.get(src)){
        if(nbr == src){
            continue;
        }else if(vis[nbr]==false){
            dfs(graph , nbr ,src);
            if(low[nbr] >= tin[src] && parent!=-1){
                isap[src] = true;
            }
            low[src] = Math.min(low[nbr],low[src]);
            child++;
        }else{
            low[src] = Math.min(low[src],tin[nbr]);
        }
        
    }
    if(child>1 && parent==-1){
        isap[src] = true;
    }
      
  }

}
