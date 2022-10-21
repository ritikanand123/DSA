class Solution {
    static HashMap<String, PriorityQueue<String>>graph;
    static LinkedList<String> ll;
   public List<String> findItinerary(List<List<String>> tickets) {
     
     
      graph = new HashMap<>();
      ll = new LinkedList<>();
     
     //creation of graph
     
     for(int i  = 0 ; i < tickets.size() ; i++){
         PriorityQueue<String> pq = graph.getOrDefault(tickets.get(i).get(0),new PriorityQueue<>());
         
         pq.add(tickets.get(i).get(1));
         graph.put(tickets.get(i).get(0),pq);
     }
     
     
     dfs("JFK");        // all paths start from jfk
     
     return(ll);
        
    }
  
  public static void dfs(String src){
      
      PriorityQueue<String> nbrs = graph.get(src);
      
      while(nbrs!=null && nbrs.size() > 0){     // as every nbrs are not intialized 
          
         dfs(nbrs.remove()); 
          
      }
      
      ll.addFirst(src);    // add while backtracking why? we can visit the end at starting   but we have to visit the final destination at end so we would get at a point from where there is no flight ticket
      
  }
}
