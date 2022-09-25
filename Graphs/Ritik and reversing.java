/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static class pair {

    int vtx;
    int wt ;

    pair(int vtx, int wt) {
      this.vtx = vtx ;
      this.wt = wt;
    }


  }
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int m = scan.nextInt();


    ArrayList<pair> [] graph = new ArrayList[n+1];

    for (int i = 0 ; i <=n ; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int  i = 0 ; i < m ; i++) {

      int a = scan.nextInt();
      int b = scan.nextInt();

      graph[a].add(new pair(b, 0));
      graph[b].add(new pair(a, 1));
    }
    // for(int i = 0 ; i < n+1 ;i++){
    // for(pair p : graph[i]){
    //     System.out.print(p.vtx+" ");
    // }
    // System.out.println(i);
    // }
    
    ArrayDeque<pair> queue  = new ArrayDeque<>();
    queue.add(new pair(1, 0));
    boolean [] visited = new boolean[n+1];

    while (queue.size() > 0) {
      pair rem = queue.remove();
      visited[rem.vtx]  = true;
      
      if (rem.vtx == n) {
        System.out.println(rem.wt);
        return;
      }
       
      for (pair nb : graph[rem.vtx]) {
        if (visited[nb.vtx] == false) {
           
          if (nb.wt  == 0) {
            queue.addFirst(new pair(nb.vtx, rem.wt + 0));
          } else {
            queue.addLast(new pair(nb.vtx, rem.wt + 1));
          }
        }
      }



    }

    System.out.println("-1");

  }
	
}
