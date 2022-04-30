import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<String> res=getMazePaths(1,1,n,m);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc){
            ArrayList<String> bres=new ArrayList<String>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> paths=new ArrayList<String>();
        
        for(int ms = 1 ;ms<=dc-sc;ms++){
        ArrayList<String> hpaths=getMazePaths(sr,sc+ms,dr,dc);
        for(String val:hpaths){
            paths.add("h"+ms+val);
        }
        }
        for(int ms = 1 ;ms<=dr-sr;ms++){
        ArrayList<String> vpaths=getMazePaths(sr+ms,sc,dr,dc);
        for(String val:vpaths){
            paths.add("v"+ms+val);
        }
        }
        for(int ms = 1 ;ms<=dc-sc&&ms<=dr-sr;ms++){
        ArrayList<String> dpaths=getMazePaths(sr+ms,sc+ms,dr,dc);
        for(String val:dpaths){
            paths.add("d"+ms+val);
        }
        }
        return paths;
        
    }

}
