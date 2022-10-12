import java.util.*;

public class matrix_multiplication {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in) ;

        System.out.println("Program to multiply the two matrices:");
        System.out.println("=====================================");

        int arr1[][] = new int [2][2];
        int arr2[][] = new int [2][2];
        int mul[][] = new int [2][2];

        System.out.println("Enter the arr1 elements:");

        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr1.length;j++) {
                System.out.printf("arr[%d][%d]=",i,j);
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("");

        System.out.println("Enter the arr2 elements:");

        for(int i=0;i<arr2.length;i++) {
            for(int j=0;j<arr2.length;j++) {
                System.out.printf("arr[%d][%d]=",i,j);
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("");

        System.out.println("Elements in arr1 are:");
        for(int d[]:arr1) {
            for(int h:d) {
                System.out.print(h+" ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Elements in arr2 are:");
        for(int d[]:arr2) {
            for(int h:d) {
                System.out.print(h+" ");
            }
            System.out.println("");
        }
        System.out.println("");


        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr1.length;j++) {
                mul[i][j]=0;
                for(int k=0;k<arr1.length;k++) {
                    mul[i][j]+=arr1[i][k]*arr2[k][j];

                }
            }
        }

        System.out.println("After the multiplication of the arr1 and arr1 are:");

        for(int h[]:mul) {
            for(int j:h) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }


  
    }
}