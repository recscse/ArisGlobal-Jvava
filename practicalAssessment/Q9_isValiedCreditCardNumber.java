package practicalAssessment;

import java.util.Scanner;

public class Q9_isValiedCreditCardNumber {
	public static void main(String args[]) {
		char a = isValiedCreditCardNumber();
		if(a == '3')
			System.out.println("American Express, Diner's Club or Carte Blanche payment networks");
		else if(a == '4')
			System.out.print("Visa. Card ");
		else if(a == '5')
			System.out.print("MasterCards");
		else if(a == '6')
			System.out.print("Discover network");
		else if(a == '0')
			System.out.print("Invalid Card Number! Please Find the Correct Number");

	 }
	 public static char isValiedCreditCardNumber() {
		 String CreditCardNumber= CreditCardNumber();
		 if (CreditCardNumber.length() != 16)
			 	return '0';
		 else return CreditCardNumber.charAt(0);
		 
		 
	 }
	 public static String CreditCardNumber() {
		 Scanner CreditCardNumber = new Scanner(System.in);
		 System.out.print("Please Enter The CreditCardNumber: ");
		 return CreditCardNumber.next();
	 }
}
