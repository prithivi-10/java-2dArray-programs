import java.util.*;

import javax.sound.midi.Synthesizer;
import javax.swing.text.StyleConstants;

public class replace_diagonal_with_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to replace the value of sum in diagonal elements:");
        System.out.println("------------------------------------------------------------------\n");
        
        System.out.println("Enter the size of the matrix:");
        int size=sc.nextInt();
        int sum=0;

        int arr[][]=new int[size][size];

        System.out.println("Enter the "+size+" elements for the matrix:");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j]=sc.nextInt();
                if(i==j || i+j==size-1) 
                    sum+=arr[i][j];
            }
        }

        System.out.println("The value of the sum is = "+sum+"\n");

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(i==j || i+j==size-1) {
                    arr[i][j]=sum;
                }

            }
        }

        System.out.println("The resultant matrix is:");
        for(int op[]:arr) {
            for(int k:op) {
                System.out.print(k+" ");

            }
            System.out.println();
        }


    }

}