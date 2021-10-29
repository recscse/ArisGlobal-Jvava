package practicalAssessment;

import java.util.Scanner;

public class Q11_calculateEmployeeSalary {
	 public static void main(String args[]) {
			System.out.println(calculateEmployeeSalary());

		 }
		 public static int calculateEmployeeSalary() {
			 int hours= hours();
			 if(hours > 8)
				  return 8*250;
			 else if(hours <0)
				 return -1;
			 else
				 return hours*250;
			 
		 }
		 public static int hours() {
			 Scanner hours = new Scanner(System.in);
			 System.out.print("Please Enter Hours: ");
			 return hours.nextInt();
		 }
}
