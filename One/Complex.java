class Complex	
{
	int real,image;
	Complex(int r,int i)
	{
		this.real=r;
		this.image=i;
	}
	Complex add(Complex other)
	{
		int sumreal=this.real+other.real;
		int sumimage=this.image+other.image;
		return new Complex(sumreal,sumimage);
	}
	public static void main(String[] args)
	{
		Complex n1= new Complex(2,3);
		Complex n2= new Complex(4,5);
		Complex result= n1.add(n2);
		System.out.println("Sum : "+result.real+" + "+result.image+"i");
	}
}

Algorithm

Step 1: Define a class named "Complex."

Step 2: Inside the "Complex" class, declare two integer variables, "real" and "image," which represent the real and imaginary parts of a complex number.

Step 3: Create a parameterized constructor for the "Complex" class that takes two integers, "r" and "i," as input. Inside the constructor, initialize the "real" and "image" instance variables with the values of "r" and "i," respectively.

Step 4: Define a method named "add" that takes another "Complex" object, "other," as a parameter.

Step 5: Inside the "add" method, calculate the sum of the real parts by adding "this.real" and "other.real," and store it in the "sumreal" variable.

Step 6: Calculate the sum of the imaginary parts by adding "this.image" and "other.image," and store it in the "sumimage" variable.

Step 7: Create a new "Complex" object using the "sumreal" and "sumimage" values and return it as the result of the "add" method.

Step 8: In the "main" method:

Create two "Complex" objects, "n1" and "n2," and initialize them with values (2,3) and (4,5) respectively.

Call the "add" method on the "n1" object, passing "n2" as an argument. This computes the sum of the two complex numbers and returns a new "Complex" object, which is assigned to the "result" variable.

Print the result in the form "Sum : real + imagi" using the "System.out.println" statement.

Step 9: End
