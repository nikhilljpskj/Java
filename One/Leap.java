import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the starting year: ");
		int start=inp.nextInt();
		System.out.print("Enter the ending year: ");
		int end=inp.nextInt();
		int i;
		for(i=start;i<=end;i++)
		{
			if(i%4==0&&i%100!=0||i%400==0)
			{
				System.out.println(i);
			}
		}
	}
}

Algorithm

Step 1: Import the Scanner class from the java.util package.

Step 2: Define a class named Leap.

Step 3: In the main method:

Create a Scanner object named inp to read input from the console.
Display the message "Enter the starting year: " to prompt the user for input.
Read an integer input from the user and store it in the variable start.
Display the message "Enter the ending year: " to prompt the user for input.
Read another integer input from the user and store it in the variable end.
Declare an integer variable i for iteration.
Step 4: Start a for loop with the loop variable i initialized to the value of start. The loop will continue as long as i is less than or equal to end. Increment i by 1 in each iteration.

Step 5: Inside the for loop:

Check if i is divisible by 4 (i % 4 == 0) and not divisible by 100 (i % 100 != 0) or divisible by 400 (i % 400 == 0). This condition checks whether the year i is a leap year.
If the condition is true, print the value of i to the console. This indicates that the year i is a leap year.
Step 6: End the for loop
