import java.util.*;



class replace_prime_by_1 {

    //user defined method for checking whether it is a prime or not:
    static int prime(int n1) {

        if(n1==1)
            return -1;
        else {
            for(int i=2;i<=n1/2;i++) {
                if(n1%i==0)
                    return 0;
            }
        }
        return 1;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to replace the matrix elements by 1 if prime or 0 if not prime ");
        System.out.println("\n=============================================================================\n");

        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        System.out.println("Enter the matrix elements ");

        for(int j=0;j<row;j++) {
            for(int k=0;k<col;k++) {
                int getting=sc.nextInt();
                int checking=prime(getting);
                arr[j][k]=checking;
            }
        }

        System.out.println("The resultant matrix will be");
        for(int ii[]:arr) {
            for(int jj:ii) {
                System.out.print(jj+" ");
            }
            System.out.println();
        }

    }
}