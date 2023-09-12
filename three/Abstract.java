import java.util.Scanner;

abstract class Shape{
    abstract void Findarea();
}

class Rectangle extends Shape{
    double length,breadth;
    Rectangle(double len,double bre){
        this.length=len;
        this.breadth=bre;
    }
    void Findarea(){
            double area=length*breadth;
            System.out.println("Area of rectangle is :"+area);
    }
}

class Square extends Shape{
    double side;
    Square(double s){
        this.side=s;
    }
    void Findarea(){
            double area=side*side;
            System.out.println("Area of square is :"+area);
    }
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    void Findarea(){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is :"+area);
    }
}

class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        double radius=sc.nextDouble();
        Circle obj=new Circle(radius);
        obj.Findarea();

        System.out.print("Enter the side of the square :");
        double side=sc.nextDouble();
        Square obj1=new Square(side);
        obj1.Findarea();

        System.out.print("Enter the length of the rectangle :");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle :");
        double breadth=sc.nextDouble();
        Rectangle obj2=new Rectangle(length,breadth);
        obj2.Findarea();

        sc.close();
    }
}

Algorithm

    Step 1: Define an abstract Java class named Shape.

Step 2: Inside the Shape class, declare an abstract method named Findarea(), which will be used to calculate and display the area of various shapes.

Step 3: Define a Java class named Rectangle that extends the Shape class:

a. Declare instance variables length and breadth to represent the dimensions of the rectangle.

b. Create a constructor for the Rectangle class that takes the length and breadth as parameters and initializes the instance variables.

c. Override the Findarea() method to calculate and display the area of the rectangle.

Step 4: Define a Java class named Square that extends the Shape class:

a. Declare an instance variable side to represent the side length of the square.

b. Create a constructor for the Square class that takes the side length as a parameter and initializes the instance variable.

c. Override the Findarea() method to calculate and display the area of the square.

Step 5: Define a Java class named Circle that extends the Shape class:

a. Declare an instance variable radius to represent the radius of the circle.

b. Create a constructor for the Circle class that takes the radius as a parameter and initializes the instance variable.

c. Override the Findarea() method to calculate and display the area of the circle.

Step 6: In the Abstract class (the main class):

a. Create a Scanner object sc to read input from the user.

b. Prompt the user to enter the radius of the circle and read the value into the radius variable.

c. Create an object obj of the Circle class, passing the radius as a parameter, and call the Findarea() method to calculate and display the area of the circle.

d. Prompt the user to enter the side length of the square and read the value into the side variable.

e. Create an object obj1 of the Square class, passing the side as a parameter, and call the Findarea() method to calculate and display the area of the square.

f. Prompt the user to enter the length and breadth of the rectangle and read the values into the length and breadth variables.

g. Create an object obj2 of the Rectangle class, passing the length and breadth as parameters, and call the Findarea() method to calculate and display the area of the rectangle.

h. Close the Scanner object sc.

Step 7: End
