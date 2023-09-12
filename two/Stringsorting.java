import java.util.Scanner;
import java.util.Arrays;

class Stringsorting
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of strings you want :");
		int size=sc.nextInt();
		String array[]=new String[size];
		System.out.println("Enter the strings \n");
		for(i=0;i<size;i++)
		{
				array[i]=sc.next();
		}
		System.out.println("\nBefore sorting");
		for(i=0;i<size;i++)
		{
				System.out.println(array[i]);
		}
		Arrays.sort(array);
		System.out.println("\nAfter sorting ");
		for(i=0;i<size;i++)
		{
				System.out.println(array[i]);
		}
	}
}

Algorithm

Step 1: Define a Java class named StringSorting.

Step 2: Inside the StringSorting class, declare an integer variable i to be used as a loop counter.

Step 3: Create a Scanner object sc to read input from the user.

Step 4: Prompt the user to enter the number of strings they want using System.out.print and read the value into the size variable.

Step 5: Create a String array array with a size of size to store the input strings.

Step 6: Display a message asking the user to enter the strings using System.out.println.

Step 7: Use a for loop to read the input strings from the user and store them in the array at the appropriate index.

Step 8: Display a message indicating that the strings are about to be sorted using System.out.println.

Step 9: Use the Arrays.sort(array) method to sort the strings in the array in lexicographic (alphabetical) order.

Step 10: Display a message indicating that the strings have been sorted using System.out.println.

Step 11: Use another for loop to iterate through the sorted array and print each string.

Step 12: End
