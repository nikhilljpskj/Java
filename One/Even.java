import java.util.Scanner;
public class Even {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check Odd or Even: ");
        a = sc.nextInt();

        if (a %2 == 0)
        {
            System.out.println(a+ " is Even");
        }
        else{
            System.out.println(a+ " is odd");
        }

    }
}

Algorithm

Step 1: Import the Scanner class and declare a class named "Even."

Step 2: Define the main method within the "Even" class. This method serves as the entry point for the program.

Step 3: Declare an integer variable a to store the user input.

Step 4: Create a new Scanner object named sc to read input from the keyboard.

Step 5: Display a prompt to the user, asking them to enter a number to check if it's even or odd.

Step 6: Read an integer input from the user using the nextInt method of the Scanner object and store it in the variable a.

Step 7: Check if the entered number a is even or odd by using the modulo operator %. If a % 2 equals 0, it means the number is even.

Step 8: If the condition in Step 7 is true, print a message indicating that the number is even, including the number itself.

Step 9: If the condition in Step 7 is false (i.e., the number is not even), print a message indicating that the number is odd, including the number itself.

Step 10: End
