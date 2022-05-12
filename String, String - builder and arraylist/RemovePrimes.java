import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		
		for(int i = al.size()-1 ; i>=0 ;i--){
		    
		    int num = al.get(i);
		    boolean ans = checkprime(num);
		    if(ans == true){
		        al.remove(i);
		    }
		}
	}
	
	public static boolean checkprime(int num){
	    
	    boolean ans = true;
	    
    int start = 2;
    int end=num-1;
    for(int i =start;i<=end;i++){
        if(num%i==0){
            ans = false;
            return ans;
        }
    
    }
    return ans;
   
	    
	    
	}
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
