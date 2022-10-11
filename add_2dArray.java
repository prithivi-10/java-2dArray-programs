import java.util.*;

public class add_2dArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Program to print addition of two matrices:");
        System.out.println("------------------------------------------");

        System.out.println("Enter the row1 for MAT1:");
        int r1=sc.nextInt();
        System.out.println("Enter the col1: for MAT1");
        int c1=sc.nextInt();

        System.out.println("Enter the row2 for MAT2:");
        int r2=sc.nextInt();
        System.out.println("Enter the col2 for MAT2:");
        int c2=sc.nextInt();

        int mat1 [][] = new int [r1][c1];
        int mat2 [][] = new int [r2][c2];
        int sum [][] = new int [r1][c1];

        if(r1==r2 && c1==c2) {

            System.out.printf("Enter the %d X %d elements for MAT1\n",r1,c1);

            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    System.out.printf("arr[%d][%d]=",i,j);
                    mat1[i][j]=sc.nextInt();
                }
            }
            System.out.println("");

            System.out.printf("Enter the %d X %d elements for MAT2\n",r2,c2);

            for(int i=0;i<r2;i++) {
                for(int j=0;j<c2;j++) {
                    System.out.printf("arr[%d][%d]=",i,j);
                    mat2[i][j]=sc.nextInt();
                }
            }
            System.out.println("");

            System.out.println("The elements in MATRIX1:");
            for(int x[]:mat1) {
                for(int y:x) {
                    System.out.print(y+" ");
                }
                System.out.println("");
            }

            System.out.println("");

            System.out.println("The elements in MATRIX2:");
            for(int x[]:mat2) {
                for(int y:x) {
                    System.out.print(y+" ");
                }
                System.out.println("");
            }

            System.out.println("");

            for(int i=0;i<sum.length;i++) {
                for(int j=0;j<sum.length;j++) {
                    sum[i][j]=mat1[i][j]+mat2[i][j];
                }
            }

            System.out.println("Elements after adding MAT1 and MAT2 are:");

            for(int d[]:sum) {
                for(int s:d) {
                    System.out.print(s+" ");
                }
                System.out.println("");
            }

        }
        else {
            System.out.println("");
            System.out.println("Please enter the valid rows and colmns for addition:");
        }
    }
}