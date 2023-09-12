import java.util.Date;
import java.util.Scanner;

interface Calculations{
    double calculate();
}

class Product implements Calculations{
    int quantity,i,productId;
    double unitPrice,total;
    String name;
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    Product(){
        System.out.print("Enter product ID :");
        this.productId=sc.nextInt();
        System.out.print("Enter product name :");
        this.name=s.nextLine();
        System.out.print("Enter the quantity :");
        this.quantity=sc.nextInt();
        System.out.print("Enter the price :");
        this.unitPrice=sc.nextDouble();
        this.total=calculate();
    }
    void display()
    {
        System.out.println(String.format("%d\t\t%s\t\t%d\t\t%,.2f\t\t%,.2f",this.productId,this.name,this.quantity,this.unitPrice,this.total));
    }
    public double calculate(){
        return this.unitPrice*this.quantity;
    }
}

class BillingSystem{
    static double netAmount;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  orderNo :");
        int orderNo=sc.nextInt();
        Date date=new Date();
        System.out.print("Enter the number of products you want:");
        int pCount=sc.nextInt();
        Product[] product=new Product[pCount];
        for(int i=0;i<pCount;i++){
            product[i]=new Product();
        }
        System.out.print("\n\n");
        System.out.println("Order No:"+orderNo);
        System.out.println("Date :"+date);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Product ID \tName \t\tQuantity \tUnitPrice \tTotal");
        for(int i=0;i<pCount;i++){
            product[i].display();
        }
        System.out.println("-------------------------------------------------------------------");
        for(int i=0;i<pCount;i++){
            netAmount+=product[i].total;
        }
        System.out.println("\t\t\t\t\t\t\tNet Amount="+netAmount);
    }
}


Algorithm

Step 1: Define an interface named Calculations with a single method calculate().

Step 2: Define a Java class named Product that implements the Calculations interface:

a. Declare instance variables for productId, name, quantity, unitPrice, and total.

b. Create a constructor for the Product class:
- Prompt the user to enter product details, including productId, name, quantity, and unitPrice.
- Calculate the total cost of the product using the calculate() method and store it in the total variable.

c. Define a method display() to display product details in a formatted manner.

d. Implement the calculate() method to calculate the total cost (unitPrice * quantity) and return the result.

Step 3: Define a Java class named BillingSystem:

a. Declare a static double variable netAmount to keep track of the total cost of all products.

b. In the main method:
- Prompt the user to enter an orderNo.
- Get the current date and time using the Date class.

c. Prompt the user to enter the number of products (pCount) they want to purchase.

d. Create an array of Product objects named product with a size of pCount.

e. Use a for loop to create Product objects and store them in the product array.

f. Display an order summary, including order number, date, and a table header.

g. Iterate through the product array and call the display() method for each product to display product details in a table format.

h. Calculate the netAmount by summing up the total values of all products.

i. Display the netAmount as the "Net Amount."

Step 4: End
