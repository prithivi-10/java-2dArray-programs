import java.util.*;
public class star_pattern_2D_matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the star in center of the matrix:");
		System.out.println("---------------------------------------------------------\n");;

		System.out.println("Enter the number of rows");
		int k=sc.nextInt();
		System.out.println("Enter the number od columns:");
		int kk=sc.nextInt();

		//declare the 2d array:
		int arr[][]=new int [k][kk];

		//geting input for the array:
		System.out.println("Enter the "+k+" row "+kk+" columns :");
		for(int i=0;i<k;i++) {
			for(int j=0;j<kk;j++) {
				System.out.print("Element for "+i+"X"+j+"=");
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("\n");

		System.out.println("The elements after the insertion is:");
		for(int array[]:arr) {
			for(int mm:array) {
				System.out.print(mm+" ");
			}
			System.out.println();
		}

		System.out.println("\n");
		//condition:

		System.out.println("The matrix after the condition is:");
		for(int i=0;i<k;i++) {
			for(int j=0;j<kk;j++) {
				if(i==0)
				{
					System.out.print(arr[i][j]+" ");
				}
				else if(j==0) {
					System.out.print(arr[i][j]+" ");
				 }
				else if(i==k-1) {
					System.out.print(arr[i][j]+" ");
				 }
				else  if(j==kk-1) {
					System.out.print(arr[i][j]+" ");
				 }
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}