import java.util.Scanner;
class Publisher{
	String pname;
	Publisher(String n)
	{
		pname=n;
	}
}

class Book extends Publisher{
	String bookName,author;
	int bookPrice;
	Book(String n,String bn,String a,int bp){
		super(n);
		bookName=bn;
		author=a;
		bookPrice=bp;
	}	
}

class Literature extends Book{
	Literature(String n,String bn,String a,int bp){
		super(n,bn,a,bp);
	}
	void display(){
		System.out.println("Book Name :"+bookName+"\nAuthor :"+author+"\nPublisher :"+pname+"\nBook Price :"+bookPrice);
	}
}

class Fiction extends Book{
	Fiction(String n,String bn,String a,int bp){
		super(n,bn,a,bp);
	}
	void display(){
		System.out.println("Book Name :"+bookName+"\nAuthor :"+author+"\nPublisher :"+pname+"\nBook Price :"+bookPrice);
	}
}

class HierarchicalInheritance{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Book details (Literature)");
		System.out.print("Enter the publisher name :");
		String publisherName=sc.nextLine();
		System.out.print("Enter the author name :");
		String authorName=sc.nextLine();
		System.out.print("Enter the book name :");
		String bookname=sc.nextLine();
		System.out.print("Enter the price of the book :");
		int price=s.nextInt();
		
		Literature obj =new Literature(publisherName,bookname,authorName,price);
		obj.display();

		System.out.println("\nEnter the Book details (Fiction)");
		System.out.print("Enter the publisher name :");
		String publisherName1=sc.nextLine();
		System.out.print("Enter the author name :");
		String authorName1=sc.nextLine();
		System.out.print("Enter the book name :");
		String bookname1=sc.nextLine();
		System.out.print("Enter the price of the book :");
		int price1=s.nextInt();

		Fiction obj1 =new Fiction(publisherName1,bookname1,authorName1,price1);
		obj1.display();
		
	}
}

Step 1: Define a Java class named Publisher:

a. Declare an instance variable pname to store the publisher's name.

b. Create a constructor for the Publisher class that takes a String parameter n and initializes pname.

Step 2: Define a Java class named Book that extends Publisher:

a. Declare instance variables bookName, author, and bookPrice to store book details.

b. Create a constructor for the Book class that takes parameters for the publisher's name (n), book name (bn), author (a), and book price (bp).

Step 3: Define a Java class named Literature that extends Book:

a. Create a constructor for the Literature class that takes the same parameters as the Book constructor and calls the superclass constructor using super.

b. Implement a display() method to display book details, including book name, author, publisher, and book price.

Step 4: Define a Java class named Fiction that extends Book:

a. Create a constructor for the Fiction class that takes the same parameters as the Book constructor and calls the superclass constructor using super.

b. Implement a display() method to display book details, including book name, author, publisher, and book price.

Step 5: In the HierarchicalInheritance class (the main class):

a. Create Scanner objects sc and s to read input from the user.

b. Prompt the user to enter the details of a literature book (publisher name, author name, book name, and price).

c. Create an object obj of the Literature class, passing the user-provided values to the constructor.

d. Call the display() method on obj to display the details of the literature book.

e. Prompt the user to enter the details of a fiction book (publisher name, author name, book name, and price).

f. Create an object obj1 of the Fiction class, passing the user-provided values to the constructor.

g. Call the display() method on obj1 to display the details of the fiction book.

Step 6: End
