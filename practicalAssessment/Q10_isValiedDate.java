package practicalAssessment;

import java.util.Scanner;

public class Q10_isValiedDate {
	 static int MAX_VALID_YR = 9999;
	 static int MIN_VALID_YR = 1800;
	public static void main(String args[]) {
		 if(isValiedDate())
			  System.out.println("This is a valid date.");
		 else
			 System.out.println("This is a invalid date.");
		

	 }
	 public static boolean isValiedDate() {
		 int[] dateMonthYear= dateMonthYear();
		 if (dateMonthYear[2] > MAX_VALID_YR || dateMonthYear[2] < MIN_VALID_YR)
		            return false;
		        if (dateMonthYear[1] < 1 || dateMonthYear[1] > 12)
		            return false;
		        if (dateMonthYear[0] < 1 || dateMonthYear[0] > 31)
		            return false;
		        if (dateMonthYear[1] == 2)
		        {
		            if (isLeap(dateMonthYear[2]))
		                return (dateMonthYear[0] <= 29);
		            else
		                return (dateMonthYear[0] <= 28);
		        }

		        if (dateMonthYear[1] == 4 || dateMonthYear[1] == 6 ||
		        		dateMonthYear[1] == 9 || dateMonthYear[1] == 11)
		            return (dateMonthYear[0] <= 30);
		 
		        return true;
		 
		 
	 }
	 public static int[] dateMonthYear() {
		 Scanner dateMonthYear = new Scanner(System.in);
		 int date[] = new int[3];
		 System.out.print("Please Enter date\n");
		 date[0] = dateMonthYear.nextInt();
		 System.out.print("Please Enter Month\n");
		 date[1] = dateMonthYear.nextInt();
		 System.out.print("Please Enter Year\n");
		 date[2] = dateMonthYear.nextInt();
		 return date;
	 }
	 static boolean isLeap(int year)
	    {
	        return (((year % 4 == 0) &&
	                 (year % 100 != 0)) ||
	                 (year % 400 == 0));
	    }
}
