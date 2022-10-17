import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] st = br.readLine().split(" ");
    int m = Integer.parseInt(st[0]);
    int n = Integer.parseInt(st[1]);
    int q = Integer.parseInt(st[2]);

    int[][] pos = new int[q][2];
    for (int i = 0; i < q; i++) {
      st = br.readLine().split(" ");
      pos[i][0] = Integer.parseInt(st[0]);
      pos[i][1] = Integer.parseInt(st[1]);
    }

    System.out.println(numIslands2(m, n, pos));
  }
  
    static int parent[];
    static int rank[];

  public static List<Integer> numIslands2(int m, int n, int[][] positions) {
        
        List<Integer> ans = new ArrayList<>();
        parent= new int[n*m];
        Arrays.fill(parent,-1);
        rank = new int[n*m];
        int count = 0;
        int rowarr []= { 0,-1,0,1};
        int colarr []= {-1, 0,1,0};
        
        for(int i  = 0 ; i < positions.length ; i++){
            
            int row = positions[i][0];
            int col = positions[i][1];
            
            int odcn = row*n+col;
            
            if(parent[odcn]!=-1){
                ans.add(count);
                continue;
            }
            parent[odcn] = odcn;
            count ++;
            for(int j = 0;j < 4 ;j++){
                int nrow = rowarr[j] + row;
                int ncol = colarr[j] + col;
                
                int nodcn =nrow*n+ncol; 
                
                if(nrow < 0 || ncol < 0 || nrow >= m || ncol >= n || parent[nodcn] == -1){
                  
                  continue;
                }
                
                if(find(odcn) != find(nodcn)){
                    count--;
                }
                
                union(odcn , nodcn);
            }
            
            ans.add(count);
            
        }
        
        
        return ans;
        
  }
  
  
  public static void union(int x , int y){
      
      int px = find(x);
      int py = find(y);
      
      if(parent[x] == parent[y]){
          return;
      }
      
      if(rank[px] > rank[py]){
          parent[py] = px;
      }else if(rank[px] < rank[py]){
          parent[px] = py;
      }else{
          parent[py] = px;
          rank[px] = rank[px] + 1;
      }
      
  }
  
  public static int find(int x){
      
      if(parent[x]!=x){
          parent[x] = find(parent[x]);
      }
      return parent[x];
      
  }
  
  
  
}




