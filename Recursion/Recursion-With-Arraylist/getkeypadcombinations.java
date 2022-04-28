import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        String s=scan.next();
        ArrayList<String> res=getKPC(s);
        System.out.println(res);

    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
         if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String rem=str.substring(1);
        ArrayList<String> rres=getKPC(rem);
        
        ArrayList<String> mres = new ArrayList<>();
        
        String strfromcodes=codes[ch-48];
        for(int i = 0 ;i < strfromcodes.length();i++){
            
            char chcode = strfromcodes.charAt(i);
            for(int j = 0 ;j < rres.size();j++ ){
                mres.add(chcode+rres.get(j));
            }
            
        }
        
        return mres;
    }

}
