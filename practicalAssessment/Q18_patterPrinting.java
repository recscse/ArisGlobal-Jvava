package practicalAssessment;

import java.util.Scanner;

public class Q18_patterPrinting {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter Height");
			int n = sc.nextInt();
			System.out.println("Please enter width");
			int m = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=m;j++) {
					System.out.print('*');
				}
				System.out.println();
			
				
		
			}
		}
}
