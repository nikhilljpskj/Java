import java.util.Scanner;

class Product {
    int Pcde,Price;
    String Pnm;
    Product(int Pcode, String Pname, int price)
    {
        Pcde = Pcode;
        Pnm = Pname;
        Price = price;

    }
    static void Compare(Product pd1,Product pd2,Product pd3)
    {   
         
    	   if(pd1.Price > pd2.Price && pd1.Price>pd3.Price)
        {
            System.out.println("Price of Product 1 is greater");
        }
        else if(pd1.Price < pd2.Price && pd2.Price>pd3.Price)
        {
            System.out.println("The price of Product 2 is greater");
        }
        else if(pd1.Price<pd2.Price && pd2.Price<pd3.Price)
        {
            System.out.println("The price of Product 3 is greater");
        }

    
    }

    public static void main(String args[])
    {
    	  Scanner val = new Scanner(System.in);
    	  System.out.print("Enter the product code1:");
    	  int pcde=val.nextInt();
    	  System.out.print("Enter the product Name1:");
    	  String pnme=val.next();
    	  System.out.print("Enter the Price1:");
    	  int prc=val.nextInt();
    	  
    	  System.out.print("Enter the product code2:");
    	  int pcde1=val.nextInt();
    	  System.out.print("Enter the product Name2:");
    	  String pnme1=val.next();
    	  System.out.print("Enter the Price2:");
    	  int prc1=val.nextInt();
    	  
    	   System.out.print("Enter the product code3:");
    	  int pcde2=val.nextInt();
    	  System.out.print("Enter the product Name3:");
    	  String pnme2=val.next();
    	  System.out.print("Enter the Price3:");
    	  int prc2=val.nextInt();
    	  
    	   Product pd1 = new Product(pcde,pnme,prc);
        Product pd2 = new Product(pcde1,pnme1,prc1);
        Product pd3 = new Product(pcde2, pnme2, prc2);
        Compare(pd1,pd2,pd3);   
	
    }
}


Algorithm

Step 1: Declare a Java class named Product.

Step 2: Inside the Product class, declare instance variables Pcde, Price, and Pnm to represent the product code, price, and name, respectively.

Step 3: Create a parameterized constructor for the Product class that takes three parameters: Pcode (product code), Pname (product name), and price.

Step 4: Inside the constructor, initialize the instance variables Pcde, Pnm, and Price with the values passed as parameters.

Step 5: Define a static method Compare within the Product class that takes three Product objects (pd1, pd2, and pd3) as parameters.

Step 6: Inside the Compare method, compare the prices of the three Product objects (pd1, pd2, and pd3) and print a message indicating which product has the highest price.

Step 7: In the main method:

a. Create a Scanner object named val to read user input.

b. Prompt the user to enter details for the  product (product code, product name, and price) and store them in separate variables (pcde, pnme, and prc).

c. Create three Product objects (pd1, pd2, and pd3) using the provided input values.

d. Call the Compare method, passing pd1, pd2, and pd3 as arguments to compare their prices.

Step 8: End
