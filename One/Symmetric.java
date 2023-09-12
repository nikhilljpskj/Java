import java.util.Scanner;

public class Symmetric
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[20][20];
		int i,j,flag=0;
		
		System.out.print("Enter the row of matrix:");
		int row= sc.nextInt();
		System.out.print("Enter the column of matrix:");
		int col= sc.nextInt();
		if(row!=col)
		{
			System.out.println("This is not a symmetric matrix");
			return;
		}

		System.out.println("Enter the Matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("The transpose of the matrix is ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
					System.out.print(matrix[j][i] +" ");
			}
		System.out.println();
		}
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(matrix[i][j] != matrix[j][i])
				{
				flag =1;
				break;
				}
			}
		}
		
		if(flag ==1 )
		{
			System.out.println("The matrix is not symmetric");
		}
		
		else
		{
			System.out.println("The matrix is symmetric");
		}
	}
}

Algorithm

	Step 1: Define a Java class named Symmetric.

Step 2: Inside the Symmetric class, declare the main method, which is the entry point of the program.

Step 3: Create a Scanner object sc to read input from the user.

Step 4: Declare a 2D integer array matrix with a maximum size of 20x20 to store the matrix.

Step 5: Declare integer variables i, j, and flag to be used as loop counters and a flag to check for symmetry.

Step 6: Prompt the user to enter the number of rows of the matrix using System.out.print and read the value into the variable row.

Step 7: Prompt the user to enter the number of columns of the matrix using System.out.print and read the value into the variable col.

Step 8: Check if row is not equal to col. If they are not equal, print "This is not a symmetric matrix" and exit the program using return.

Step 9: Display a message asking the user to enter the elements of the matrix using System.out.println.

Step 10: Use nested for loops to read the elements of the matrix from the user. The outer loop iterates over rows, and the inner loop iterates over columns.

Step 11: Display a message indicating that the transpose of the matrix is about to be printed using System.out.println.

Step 12: Use nested for loops to calculate and print the transpose of the matrix by swapping rows and columns. Print the elements with a space in between.

Step 13: Use nested for loops to check if the matrix is symmetric by comparing matrix[i][j] with matrix[j][i]. If any element is found to be different, set the flag to 1 and break out of the loops.

Step 14: Check the value of the flag. If flag is 1, print "The matrix is not symmetric." Otherwise, print "The matrix is symmetric."

Step 15: End
