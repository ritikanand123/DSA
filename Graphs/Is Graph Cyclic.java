import java.io.*;
import java.util.*;

public class Main {
  static class Edge {
    int src;
    int nbr;

    Edge(int src, int nbr) {
      this.src = src;
      this.nbr = nbr;
    }
  }



  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int vtces = Integer.parseInt(br.readLine());
    ArrayList<Edge>[] graph = new ArrayList[vtces];
    for (int i = 0; i < vtces; i++) {
      graph[i] = new ArrayList<>();
    }

    int edges = Integer.parseInt(br.readLine());
    for (int i = 0; i < edges; i++) {
      String[] parts = br.readLine().split(" ");
      int v1 = Integer.parseInt(parts[0]);
      int v2 = Integer.parseInt(parts[1]);
      graph[v1].add(new Edge(v1, v2));
      graph[v2].add(new Edge(v2, v1));
    }


    boolean visited[] = new boolean[vtces];
    for (int i  = 0; i < vtces ; i++) {
      if (visited[i] == false) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(i);
        boolean res = bfs(graph, i, visited, queue );
        if (res == true ) {
          System.out.println(true);
          return;
        } else {
          continue;
        }
      }
    }
    System.out.println(false);
  }

  public static boolean bfs(ArrayList<Edge> graph[], int src, boolean [] visited, ArrayDeque<Integer> queue) {

    while (queue.size() > 0) {
      int rem = queue.removeFirst();
      
      if (visited[rem] == true) {
        return true;
      } else {
        visited[rem] = true;
        
        for (Edge e : graph[rem]) {
            if(visited[e.nbr] == false){
                queue.add(e.nbr);
            }
        }

      }

    }
    return false;
  }


}




