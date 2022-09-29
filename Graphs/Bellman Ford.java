import java.util.*;
import java.io.*;

public class Main {
    
    public static class pair{
        int src;
        int dst;
        int wt;
        
        pair(int src , int dst , int wt){
            
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
        
    }
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
        
        
        Scanner scan = new Scanner(System.in);
        
        int v = scan.nextInt();
        int e = scan.nextInt();
        
        ArrayList<pair> graph = new ArrayList<>();
        
        for(int i  = 0 ; i < e ;i++){
            
            int src = scan.nextInt();
            int dst = scan.nextInt();
            int wt =  scan.nextInt();
            graph.add(new pair(src,dst,wt));
             
        }
        
        int dist[] = new int[v+1];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[1] = 0;
        
        
        
        for(int i = 0 ; i < v-1;i++){
            for(pair vt : graph){
                int mx  = Integer.MAX_VALUE;
                if(dist[vt.src] != mx && (dist[vt.src]+vt.wt)<dist[vt.dst]){
                    dist[vt.dst] = dist[vt.src] + vt.wt;
                }
                
                
            }
        }
        
        
        for(int i  = 2 ; i < dist.length ;i++ ){
            System.out.print(dist[i] +" ");
        }
        
	}
}
