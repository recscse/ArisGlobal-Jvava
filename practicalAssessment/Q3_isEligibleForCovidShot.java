package practicalAssessment;

import java.util.Scanner;

public class Q3_isEligibleForCovidShot {
	 public static void main(String args[]) {
			System.out.println(isEligibleForCovidShot());

		 }
		 public static String isEligibleForCovidShot() {
			 int userAge= userAge();
			 if(userAge > 60)
				 return "Eligible now";
			 else if(userAge > 45 && userAge <= 60)
				 return "Eligible in 15 days";
			 else if(userAge > 18 && userAge <= 45)
				 return "Eligible in a month";
			 else 
				 return "Not Eligible Be Safe and away from crowd :)";
			 
		 }
		 public static int userAge() {
			 Scanner userAge = new Scanner(System.in);
			 System.out.print("Please Enter Your Age: ");
			 return userAge.nextInt();
		 }
}
