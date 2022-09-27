//try to avoid using dfs as bfs is far simpler

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] words = br.readLine().split(" ");

    System.out.println(alienOrder(words));
  }

  public static String alienOrder(String[] words) {
    
    HashMap<Character,HashSet<Character>> map = new HashMap<>();
    HashMap<Character,Integer> indegree = new HashMap<>();
    
    for(String str : words){
        for(char ch : str.toCharArray()){
            indegree.put(ch,0);
        }
    }
    
    
    for(int i = 0  ; i < words.length-1 ;i++){
        
        String s1 = words[i];
        String s2 = words[i+1];
        
        int len = Math.min(s1.length(),s2.length());
        boolean flag = false;
        for(int  j  = 0 ; j < len ;j++){
            char ch1 = s1.charAt(j);
            char ch2 = s2.charAt(j);
            
            if(ch1!=ch2){
                HashSet<Character> set = new HashSet<>();
                if(map.containsKey(ch1)){
                    set = map.get(ch1);
                    if(set.contains(ch2)==false){
                        set.add(ch2);
                        indegree.put(ch2 , indegree.get(ch2)+1);
                        map.put(ch1 , set);
                    }
                    
                }
                else{
                    
                    set.add(ch2);
                    indegree.put(ch2 , indegree.get(ch2)+1);
                    map.put(ch1 , set);
                }
                flag =true;
                break;
            }
        }
        if(flag == false && s1.length()>s2.length()){
            return "";
        }
        
    }
    
    
    
    ArrayDeque<Character> queue= new ArrayDeque<>();
    String ans="";
    for(char ch : indegree.keySet()){
        if(indegree.get(ch) == 0){
            queue.add(ch);
        }
    }
    
    
    while(queue.size()>0){
        
        char rem = queue.remove();
        ans+=rem;
        if(map.containsKey(rem)){
            for(char ch : map.get(rem)){
                
                indegree.put(ch , indegree.get(ch)-1);
                if(indegree.get(ch)==0){
                    queue.add(ch);
                }
                
            }
        }
        
    }
    return ans;
  }
}






