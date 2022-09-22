import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());

    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      String[] st = br.readLine().split(" ");
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(st[j]);
      }
    }

    String[] st1 = br.readLine().split(" ");
    int src = Integer.parseInt(st1[0]);
    int dest = Integer.parseInt(st1[1]);
    System.out.println(numBusesToDestination(arr, src, dest));

  }


  public static int numBusesToDestination(int[][] arr, int S, int T) {
    
    HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
    
    
    
    for(int i  = 0 ; i < arr.length ;i++){
        for(int j = 0 ; j < arr[0].length ;j++){
            if(hm.containsKey(arr[i][j])){
                
                ArrayList<Integer> temp = hm.get(arr[i][j]);
                temp.add(i);
                hm.put(arr[i][j],temp);
                
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                hm.put(arr[i][j],temp);
            }
        }
    }
    HashSet<Integer> bustopvis = new HashSet<>();
    HashSet<Integer> busvis= new HashSet<>();
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    int level = 0;
    
    queue.add(S);
    bustopvis.add(S);
    
    while(queue.size()>0){
        int size = queue.size();
        while(size-->0){
            
            int rem  = queue.remove();
            
            if(rem==T){
                return level;
            }
            
            ArrayList<Integer> buses = hm.get(rem);
            
            for(int bus : buses ){
                
                if(busvis.contains(bus)){
                    continue;
                }
                
                int rtarr[] = arr[bus];
                
                for(int bstp : rtarr){
                    
                    if(bustopvis.contains(bstp)){
                        continue;
                    }
                    
                    queue.add(bstp);
                    bustopvis.add(bstp);
                }
                
                busvis.add(bus);
            }
            
            
            
        }
        level++;
    }
    
    return -1;
    
  }
}
