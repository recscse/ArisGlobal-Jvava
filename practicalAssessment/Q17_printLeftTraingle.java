package practicalAssessment;

import java.util.Scanner;

public class Q17_printLeftTraingle {
	public static void main(String args[]) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
			
	}

}
