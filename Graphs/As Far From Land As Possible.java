import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      String[] st = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st[j]);
      }
    }

    System.out.println(maxDistance(arr));

  }
  
  public static class pair{
        int row;
        int col;
        int dis;
        
        pair(int row, int col, int dis){
            this.row = row;
            this.col = col;
            this.dis = dis;
        }
        
        
    }

  public static int maxDistance(int[][] grid) {
     ArrayDeque<pair> queue = new ArrayDeque<>();
        int cntzeros = 0;
        int cntones = 0;
        for(int i  = 0 ; i < grid.length ;i++){
            for(int j  =  0 ; j < grid[0].length ;j++){
                if(grid[i][j] == 1){
                    cntones++;
                    queue.add(new pair(i,j,0));
                }else{
                    cntzeros++;
                }
            }
        }
            
        if(cntones == grid.length*grid[0].length||cntzeros == grid.length*grid[0].length){
            return -1;
        }    
            
        int rows[] = {-1, 0 , 1 , 0};
        int cols[] = { 0, 1 , 0 ,-1};
        
       int md = Integer.MIN_VALUE;
       
       while(queue.size()>0){
           
           pair rem  = queue.removeFirst();
           
           md = Math.max(md,rem.dis);
           for(int i  = 0 ; i < 4 ;i++){
               int nr = rem.row+rows[i];
               int nc = rem.col+cols[i];
                   
               if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&grid[nr][nc]==0){
                   
                   grid[nr][nc] = 1;
                   queue.add(new pair(nr,nc,rem.dis+1));
                  
               }
               
           }
           
           
       } 
        
        return md;
  }
}


/*best case to dry run 1 0 0
                       0 0 0   
                       0 0 1
                       0 0 0  */
