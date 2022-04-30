import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        printStairPaths(n,"");

    }

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }
        if(n<0){
            return;
        }
        
        for(int i =1 ; i <=3 ;i++){
            printStairPaths(n-i,path+i);
        }
    }

}
