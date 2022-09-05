import java.util.*;
  
  public class 2darraydemo{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = scn.nextInt();
    int mat[][]= new int[nr][nc];
    fillMatrix(mat,scn);
    display(mat);
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
   public static void display(int mat[][]){
     int nr = mat.length;
     int nc = mat[0].length;
     for(int r = 0; r<nr; r++){
       for(int c = 0; c< nc; c++){
         System.out.print(mat[r][c]+ " ");
       }
       System.out.println();
     }
   }
  }