import java.io.*;
import java.util.*;

public class stateOfWakanda2 {

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = nr;
    int mat[][]= new int[nr][nc];
    fillMatrix(mat,scn);
    stateOfWakanda2(mat);
   }
public static void fillMatrix(int mat[][], Scanner scn){
     int nr = mat.length;
     int nc = mat[0].length;
     for(int r = 0; r<nr; r++){
       for(int c = 0; c< nc; c++){
         mat[r][c]=scn.nextInt();
       }
     }
   }  
public static void stateOfWakanda2(int mat[][]){
   int n = mat.length;
   for(int gap =0; gap<n; gap++){
    int r=0, c=gap;
    while(r<n && c<n){
        System.out.println(mat[r][c]);
        r++;
        c++;
    }
   }
    }  
  }  

