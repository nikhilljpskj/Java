import java.util.Scanner;

class Mark
{
	public static void main(String[] args)
	{
		int mark[]=new int[10];
		int i,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of subjects:");
		int size=sc.nextInt();
		System.out.println("Enter the mark of each subjects");
		for(i=0;i<size;i++)
		{
			mark[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			total=total+mark[i];
		}
		float percentage=(total/(float)size);
		System.out.println("Total mark of the Student is :"+total);
		System.out.println("Total percentage is :"+percentage);
	}
}


Algorithm

	Step 1: Import the Scanner class to enable user input.

Step 2: Define a Java class named Mark.

Step 3: Inside the Mark class, declare the main method, which is the entry point of the program.

Step 4: Declare an integer array mark to store the marks of 10 subjects. Initialize it with a size of 10.

Step 5: Declare integer variables i and total. i will be used as a loop counter, and total will store the sum of marks.

Step 6: Create a Scanner object named sc to read input from the user.

Step 7: Use System.out.print to prompt the user to enter the number of subjects. Read the number entered by the user and store it in the variable size.

Step 8: Display a message asking the user to enter the marks for each subject.

Step 9: Use a for loop to iterate from i = 0 to i < size (the number of subjects entered by the user).

Step 10: Inside the loop, read the marks for each subject one by one and store them in the mark array at the current index i.

Step 11: Use another for loop to calculate the total marks. Initialize i to 0.

Step 12: Inside the second loop, add the marks at each index i to the total variable.

Step 13: Calculate the percentage by dividing total by size and casting it to a float to ensure a decimal result.

Step 14: Use System.out.println to display the total marks and the percentage to the user.

Step 15: End

