import java.util.Scanner;

class Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of employees to  be entered");
		int length=sc.nextInt();
		EmployeData[] array=new EmployeData[length];
		for(int i=0;i<length;i++)
		{
			array[i]=new EmployeData();
		}
		System.out.print("Enter the Search key[Employee number]");
		int searchKey=sc.nextInt();
		searchArray(array,searchKey);
	}
	static void searchArray(EmployeData array[],int sk)
	{
		int i,flag=0;
		for(i=0;i<array.length;i++)
		{
			if(array[i].Eno==sk)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Employee Number of : "+sk+" is found and Name is "+array[i].Ename+" and salary is "+array[i].Salary);
		}
		else{
			System.out.println("Employee not found : "+sk);
		}
	}
	static class EmployeData
	{
		int Eno,Salary;
		String Ename;
		Scanner sc=new Scanner(System.in);
		
		EmployeData()
		{
			System.out.print("Enter employee number : ");
			Eno=sc.nextInt();
			System.out.print("Enter employee name : ");
			Ename=sc.next();
			System.out.print("Enter Salary : ");
			Salary=sc.nextInt();
		}
	}
}

Algorithm

Step 1: Define a Java class named Employee.

Step 2: Inside the Employee class, declare the main method, which is the entry point of the program.

Step 3: Create a Scanner object sc to read input from the user.

Step 4: Prompt the user to enter the number of employees to be entered using System.out.print and read the value into the variable length.

Step 5: Create an array of EmployeData objects named array with a size of length.

Step 6: Use a for loop to initialize each element of the array by creating a new EmployeData object and storing it in the corresponding array index.

Step 7: Prompt the user to enter a search key (Employee number) using System.out.print and read the value into the variable searchKey.

Step 8: Call the searchArray method, passing the array and searchKey as arguments to search for the employee with the given employee number.

Step 9: Define a static method named searchArray that takes an array of EmployeData objects (array) and an integer sk (search key) as parameters.

Step 10: Inside the searchArray method, declare integer variables i and flag to be used as loop counters and a flag to indicate whether the employee was found or not.

Step 11: Use a for loop to iterate through the array of EmployeData objects.

Step 12: Inside the loop, check if the Eno (Employee number) of the current EmployeData object matches the sk (search key). If it does, set the flag to 1 and break out of the loop.

Step 13: After the loop, check the value of the flag. If flag is 1, print the details of the employee with the specified employee number, including their name and salary.

Step 14: If flag is not 1, print a message indicating that the employee was not found.

Step 15: Define a static nested class named EmployeData within the Employee class to represent employee data. This class has integer fields for Employee number (Eno), salary (Salary), and a string field for Employee name (Ename).

Step 16: Inside the EmployeData class, create a constructor to initialize the Eno, Ename, and Salary fields by reading input from the user using the Scanner object sc.

Step 17: End
