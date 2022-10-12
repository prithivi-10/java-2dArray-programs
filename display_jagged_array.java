import java.util.*;

public class display_jagged_array {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in) ;

        System.out.println("Program to display the jagged array:");
        System.out.println("=====================================");

        int arr1 [][] = {   {1,3,4,2},
                            {1,2,3,4,4,5,5,6,6},
                            {1,2,3,4,5,4,4},
                            {1,3,5,6,5,3,4,6,6,5,4,3,4,5,6,7},
                            {11,33,55,33,66,55,33,56,7,56,654,345,7654,345,2345}
                        };

        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr1[i].length;j++) {
                System.out.format("%2d ",arr1[i][j]);
            }
            System.out.println("");
        }
        
  
    }
}