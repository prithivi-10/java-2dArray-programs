import java.util.*;
import java.lang.*;

public class transpose_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java program to find the Transpose of the matrix:");
        System.out.println("-------------------------------------------------");

        int mat[][] = new int [3][3];
        int trans[][] = new int [3][3];

        System.out.println("Enter the elements for the matrix:");

        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat.length;j++) {
                System.out.printf("Element for %d X %d =",i,j);
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("");

        System.out.println("After inserting the elements for the matrix:");
        for(int i[]:mat) {
            for(int j:i) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat.length;j++) {
                trans[i][j]=mat[j][i];
            }
        }

        System.out.println("After taking the Transpose if the matrix:");
        for(int i[]:trans) {
            for(int j:i) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
