import java.util.Scanner;

interface operations{
    void area(int a,double b);
    void perimeter(int a,double b);
}

class Rectangle implements operations{
    public void area(int a,double b){
        double areaOfR= a*b;
        System.out.println("Area of rectangle :"+areaOfR);
    }
    public void perimeter(int a,double b){
        double perimeterOfR = 2*(a+b);
        System.out.println("Perimeter of rectangle :"+perimeterOfR);
    }
}

class Circle implements operations{
    public void area(int r,double pi){
        double areaOfC = pi*r*r;
        System.out.println("Area of cirle :"+areaOfC);
    }
    public void perimeter(int r,double pi){
        double perimeterOfC = 2*pi*r;
        System.out.println("Perimeter of circle :"+perimeterOfC);

    }
}

class Interface{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        int length=sc.nextInt();
        System.out.print("Enter the breadth of rectangle:");
        double breadth=sc.nextInt();
        System.out.print("Enter the radius of circle:");
        int radius=sc.nextInt();
        double pi=3.14;
        operations obj1=new Rectangle();
        obj1.area(length,breadth);
        obj1.perimeter(length,breadth);
        operations obj2=new Circle();
        obj2.area(radius,pi);
        obj2.perimeter(radius,pi);
    }
}

Algorithm

Step 1: Define an interface named operations with two abstract methods: area(int a, double b) and perimeter(int a, double b).

Step 2: Define a Java class named Rectangle that implements the operations interface:

a. Implement the area(int a, double b) method to calculate and display the area of a rectangle (Area = length * breadth).

b. Implement the perimeter(int a, double b) method to calculate and display the perimeter of a rectangle (Perimeter = 2 * (length + breadth)).

Step 3: Define a Java class named Circle that also implements the operations interface:

a. Implement the area(int r, double pi) method to calculate and display the area of a circle (Area = π * r * r).

b. Implement the perimeter(int r, double pi) method to calculate and display the perimeter of a circle (Perimeter = 2 * π * r).

Step 4: In the Interface class (the main class):

a. Create a Scanner object sc to read input from the user.

b. Prompt the user to enter the length and breadth of a rectangle and the radius of a circle.

c. Create an instance obj1 of the Rectangle class and an instance obj2 of the Circle class.

d. Call the area() and perimeter() methods on both obj1 and obj2 to calculate and display the area and perimeter of the rectangle and circle based on user input.

Step 5: End
