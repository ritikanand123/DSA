class Solution {
    
    public class pair implements Comparable<pair>{
        
        int row;
        int col;
        int msf;
        
        pair(int row , int col , int msf){
            this.row = row;
            this.col = col;
            this.msf = msf;
            
        }
        public int compareTo(pair o){
            return this.msf-o.msf;
        }
        
        
    }
    
    
    public int swimInWater(int[][] grid) {
        
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean visited[][] = new boolean [grid.length][grid[0].length];
        pq.add(new pair(0,0,grid[0][0]));
        
        int rows[] = {-1,1,0,0};
        int cols[] = {0,0,1,-1};
        
        
        
        while(pq.size()>0){
            
            pair rem = pq.remove();
            
            if(rem.row == grid.length-1&&rem.col == grid[0].length-1){
                return rem.msf;
            }
            if(visited[rem.row][rem.col] == true){
                continue;
            }
            
            visited[rem.row][rem.col] = true;
            for(int i = 0  ; i < 4; i++){
                int nr = rem.row+rows[i]; 
                int nc = rem.col+cols[i];  
                    if(nr<0||nc<0||nr>=grid.length||nc>=grid.length||visited[nr][nc]==true){
                    continue;
                }
                if(grid[nr][nc]>rem.msf){
                    pq.add(new pair(nr,nc,grid[nr][nc]));
                }else{
                    pq.add(new pair(nr,nc,rem.msf));
                }       
            }
            
            
        }
        
        
        return -1;
        
    }
}
