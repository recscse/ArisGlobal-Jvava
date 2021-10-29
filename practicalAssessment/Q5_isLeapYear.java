package practicalAssessment;

import java.util.Scanner;

public class Q5_isLeapYear {
	public static void main(String args[]) {
		System.out.println(is_leap_year());

	 }
	 public static Boolean is_leap_year() {
		 int a;
		 int year= year();
		 int number = (year % 400 == 0)?(a = 1):((year % 100 == 0)?(a = 0):((year % 4 == 0)?(a = 1):(a = 0)));
		 return number == 1 ? true : false;
	 }
	 public static int year() {
		 Scanner year = new Scanner(System.in);
		 System.out.print("Please Enter The Year: ");
		 return year.nextInt();
	 }
}
