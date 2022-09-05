import java.util.*;
public class matrixmultiplication{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int nr1= scn.nextInt(), nc1 = scn.nextInt();
        
        
        int mat1[][] = new int[nr1][nc1];
        for(int i=0; i< nr1; i++){
            for(int j=0; j<nc1; j++){
                mat1[i][j]=scn.nextInt();
            }
        }

        int nr2= scn.nextInt(), nc2 = scn.nextInt();
        int mat2[][] = new int[nr2][nc2];
         for(int i=0; i< nr2; i++){
            for(int j=0; j<nc2; j++){
                mat2[i][j]=scn.nextInt();
            }
        }
        int res[][] = matrixmultiplication(mat1, mat2);
        if(res == null){
            System.out.println("Invalid input");
        }else{
            display(res);
        }
    }
    public staic int[][] matrixmultiplication(int mat1[][], int mat2[][]){
        int nr1= mat1.length, nc1 = mat1[0].length;
        int nr2= mat2.length, nc2 = mat2[0].length;

        if(nc1 == nr2){
            int res[][] = new int[nr1][nc2];
            
            for(int r = 0; r<res.length; r++){
                for(int c =0; c< res[0].length; ++){
                    for(int k=0; k<nc1; k++){
                        res[r][c] += (mat1[r][k]*mat2[k][c]);

                    }
                }
            }
            return res;
        }else{
            return null;
        }
    }
    public static void display(int mat[][]){
        for(int i=0; i< mat.length; i++){
            for(int j=0; j< mat[0].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}