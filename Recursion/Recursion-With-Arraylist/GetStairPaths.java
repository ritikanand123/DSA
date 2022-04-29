import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<String> res = getStairPaths(num);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String>bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String>p1=getStairPaths(n-1);
        ArrayList<String>p2=getStairPaths(n-2);
        ArrayList<String>p3=getStairPaths(n-3);
        
        ArrayList<String>mres=new ArrayList<>();
        
        for(int i = 0 ; i < p1.size();i++){
            mres.add(1+p1.get(i));
        }
        for(int i = 0 ; i < p2.size();i++){
            mres.add(2+p2.get(i));
        }
        for(int i = 0 ; i < p3.size();i++){
            mres.add(3+p3.get(i));
        }
        
        return mres;
        
        
    }

}
