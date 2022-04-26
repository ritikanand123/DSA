import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
	
		String ns="";
		
	    for(int i=0;i<str.length();i++){
	        int temp=(int)str.charAt(i);
	        if(temp >= 65&&temp<97){
	            temp=temp+32;
	            char c=(char)temp;
	            ns=ns+c;
	        }
	        else if(temp>=97){
	            temp=temp-32;
	            char c=(char)temp;
	            ns=ns+c;
	        }
	    }

		return ns;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
