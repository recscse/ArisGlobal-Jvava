package practicalAssessment;

import java.util.Scanner;

public class Q2_Odd_Even {
 public static void main(String args[]) {
	System.out.println(OddEven());

 }
 public static String OddEven() {
	 int userInput= userInput();
	 if(userInput %2 == 0)
		 return "Number is even";
	 else if(userInput %2 !=0)
		 return "Number is Odd";
	 else
		 return "You have entered Negative Number! that can't be defined as per Question";
	 
 }
 public static int userInput() {
	 Scanner userInput = new Scanner(System.in);
	 System.out.print("Please Enter a Number: ");
	 return userInput.nextInt();
 }
}
