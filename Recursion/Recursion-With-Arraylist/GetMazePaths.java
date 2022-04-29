import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int m = scan.nextInt();
        sr=0;
        sc=0;
        dr=n-1;
        dc=m-1;
        ArrayList<String>res=getMazePaths(sr,sc,dr,dc);
        System.out.println(res);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String>hres=new ArrayList<>();
        ArrayList<String>vres=new ArrayList<>();
        if(sr<dr){
            hres=getMazePaths(sr+1,sc,dr,dc);
        }
        if(sc<dc){
            vres=getMazePaths(sr,sc+1,dr,dc);
        }
        ArrayList<String>mres=new ArrayList<>();
        
        for(val:hres){
            mres.add("h"+val)
        }
        for(val:vres){
            mres.add("v"+val)
        }    
        
        
        return mres
        
    }

}
