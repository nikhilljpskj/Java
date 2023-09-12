import java.util.Scanner;

class StringManupluation
{
	static void manipulate(String str)
	{
		String temp=str;
		System.out.println("\nString manipulation with string class\n");
		System.out.println("First character is : "+temp.charAt(0));
		temp=temp.concat("concatenated");
		System.out.println("Concat operation : "+temp);
		System.out.println("Length of the string : "+temp.length());
		System.out.println("String to UPPER case "+temp.toUpperCase());
		System.out.println("String to lower case "+temp.toLowerCase());
		System.out.println("Replaced : "+temp.replace("concatenated","replaced"));
		System.out.println("Index of this  :"+temp.indexOf("this"));
	}
	static void manipulateBuffer(StringBuffer str)
	{
		StringBuffer tempSb=str;
		System.out.println("\nString manipulation using buffer class\n");
		tempSb=tempSb.append("Appended");
		System.out.println("Append : "+tempSb);
		System.out.println("Length is  :"+tempSb.length());
		System.out.println("Substring from 8th to last index 
:"+tempSb.substring(8));
		System.out.println("Substring from 0 to 4th index  :"+tempSb.substring(0,5));
	}
	public static void main(String args[])
	{
		String str=new String();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		manipulate(str);
		StringBuffer sb=new StringBuffer(str);
		manipulateBuffer(sb);
	}
}

Algorithm

Step 1: Define a Java class named StringManipulation.

Step 2: Inside the StringManipulation class, define two static methods for string manipulation:

Step 3: Define a static method named manipulate that takes a String parameter str for string manipulation:

Declare a String variable temp and initialize it with the input str.
Display a message indicating that string manipulation with the String class is about to start.
Use temp.charAt(0) to get and print the first character of the string.
Use temp.concat("concatenated") to concatenate "concatenated" to the temp string and print the result.
Use temp.length() to get and print the length of the temp string.
Use temp.toUpperCase() to convert the temp string to uppercase and print it.
Use temp.toLowerCase() to convert the temp string to lowercase and print it.
Use temp.replace("concatenated", "replaced") to replace "concatenated" with "replaced" in the temp string and print the result.
Use temp.indexOf("this") to find and print the index of the substring "this" in the temp string.
Step 4: Define another static method named manipulateBuffer that takes a StringBuffer parameter str for string manipulation using a StringBuffer:

Declare a StringBuffer variable tempSb and initialize it with the input str.
Display a message indicating that string manipulation using the StringBuffer class is about to start.
Use tempSb.append("Appended") to append "Appended" to the tempSb buffer and print the result.
Use tempSb.length() to get and print the length of the tempSb buffer.
Use tempSb.substring(8) to get and print the substring starting from the 8th index to the end of the tempSb buffer.
Use tempSb.substring(0, 5) to get and print the substring from index 0 to the 4th index (exclusive) of the tempSb buffer.
Step 5: In the main method:

Declare a String variable str and initialize it with an empty string.
Create a Scanner object sc to read input from the user.
Display a message asking the user to enter a string using System.out.println.
Read the user's input line and store it in the str variable.
Call the manipulate method, passing str as an argument to perform string manipulation with the String class.
Create a StringBuffer object sb and initialize it with the str variable.
Call the manipulateBuffer method, passing sb as an argument to perform string manipulation with the StringBuffer class.
Step 6: End the program.
