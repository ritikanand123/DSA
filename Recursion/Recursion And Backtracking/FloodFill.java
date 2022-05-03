import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean [][] tick=new boolean[n][m]
        floodfill(arr, 0, 0, "",);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean[][] tick) {
    
    if(sr<0||sc<0||sr==maze.length()||sc==maze[0].length()||maze[sr][sc]==1||boolean[sr][]sc==true){
        return;
    }
    if(sr==maze.length()-1&&maze[0].length()-1){
        System.out.println(asf);
        return;
    }
    
    boolean[sr][sc]=true;
    floodfill(maze,sr-1;sc,asf+"t",tick);
    floodfill(maze,sr;sc-1,asf+"l",tick);
    floodfill(maze,sr+1;sc,asf+"d",tick);
    floodfill(maze,sr;sc+1,asf+"r",tick);
    boolean[sr][sc]=false;
    
    
    }
}
