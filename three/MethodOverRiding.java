import java.util.Scanner;

class Rectangle{
    void area(double len,double bre){
        double recArea=len*bre;
        System.out.println("This is area of rectangle is :"+recArea);
        System.out.println();
    }
}

class Square extends Rectangle{
    void area(double a){
        double sqrArea=a*a;
        System.out.println("This is area of Square is :"+sqrArea);
        System.out.println();
    }
}

class Circle extends Square{
    void area(double r){
        double cirArea=3.14*r*r;
        System.out.println("This is area of Circle is :"+cirArea);
        System.out.println();
    }
}
class MethodOverRiding{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius=sc.nextDouble();
        Circle obj=new Circle();
        obj.area(radius);

        System.out.print("Enter the length of the rectangle:");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double breadth=sc.nextDouble();
        Rectangle obj1=new Rectangle();
        obj1.area(length,breadth);

        System.out.print("Enter the side of square :");
        double side=sc.nextDouble();
        Square obj2=new Square();
        obj2.area(side);
    }
}

Algorithm

Step 1: Define a Java class named Rectangle:

a. Create a method area(double len, double bre) to calculate and display the area of a rectangle (Area = length * breadth).

Step 2: Define a Java class named Square that extends Rectangle:

a. Create a method area(double a) to calculate and display the area of a square (Area = side * side).

Step 3: Define a Java class named Circle that extends Square:

a. Create a method area(double r) to calculate and display the area of a circle (Area = π * r * r).

Step 4: In the MethodOverRiding class (the main class):

a. Create a Scanner object sc to read input from the user.

b. Prompt the user to enter the radius of a circle and store it in the variable radius.

c. Create an instance obj of the Circle class.

d. Call the area() method on obj with the radius as an argument to calculate and display the area of the circle.

e. Prompt the user to enter the length and breadth of a rectangle and store them in the variables length and breadth.

f. Create an instance obj1 of the Rectangle class.

g. Call the area() method on obj1 with length and breadth as arguments to calculate and display the area of the rectangle.

h. Prompt the user to enter the side of a square and store it in the variable side.

i. Create an instance obj2 of the Square class.

j. Call the area() method on obj2 with side as an argument to calculate and display the area of the square.

Step 5: End
