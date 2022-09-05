import java.io.*;
import java.util.*;

public class spiraldisplay {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int nr = scn.nextInt(), nc = scn.nextInt();
    int mat[][] = new int[nr][nc];
    for(int i =0;i<mat.length;i++){
        for(int j=0; j<mat[0].length;j++){
            mat[i][j]=scn.nextInt();
        }
    }
    spiraldisplay(mat);    
    }
    public static void spiraldisplay(int mat[][]){
        int rmin = 0, cmin = 0, rmax = mat.length-1, cmax = mat[0].length-1;
        int count = 0;
        int tne = mat.length*mat[0].length;
        while(count<tne){
        //left wall
        for(int r=rmin,c=cmin; r<=rmax&&(count<tne); r++){
            System.out.println(mat[r][c]);
            count++;
        }
        
        //bottom wall
        for(int r = rmax , c = cmin+1; c<= cmax&&(count<tne);c++ ){
            System.out.println(mat[r][c]);
            count++;
        }
        //right wall
        for(int r = rmax-1 , c = cmax; r>=rmin&&(count<tne);r-- ){
            System.out.println(mat[r][c]);
            count++;
        }
        //top wall
        for(int r = rmin , c = cmax-1; c>= cmin+1&&(count<tne);c-- ){
            System.out.println(mat[r][c]);
            count++;
        }
        rmin++;
        cmin++;
        rmax--;
        cmax--;
    }
}
}