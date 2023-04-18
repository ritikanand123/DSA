import java.io.*;
import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
         int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][]=new int[row][col];
        for(int i =0; i<arr.length;i++){
            for(int j = 0 ; j<arr[0].length;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        int shell = scan.nextInt();
        int rotation=scan.nextInt();
        
        rotateshell(arr,shell,rotation);
        display(arr);
    }
    
    public static void rotateshell(int [][]arr,int s,int r){
        
        int oned[]=fillfromshell(arr,s);
        rotate(oned,r);
        filltoshell(arr,oned,s); 
    }
    
    public static int[] fillfromshell(int arr[][],int s){
         int minrow = s-1;
         int mincol = s-1;
         int maxrow = arr.length - s;
         int maxcol = arr[0].length - s;
         int size=2*((maxrow-minrow)+(maxcol-mincol));
         int oned[]=new int [size];
         int count=0;
         
             //left  wall
            for(int i = minrow,j=mincol;i<=maxrow;i++){
                oned[count]=arr[i][j];
                count++;
            } 
            //bottom wall
            for(int i = maxrow,j=mincol+1;j<=maxcol;j++){
                oned[count]=arr[i][j];
                count++;
            }
            //right wall
            for(int i = maxrow-1,j=maxcol;i>=minrow;i--){
                oned[count]=arr[i][j];
                count++;
            }
            //top wall
            for(int i = minrow,j=maxcol-1;j>=mincol+1;j--){
                oned[count]=arr[i][j];
                count++;
            }
         return oned;
    }
    
    public static void rotate(int []oned,int rotation){
        
    rotation = rotation%oned.length;
    if(rotation<0){
        rotation=oned.length+rotation;
    }
    reverse(oned,0,oned.length-rotation-1);
    reverse(oned,oned.length-rotation,oned.length-1);
    reverse(oned,0,oned.length-1);
        
    }
    public static void reverse(int []oned,int start,int end){
        int li = start;
        int ri =end;
        while(li<ri){
            int temp = oned[ri];
            oned[ri]=oned[li];
            oned[li]=temp;
            li++;
            ri--;
        }
        
    }
    
    public static void filltoshell(int arr[][],int oned[],int s){
        int minrow = s-1;
         int mincol = s-1;
         int maxrow = arr.length - s;
         int maxcol = arr[0].length - s;
         int count=0;
            //left wall
           for(int i = minrow,j=mincol;i<=maxrow;i++){
               arr[i][j]=oned[count];
               count++;
           }
           //bottom wall
           for(int i = maxrow,j=mincol+1;j<=maxcol;j++){
               arr[i][j]=oned[count];
               count++;
           }
           //right wall
           for(int i = maxrow-1,j=maxcol;i>=minrow;i--){
               arr[i][j]=oned[count];
               count++;
           }
           //top wall
           for(int i = minrow,j=maxcol-1;j>=mincol+1;j--){
               arr[i][j]=oned[count];
               count++;
           }
         
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
