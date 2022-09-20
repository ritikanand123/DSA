class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        colourEdges(grid, row , col , grid[row][col]);
    
        for(int i = 0 ; i < grid.length ;i++){
            for(int j  = 0 ; j< grid[0].length ;j++){
                if(grid[i][j]<0){
                    grid[i][j] = color;
                }
            }
        }
    
        return grid;
    }
    
   public static int res = 0;
   public static void colourEdges(int [][] grid , int row , int col ,int colour){
       
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length ||   Math.abs(grid[row][col]) != colour) {
      res = 0;
      return;
    }

    else if (grid[row][col] <0) {
          
      res = 1;
      return;
    }

    int count = 0;
    grid[row][col] = -grid[row][col];

    colourEdges(grid, row, col - 1, colour);
    count += res;
    colourEdges(grid, row - 1, col, colour);
    count += res;
    colourEdges(grid, row, col + 1, colour);
    count += res;
    colourEdges(grid, row + 1, col, colour);
    count += res;
   
    if (count == 4) {
      grid[row][col] = colour;
    }
       res=1;
       return;
       
   }
}
