import java.util.Scanner;
interface Sports{
	void Activities(float s);
}
interface Student{
	void Marks(int m,int r,String n);
}
class Result implements Sports,Student{
	int marks,registerNo;
	float score;
	String Name;
	public void Activities(float s){
		score=s;
	}
	public void Marks(int m,int r,String n){
		marks=m;
		registerNo=r;
		Name=n;
	}
	public void display()
	{
		System.out.println("Name of the student:"+Name);
		System.out.println("Register number:"+registerNo);
		System.out.println("Marks scored:"+marks);
		System.out.println("Scores obtained :"+score);
	}
}

class MultipleInheritance{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the student name:");
		String name=sc.nextLine();
		System.out.print("Enter register number:");
		int registerNo=s.nextInt();
		System.out.print("Enter mark:");
		int marks=s.nextInt();
		System.out.print("Enter the sports score:");
		float score=s.nextFloat();
		Result obj=new Result();
		obj.Activities(score);
		obj.Marks(marks,registerNo,name);
		obj.display();
	}	
}


Algorithm

Step 1: Start
Step 2: Create an interface Sports with a method 'Activities' that takes a float parameter
's'
Step 3: Create an interface Student with a method 'Marks' that takes three parameters
'm' (marks), 'r' (register number), and 'n' (name)
Step 4: Create a class Result that implements both Sports and Student interfaces
Step 5: Add instance variables 'marks','registerNo','score', and 'Name' to the Result class
Step 6: Implement the 'Activities' method in the Result class to set the 'score' variable
Step 7: Implement the 'Marks' method in the Result class to set the 'marks', 'registerNo',
and 'Name' variables
Step 8: Create a method 'display' in the Result class to display the student's name,
register number, marks, and score
Step 9: Create the main method in the MultipleInheritance class
Step 10: Read the student details from the user (name, register number, marks, and
score)
Step 11: Create an object 'obj' of Result class
39
Step 12: Call the 'Activities' method on 'obj' and pass the score
Step 13: Call the 'Marks' method on 'obj' and pass the marks, register number, and name
Step 14: Call the 'display' method on 'obj' to display the student's details
Step 15: Stop
