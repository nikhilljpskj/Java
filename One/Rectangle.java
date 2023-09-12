public class Rectangle {
    int bre;
    double len;

    void setData(double Length,int Breadth)
    {
        len = Length;
        bre = Breadth;
    }

    double getArea()
    {
        return len*bre;
    }

    public static void main(String []args)
    {
        Rectangle ob = new Rectangle();
        ob.setData(12.48, 13);

        System.out.println("Area of the Rectangle with length = "+ob.len+" breadth = "+ob.bre+" is : "+ob.getArea());
    }
}

Algorithm

Step 1: Define a Java class named Rectangle.

Step 2: Inside the Rectangle class, declare instance variables bre (for breadth) and len (for length) to represent the properties of a rectangle.

Step 3: Create a method named setData within the Rectangle class that takes two parameters: Length (for length) and Breadth (for breadth).

Step 4: Inside the setData method, assign the values of Length and Breadth to the instance variables len and bre, respectively, to set the properties of the rectangle.

Step 5: Create a method named getArea within the Rectangle class that calculates and returns the area of the rectangle by multiplying the len and bre instance variables.

Step 6: In the main method:

a. Create an object ob of the Rectangle class.

b. Call the setData method on the ob object, passing the length (12.48) and breadth (13) as arguments to set the properties of the rectangle.

c. Calculate the area of the rectangle by calling the getArea method on the ob object.

d. Use System.out.println to display a message that includes the length, breadth, and calculated area of the rectangle.

Step 7: End
