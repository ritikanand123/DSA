import java.io.*;
import java.util.*;

public class Main {

	public static String compression2(String str){
		int tc=1;
		String sn="";
		sn=sn+str.charAt(0);
		for(int i = 1;i<str.length();i++){
		    if(str.charAt(i-1)!=str.charAt(i)){
		        if(tc>1){
		        sn=sn+tc;
		        tc=1;
		        }
		        sn=sn+str.charAt(i);
		        
		    }
		    else{
		        tc++;
		    }
		     if(i==str.length()-1&&tc>1){
		        sn=sn+tc;
		    }
		    
		}
		return sn;
	}

	public static String compression1(String str){
		
		String sn="";
		sn=sn+str.charAt(0);
		for(int i=0;i<str.length()-1;i++ ){
		    if(str.charAt(i)!=str.charAt(i+1)){
		        sn=sn+str.charAt(i+1);
		    }
		}

		return sn;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
