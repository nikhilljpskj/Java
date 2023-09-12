import java.util.Scanner;

class Searchelement
{
	public static void main(String args[])
	{
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int size=sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the array elements");
		for(i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Enter the Search element :");
		int search=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(array[i]==search)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(search+" is present in array");
		}
		else
		{
			System.out.println(search+" is not present in array");
		}
	}
}

Algorithm

Step 1: Define a Java class named Searchelement.

Step 2: Inside the Searchelement class, declare the main method, which is the entry point of the program.

Step 3: Create an integer variable i and a flag variable flag both initialized to 0.

Step 4: Create a Scanner object sc to read input from the user.

Step 5: Prompt the user to enter the size of the array using System.out.print and read the value into the variable size.

Step 6: Create an integer array array with a size of size to store the elements of the array.

Step 7: Display a message asking the user to enter the elements of the array using System.out.println.

Step 8: Use a for loop to read the elements of the array from the user and store them in the array at the appropriate index.

Step 9: Prompt the user to enter the element to search for in the array using System.out.print and read the value into the variable search.

Step 10: Use a for loop to iterate through the array elements and check if any element matches the search element. If a match is found, set the flag to 1 and break out of the loop.

Step 11: After the loop, check the value of the flag. If flag is 1, print a message indicating that the search element is present in the array, along with the value of the search element.

Step 12: If flag is not 1, print a message indicating that the search element is not present in the array.

Step 13: End
