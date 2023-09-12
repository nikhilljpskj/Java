import java.util.Scanner;

class AreaOfShapes
{
		void display(int a)
		{
			int Area=a*a;
			System.out.println("\nThe Area of Square is : "+Area);
		}
		void display(int a,int b)
		{
			int Area=a*b;
			System.out.println("The Area of reactangle is : "+Area);
		}
		void display(int r,double p)
		{
			double Area=p*r*r;
			System.out.println("The Area of Circle is : "+Area);
		}
		public static void main(String args[])
		{
			double pi=3.14;
			AreaOfShapes as=new AreaOfShapes();
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter the length of  the square : ");
			int sqrlen=sc.nextInt();
			System.out.print("Enter the length of  the rectangle : ");
			int reclen=sc.nextInt();
			System.out.print("Enter the breadth of  the rectangle : ");
			int recbre=sc.nextInt();
			System.out.print("Enter the radius of  the circle : ");
			int rad=sc.nextInt();
			as.display(sqrlen);
			as.display(reclen,recbre);
			as.display(rad,pi);
		}
}

Algorithm

Step 1: Define a Java class named AreaOfShapes.

Step 2: Inside the AreaOfShapes class, define three overloaded methods named display:

a. The first display method takes a single integer parameter a representing the side length of a square. It calculates and displays the area of the square (Area = a * a).

b. The second display method takes two integer parameters a and b representing the length and breadth of a rectangle. It calculates and displays the area of the rectangle (Area = a * b).

c. The third display method takes an integer parameter r representing the radius of a circle and a double parameter p representing the value of pi (π). It calculates and displays the area of the circle (Area = π * r * r).

Step 3: In the main method:

a. Declare a double variable pi and initialize it with the value 3.14.

b. Create an object as of the AreaOfShapes class to call the display methods.

c. Create a Scanner object sc to read input from the user.

d. Prompt the user to enter the side length of the square, length and breadth of the rectangle, and the radius of the circle.

e. Read these values into the respective variables: sqrlen, reclen, recbre, and rad.

f. Call the display method for the square, passing sqrlen as the argument.

g. Call the display method for the rectangle, passing reclen and recbre as arguments.

h. Call the display method for the circle, passing rad and pi as arguments.

Step 4: End
	
