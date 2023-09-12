import java.util.Scanner;
class Student
{
    public static void main(String[] args)
    {
        int i;
        int mark[]=new int[20];
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of subjects :");
        int totalSub=in.nextInt();
        for(i=0;i<totalSub;i++)
        {
            mark[i]=in.nextInt();
        }
        int totalMarks=0;
        for(i=0;i<totalSub;i++)
        {
            totalMarks+=mark[i];
        }
        System.out.println("Total marks of the subjects:"+totalMarks);
        System.out.println("Average of the marks:"+(totalMarks/totalSub));
    } 
}

Algorithm

Step 1: Define a Java class named Student.

Step 2: Inside the Student class, declare integer variables i, totalSub, and totalMarks.

Step 3: Create an integer array mark with a maximum size of 20 to store the marks of the subjects.

Step 4: Create a Scanner object named in to read input from the user.

Step 5: Prompt the user to enter the number of subjects using System.out.print and read the value into the totalSub variable.

Step 6: Use a for loop to read the marks of each subject from the user and store them in the mark array.

Step 7: Initialize the totalMarks variable to 0, which will be used to accumulate the total marks.

Step 8: Use another for loop to calculate the total marks by summing up the marks of all subjects and store the result in the totalMarks variable.

Step 9: Display the total marks of the subjects using System.out.println.

Step 10: Calculate the average of the marks by dividing totalMarks by totalSub and display the result using System.out.println.

Step 11: End
