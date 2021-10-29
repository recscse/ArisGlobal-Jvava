package practicalAssessment;

import java.util.Scanner;

public class Q8_printTheMonthOfYearInLiteral {
	 public static void main(String args[]) {
			System.out.println(printTheMonthOfYearInLiterals());

		 }
		 public static String printTheMonthOfYearInLiterals() {
			 int number= number();
			 switch (number)
			    {
			    case 1:
			        return "January";
			    case 2:
			        return "February";
			    case 3:
			        return "March";
			    case 4:
			        return "April";
			    case 5:
			        return "May";
			    case 6:
			        return "June";
			    case 7:
			        return "July";
			    case 8:
			        return "August";
			    case 9:
			    	return "September";
			    case 10:
			        return "October";
			    case 11:
			        return "November";
			    case 12:
			        return "December";
			        default:
			            return "You have entered an invalid number";
			      }
			 
		 }
		 public static int number() {
			 Scanner number = new Scanner(System.in);
			 System.out.print("Please Enter The Month: ");
			 return number.nextInt();
		 }
}
