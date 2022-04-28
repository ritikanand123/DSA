import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char first=str.charAt(0);
        String rstr = str.substring(1);
        ArrayList<String> rres = gss(rstr);
        
        ArrayList<String> mres = new ArrayList<>();
        for(int i = 0;i<rres.size();i++){
            mres.add(rres.get(i));
        }
        for(int i = 0;i<rres.size();i++){
            mres.add(first+rres.get(i));
        }
        return mres;
        
        
    }

}
