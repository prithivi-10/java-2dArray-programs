import java.util.*;
public class reduce_row_column_2dArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to reduce the ROW AND COLUMNS in the resultant array:");
		System.out.println("------------------------------------------------------------------\n");

		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();

		int arr[][]=new int [size][size];

		System.out.println("Enter the array elements:\n");

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print("Enter the element for "+(i+1) +"x"+(j+1)+"=");
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter the number to reduce the ROW AND COLUMN:");
		int number=sc.nextInt();


		System.out.println("The entered elements in the array are:\n");
		for(int k[]:arr) {
			for(int p:k) {
				System.out.print(p+" ");
			}
			System.out.println();
		}

		

		System.out.println("The array elements after reducing the ROW AND COLUMN are:");
		
		//condition to reduce the row and column:
		for(int i=number;i<arr.length;i++) {
			for(int j=number;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}
}