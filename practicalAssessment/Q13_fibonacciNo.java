package practicalAssessment;

import java.util.Scanner;

public class Q13_fibonacciNo {
	public static void main(String[] args) {
		int n; int i=1;
		int firstTerm=0;
		int secondTerm=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of terms: ");
		n=sc.nextInt();
		
		System.out.println("Fibonacci series till "+ n + " terms : ");
		
		while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		    }

	}
}
