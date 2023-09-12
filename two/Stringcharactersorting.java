import java.util.Arrays;
import java.util.Scanner;

class Stringcharactersorting
{
	public static void main(String args[])
	{
		int temp,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string :");
		String input=sc.nextLine();
		System.out.print("The String before sorting :"+input);
		char array[]=input.toCharArray();
		Arrays.sort(array);
		/*for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=(char)temp;
				}
			}
		}*/
		String newArray= new String(array);
		System.out.println("\nThe String after sorting :"+newArray);
	}
}

Algorithm

Step 1: Define a Java class named StringCharacterSorting.

Step 2: Inside the StringCharacterSorting class, declare variables temp, i, and j of type int to be used as temporary storage and loop counters.

Step 3: Create a Scanner object sc to read input from the user.

Step 4: Prompt the user to enter a string using System.out.print and read the input into the input variable as a line of text.

Step 5: Display a message indicating the string before sorting using System.out.print.

Step 6: Convert the input string input into a character array array using the toCharArray method.

Step 7: Use the Arrays.sort(array) method to sort the characters in the array.

Step 8: Comment out or remove the block of code that uses nested loops to manually sort the characters (since it's replaced by the Arrays.sort method).

Step 9: Create a new string newArray by converting the sorted character array array back into a string using new String(array).

Step 10: Display a message indicating the string after sorting using System.out.println.

Step 11: End
