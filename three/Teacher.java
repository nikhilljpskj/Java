import java.util.Scanner;

class Employee{
    int empid,salary;
    String name,address;
    Employee(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter empid :");
        empid=sc.nextInt();
        System.out.print("Enter name :");
        name=sc.next();
        System.out.print("Enter salary :");
        salary=sc.nextInt();
        System.out.print("Enter address :");
        address=sc.next();
    }
}
class Teacher extends Employee{
    String department;
    String[] Subjects;
    Teacher(){
        super();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter department :");
        department=sc.next();
        System.out.print("Enter number of subjects Taught :");
        int size=sc.nextInt();
        Subjects=new String[size];
        System.out.println("Enter the subjects\n");
        for(int i=0;i<size;i++){
            Subjects[i]=sc.next();
        }
    }
    void display(){
        System.out.println("\nEmployee id :"+empid+"\nname :"+name+"\nSalary :"+salary+"\nAddress :"+address+"\nDepartment :"+department);
        System.out.print("Subjects are\n");
        for(int i=0;i<Subjects.length;i++){
            System.out.println(Subjects[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of teachers details to be entered :");
        int size=sc.nextInt();
        Teacher[] obj=new Teacher[size];
        for(int i=0;i<size;i++){
            obj[i]=new Teacher();
            System.out.println();
        }
        for(int i=0;i<size;i++){
            obj[i].display();
            System.out.println();
        }
    }
}

Algorithm

Step 1: Start
Step 2: Create a class Employee with instance variables 'empid', 'salary', 'name', and
'address'
Step 3: Create a default constructor in the Employee class to initialize the instance
variables
Step 4: Create a class Teacher that extends Employee
Step 5: Add an instance variable 'department' and 'Subjects' as an array of strings to the
Teacher class
Step 6: Create a default constructor in the Teacher class to initialize the instance
variables
Step 7: Create a method 'display' in the Teacher class to display the teacher's details
Step 8: Create the main method in the Teacher class
32
Step 9: Read the number of teachers 'size' from the user
Step 10: Create an array of Teacher objects with size 'size'
Step 11: Read and store the details of each teacher in the array using a loop
Step 12: Display the details of each teacher using a loop
Step 13: Stop
