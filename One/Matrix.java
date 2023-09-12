import java.util.Scanner;
class Matrix
{
	public static void main(String [] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[20][20];
		int i,j;
		Scanner inp= new Scanner(System.in);
		System.out.print("Enter the row :");
		int row=inp.nextInt();
		System.out.print("Enter the colomn :");
		int col=inp.nextInt();
		System.out.println("Enter the first matrix");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				a[i][j]=inp.nextInt();
		System.out.println("Enter the second matrix");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				b[i][j]=inp.nextInt();
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				c[i][j]=a[i][j]+b[i][j];
		System.out.println("The addtion of the two matrix are ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++){
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
	}
}


Algorithm

Step 1: Declare a Java class named Matrix.

Step 2: Inside the Matrix class, declare the main method, which is the entry point of the program.

Step 3: Declare integer arrays a[][], b[][], and c[][] to store matrices. Initialize them with a maximum size of 10x10.

Step 4: Declare integer variables i and j. These will be used as loop counters.

Step 5: Create a Scanner object named inp to read input from the user.

Step 6: Use System.out.print to prompt the user to enter the number of rows for the matrices. Read the number entered by the user and store it in the variable row.

Step 7: Use System.out.print to prompt the user to enter the number of columns for the matrices. Read the number entered by the user and store it in the variable col.

Step 8: Display a message asking the user to enter the elements of the first matrix.

Step 9: Use nested for loops to read the elements of the first matrix (a) from the user. The outer loop iterates over rows, and the inner loop iterates over columns.

Step 10: Display a message asking the user to enter the elements of the second matrix.

Step 11: Use nested for loops to read the elements of the second matrix (b) from the user, following the same row-column iteration pattern as the first matrix.

Step 12: Use nested for loops to calculate the sum of the corresponding elements of matrices a and b and store the result in the c matrix.

Step 13: Display a message indicating that the addition of the two matrices is about to be printed.

Step 14: Use nested for loops to print the elements of the resultant matrix (c) after addition. The outer loop iterates over rows, and the inner loop iterates over columns.

Step 15: End
