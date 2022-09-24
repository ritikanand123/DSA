// use bsf to solve this question generate all possible combination when swaped in 4 directional way after after each no of swaps


ArrayDeque<String> queue = new ArrayDeque<>();
    String tar = "123450";
    String intial ="";
    
    for(int i = 0  ; i< board.length ;i++){
        for(int j  = 0 ; j < board[0].length ;j++){
            intial += board[i][j];
        }
    }
    
    Set<String> hm = new HashSet<>();
    hm.add(intial);
    queue.add(intial);
    int swppsb [][] = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};//swaps possible with the index if 0 is at 2 it can swap with index 1 and 5
    int level = 0;
    while(queue.size()>0){
        int size = queue.size();
        while(size-->0){
            
            String rem = queue.remove();
            
            if(rem.equals(tar)){
                return level;
            }
            int idx = -1; // finding 0 at and index
            for(int i = 0 ; i < rem.length();i++){
                if(rem.charAt(i)=='0'){
                    idx = i;
                    break;
                }
            }
           
            int arr[] = swppsb[idx];
            
            for(int i = 0 ; i< arr.length ;i++){
                String swaped = swap(rem,idx,arr[i]);
                
                if(hm.contains(swaped)){
                   continue; 
                }
                
                queue.add(swaped);
                hm.add(swaped);
            }
            
            
        }
        level++;
    }
    return -1;
    
    
  }

//one should use string builder or char arr
  
  public static  String swap(String str , int i , int j){
      StringBuilder sb = new StringBuilder(str);
      sb.setCharAt(i,str.charAt(j)) ;
      sb.setCharAt(j,str.charAt(i));
      return sb.toString();
      
  }
