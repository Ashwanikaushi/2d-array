import java.io.*;
import java.util.*;

public class rotateby90 {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int arr[][] = new int[n][n];
       for(int i =0; i< n; i++){
           for(int j=0; j<n; j++){
               arr[i][j] = scn.nextInt();
           }
       }
       // transpose 
       for(int i=0; i<arr.length; i++){
           for(int j = i; j<arr[0].length; j++){
               int tmp = arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]= tmp;
           }
       }
       // reverse row
       for(int i =0; i< arr.length; i++){
           int li=0;
           int ri=arr[i].length-1;
           while(li<ri){
               int tmp = arr[i][li];
               arr[i][li]= arr[i][ri];
               arr[i][ri]=tmp;
               li++;
               ri--;
           }
       }
       display(arr);
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