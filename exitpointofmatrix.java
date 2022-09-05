import java.io.*;
import java.util.*;

public class exitpointofmatrix {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int nr = scn.nextInt(), nc = scn.nextInt();
    int mat[][] = new int[nr][nc];
    for(int i=0; i<nr;i++){
        for(int j=0; j<nc; j++){
            mat[i][j] = scn.nextInt();
        }
    } 
    exitpointofmatrix(mat);
    }
public static void exitpointofmatrix(int mat[][]){
    // dimension
    int nr = mat.length, nc = mat[0].length;
    //init
    // Drxn : 0 -> east, 1 -> south, 2-> west, 3 -> north
    int r=0,c=0, dir = 0;
    int ans_row = -1, ans_col = -1;

    while(!(r<0 || c<0 || r>=nr|| c>=nc)){
        dir = (dir + mat[r][c]) % 4;// drxn update 

        // store previous coordinates
        ans_row = r;
        ans_col = c;

        //change
        if(dir==0) c++;
        else if(dir==1)r++;
        else if(dir == 2) c--;
        else r--;

    }
    System.out.println(ans_row);
    System.out.println(ans_col);
}
}