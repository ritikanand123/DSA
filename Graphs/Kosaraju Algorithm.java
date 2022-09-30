import java.io.*;
import java.util.*;

public class Main {
    
    
    
    
	public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int v = scan.nextInt(); 
        int e = scan.nextInt();
        
        ArrayList<Integer> graph[] = new ArrayList[v] ;
        
        for(int i  = 0 ; i < graph.length ;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0  ;i < e ;i++){
            int src = scan.nextInt()-1;
            int dst = scan.nextInt()-1;
            
            graph[src].add(dst);
            
        }
        
        
        
        boolean visited[] = new boolean[v+1];
        Stack<Integer> st  = new Stack<>();
        for(int i  = 0 ; i < v ;i++){
            if(visited[i] == false){
                dfs1(i , graph , visited ,st);
            }
        }
        
        ArrayList<Integer> ngraph[] = new ArrayList[v] ;
        
        for(int i  = 0 ; i < graph.length ;i++){
            ngraph[i] = new ArrayList<>();
        }
        
       for(int i = 0  ;i < v ;i++){
            for(int nbr : graph[i]){
                ngraph[nbr].add(i);
            }   
        }
        

      

        visited = new boolean[v+1];
        int ans =0;
        while(st.size()>0){
            int rem = st.pop();
            if(visited[rem]==false){
                dfs2(rem,ngraph,visited);
                ans++;
            }
        }
        System.out.println(ans);
        
        
    }
    
    public static void dfs1(int src ,ArrayList<Integer> graph[],boolean vis[], Stack<Integer> st){
        vis[src] = true;
        for(int nbr:graph[src]){
            if(vis[nbr] == false){
                dfs1(nbr,graph,vis,st);
            }
        }
        st.push(src);
        
    }
    
    public static void dfs2(int src ,ArrayList<Integer> graph[],boolean[] vis){
        vis[src] = true;
        for(int nbr:graph[src]){
            if(vis[nbr] == false){
                dfs2(nbr,graph,vis);
            }
        }
        
    }
    
    

}
