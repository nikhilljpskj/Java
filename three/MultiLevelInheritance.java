import java.util.Scanner;

class Person{
    String name,address,gender;
    int age;
    Person()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name  :");
        name=sc.next();
        System.out.print("Enter Age :");
        age=sc.nextInt();
        System.out.print("Enter Address :");
        address=sc.next();
        System.out.print("Enter gender :");
        gender=sc.next();
    }
}
class Employee extends Person{
    int salary,empid;
    String[] qualifications;
    String companyName;
    Employee()
    {
        super();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Empid :");
        empid=sc.nextInt();
        System.out.print("Enter Salary :");
        salary=sc.nextInt();
        System.out.print("Enter Company Name :");
        companyName=sc.next();
        System.out.print("Enter the number of qualifications:");
        int size=sc.nextInt();
        System.out.println("Enter your qualifications");
        qualifications=new String[size];
        for(int i=0;i<size;i++){
            qualifications[i]=sc.next();
        }
    }
}

class Teachers extends Employee{
    int teacherId;
    String[] subjects;
    String department;
    Teachers()
    {
        super();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter teacherID :");
        teacherId=sc.nextInt();
        System.out.print("Enter Department :");
        department=sc.next();
        System.out.print("Enter the number of subjects :");
        int size=sc.nextInt();
        subjects=new String[size];
        System.out.println("Enter the subjects");
        for(int i=0;i<size;i++){
            subjects[i]=sc.next();
        }
    }
    void display()
    {
        System.out.println("\nName :"+name+"\nAge :"+age+"\nAddress :"+address+"\nGender :"+gender+"\n\nEmpid :"+empid+"\nSalary :"+salary+"\nCompany :"+companyName);
        System.out.println("Qualifications");
        for(int i=0;i<qualifications.length;i++){
            System.out.println(qualifications[i]);
        }
        System.out.print("\nTeacher ID:"+teacherId+"\nDepartment :"+department);
        System.out.println("\nSubjects are");
        for(int i=0;i<subjects.length;i++){
            System.out.println(subjects[i]);
        }
    }
}

class MultiLevelInheritance{

 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of teacher :");
        int size=sc.nextInt();
        Teachers[] obj=new Teachers[size];
        for(int i=0;i<size;i++){
            obj[i]=new Teachers();
        }
        for(int i=0;i<size;i++){
            obj[i].display();
        }
    }
}


Algorithm

Step 1: Start
Step 2: Create a class Person with instance variables 'name','address','gender', and 'age'
Step 3: Create a default constructor in the Person class to initialize the instance variables
Step 4: Create a class Employee that extends Person
Step 5: Add instance variables 'salary', 'empid', 'qualifications', and 'companyName' to
the Employee class
Step 6: Create a default constructor in the Employee class to initialize the instance
variables
Step 7: Create a class Teachers that extends Employee
Step 8: Add instance variables 'teacherId', 'subjects', and 'department' to the Teachers
class
Step 9: Create a default constructor in the Teachers class to initialize the instance
variables
Step 10: Create a method 'display' in the Teachers class to display the teacher's details
34
Step 11: Create the main method in the MultiLevelInheritance class
Step 12: Read the number of teachers 'size' from the user
Step 13: Create an array of Teachers objects 'obj' with size 'size'
Step 14: Read and store the details of each teacher in the array using a loop
Step 15: Display the details of each teacher using a loop
Step 16: Stop
