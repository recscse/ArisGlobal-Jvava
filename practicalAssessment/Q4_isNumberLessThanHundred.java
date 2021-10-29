package practicalAssessment;

import java.util.Scanner;

public class Q4_isNumberLessThanHundred {
	 public static void main(String args[]) {
			System.out.println(isNumberLessThanHundred());

		 }
		 public static Boolean isNumberLessThanHundred() {
			 int userInput= userInput();
			 return userInput <100 ? true : false;
			 
		 }
		 public static int userInput() {
			 Scanner userInput = new Scanner(System.in);
			 System.out.print("Please Enter Number: ");
			 return userInput.nextInt();
		 }
}
