import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		String ans = "";
		for(int i = 0 ; i < str.length()-1 ;i++){
		    char ch = str.charAt(i);
		    int sum = (int)str.charAt(i+1)-ch;
		    ans=ans+ch+sum;
		}
		ans+=str.charAt(str.length()-1);
		
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
