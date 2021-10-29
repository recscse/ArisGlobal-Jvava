package practicalAssessment;

import java.util.Scanner;

public class Q7_calculateGrade {
	 public static void main(String args[]) {
			System.out.println(calculateGreade());

		 }
		 public static String calculateGreade() {
			 int marks= marks();
			 if (marks > 95) {
				    return "A+";
				} 
			 else if ((marks > 85) && (marks <= 95)) {
				 return "A";
				} 
			 else if ((marks > 80) && (marks <= 85)) {
				 return "B+";
				} 
			 else if ((marks > 70) && (marks <= 80)) {
				 return "B";
				} 
			 else if ((marks > 60) && (marks <= 70)) {
				 return "C";
				} 
			 else if ((marks > 50) && (marks <= 60)) {
				 return "D";
				}
			 else
				 return "Fails";
			 
		 }
		 public static int marks() {
			 Scanner marks = new Scanner(System.in);
			 System.out.print("Please Enter The Marks: ");
			 return marks.nextInt();
		 }
}
