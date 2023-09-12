class CPU
{
	int price;
	CPU(int Prc)
	{
		price=Prc;
	}
	class Processor
	{
		int cores;
		String manufacture;
		Processor(int n,String m)
		{
			cores=n;
			manufacture=m;
		}
		void display()
		{
			System.out.println("The number of cores is "+cores);
			System.out.println("Manufacture is "+manufacture);
		} 
	}
	static class Ram
	{
		int memory;
		String manufactured;
		Ram(int m,String manu)
		{
			memory=m;
			manufactured=manu;
		}
		void display()
		{
			System.out.println("Memory size "+memory);
			System.out.println("Manufactured by "+manufactured);
		} 
	}
	void display()
		{
			System.out.println("The price is "+price);
		} 
	public static void main(String[] args)
	{
		CPU obj=new CPU(20000);
		CPU.Processor obj2=obj.new Processor(3,"Apple");
		CPU.Ram obj3 =new Ram(128,"Samsung");
		obj.display();
		obj2.display();
		obj3.display();
	}
}


Algorithm


1. Create a class named "CPU."

2. Inside the "CPU" class:
   a. Declare an integer variable "price."
   b. Create a constructor that takes an integer argument and assigns it to the "price" variable.
   c. Create an inner class named "Processor" inside the "CPU" class.
      i. Inside the "Processor" class:
         - Declare integer variables "cores" and "manufacture."
         - Create a constructor that takes two arguments (an integer and a string) and assigns them to the respective variables.
         - Create a method "display" that prints the number of cores and the manufacturer of the processor.
   d. Create a static inner class named "Ram" inside the "CPU" class.
      i. Inside the "Ram" class:
         - Declare integer variables "memory" and "manufactured."
         - Create a constructor that takes two arguments (an integer and a string) and assigns them to the respective variables.
         - Create a method "display" that prints the memory size and the manufacturer of the RAM.

3. Create a method named "display" in the "CPU" class that prints the price of the CPU.

4. In the main method:
   a. Create an object "obj" of the "CPU" class with a price of 20000.
   b. Create an object "obj2" of the "Processor" class inside the "CPU" class with 3 cores and "Apple" as the manufacturer.
   c. Create an object "obj3" of the "Ram" class inside the "CPU" class with 128 memory size and "Samsung" as the manufacturer.
   d. Call the "display" method for each of the objects to print their respective information (price, processor details, and RAM details).

5. End.
